package com.lucasbezerra.cursomc.resources;

import com.lucasbezerra.cursomc.damain.Cliente;
import com.lucasbezerra.cursomc.damain.Produto;
import com.lucasbezerra.cursomc.dto.ClienteDTO;
import com.lucasbezerra.cursomc.dto.ProdutoDTO;
import com.lucasbezerra.cursomc.resources.utils.URL;
import com.lucasbezerra.cursomc.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
    @Autowired
    ProdutoService service;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<ProdutoDTO>> search(
            @RequestParam(name = "nome", defaultValue = "") String nome,
            @RequestParam(name = "categorias", defaultValue = "") String categorias,
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "linesPerPage", defaultValue = "24") Integer linesPerPage,
            @RequestParam(name = "orderBy", defaultValue = "nome") String orderBy,
            @RequestParam(name = "direction", defaultValue = "ASC") String direction
    ){
        String nomeDecoded = URL.decodeParam(nome);
        List<Integer> listIds = URL.decodeIntList(categorias);
        Page<Produto> listPage = service.search(nomeDecoded, listIds, page, linesPerPage, orderBy, direction);
        Page<ProdutoDTO> listPageDto = listPage.map(obj -> new ProdutoDTO(obj));
        return ResponseEntity.ok().body(listPageDto);
    }
}

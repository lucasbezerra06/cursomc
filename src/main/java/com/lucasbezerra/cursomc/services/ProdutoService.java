package com.lucasbezerra.cursomc.services;

import com.lucasbezerra.cursomc.damain.Categoria;
import com.lucasbezerra.cursomc.damain.Produto;
import com.lucasbezerra.cursomc.repositories.CategoriaRepository;
import com.lucasbezerra.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repo;

    @Autowired
    CategoriaRepository categoriaRepository;

    public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        List<Categoria> categorias = categoriaRepository.findAllById(ids);
        return repo.search(nome, categorias, pageRequest);

    }
}

package com.lucasbezerra.cursomc.services;

import com.lucasbezerra.cursomc.damain.Pedido;
import com.lucasbezerra.cursomc.repositories.PedidoRepository;
import com.lucasbezerra.cursomc.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repo;

    public Pedido find(Integer id){
        Optional<Pedido> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+ id + ", Tipo: " + Pedido.class.getName()));
    }
}

package com.lucasbezerra.cursomc.damain;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.lucasbezerra.cursomc.damain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
@JsonTypeName("pagamentoComCartao")
public class PagamentoComCartao extends Pagamento{
    private static final long serialVersionUID = 1L;

    Integer numeroDeParcelas;

    public PagamentoComCartao(){
        super();
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.numeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return numeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        this.numeroDeParcelas = numeroDeParcelas;
    }
}

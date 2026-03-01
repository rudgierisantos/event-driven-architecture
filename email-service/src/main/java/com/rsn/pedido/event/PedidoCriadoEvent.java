package com.rsn.pedido.event;

public class PedidoCriadoEvent {

    private String produto;
    private Integer quantidade;

    public PedidoCriadoEvent() {}

    public PedidoCriadoEvent(String produto, Integer quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}

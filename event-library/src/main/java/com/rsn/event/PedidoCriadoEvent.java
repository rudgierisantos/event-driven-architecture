package com.rsn.event;

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

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}

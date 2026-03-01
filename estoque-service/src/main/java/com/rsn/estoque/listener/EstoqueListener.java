package com.rsn.estoque.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rsn.pedido.event.PedidoCriadoEvent;

@Service
public class EstoqueListener {

    @KafkaListener(topics = "pedido-criado", groupId = "pedido-group")
    public void processarPedidoCriado(PedidoCriadoEvent event) {
        System.out.println("Baixando estoque: " + event.getProduto());
    }
}

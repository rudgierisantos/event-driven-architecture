package com.rsn.email.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rsn.pedido.event.PedidoCriadoEvent;

@Service
public class EmailListener {

    @KafkaListener(topics = "pedido-criado", groupId = "pedido-group")
    public void processar(PedidoCriadoEvent event) {
        System.out.println("Enviando email para: " + event.getProduto());
    }
}

package com.rsn.email.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.rsn.event.PedidoCriadoEvent;

@Service
public class EmailListener {

    @KafkaListener(topics = "pedido-criado")
    public void processar(PedidoCriadoEvent event) {
        System.out.println("Enviando email para: " + event.getProduto());
    }
}

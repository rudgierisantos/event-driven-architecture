package com.rsn.pedido.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.rsn.pedido.event.PedidoCriadoEvent;

@Service
public class PedidoService {

    private final KafkaTemplate<String, PedidoCriadoEvent> kafkaTemplate;

    public PedidoService(KafkaTemplate<String, PedidoCriadoEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void criarPedido(String produto, Integer quantidade) {
        PedidoCriadoEvent event = new PedidoCriadoEvent(produto, quantidade);
        kafkaTemplate.send("pedido-criado", event);
    }
}

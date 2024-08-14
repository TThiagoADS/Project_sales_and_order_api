package io.github.tthiadoads.service;

import io.github.tthiadoads.domain.entity.Pedido;
import io.github.tthiadoads.domain.enums.StatusPedido;
import io.github.tthiadoads.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar( PedidoDTO dto );
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}

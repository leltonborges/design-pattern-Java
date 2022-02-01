package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

@FunctionalInterface
public interface AcaoParaGerarPedido {
    void executeAction(Pedido pedido);
}

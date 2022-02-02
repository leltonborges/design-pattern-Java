package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

public class LogPedido implements AcaoPedidoObserver {
    @Override
    public void executeAction(Pedido pedido) {
        System.out.println("Log info: " + pedido.getClient());
    }
}

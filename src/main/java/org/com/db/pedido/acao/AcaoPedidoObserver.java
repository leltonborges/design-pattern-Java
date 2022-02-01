package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

public interface AcaoPedidoObserver {
    void executeAction(Pedido pedido);
}

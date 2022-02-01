package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

public class EnviarEmailPedidoObserver implements AcaoPedidoObserver {
    @Override
    public void executeAction(Pedido pedido){
        System.out.println("Enviando email com dados do pedido.");
    }
}

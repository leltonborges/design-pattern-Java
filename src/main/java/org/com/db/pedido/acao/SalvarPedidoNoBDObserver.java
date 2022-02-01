package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

public class SalvarPedidoNoBDObserver implements AcaoPedidoObserver {

    @Override
    public void executeAction(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }
}

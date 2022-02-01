package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

public class EnviarEmailPedido  implements AcaoParaGerarPedido{
    @Override
    public void executeAction(Pedido pedido){
        System.out.println("Enviando email com dados do pedido.");
    }
}

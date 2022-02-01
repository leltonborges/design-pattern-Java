package org.com.db.pedido.acao;

import org.com.db.pedido.Pedido;

public class EnviarEmailPedido {
    public void execute(Pedido pedido){
        System.out.println("Enviando email com dados do pedido.");
    }
}

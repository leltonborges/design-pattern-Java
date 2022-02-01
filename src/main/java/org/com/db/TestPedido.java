package org.com.db;

import org.com.db.orcamento.Orcamento;
import org.com.db.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestPedido {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal(600), 4);
        String client = "Foo";
        LocalDateTime data = LocalDateTime.now();

        Pedido pedido = new Pedido(client, data, orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}

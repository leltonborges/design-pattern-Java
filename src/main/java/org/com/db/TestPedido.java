package org.com.db;

import org.com.db.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestPedido {
    public static void main(String[] args) {
        String client = "foo";
        BigDecimal valueOrcamento = new BigDecimal(600);
        Integer quantity = 43;

        GeraPedido geraPedido = new GeraPedido(client, valueOrcamento, quantity);
        geraPedido.execute();

    }
}

package org.com.db.pedido;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String client;
    private BigDecimal valueOrcamento;
    private int quantity;

    public GeraPedido(String client, BigDecimal valueOrcamento, int quantity) {
        this.client = client;
        this.valueOrcamento = valueOrcamento;
        this.quantity = quantity;
    }

    public void execute(){
        Orcamento orcamento = new Orcamento(this.valueOrcamento, this.quantity);
        String client = this.client;

        Pedido pedido = new Pedido(client, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}

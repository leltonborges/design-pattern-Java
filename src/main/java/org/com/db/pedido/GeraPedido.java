package org.com.db.pedido;

import org.com.db.pedido.acao.EnviarEmailPedidoObserver;
import org.com.db.pedido.acao.LogPedido;
import org.com.db.pedido.acao.SalvarPedidoNoBDObserver;

import java.math.BigDecimal;
import java.util.Arrays;

public class GeraPedido {
    private String client;
    private BigDecimal valueOrcamento;
    private int quantity;

    public GeraPedido(String client, BigDecimal valueOrcamento, int quantity) {
        this.client = client;
        this.valueOrcamento = valueOrcamento;
        this.quantity = quantity;
    }

    public String getClient() {
        return client;
    }

    public BigDecimal getValueOrcamento() {
        return valueOrcamento;
    }

    public int getQuantity() {
        return quantity;
    }

    public void execute(){
        GeraPedido geraPedido = new GeraPedido(this.getClient(), this.getValueOrcamento(), this.getQuantity());
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
                Arrays.asList(
                        new SalvarPedidoNoBDObserver(),
                        new EnviarEmailPedidoObserver(),
                        new LogPedido()
                )
        );
        geraPedidoHandler.execute(geraPedido);
    }


}

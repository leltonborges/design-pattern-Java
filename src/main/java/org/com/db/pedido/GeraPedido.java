package org.com.db.pedido;

import org.com.db.orcamento.Orcamento;
import org.com.db.pedido.acao.AcaoParaGerarPedido;
import org.com.db.pedido.acao.EnviarEmailPedido;
import org.com.db.pedido.acao.SalvarPedidoNoBD;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

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
                Arrays.asList(new SalvarPedidoNoBD(), new EnviarEmailPedido())
        );
        geraPedidoHandler.execute(geraPedido);
    }


}

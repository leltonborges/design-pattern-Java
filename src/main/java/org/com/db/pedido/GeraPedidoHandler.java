package org.com.db.pedido;

import org.com.db.orcamento.Orcamento;
import org.com.db.pedido.acao.AcaoParaGerarPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoParaGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoParaGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValueOrcamento(), dados.getQuantity());
        String client = dados.getClient();

        Pedido pedido = new Pedido(client, LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executeAction(pedido));
    }
}

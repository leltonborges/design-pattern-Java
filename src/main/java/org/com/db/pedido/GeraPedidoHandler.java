package org.com.db.pedido;

import org.com.db.orcamento.Item;
import org.com.db.orcamento.Orcamento;
import org.com.db.pedido.acao.AcaoPedidoObserver;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoPedidoObserver> acoes;

    public GeraPedidoHandler(List<AcaoPedidoObserver> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.addItem(new Item(dados.getValueOrcamento()));
        String client = dados.getClient();

        Pedido pedido = new Pedido(client, LocalDateTime.now(), orcamento);

        acoes.parallelStream().forEach(a -> a.executeAction(pedido));
    }
}

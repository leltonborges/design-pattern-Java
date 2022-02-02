package org.com.db;

import org.com.db.orcamento.Item;
import org.com.db.orcamento.Orcamento;
import org.com.db.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestComposicao {
    public static void main(String[] args) {
        Orcamento oldOrcamento = new Orcamento();
        oldOrcamento.addItem(new Item(new BigDecimal(800)));
        oldOrcamento.reprova();

        Orcamento newOrcamento = new Orcamento();
        newOrcamento.addItem(new Item(new BigDecimal(700)));
        newOrcamento.addItem(oldOrcamento);

        OrcamentoProxy proxy = new OrcamentoProxy(newOrcamento);
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
        System.out.println(proxy.getValue());
    }
}

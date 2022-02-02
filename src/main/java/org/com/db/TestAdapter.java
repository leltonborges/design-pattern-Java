package org.com.db;

import org.com.db.http.JavaHttpClient;
import org.com.db.orcamento.Item;
import org.com.db.orcamento.Orcamento;
import org.com.db.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestAdapter {
    public static void main(String[] args) {
        Orcamento first = new Orcamento();
        first.addItem(new Item(BigDecimal.valueOf(200)));

        first.aprovar();
        first.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(first);
    }
}

package org.com.db;

import org.com.db.http.JavaHttpClient;
import org.com.db.orcamento.Orcamento;
import org.com.db.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(200), 6);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new JavaHttpClient());
        registroOrcamento.registrar(orcamento);
    }
}

package org.com.db.orcamento;

import org.com.db.http.HttpAdapter;
import org.com.db.orcamento.situação.exception.DomainException;

import java.util.Map;

public class RegistroOrcamento {

    private HttpAdapter httpAdapter;

    public RegistroOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento){
        if (!orcamento.isFinalizado())
            throw new DomainException("Orcamento não finalizado");

        final String url = "https://api.project/orcamento";
        Map<String, Object> dados = Map.of(
                "value", orcamento.getValue(),
                "quatityItens", orcamento.getQuantity()

        );

        httpAdapter.post(url, dados);
    }
}

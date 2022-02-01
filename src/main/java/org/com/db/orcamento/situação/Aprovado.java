package org.com.db.orcamento.situação;

import org.com.db.orcamento.Orcamento;
import org.com.db.orcamento.situação.exception.DomainException;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValue().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituation(new Finalizado());
    }
}

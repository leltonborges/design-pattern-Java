package org.com.db.orcamento.situação;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValue().multiply(BigDecimal.valueOf(0.05));
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.setSituation(new Finalizado());
    }
}

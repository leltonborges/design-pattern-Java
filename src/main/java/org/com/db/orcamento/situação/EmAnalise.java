package org.com.db.orcamento.situação;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento{
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return orcamento.getValue().multiply(BigDecimal.valueOf(0.05));
    }
    public void aprovar(Orcamento orcamento){
        orcamento.setSituation(new Aprovado());
    }

    public void reprovar(Orcamento orcamento){
        orcamento.setSituation(new Reprovado());
    }
}

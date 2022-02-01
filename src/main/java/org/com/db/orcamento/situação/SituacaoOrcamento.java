package org.com.db.orcamento.situação;

import org.com.db.orcamento.Orcamento;
import org.com.db.orcamento.situação.exception.DomainException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Não é possivel aprova o orçamento");
    }

    public void reprovar(Orcamento orcamento){
        throw new DomainException("Não é possivel reprovar o orçamento");
    }

    public void finalizado(Orcamento orcamento){
        throw new DomainException("Não é possivel finalizar o orçamento");
    }
}

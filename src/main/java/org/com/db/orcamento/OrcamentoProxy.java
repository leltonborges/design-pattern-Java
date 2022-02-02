package org.com.db.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{
    private BigDecimal value;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValue() {
        if (value == null){
            this.value = orcamento.getValue();
        }
        return this.value;
    }
}

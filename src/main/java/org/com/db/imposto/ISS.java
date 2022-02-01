package org.com.db.imposto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS(Imposto imposto) {
        super(imposto);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValue().multiply(BigDecimal.valueOf(0.06));
    }

}

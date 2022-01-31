package org.com.db.desconto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaComprasAcimaDe500 extends Desconto {

    public DescontoParaComprasAcimaDe500(Desconto next) {
        super(next);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValue().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValue().compareTo(BigDecimal.valueOf(500)) > 0;
    }

}

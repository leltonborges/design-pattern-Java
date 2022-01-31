package org.com.db.desconto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeCincoItens extends Desconto {

    public DescontoParaMaisDeCincoItens(Desconto next) {
        super(next);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValue().multiply(BigDecimal.valueOf(0.1));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantity() > 5;
    }

}

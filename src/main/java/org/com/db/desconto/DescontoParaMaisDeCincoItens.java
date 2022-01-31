package org.com.db.desconto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaMaisDeCincoItens extends Desconto{

    public DescontoParaMaisDeCincoItens(Desconto next) {
        super(next);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantity() > 5){
            return orcamento.getValue().multiply(BigDecimal.valueOf(0.1));
        }
        return next.calcular(orcamento);
    }

}

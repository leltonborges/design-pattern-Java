package org.com.db.desconto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getQuantity() > 5){
            return orcamento.getValue().multiply(BigDecimal.valueOf(0.1));
        }
        if(orcamento.getValue().compareTo(BigDecimal.valueOf(500)) > 0){
            return orcamento.getValue().multiply(BigDecimal.valueOf(0.1));
        }
        return BigDecimal.ZERO;
    }
}

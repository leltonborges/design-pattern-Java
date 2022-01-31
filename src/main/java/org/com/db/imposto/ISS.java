package org.com.db.imposto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{

    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValue().multiply(BigDecimal.valueOf(0.06));
    }
}

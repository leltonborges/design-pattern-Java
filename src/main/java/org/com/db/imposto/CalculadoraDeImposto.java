package org.com.db.imposto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto){
        return tipoImposto.calcular(orcamento);
    }
}

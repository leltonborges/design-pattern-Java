package org.com.db.imposto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImposto {
    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto){
     return switch (tipoImposto){
            case ICMS -> orcamento.getValue().multiply(BigDecimal.valueOf(0.1));
            case ISS -> orcamento.getValue().multiply(BigDecimal.valueOf(0.06));
            default -> BigDecimal.valueOf(0);
        };
    }
}

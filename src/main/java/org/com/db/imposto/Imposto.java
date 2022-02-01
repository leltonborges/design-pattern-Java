package org.com.db.imposto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto imposto;

    public Imposto(Imposto imposto) {
        this.imposto = imposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    protected BigDecimal calcular(Orcamento orcamento){
        BigDecimal valueImposto = realizarCalculo(orcamento);
        BigDecimal outroImposto = BigDecimal.ZERO;
        if(isNext()) {
            outroImposto = imposto.calcular(orcamento);
        }
        return valueImposto.add(outroImposto);
    }

    private boolean isNext(){
        return this.imposto != null;
    }
}

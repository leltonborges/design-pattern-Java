package org.com.db.desconto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoParaComprasAcimaDe500 extends Desconto{

    public DescontoParaComprasAcimaDe500(Desconto next) {
        super(next);
    }

    public BigDecimal calcular(Orcamento orcamento){
        if(orcamento.getValue().compareTo(BigDecimal.valueOf(500)) > 0){
            return orcamento.getValue().multiply(BigDecimal.valueOf(0.05));
        }

        return next.calcular(orcamento);
    }

}

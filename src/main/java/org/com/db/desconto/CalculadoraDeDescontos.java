package org.com.db.desconto;

import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaMaisDeCincoItens(
                new DescontoParaComprasAcimaDe500(
                        new SemDesconto()
                )

        );
        return desconto.calcular(orcamento);
    }
}

package org.com.db;

import org.com.db.desconto.CalculadoraDeDescontos;
import org.com.db.imposto.CalculadoraDeImposto;
import org.com.db.imposto.ICMS;
import org.com.db.imposto.ISS;
import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(BigDecimal.valueOf(200), 6);
        Orcamento orcamento2 = new Orcamento(BigDecimal.valueOf(1000), 1);
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        System.out.println(calc.calcular(orcamento1));
        System.out.println(calc.calcular(orcamento2));
    }

}

package org.com.db;

import org.com.db.imposto.CalculadoraDeImposto;
import org.com.db.imposto.ICMS;
import org.com.db.imposto.ISS;
import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100), 3);
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        System.out.println(calc.calcular(orcamento, new ICMS()));
        System.out.println(calc.calcular(orcamento, new ISS()));
    }

}

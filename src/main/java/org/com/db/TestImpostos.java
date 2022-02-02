package org.com.db;

import org.com.db.imposto.CalculadoraDeImposto;
import org.com.db.imposto.ICMS;
import org.com.db.imposto.ISS;
import org.com.db.orcamento.Item;
import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {
    public static void main(String[] args) {
        Orcamento first = new Orcamento();
        first.addItem(new Item(new BigDecimal(1100)));
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        System.out.println(calc.calcular(first, new ICMS(null)));
        System.out.println(calc.calcular(first, new ISS(null)));
    }

}

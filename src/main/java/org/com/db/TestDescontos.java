package org.com.db;

import org.com.db.desconto.CalculadoraDeDescontos;
import org.com.db.imposto.CalculadoraDeImposto;
import org.com.db.imposto.ICMS;
import org.com.db.imposto.ISS;
import org.com.db.orcamento.Item;
import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestDescontos {
    public static void main(String[] args) {
        Orcamento first = new Orcamento();
        first.addItem(new Item(new BigDecimal(800)));
        Orcamento secund = new Orcamento();
        secund.addItem(new Item(new BigDecimal(170)));
        CalculadoraDeDescontos calc = new CalculadoraDeDescontos();
        System.out.println(calc.calcular(first));
        System.out.println(calc.calcular(secund));
    }

}

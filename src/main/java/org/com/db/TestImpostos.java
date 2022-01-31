package org.com.db;

import org.com.db.imposto.CalculadoraDeImposto;
import org.com.db.imposto.TipoImposto;
import org.com.db.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(100));
        CalculadoraDeImposto calc = new CalculadoraDeImposto();
        System.out.println(calc.calcular(orcamento, TipoImposto.ISS));
    }

}

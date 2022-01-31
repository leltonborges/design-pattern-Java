package org.com.db.orcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal value;
    private Integer quantity;

    public Orcamento(BigDecimal value, Integer quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getQuantity() {
        return quantity;
    }
}

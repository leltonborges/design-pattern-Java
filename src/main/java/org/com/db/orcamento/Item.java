package org.com.db.orcamento;

import java.math.BigDecimal;

public class Item implements Orcavel{
    private BigDecimal value;

    public Item(BigDecimal value) {
        this.value = value;
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }
}

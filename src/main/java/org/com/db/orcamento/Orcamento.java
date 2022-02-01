package org.com.db.orcamento;

import org.com.db.orcamento.situação.EmAnalise;
import org.com.db.orcamento.situação.Finalizado;
import org.com.db.orcamento.situação.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal value;
    private Integer quantity;
    private SituacaoOrcamento situation;

    public Orcamento(BigDecimal value, Integer quantity) {
        this.value = value;
        this.quantity = quantity;
        this.situation = new EmAnalise();
    }

    public BigDecimal getValue() {
        return value;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public SituacaoOrcamento getSituation() {
        return situation;
    }

    public void setSituation(SituacaoOrcamento situation) {
        this.situation = situation;
    }

    public void aplicarDescontoExtra(){
        BigDecimal valorDoDesconto  = this.situation.calcularValorDescontoExtra(this);
        this.value = this.value.subtract(valorDoDesconto);
    }

    public void aprovar(){
        this.situation.aprovar(this);
    }

    public void reprova(){
        this.situation.reprovar(this);
    }

    public void finalizar(){
        this.situation.finalizar(this);
    }

    public boolean isFinalizado() {
        return situation instanceof Finalizado;
    }
}

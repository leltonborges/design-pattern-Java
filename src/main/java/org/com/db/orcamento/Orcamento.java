package org.com.db.orcamento;

import org.com.db.orcamento.situação.EmAnalise;
import org.com.db.orcamento.situação.Finalizado;
import org.com.db.orcamento.situação.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{
    private BigDecimal value;
    private List<Orcavel> items;
    private SituacaoOrcamento situation;

    public Orcamento() {
        this.value = BigDecimal.ZERO;
        items = new ArrayList<>();
        this.situation = new EmAnalise();
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }

    public Integer getQuantity() {
        return items.size();
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

    public void addItem(Orcavel item){
        this.value = value.add(item.getValue());
        this.items.add(item);
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

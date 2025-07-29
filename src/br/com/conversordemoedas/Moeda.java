package br.com.conversordemoedas;

public class Moeda {
    private String moedaBase;
    private String moedaDestino;
    private Double taxaDeConversao;
    private Double resultadoDaConversao;

    public Moeda(MoedaApi moedaApi) {
        this.moedaBase = moedaApi.baseCode();
        this.moedaDestino = moedaApi.targetCode();
        this.taxaDeConversao = moedaApi.conversionRate();
        this.resultadoDaConversao = moedaApi.conversionResult();
    }


    public String getMoedaBase() {
        return moedaBase;
    }

    public void setMoedaBase(String moedaBase) {
        this.moedaBase = moedaBase;
    }

    public String getMoedaDestino() {
        return moedaDestino;
    }

    public void setMoedaDestino(String moedaDestino) {
        this.moedaDestino = moedaDestino;
    }

    public Double getTaxaDeConversao() {
        return taxaDeConversao;
    }

    public void setTaxaDeConversao(Double taxaDeConversao) {
        this.taxaDeConversao = taxaDeConversao;
    }

    public Double getResultadoDaConversao() {
        return resultadoDaConversao;
    }

    public void setResultadoDaConversao(Double resultadoDaConversao) {
        this.resultadoDaConversao = resultadoDaConversao;
    }
}

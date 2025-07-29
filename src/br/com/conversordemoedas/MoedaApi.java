package br.com.conversordemoedas;

public record MoedaApi(String baseCode, String targetCode, Double conversionRate, Double conversionResult) {
}

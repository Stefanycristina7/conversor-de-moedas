package br.com.conversordemoedas;

import java.util.Scanner;

public class Principal {
    private final String CHAVE = System.getenv("EXCHANGE_KEY");
    private final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
    private String endereco;
    private String json;
    private int opcaoEscolhida;
    private double valor;
    ApiConsulta apiConsulta = new ApiConsulta();
    ConverterMoedas converterMoedas = new ConverterMoedas();
    public void menuInteragir(){
        Scanner entrada = new Scanner(System.in);

        while (opcaoEscolhida != 7){
            String opcoes = """
               **************************************
               Olá! Você está no conversor de moeda!
               
               1) Dolar -> Peso argentino
               2) Peso argentino -> Dólar
               3) Dólar -> Real brasileiro
               4) Real brasileiro -> Dólar
               5) Dólar -> Peso colombiano
               6) Peso colombiano -> Dólar
               
               7) Sair 
               **************************************
               Escolha qual conversão quer realizar:
              
               """;
            System.out.println(opcoes);
            opcaoEscolhida = entrada.nextInt();
            if(opcaoEscolhida != 7) {
                System.out.println("Qual valor deseja converter? ");
                valor = entrada.nextDouble();
            }
            switch (opcaoEscolhida) {
                case 1:
                    endereco = URL_BASE + CHAVE + "/pair/USD/ARS/" + valor;
                    json = apiConsulta.obterMoeda(endereco);
                    converterMoedas.conversao(json);
                    break;
                case 2:
                    endereco = URL_BASE + CHAVE + "/pair/ARS/USD/" + valor;
                    json = apiConsulta.obterMoeda(endereco);
                    converterMoedas.conversao(json);
                    break;
                case 3:
                    endereco = URL_BASE + CHAVE + "/pair/USD/BRL/" + valor;
                    json = apiConsulta.obterMoeda(endereco);
                    converterMoedas.conversao(json);
                    break;
                case 4:
                    endereco = URL_BASE + CHAVE + "/pair/BRL/USD/" + valor;
                    json = apiConsulta.obterMoeda(endereco);
                    converterMoedas.conversao(json);
                    break;
                case 5:
                    endereco = URL_BASE + CHAVE + "/pair/USD/COP/" + valor;
                    json = apiConsulta.obterMoeda(endereco);
                    converterMoedas.conversao(json);
                    break;
                case 6:
                    endereco = URL_BASE + CHAVE + "/pair/COP/USD/" + valor;
                    json = apiConsulta.obterMoeda(endereco);
                    converterMoedas.conversao(json);
                    break;
                case 7:
                    System.out.println("Saindo, até a próxima!");
                    break;
                default:
                    System.out.println("Opção incorreta! Tente novamente.");
            }

        }

    }
}
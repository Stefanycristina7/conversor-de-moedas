package br.com.conversordemoedas;

import java.util.Scanner;

public class Principal {
    private final String CHAVE = System.getenv("EXCHANGE_KEY");
    private final String URL_BASE = "https://v6.exchangerate-api.com/v6/";
    private String endereco = URL_BASE+CHAVE+"/pair/";
    private String json;
    private int opcaoEscolhida;
    private double valor;
    ApiConsulta apiConsulta = new ApiConsulta();
    ConverterMoedas converterMoedas = new ConverterMoedas();
   public void menuInteragir(){
       Scanner entrada = new Scanner(System.in);


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

       System.out.println("Qual valor deseja converter? ");
       valor = entrada.nextDouble();

       switch (opcaoEscolhida){
           case 1:
               endereco = "USD/ARS/"+valor;
               json = apiConsulta.obterMoeda(endereco);
               converterMoedas.conversao(json);
               break;
       }

   }
}
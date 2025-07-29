package br.com.conversordemoedas;

import java.util.Scanner;

public class Principal {
   public void menuInteragir(){
       Scanner entrada = new Scanner(System.in);
       int opcaoEscolhida;

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

   }
}
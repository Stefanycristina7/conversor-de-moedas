package br.com.conversordemoedas;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverterMoedas {
    //criando objeto Gson personalizado com GsonBuider
    Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) //converter campos snake_case em camelCase
            .create();

    public void conversao(String json){
        MoedaApi moedaApi = gson.fromJson(json, MoedaApi.class);
        Moeda moeda = new Moeda(moedaApi);
        System.out.println(moeda);

    }

}

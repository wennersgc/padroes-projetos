package com.padroes.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public CepApi getInstancia() {
        return instancia;
    }

    public static String recuperarCidade(String cep) {
        return "Cururupu";
    }

    public static String recuperarEstado(String cep) {
        return "Maranhão";
    }
}

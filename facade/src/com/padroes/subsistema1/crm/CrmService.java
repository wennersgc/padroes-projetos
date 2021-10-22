package com.padroes.subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep,
                                     String estado, String cidade) {
        System.out.println(
                String.format("Cliente %s, Migrou para a  cidade de %s de cep %s no estado do %s",
                        nome, cidade, cep, estado)
        );
    }
}

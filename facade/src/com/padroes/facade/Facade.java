package com.padroes.facade;

import com.padroes.subsistema1.crm.CrmService;
import com.padroes.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.recuperarCidade(cep);
        String estado = CepApi.recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, estado, cidade);
    }

}

package com.padroes.teste;

import com.padroes.facade.Facade;

public class Teste {

    public static void main(String[] args) {
        System.out.println("Facade\n");

        Facade facade = new Facade();
        facade.migrarCliente("Wenner", "8888888");
    }
}

package com.padroes.singleton;

/**
 * Singleton que disponibiliza imediatamenter uma
 * instância
 * */
public class SingletoEager {

    private static SingletoEager instancia = new SingletoEager();

    private SingletoEager() {
        super();
    }

    public static SingletoEager getInstancia() {
        return instancia;
    }
}

package com.padroes.singleton;
/**
 * Singleton q não disponipiliza num primeiro momento
 * uma instância para o usuário
 * */
public class SingletonLazy {

    private static SingletonLazy instancia;

    SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        return (instancia == null ? new SingletonLazy() : instancia);
    }
}

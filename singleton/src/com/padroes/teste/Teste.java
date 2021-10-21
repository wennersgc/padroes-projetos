package com.padroes.teste;

import com.padroes.singleton.SingletoEager;
import com.padroes.singleton.SingletonLazy;
import com.padroes.singleton.SingletonLazyHolder;

public class Teste {

    public static void main(String[] args) {

        System.out.println("Singleton Lazy");
        SingletonLazy lazy  = SingletonLazy.getInstancia();
        System.out.println(lazy);

        lazy  = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("\n=======================\n");
        System.out.println("Singleton Eager");
        SingletoEager eager = SingletoEager.getInstancia();
        System.out.println(eager);

        eager = SingletoEager.getInstancia();
        System.out.println(eager);

        System.out.println("\n=======================\n");
        System.out.println("Singleton Lzzy Holder");
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);


    }
}

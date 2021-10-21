package com.padroes.teste;

import com.padroes.context.Robo;
import com.padroes.strategy.Comportamento;
import com.padroes.strategy.impl.ComportamentoAgressivo;
import com.padroes.strategy.impl.ComportamentoDefensivo;
import com.padroes.strategy.impl.ComportamentoNormal;

public class Teste {

    public static void main(String[] args) {
        System.out.println("Strategy\n");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo =  new ComportamentoAgressivo();

        Robo robo = new Robo();

        System.out.println("\nComportamento normal");
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        System.out.println("\nComportamento defensivo");
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();


        System.out.println("\nComportamento agressivo");
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
    }
}

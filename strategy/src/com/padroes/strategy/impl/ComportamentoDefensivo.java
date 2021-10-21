package com.padroes.strategy.impl;

import com.padroes.strategy.Comportamento;

public class ComportamentoDefensivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
}

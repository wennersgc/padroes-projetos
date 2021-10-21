package com.padroes.strategy.impl;

import com.padroes.strategy.Comportamento;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente...");
    }
}

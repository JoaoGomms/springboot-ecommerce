package com.example.demo.entity;

public enum TipoPagamento {
    BO("Boleto"),
    CC("Cartão de Crédito"),
    CD("Cartão de Débito"),
    RE("Refeição");

    private String tipo;

    TipoPagamento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

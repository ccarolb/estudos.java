package com.company.exercicios.heranca_polimorfismo;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numConta, int agencia, double limite) {
        super(numConta, agencia);
        this.limite = limite;
    }
@Override
    public double sacar(double valor) {
        if(valor <= limite) {
            super.sacar(valor);
        }
        return valor;
    }
}

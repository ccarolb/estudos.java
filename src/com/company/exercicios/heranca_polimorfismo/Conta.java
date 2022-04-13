package com.company.exercicios.heranca_polimorfismo;

public class Conta {
    private String nomeCliente;
    private int numConta;
    private int agencia;
    private double saldo;

    public Conta(int numConta, int agencia) {
        this.numConta = numConta;
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double sacar(double valor) {
        this.saldo -= valor;
        return valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }
}

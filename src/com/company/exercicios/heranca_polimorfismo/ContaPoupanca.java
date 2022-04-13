package com.company.exercicios.heranca_polimorfismo;

public class ContaPoupanca extends Conta {
    private int diaRendimento;
    private double saldoPoupanca;

    public ContaPoupanca(int numConta, int agencia) {
        super(numConta, agencia);
    }

    public void depositaPoupanca(double valor) {
        if(super.getSaldo() >= valor) {
          super.sacar(valor);
          this.saldoPoupanca += valor;
        }
    }

    public void calcularNovoSaldo(double taxaRendimento) {
      double rendimento = this.saldoPoupanca * taxaRendimento;
      this.saldoPoupanca += rendimento;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }
}

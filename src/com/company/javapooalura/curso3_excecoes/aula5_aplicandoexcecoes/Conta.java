package com.company.javapooalura.curso3_excecoes.aula5_aplicandoexcecoes;

import com.company.javapooalura.curso2_herancapolimorfinterfaces.aula4_herancaconstrutores.Cliente;


//classe abstrata porque não queremos poder criar apenas uma conta. ela deve ser uma conta corrente, poupança, salário, etc.
public abstract class Conta {
    private static int total;
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;


  public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        total++;
    }

    public  String depositar(double valor) {
             this.saldo += valor;
             return "Depósito realizado com sucesso.";
         }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("\nSaldo insuficiente: " + this.getSaldo() + "\nValor a sacar: " + valor);
        }
        this.saldo -= valor;
     }

    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double getSaldo() {
            return this.saldo;
        }

    public int getAgencia() {
            return this.agencia;
        };

    public int getNumero() {
            return this.numero;
        };

    public Cliente getTitular() {
            return this.titular;
        }

    public void setTitular(Cliente titular) {
            this.titular = titular;
        }

    public static int getTotal() {
        return Conta.total;
    }
}

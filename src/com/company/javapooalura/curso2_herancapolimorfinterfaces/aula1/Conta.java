package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula1;

import com.company.javapooalura.curso1_intropoo.aula5.Cliente;

public class Conta {
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

    public boolean sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
     }

    public String transferir(double valor, Conta destino) {

            if(this.saldo >= valor) {
                this.sacar(valor);
                destino.depositar(valor);
                return "Transferência realizada com sucesso.";
            }
            return "Não foi possível realizar a transferência.";

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

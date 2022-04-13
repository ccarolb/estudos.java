package com.company.javapooalura.curso1_intropoo.aula6_4;

import com.company.javapooalura.curso1_intropoo.aula5.Cliente;

public class ContaComStatic {
    private static int total; //total com static.
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;


  public ContaComStatic(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;

        //Aula 6.4: Static
                //Suponha que a gente queira que a cada instância de Conta criada, se some 1 ao total, pra gente consultar quantas contas foram criadas ao todo.
                //Pra consultar quantas contas foram criadas ao todo, vamos fazer um getter.
        total++;
        //OBS: antes eu tinha colocado antes do total++ um total = 0. Não precisa fazer isso, já q o default dos atributos é 0/null.
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

    public String transferir(double valor, ContaComStatic destino) {

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

//getter de total, agora com static.
    public static int getTotal() {
        return ContaComStatic.total;
    }
}

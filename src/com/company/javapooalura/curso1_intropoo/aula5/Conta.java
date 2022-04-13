package com.company.javapooalura.curso1_intropoo.aula5;

public class Conta {
        private double saldo; //AtributosPrivadosEncapsulamento.java
        private int agencia;
                                //O ideal é que todos nossos atributos sejam privados, pq a gente n quer mexer na raíz, a gente quer mexer com métodos que mexem com a raíz.
                                //Ex: pra mudar nosso narigão, a gente não achata o nariz na mão, a gente procura o método de cirúrgia plástica.
        private int numero;
        private Cliente titular; // -> classe Cliente dentro da classe Conta. tb dá pra fazer Classe nomeVar = new Classe(); aqui dentro já, depende do caso.

  /*   void depositar(double valor) { //void: pq o método não vai retornar nada. ele poderia retornar um msg escrito "Depósito feito com sucesso", daí seria String depositar, e assim vai, td depende do
             //tipo de dado q a gente quer q retorne, mas aqui não retornamos nada então é void. obs: O VOID É OBRIGATÓRIO!!!!!!!!!!!!!!!!!!!!
              this.saldo += valor;
        }*/

  public  String depositar(double valor) {
         this.saldo += valor;
         return "Depósito realizado com sucesso."; //só vai aparecer na tela se a gente imprimir o ato de depositar, ex: System.out.println(contaCarol.depositar(200));
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

                    //isso é um getter.
    public double getSaldo() { //AtributosPrivadosEncapsulamento.java
        return this.saldo; //return pq daí retorna o saldo mas sem mostrar direto, só se a gente printar ou exibir de outra forma. é isso q a gente quer, acessar com return.
    }

    //não faz sentido ter setter pro saldo porque ele já tem outros métodos que trabalham com ele. Sacar, transferir, depositar. E a gente não quer ATRIBUIR um saldo manual-
    //mente, pq o set é de setar, ou seja, atribuir. A gente quer na vdd é trabalhar c as regras de negócio q é um saldo só pode ser alterado através de movimentações, tipo
    //o depósito, a transferência, o saque, o pix, etc.


    public int getAgencia() {
        return this.agencia;
    };

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    };

    public int getNumero() {
        return this.numero;
    };

    public void setNumero(int numero) {
        this.numero = numero;
    };

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}

package com.company.javapooalura.curso1_intropoo.aula2;

public class Conta {
        private double saldo; //AtributosPrivadosEncapsulamento.java
        private int agencia;
        private int numero;
        Cliente titular; // -> classe Cliente dentro da classe Conta. tb dá pra fazer Classe nomeVar = new Classe(); aqui dentro já, depende do caso.

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

    public double getSaldo() { //AtributosPrivadosEncapsulamento.java
        return this.saldo; //return pq daí retorna o saldo mas sem mostrar direto, só se a gente printar ou exibir de outra forma. é isso q a gente quer, acessar com return.
    }
}

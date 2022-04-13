package com.company.javapooalura.curso1_intropoo.aula2;

public class AtributosPrivadosEncapsulamento {

    public static void main(String[] args) {
        Conta conta = new Conta();
      //  conta.saldo = 100; // saldo é privado (private double saldo;), não podemos acessar ele, nem modificar nem visualizar com System.out.println

//        System.out.println(conta.saldo);
        //A solução pra podermos visualizar o saldo é criar um método em Conta que nos retorne ele.

        System.out.println(conta.getSaldo());
    }

}

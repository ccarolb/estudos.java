package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula1;

import com.company.javapooalura.curso1_intropoo.aula6_4.ContaSemStatic;

public class TestaStatic {
    public static void main(String[] args) {
        ContaSemStatic conta = new ContaSemStatic(2404, 2212);
        ContaSemStatic outraConta = new ContaSemStatic(2499, 1851);

        System.out.println(outraConta.getTotal());

        Conta contaStatic = new Conta(5996, 2104);
        Conta outraContaStatic = new Conta(8799, 5154);

        System.out.println(Conta.getTotal());
    }
}

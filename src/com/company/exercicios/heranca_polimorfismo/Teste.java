package com.company.exercicios.heranca_polimorfismo;

public class Teste {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta(2222, 3212);
        ContaPoupanca contaComPoupanca = new ContaPoupanca(2322, 3212);
        ContaEspecial contaEspecial = new ContaEspecial(2422, 3212, 500);

        contaCorrente.setNomeCliente("João");
        contaComPoupanca.setNomeCliente("Maria");
        contaEspecial.setNomeCliente("Joaquina");

        contaComPoupanca.depositar(500);
//        System.out.println(contaComPoupanca.getSaldo());

        contaComPoupanca.depositaPoupanca(500);
//        System.out.println(contaComPoupanca.getSaldo());
//        System.out.println(contaComPoupanca.getSaldoPoupanca());

        contaComPoupanca.calcularNovoSaldo(0.001);
//        System.out.println(contaComPoupanca.getSaldoPoupanca());

        contaEspecial.depositar(1000);
        System.out.println(contaEspecial.getSaldo());
        contaEspecial.sacar(500);
        System.out.println(contaEspecial.getSaldo());

        System.out.println("\nOs dados do cliente com conta poupança são:\nNome: " + contaComPoupanca.getNomeCliente() + "\nNúmero da conta: " + contaComPoupanca.getNumConta() + "\nAgência: " + contaComPoupanca.getAgencia());
        System.out.println("\nOs dados do cliente com conta corrente são:\nNome: " + contaCorrente.getNomeCliente() + "\nNúmero da conta: " + contaCorrente.getNumConta() + "\nAgência: " + contaCorrente.getAgencia());
        System.out.println("\nOs dados do cliente com conta especial são:\nNome: " + contaEspecial.getNomeCliente() + "\nNúmero da conta: " + contaEspecial.getNumConta() + "\nAgência: " + contaEspecial.getAgencia());
    }
}

package com.company.javabasico.curso3_excecoes.aula5_aplicandoexcecoes;

public class TestaSaldoInsuficiente {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente contacore = new ContaCorrente(222, 333);

        contacore.depositar(20);

        //testa Exception no método sacar
        try {
            contacore.sacar(260);
        }
        catch (SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println("Exception na contacore1: " + saldoInsuficienteException.getMessage());
        }

        ContaCorrente contacore2 = new ContaCorrente(234, 112);

        contacore2.depositar(100);

        //testa Exception no método transferir
        try {
            contacore2.transferir(200, contacore);
        } catch (SaldoInsuficienteException saldoInsuficienteException) {
            System.out.println("\n\nException na contacore2: " + saldoInsuficienteException.getMessage());
        }


    }
}

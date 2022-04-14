package com.company.javabasico.curso3_excecoes.aula5_aplicandoexcecoes;


public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        double valorASacar = valor + 0.20; //regra de negócio hipotética que diz que ao sacar da conta corrente é cobrada uma taxa de 20 centavos.
        super.sacar(valorASacar);
    }
}

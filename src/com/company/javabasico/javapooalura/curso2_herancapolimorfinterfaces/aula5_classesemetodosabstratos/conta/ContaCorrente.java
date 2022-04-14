package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula5_classesemetodosabstratos.conta;

public class ContaCorrente extends Conta {
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) {
        double valorASacar = valor + 0.20; //regra de negócio hipotética que diz que ao sacar da conta corrente é cobrada uma taxa de 20 centavos.
        return super.sacar(valorASacar);
    }
}

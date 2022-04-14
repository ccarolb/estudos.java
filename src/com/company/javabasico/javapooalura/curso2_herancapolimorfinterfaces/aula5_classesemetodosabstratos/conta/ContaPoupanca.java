package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula5_classesemetodosabstratos.conta;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero); //parâmetros no construtor e super(atributos) no escopo -> faz herdar o construtor da superclasse, já que isso não é feito "naturalmente".
    }
}

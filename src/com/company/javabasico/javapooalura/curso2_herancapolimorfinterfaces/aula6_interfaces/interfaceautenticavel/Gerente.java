package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces.interfaceautenticavel;

//Gerente é um Funcionario, assina o contrato Autenticavel e é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        return super.getSalario();
    };

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }

}

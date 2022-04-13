package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces.interfaceautenticavel;

//Administrador é um Funcionario, assina o contrato Autenticavel e é um Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        return super.getSalario() + 100;
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}

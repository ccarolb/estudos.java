package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces;

//Problemática: FuncionarioAutenticavel é um Funcionário, mas agora Cliente também quer acessar o sistema.
//Solução: renomear FuncionarioAutenticavel para Autenticavel e torná-la uma interface, que não estende nenhuma superclasse. IR PARA PASTA INTERFACE

public abstract class FuncionarioAutenticavel extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

}

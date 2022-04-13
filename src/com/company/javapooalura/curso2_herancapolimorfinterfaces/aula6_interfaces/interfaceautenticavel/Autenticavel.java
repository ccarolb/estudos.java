package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces.interfaceautenticavel;

//Problemática: FuncionarioAutenticavel é um Funcionário, mas agora Cliente também quer acessar o sistema.
//Solução: renomear FuncionarioAutenticavel para Autenticavel e torná-la uma interface, que não estende nenhuma superclasse.

//Obs: interface não possui nada concreto, apenas métodos abstratos.
public interface Autenticavel {

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}

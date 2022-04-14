package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces.interfaceautenticavel;

//Cliente assina o contrato Autenticavel e é um Autenticavel
public class Cliente implements Autenticavel {
    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}

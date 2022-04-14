package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula7_praticandoherancainterface.composicao_1;

public class Autenticacao {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}

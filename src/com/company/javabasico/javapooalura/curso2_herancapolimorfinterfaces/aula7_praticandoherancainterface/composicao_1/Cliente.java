package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula7_praticandoherancainterface.composicao_1;

//Cliente assina o contrato Autenticavel e é um Autenticavel
public class Cliente implements Autenticavel {
    private Autenticacao autenticacao;

    public Cliente() {
        this.autenticacao = new Autenticacao();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticacao.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacao.autentica(senha);
    }
}
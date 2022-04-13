package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula7_praticandoherancainterface.composicao_1;

//Gerente é um Funcionario, assina o contrato Autenticavel e é um Autenticavel
public class Gerente extends Funcionario implements Autenticavel {
    private Autenticacao autenticacao;

    public Gerente() {
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

    @Override
    public double getBonificacao() {
        return super.getSalario();
    }
}

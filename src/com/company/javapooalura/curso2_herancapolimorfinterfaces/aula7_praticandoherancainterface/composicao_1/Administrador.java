package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula7_praticandoherancainterface.composicao_1;

//Administrador é um Funcionario, assina o contrato Autenticavel e é um Autenticavel
public class Administrador extends Funcionario implements Autenticavel {
    private Autenticacao autenticacao;

    public Administrador() {
        this.autenticacao = new Autenticacao();
    }

    @Override
    public double getBonificacao() {
        return super.getSalario() + 100;
    }


    //A lógica de autenticação está repetida em Administrador, Gerente e Cliente. Pode ser criada uma classe Autenticador para melhorar isso, e chamá-la em um construtor dentro dessas classes.
    @Override
    public void setSenha(int senha) {
        this.autenticacao.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticacao.autentica(senha);
    }
}

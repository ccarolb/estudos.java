package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2;

public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() { //public double getBonificacao() = assinatura do método. Aqui a gente sobrescreveu/reescreveu esse método.
                                    //reescrever minimamente o escopo de um método sem mudar sua assinatura é um conceito chamado de reescrita.

        return super.salario; //salario -> se private na superclasse Funcionario não compila. Deve estar como protected (visível apenas na superclasse e nas classes filhas)
        //outro ponto: this.salario = refere-se como se salario fosse um atributo de Gerente, sendo que salario é atributo da superclasse. deve-se usar o super.atributo p/ se referir a atributos da superclasse
    };

}

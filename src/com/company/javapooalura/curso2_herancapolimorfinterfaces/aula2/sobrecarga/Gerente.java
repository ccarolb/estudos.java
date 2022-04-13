package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2.sobrecarga;

import com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2.super_reescritametodos.Funcionario;

public class Gerente extends Funcionario {
    private String login;
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    /*mesmo método na mesma classe porém com mais ou menos parâmetros = sobrecarga.
     A sobrecarga não leva em conta a visibilidade ou retorno do método, apenas os parâmetros e não depende da herança.*/

    public boolean autentica(String login, int senha) {
        return this.senha == senha && this.login == login;
    }


    public double getBonificacao() {
        return super.getSalario() + super.getBonificacao();
    };

}

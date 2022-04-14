package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class Gerente extends Funcionario {
    private int senha;
    private String cargo = "Gerente";

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        return super.getSalario() + super.getBonificacao();
    };

    public String getCargo() {
        return cargo;
    }
}

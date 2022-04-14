package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2;

public class Funcionario {
    private String nome;
    private String cpf;
    protected double salario;

    public double getBonificacao() {
        return this.salario*0.10;
    }; //public double getBonificacao() = assinatura do método. *ir para Gerente.java

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    };


}

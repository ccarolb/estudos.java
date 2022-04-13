package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private String cargo = "Funcionário";

    public double getBonificacao() {
        return this.salario*0.10;
    }

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

    public String getCargo() {
        return cargo;
    }

}

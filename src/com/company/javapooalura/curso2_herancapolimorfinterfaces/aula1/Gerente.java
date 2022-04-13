package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula1;

public class Gerente extends Funcionario {
   /*
    private String nome;
    private String cpf;        problema: o gerente é um funcionário, e a classe Funcionário já tem alguns desses atributos, bem como alguns desses métodos pra manipulá-los.
    private double salario;    solução: usando herança (extends), onde Gerente vai herdar os comportamentos e atributos de Funcionário (que é a super classe), e passa a ser um Funcionário também.
    */
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
/*
    public double getBonificacao() {
        return this.salario*0.10;
    };

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
    };*/

}

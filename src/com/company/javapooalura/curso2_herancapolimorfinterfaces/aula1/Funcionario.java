package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula1;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public double getBonificacao() {
        return this.salario*0.10;
    };

    //problemas se houver outros tipos de funcionário = ifs crescem infinitamente, tipos de funcionário com atributos e métodos que não deveria ter (ex: funcionário
    //comum e diretor tem como atributo uma senha que apenas um gerente deveria ter, bem como um método setSenha. -> code smells, má prática.

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

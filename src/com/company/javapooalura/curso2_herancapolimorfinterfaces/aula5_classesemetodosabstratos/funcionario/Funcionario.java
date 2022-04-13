package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula5_classesemetodosabstratos.funcionario;

//abstract -> superclasse passa a ser um conceito, não é possível mais instanciar ela. Pra instanciar, só criando no mínimo 1 subclasse para instanciar.
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //nova regra de negócio: não existe uma regra de bonificação padrão. cada tipo de funcionário tem sua própria regra. logo getBonificacao em Funcionario não pode ter implementação.
    //abstract em método -> sem implementação, força os filhos a implementar esse método (com reescrita).
    public abstract double getBonificacao();

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

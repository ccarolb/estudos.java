package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula2.super_reescritametodos;

public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {

        /*Suponha que a regra de negócio mudou e agora o gerente recebe como bonificação o salário dele + o de todos os funcionários. A gente poderia escrever assim:

        return super.salario + (super.salario*0.10)

        Porém assim estariámos duplicando código, o que não é uma boa prática. Dessa forma podemos trocar (super.salario*0.10) por super.getBonificacao().

        Suponha que agora a gente tenha salario em Funcionario de forma privada, que é o ideal, já que não queremos acessar diretamente uma info tão sensível.
        Pra resolver isso, podemos acessar o salário pelo getter dele, assim:

        super.getSalario()

        Então nosso código final fica assim:
        */

        return super.getSalario() + super.getBonificacao();
    };

}

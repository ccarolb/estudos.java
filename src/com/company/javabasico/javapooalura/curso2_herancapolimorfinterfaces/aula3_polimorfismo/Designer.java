package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class Designer extends Funcionario {
    private String cargo = "Designer";

    public double getBonificacao() {
        return super.getSalario() + 200;
    };

    public String getCargo() {
        return cargo;
    }

}

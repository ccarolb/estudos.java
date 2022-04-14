package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces;

//Gerente herda de FuncionarioAutenticavel que herda de Funcionario
public class Administrador extends FuncionarioAutenticavel {

    @Override
    public double getBonificacao() {
        return super.getSalario() + 100;
    }
}

package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces;

            //Gerente herda de FuncionarioAutenticavel que herda de Funcionario
public class Gerente extends FuncionarioAutenticavel {
    @Override
    public double getBonificacao() {
        return super.getSalario();
    };

}

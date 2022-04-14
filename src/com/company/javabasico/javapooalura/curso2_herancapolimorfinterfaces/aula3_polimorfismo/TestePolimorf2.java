package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class TestePolimorf2 {
    public static void main(String[] args) {

        Funcionario gerenteTipoFuncionario = new Gerente(); //compila, porque:
                                        //todos os gerentes
            //são funcionários

        //Gerente funcionarioTipoGerente = new Funcionario(); //não compila, porque:          -> na hierarquia: Funcionario superclasse de Gerente, e não Gerente superclasse de Funcionario.
                                    //nem todos os funcionários
            //são gerentes

      //  gerenteTipoFuncionario.autentica(222); //não compila, porque a superclasse Funcionário não contém o método autentica, que é específico da subclasse Gerente.
        // O lado esquerdo da instanciação determina os métodos disponíveis.

        Gerente gerenteTipoGerente = new Gerente();

        gerenteTipoGerente.autentica(2222); //compila, a subclasse Gerente contém o método autentica.


    }
}

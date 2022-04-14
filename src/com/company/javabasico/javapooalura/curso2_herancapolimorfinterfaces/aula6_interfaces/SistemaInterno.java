package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces;

//Nova regra de negócio: existirá um sistema interno no qual o gerente E O ADMINISTRADOR deverão ser autenticados.
public class SistemaInterno {
    int senha = 5112;


    public void autentica(FuncionarioAutenticavel funcAutentica) {
        boolean autenticou = funcAutentica.autentica(this.senha);

        if(autenticou) {
            System.out.println("Usuário autenticado");
        } else {
            System.out.println("Usuário não autenticado");
        }
    }

}

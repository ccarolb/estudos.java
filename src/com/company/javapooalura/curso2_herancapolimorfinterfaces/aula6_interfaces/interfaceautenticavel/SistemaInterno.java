package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces.interfaceautenticavel;

//Nova regra de negócio: existirá um sistema interno no qual gerente, administrador E CLIENTE poderão ser autenticados.
public class SistemaInterno {
    int senha = 5112;

    public void autentica(Autenticavel usuario) {
        boolean autenticou = usuario.autentica(this.senha);

        if(autenticou) {
            System.out.println("Usuário autenticado");
        } else {
            System.out.println("Usuário não autenticado");
        }
    }

}

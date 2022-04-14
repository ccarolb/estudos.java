package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula7_praticandoherancainterface.composicao_1;

public class TestaAutenticacao {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Cliente cliente = new Cliente();
        Administrador administrador = new Administrador();
        SistemaInterno sistemaInterno = new SistemaInterno();

        gerente.setSenha(222);
        cliente.setSenha(5212);
        administrador.setSenha(5112);

        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(cliente);
        sistemaInterno.autentica(administrador);
    }

}

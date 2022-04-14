package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula6_interfaces;

public class Teste {
    public static void main(String[] args) {

        Gerente g = new Gerente();

        Administrador a = new Administrador();

        Designer d = new Designer();

        SistemaInterno sistema = new SistemaInterno();

/*      d.setSenha(5112);         após setar a lógica de autenticação em uma classe FuncionarioAutenticavel, onde as filhas são Gerente e Adm, essas 2 linhas param de compilar, visto que
        sistema.autentica(d);     a classe Designer só é filha de Funcionario.
 */

        g.setSenha(5112);
        sistema.autentica(g);

        a.setSenha(5112);
        sistema.autentica(a);
    }
}

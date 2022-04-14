package com.company.javabasico.curso3_excecoes.aula6_finallytrywithrsrcs;

public class TestaConexao {
    public static void main(String[] args) {

            //já instancia a conexão dentro do parêntese.
        try(Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException illegalStateException) {
            System.out.println("Deu erro");
        }

    }
}

package com.company.javabasico.curso3_excecoes.aula6_finallytrywithrsrcs;

public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Conexão aberta");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }

    @Override //com o método close não precisa do finally chamando esse método, vai ser auto-fechável (autocloseable)
    public void close() {
        System.out.println("Conexão fechada");
    }
}

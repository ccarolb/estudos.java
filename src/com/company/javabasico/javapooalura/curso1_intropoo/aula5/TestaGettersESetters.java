package com.company.javapooalura.curso1_intropoo.aula5;

public class TestaGettersESetters {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.depositar(20);

        System.out.println(conta.getSaldo());

        conta.setAgencia(116);
        System.out.println(conta.getAgencia());

        conta.setNumero(553409);
        System.out.println(conta.getNumero());


        Cliente cliente = new Cliente();
        cliente.setNomeCompleto("Carol");
        cliente.setCpf("111111111111");
        cliente.setProfissao("programadora");

        conta.setTitular(cliente);
        System.out.println(conta.getTitular().getNomeCompleto());

        conta.getTitular().setNomeCompleto("Outro nome");

        System.out.println(conta.getTitular().getNomeCompleto());



        System.out.println(conta.getTitular());
//                                                        they're the same thing. Os dois apontam pra um objeto do tipo Cliente, no endereço @eed1f14
        System.out.println(cliente);

    }
}

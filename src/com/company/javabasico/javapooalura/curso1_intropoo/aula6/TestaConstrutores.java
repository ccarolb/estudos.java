package com.company.javapooalura.curso1_intropoo.aula6;

import com.company.javapooalura.curso1_intropoo.aula5.Cliente;

public class TestaConstrutores {
    public static void main(String[] args) {
        ContaComConstrutor conta = new ContaComConstrutor(222, 333); //construtor: agora é obrigado a passar alguns argumentos na instanciação. quais argumentos vão ser depende
        //da regra de negócio, mas nesse caso uma conta n pode ser aberta com agencia e numero 0 por default. sempre vai ter um número e uma agencia assim q se cria a conta, não se define isso
        // depois como tava sendo com o setNumero e setAgencia.

        conta.depositar(20);

        System.out.println(conta.getSaldo());
        System.out.println(conta.getAgencia());
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

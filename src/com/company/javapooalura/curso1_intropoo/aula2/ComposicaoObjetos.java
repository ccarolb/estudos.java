package com.company.javapooalura.curso1_intropoo.aula2;

public class ComposicaoObjetos {
    public static void main(String[] args) {
        Cliente carol = new Cliente();    //                primeiro instancia um novo objeto do tipo Cliente
        carol.nomeCompleto = "Carolina Fulaninha da Silva";
        carol.cpf = "2222222222222";      //                dps popula esse objeto c os atributos dele
        carol.profissao = "desenvolvedora";

        Conta contaCarol = new Conta();   //                dps instancia um novo objeto do tipo Conta
        contaCarol.titular = carol;       //                dps atribui a titular (atributo onde vai ser atribuído o objeto do tipo Cliente)
                                          //                essa nova instância carol do tipo Cliente.

        System.out.println(contaCarol.titular.cpf);

        //                                                                OU

        Conta contaCarolina = new Conta();  //              instancia um novo objeto contaCarolina do tipo Conta;
        contaCarolina.titular = new Cliente(); //           atribui DIRETO ao campo (atributo) titular uma nova instância do tipo Cliente.

        contaCarolina.titular.nomeCompleto = "Carol";
        contaCarolina.titular.cpf = "111111111";  //        dps é só popular os atributos de titular, que aponta para um objeto do tipo Cliente.
        contaCarolina.titular.profissao = "dev";

        System.out.println(contaCarolina.titular.nomeCompleto);

    }
}

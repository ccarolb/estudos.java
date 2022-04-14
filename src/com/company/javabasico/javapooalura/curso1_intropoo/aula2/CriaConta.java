
package com.company.javapooalura.curso1_intropoo.aula2;

public class CriaConta {
    public static void main(String[] args) {

        Conta contaCarol = new Conta(); //contaCarol faz referência (aponta) a um objeto new Conta() criado a partir de Conta;
// Conta: indica que       new: instancia um novo objeto conta a partir da classe (que é o protótipo/blueprint/etc) Conta;
// contaCarol vai fazer
// referência (apontar na
// memória) a Conta.

//        contaCarol.saldo = 200;

//        System.out.println(contaCarol.saldo);

//        contaCarol.saldo += 200;

//        System.out.println(contaCarol.saldo);


/*
se a gente escrevesse só saldo += 200, o java não ia nem achar essa variável saldo, e nem ia compilar, pq ela tá dentro do objeto e não fora, fora ela nem existe.
dessa forma a gente tem que lembrar de trabalhar orientado ao objeto.
*//*


        Conta segundaConta = new Conta();

        System.out.println("Seu saldo é: " + segundaConta.saldo + ". Sua agência é: " + segundaConta.agencia + ". Seu número de conta é: " + segundaConta.numero + ". O titular é: " + segundaConta.titular);
*/
/*      O valor default dos atributos de uma classe é 0 pra variáveis do tipo número. Pra boolean é false. Então o default é ser 0, seja falsy, null, etc. A não ser que a gente
especifique um valor lá no próprio atributo, dentro da classe.
*/


    }
}

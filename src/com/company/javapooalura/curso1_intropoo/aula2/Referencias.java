/*
package com.company.javapooalura.intropoo.aula2;

public class Referencias {

    public static void main(String[] args) {


//a variável contaUm referencia (aponta pra um) um endereço na memória onde está localizada a nova instância (objeto) do tipo Conta;
//fazendo o System.out.println(contaUm) se descobre o endereço da memória pra onde a variável contaUm aponta.

//variável do tipo Conta
        Conta contaUm = new Conta();
                        //instanciação de um novo objeto do tipo Conta, cujo endereço a variável contaUm está referenciando/apontando. -> new Conta();

        System.out.println(contaUm); // -> deve ter como output "com.company.javapooalura.intropoo.aula2.Conta@65ab7765". Perceba o Conta@65ab7765
        //@65ab7765 significa o endereço da memória onde está armazenado o novo objeto do tipo Conta, instanciado da classe Conta.


        Conta contaDois = contaUm; // -> contaDois vai apontar (referenciar) pro mesmo endereço de memória cujo único objeto do tipo Conta está guardado e que contaUm aponta.
//isso não vai clonar o objeto e fazer com que se tenha um objeto contaDois igual ao contaUm.
//O que vai acontecer é que contaDois vai referenciar o mesmo endereço de memória que contaUm referencia. Isso porque contaUm ou contaDois não armazenam o objeto, eles só apontam pro endereço cujos objetos estão armazenados
//na memória.

        System.out.println(contaDois); // -> deve ter como output "com.company.javapooalura.intropoo.aula2.Conta@65ab7765", onde @65ab7765 é o msm endereço da memória onde está armazenado esse objeto do tipo Conta.

        System.out.println(contaUm.saldo);
        System.out.println(contaDois.saldo);

        contaDois.saldo = 100; // -> alterou o atributo saldo do objeto cujo endereço de memória é referenciado pela variável contaDois E PELA variável contaUm.
        System.out.println(contaDois.saldo); // -> saldo = 100;
        System.out.println(contaUm.saldo); // -> saldo = 100;



        Conta contaTres = new Conta(); //nova instância de Conta() -> novo objeto do tipo conta -> novo endereço de memória;

        System.out.println(contaTres); //aponta p/ um endereço de memória diferente, visto que na linha 35 foi criada um novo objeto do tipo Conta, cujo endereço de memória a variável contaTres vai estar referenciando, e que é
        // Conta@eed1f14

//      Conta contaDois = new Conta();

    }

}
*/

package com.company.javapooalura.curso1_intropoo.aula6_4;

public class TestaStatic {
    public static void main(String[] args) {
        ContaSemStatic conta = new ContaSemStatic(2404, 2212);
        ContaSemStatic outraConta = new ContaSemStatic(2499, 1851);

        System.out.println(outraConta.getTotal()); //Aqui a gente tem dois problemas:
        /*
        1 - O que imprime no console é 1, sendo que criamos duas contas.

        2 - A gente pediu pra uma conta em específico nos dizer o total criado de TODAS as contas. É tipo chegar pra um gatinho e perguntar pra ele pq que TODOS os gatinhos são fofos, invés de
        chegar e fazer uma Assembleia de gatinhos e perguntar no microfone pra todos os gatinhos de uma só vez por que que eles são fofos. Eles não vão responder, porque são só gatinhos, mas
        a ideia é essa, de perguntar pra um específico quando vc quer perguntar pra todos.

        Pra solucionar isso existe o método static, que a gente põe lá na criação do atributo e também em todo método que trabalhar com ele. O static permite que o atributo seja DA CLASSE,
        e não um atributo de cada objeto que for instanciado. Pq ali quando imprime 1, é pq qnd se cria a conta, o atributo total soma +1, só que ele soma só na conta instanciada, não pra todas.
        Qnd acontece isso o atributo total é da conta, e o outro atributo total, é da outraConta, então esse total não tá se somando 1+1, ele tá fazendo total = 0 + 1.
        Só o static pra resolver isso.
        */

        ContaComStatic contaStatic = new ContaComStatic(5996, 2104);
        ContaComStatic outraContaStatic = new ContaComStatic(8799, 5154);

//        System.out.println(contaStatic.getTotal()); //não compila se perguntando pra instância, agora só compila perguntando pra classe.

        System.out.println(ContaComStatic.getTotal()); //Agora a gente vê que o total de contas criadas é 2.
    }
}

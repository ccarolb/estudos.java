package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula4_herancaconstrutores;

public class Teste {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca(223, 5599);
        ContaCorrente cc = new ContaCorrente(203, 5119);

        cc.depositar(500);
        cp.depositar(200);

        cc.transferir(10, cp); //Polimorfismo -> aqui mesmo não sendo o método sacar, foi descontada a taxa, isso porque o método de Conta transferir chama o método sacar específico da ContaCorrente com o uso do this.sacar que é o mesmo que cc.sacar, onde cc é do tipo ContaCorrente.

        //                                              0,20 = taxa de conta corrente
        System.out.println(cc.getSaldo()); // -> 500 - 10,20 = 489,80
        System.out.println(cp.getSaldo()); // -> 200 + 10 = 210
    }
}

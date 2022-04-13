package com.company.javapooalura.curso1_intropoo.aula6;

import com.company.javapooalura.curso1_intropoo.aula5.Cliente;

public class ContaComConstrutor {
    private int total;
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;


  public ContaComConstrutor(int agencia, int numero) {  //construtor: agora é obrigado a passar alguns argumentos na instanciação. quais argumentos vão ser depende
      //da regra de negócio, mas nesse caso uma conta n pode ser aberta com agencia e numero 0 por default. sempre vai ter um número e uma agencia definidos assim q se cria a conta, não se
      // define isso depois como tava sendo com o setNumero e setAgencia, logo a gente n precisa mais desses setters se tem os construtores pra inicializar atributos já na instanciação.
        this.agencia = agencia;
        this.numero = numero;

        //Aula 6.4: Static
        total = 0;
                //Suponha que a gente queira que a cada instância de Conta criada, se some 1 ao total, pra gente consultar quantas contas foram criadas ao t.odo.
        total++;
    }

    public  String depositar(double valor) {
             this.saldo += valor;
             return "Depósito realizado com sucesso."; //só vai aparecer na tela se a gente imprimir o ato de depositar, ex: System.out.println(contaCarol.depositar(200));
         }

    public boolean sacar(double valor) {
        if (this.saldo > valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
     }

    public String transferir(double valor, ContaComConstrutor destino) {

            if(this.saldo >= valor) {
                this.sacar(valor);
                destino.depositar(valor);
                return "Transferência realizada com sucesso.";
            }
            return "Não foi possível realizar a transferência.";

        }

    public double getSaldo() {
            return this.saldo;
        }


    public int getAgencia() {
            return this.agencia;
        };

//    public void setAgencia(int agencia) {
//            this.agencia = agencia;
//        };

    public int getNumero() {
            return this.numero;
        };

//    public void setNumero(int numero) {
//            this.numero = numero;
//        };

    public Cliente getTitular() {
            return this.titular;
        }

    public void setTitular(Cliente titular) {
            this.titular = titular;
        }
}

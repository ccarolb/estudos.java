package com.company.javapooalura.curso2_herancapolimorfinterfaces.aula3_polimorfismo;

public class ControleBonificacao_TSTPolimorf3 {
    private double soma;

                                //parâmetro de entrada: objeto do tipo Funcionário (incluindo designer e gerente, que também são funcionários)
    public void controlaBonificacao(Funcionario funcionario) {
        double bonificacao = funcionario.getBonificacao();
        //entra nos parâmetros = classe mãe, logo tb as classes filhas, chamando o método getBonificacao com o escopo específico de cada subclasse.

        System.out.println("Chamou o método de bonificação de " + funcionario.getCargo());
        this.soma += bonificacao;
    }

    public double getSoma() {
        return soma;
    }
}

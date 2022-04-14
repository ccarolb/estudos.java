package com.company.javapooalura.curso1_intropoo.aula6_7;

public class Gatinho {
    private int idade;
    private String raca;
    private String miado;
    private boolean isZoomie;

   public Gatinho(int idade, String raca, boolean isZoomie) {
        this.idade = idade;
        this.raca = raca;
        this.isZoomie = isZoomie;

        miado = "Meow";
    }

    public Gatinho(int idade, String raca) {
       this(idade, raca, true);
    }

}

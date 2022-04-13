package com.company.exercicios.classes_metodos;

public class Lampada {
    double voltagem;
    String marca;
    double preco;
    int quantosWatts;
    String qualSetor;
    boolean isLigada;

    public String ligar() {
        this.isLigada = true;
        return "A lâmpada está ligada.";
    }

    public String desligar() {
        this.isLigada = false;
        return "A lâmpada está desligada.";
    }
}

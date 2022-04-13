package com.company.exercicios.classes_metodos;

import java.util.Arrays;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String[] disciplinas = new String[3];
    double[] notas = new double[3];
    boolean isAprovado;

    public String[] verificaAprovacao() {
        String[] condicao = new String[3];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                this.isAprovado = true;
                condicao[i] = "Em " + disciplinas[i] + " o aluno está aprovado";

            }
            if(notas[i] <= 7) {
                this.isAprovado = false;
                condicao[i] = "Na disciplina de " + disciplinas[i] + " o aluno está reprovado";
            }
            return condicao;
        }
        return condicao;
    }

}

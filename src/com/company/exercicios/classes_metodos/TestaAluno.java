package com.company.exercicios.classes_metodos;

import java.util.Arrays;
import java.util.Scanner;

public class TestaAluno {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        aluno1.nome = scanner.nextLine();

        System.out.print("Digite uma disciplina em que o aluno está matriculado: ");
        aluno1.disciplinas[0] = scanner.next();

        System.out.print("Digite outra disciplina em que o aluno está matriculado: ");
        aluno1.disciplinas[1] = scanner.next();

        System.out.print("Digite mais uma em que o aluno está matriculado: ");
        aluno1.disciplinas[2] = scanner.next();

        System.out.print("Digite a nota da disciplina de " + aluno1.disciplinas[0] + ": ");
        aluno1.notas[0] = scanner.nextDouble();

        System.out.print("Digite a nota da disciplina de " + aluno1.disciplinas[1] + ": ");
        aluno1.notas[1] = scanner.nextDouble();

        System.out.print("Digite a nota da disciplina de " + aluno1.disciplinas[2] + ": ");
        aluno1.notas[2] = scanner.nextDouble();

        System.out.println("O aluno cursa as disciplinas de " + Arrays.toString(aluno1.disciplinas) + "e seu boletim é: " + Arrays.toString(aluno1.verificaAprovacao()));
//        System.out.print("Digite uma disciplina em que o aluno está matriculado: ");
//        aluno1.setDisciplinas() = scanner.nextLine();
//
//        System.out.print("Digite uma disciplina em que o aluno está matriculado: ");
//        aluno1.setDisciplinas() = scanner.nextLine();
    }
}

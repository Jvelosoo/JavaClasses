/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade;

import java.util.Scanner;

/**
 *
 * @author Aluado JK
 */
public class NotasAlunos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double maiorNota = 0;
        double menorNota = 10;
        double somaNotas = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = input.nextDouble();

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }

            somaNotas += nota;
        }

        double media = somaNotas / 10;

        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);
        System.out.println("A média aritmética da turma é: " + media);
    }
}
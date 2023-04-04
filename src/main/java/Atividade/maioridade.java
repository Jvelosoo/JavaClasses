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
public class maioridade {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maiorIdade = 0;
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            if (idade >= 18) {
                contador++;
            }
        }

        System.out.println("A quantidade de pessoas com idade maior ou igual a 18 anos é: " + contador);
    }
}


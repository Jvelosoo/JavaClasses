/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade;

import java.util.Scanner;


public class tabuada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, resultado);
        }
    }

}

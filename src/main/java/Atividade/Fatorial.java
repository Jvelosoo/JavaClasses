
package Atividade;

import java.util.Scanner;



public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número natural para calcular o fatorial: ");
        int numero = input.nextInt();

        int fatorial = 1;

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println(numero + "! = " + fatorial);
    }
}
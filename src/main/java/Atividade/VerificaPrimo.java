
package Atividade;

import java.util.Scanner;

public class VerificaPrimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro para verificar se é primo: ");
        int numero = input.nextInt();

        boolean ehPrimo = true;

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                ehPrimo = false;
                break;
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
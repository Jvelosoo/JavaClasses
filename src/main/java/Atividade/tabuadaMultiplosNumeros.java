/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Atividade;

/**
 *
 * @author Aluado JK
 */
public class tabuadaMultiplosNumeros {
        public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Tabuada do número " + i + ":");
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.printf("%d x %d = %d\n", i, j, resultado);
            }
            System.out.println(); // 
        }
    }
}

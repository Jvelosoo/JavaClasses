
package AtividadeCarro;

import java.util.Scanner;


public class TesteCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Instancia dois veículos.
        System.out.println("Informe os dados do primeiro carro:");
        System.out.print("Modelo: ");
        String modelo1 = sc.nextLine();
        System.out.print("Ano: ");
        int ano1 = sc.nextInt();
        sc.nextLine(); // consome a quebra de linha
        
        Carro carro1 = new Carro(modelo1, ano1);
        
        System.out.println("\nInforme os dados do segundo carro:");
        System.out.print("Modelo: ");
        String modelo2 = sc.nextLine();
        System.out.print("Ano: ");
        int ano2 = sc.nextInt();
        sc.nextLine(); // consome a quebra de linha
        
        Carro carro2 = new Carro(modelo2, ano2);
        
        // Chama cada um dos métodos que você criou.
        System.out.println("\nValores iniciais dos carros:");
        System.out.println("Carro 1 - Modelo: " + carro1.getModelo() + " | Ano: " + carro1.getAno());
        System.out.println("Carro 2 - Modelo: " + carro2.getModelo() + " | Ano: " + carro2.getAno());
        
        // Obtém novos valores e adiciona aos atributos.
        System.out.println("\nInforme os novos valores para os carros:");
        System.out.print("Novo modelo para o carro 1: ");
        String novoModelo1 = sc.nextLine();
        System.out.print("Novo ano para o carro 1: ");
        int novoAno1 = sc.nextInt();
        sc.nextLine(); // consome a quebra de linha
        
        carro1.setModelo(novoModelo1);
        carro1.setAno(novoAno1);
        
        System.out.print("\nNovo modelo para o carro 2: ");
        String novoModelo2 = sc.nextLine();
        System.out.print("Novo ano para o carro 2: ");
        int novoAno2 = sc.nextInt();
        sc.nextLine(); // consome a quebra de linha
        
        carro2.setModelo(novoModelo2);
        carro2.setAno(novoAno2);
        
        // Exibe os valores dos atributos, usando os métodos getters.
        System.out.println("\nValores atualizados dos carros:");
        System.out.println("Carro 1 - Modelo: " + carro1.getModelo() + " | Ano: " + carro1.getAno());
        System.out.println("Carro 2 - Modelo: " + carro2.getModelo() + " | Ano: " + carro2.getAno());
        
        sc.close();
    }
}
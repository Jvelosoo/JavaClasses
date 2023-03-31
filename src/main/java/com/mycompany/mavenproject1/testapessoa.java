
package com.mycompany.mavenproject1;

public class testapessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.andar();
        
        p.nome = "Enzo";
        p.idade = 10;
        p.peso = 30;
        
        p.imprimir();
        p.comer();
        p.comer();
        p.comer();
        p.imprimir();
                
    }
}

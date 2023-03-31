package com.mycompany.mavenproject1;
public class Pessoa {
    String nome;
    int idade;
    float peso;
    
    public void andar(){
        System.out.println("Estou Andando");
    }
    
    public void comer(){
        System.out.println("Comi");
        this.peso = this.peso + 1;
    }
    public void imprimir(){
        System.out.println("Nome " + this .nome);
        System.out.println("Idade " + this.idade);
        System.out.println("Peso " + this.peso);
    }
}
    
    


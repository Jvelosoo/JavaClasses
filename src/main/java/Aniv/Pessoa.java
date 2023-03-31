package Aniv;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void aniversario() {
        this.idade++;
    }

    public String NomeN() {
        return nome;
    }

    public int IdadeN() {
        return idade;
    }
}





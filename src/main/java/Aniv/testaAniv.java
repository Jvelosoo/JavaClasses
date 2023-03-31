package Aniv;
public class testaAniv {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 20);
        System.out.println("Antes do aniversário:");
        System.out.println("Nome: " + pessoa.NomeN());
        System.out.println("Idade: " + pessoa.IdadeN());

        pessoa.aniversario();
        System.out.println("Depois do aniversário:");
        System.out.println("Nome: " + pessoa.NomeN());
        System.out.println("Idade: " + pessoa.IdadeN());
    }
}


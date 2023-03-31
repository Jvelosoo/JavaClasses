/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulaObjeto;

/**
 *
 * @author 823124575
 */
public class testalivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.biblioteca();
        
        l.preco = 80;
        l.nome = "A arte da guerra";
        l.nomeLivro();
        l.precoLivro();
        
        
    }
}


package AtividadeCarro;

public class Carro {
    private String modelo;
    private int ano;
    
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
    
    public void desligar() {
        System.out.println("O carro está desligado.");
    }


}
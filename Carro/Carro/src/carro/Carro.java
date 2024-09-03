
package carro;


public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidade;
    
     public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0.0; 
    }

   
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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

    public double getVelocidade() {
        return velocidade;
    }

   
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidade += incremento;
            System.out.println("Acelerando... Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O valor de aceleração deve ser positivo.");
        }
    }

    
    public void desacelerar(double decremento) {
        if (decremento > 0) {
            if (decremento <= velocidade) {
                velocidade -= decremento;
                System.out.println("Desacelerando... Velocidade atual: " + velocidade + " km/h");
            } else {
                velocidade = 0;
                System.out.println("Desacelerando até parar. Velocidade atual: " + velocidade + " km/h");
            }
        } else {
            System.out.println("O valor de desaceleração deve ser positivo.");
        }
    }

    
    public void exibirDetalhes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }

    
    public static void main(String[] args) {
        
        Carro carro = new Carro("Toyota", "Corolla", 2024);

        
        carro.exibirDetalhes();

        
        carro.acelerar(50.0);
        carro.acelerar(30.0);
        carro.desacelerar(20.0);
        carro.desacelerar(70.0);

       
        carro.exibirDetalhes();
        
    }
    
}

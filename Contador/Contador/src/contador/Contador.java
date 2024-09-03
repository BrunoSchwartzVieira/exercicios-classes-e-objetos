
package contador;


public class Contador {

    private int valor;

    
    public Contador() {
        this.valor = 0; 
    }

   
    public void incrementar() {
        valor++;
        System.out.println("Valor após incremento: " + valor);
    }

    
    public void decrementar() {
        valor--;
        System.out.println("Valor após decremento: " + valor);
    }

    
    public int obterValor() {
        return valor;
    }

    
    public static void main(String[] args) {
        
        Contador contador = new Contador();

        
        System.out.println("Valor inicial: " + contador.obterValor());

        
        contador.incrementar();
        contador.incrementar();
        contador.decrementar();
        contador.decrementar();
        contador.decrementar(); 

       
        System.out.println("Valor final: " + contador.obterValor());
   
    }
    
}

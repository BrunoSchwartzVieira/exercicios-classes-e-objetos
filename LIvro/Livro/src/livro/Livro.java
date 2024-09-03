
package livro;


public class Livro {
 private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int numeroDeExemplaresDisponiveis;
   
    public Livro(String titulo, String autor, int numeroDePaginas, int numeroDeExemplaresDisponiveis) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.numeroDeExemplaresDisponiveis = numeroDeExemplaresDisponiveis;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDeExemplaresDisponiveis() {
        return numeroDeExemplaresDisponiveis;
    }

    public void setNumeroDeExemplaresDisponiveis(int numeroDeExemplaresDisponiveis) {
        this.numeroDeExemplaresDisponiveis = numeroDeExemplaresDisponiveis;
    }

    
    public void emprestar() {
        if (numeroDeExemplaresDisponiveis > 0) {
            numeroDeExemplaresDisponiveis--;
            System.out.println("Empréstimo realizado com sucesso. Exemplares disponíveis: " + numeroDeExemplaresDisponiveis);
        } else {
            System.out.println("Não há exemplares disponíveis para emprestar.");
        }
    }

   
    public void devolver() {
        numeroDeExemplaresDisponiveis++;
        System.out.println("Livro devolvido com sucesso. Exemplares disponíveis: " + numeroDeExemplaresDisponiveis);
    }

    
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroDePaginas);
        System.out.println("Número de Exemplares Disponíveis: " + numeroDeExemplaresDisponiveis);
    }

    
    public static void main(String[] args) {
       
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1216, 5);

        livro.exibirDetalhes();

        
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.devolver();
        livro.devolver(); 

        
        livro.exibirDetalhes();
        
    }
    
}

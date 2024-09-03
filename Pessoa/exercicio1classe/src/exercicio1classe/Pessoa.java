
package exercicio1classe;



public class Pessoa {
    
    private String nome;
    private int idade;
    private String profissao;

    
    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

  
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Profissão: " + profissao);
    }

    
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João Silva", 30, "Engenheiro");

        
        pessoa.exibirDetalhes();
    }
}

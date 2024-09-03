
package estudante;

import java.util.ArrayList;
import java.util.List;


public class Estudante {
 private String nome;
    private int idade;
    private List<String> disciplinasMatriculadas;

    // Construtor da classe
    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    // Método para adicionar uma disciplina à lista
    public void adicionarDisciplina(String disciplina) {
        disciplinasMatriculadas.add(disciplina);
        System.out.println("Disciplina '" + disciplina + "' adicionada com sucesso.");
    }

    
    public void exibirDisciplinas() {
        System.out.println("Disciplinas matriculadas de " + nome + ":");
        if (disciplinasMatriculadas.isEmpty()) {
            System.out.println("Nenhuma disciplina matriculada.");
        } else {
            for (String disciplina : disciplinasMatriculadas) {
                System.out.println("- " + disciplina);
            }
        }
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

    
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante("Maria Oliveira", 20);

        estudante.adicionarDisciplina("Matemática");
        estudante.adicionarDisciplina("Física");
        estudante.adicionarDisciplina("Química");

        
        estudante.exibirDisciplinas();
        
    }
    
}

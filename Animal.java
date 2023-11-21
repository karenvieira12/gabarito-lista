/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class Animal {
    // Atributo da classe Animal
    private String nome;

    // Construtor da classe Animal
    public Animal(String nome) {
        this.nome = nome;
    }

    // Método da classe Animal para emitir som (será sobrescrito nas subclasses)
    public void emitirSom() {
        System.out.println("O animal está emitindo um som.");
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }
}


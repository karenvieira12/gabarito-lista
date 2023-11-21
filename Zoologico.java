/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    // Atributo para armazenar a lista de animais
    private List<Animal> animais;

    // Construtor
    public Zoologico() {
        this.animais = new ArrayList<>();
    }

    // Método para adicionar um animal à lista do zoológico
    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    // Método para iterar sobre a lista de animais e chamar emitirSom() de cada animal
    public void fazerBarulho() {
        System.out.println("No zoológico, os animais estão fazendo barulho:");
        for (Animal animal : animais) {
            
            if(animal instanceof Ave){
                System.out.println("*********Apresentado ave abaixo*********");
                animal.emitirSom();
                System.out.println();
            }
            else if(animal instanceof Mamifero){
                System.out.println("*********Apresentado mamífero abaixo*********");
                animal.emitirSom();
                System.out.println();
            }
            
        }
    }

  
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author aluno
 */
public class Teste {
    public static void main(String[] args) {
        // Exemplo de uso do Zoologico
        Zoologico zoologico = new Zoologico();

        // Adiciona alguns animais ao zoológico
        zoologico.adicionarAnimal(new Mamifero("Rex", "Cachorro"));
        zoologico.adicionarAnimal(new Mamifero("Whiskers","Gato"));
        zoologico.adicionarAnimal(new Ave("Bard", "Papagaio"));
        zoologico.adicionarAnimal(new Ave("Filó", "Galinha"));

        // Faz os animais do zoológico emitirem som
        zoologico.fazerBarulho();
    }
}

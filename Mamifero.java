
package polimorfismo;

/**
 *
 * @author aluno
 */
public class Mamifero extends Animal {
    // Novo atributo da classe Mamifero
    private String tipoMamifero;

    // Construtor da classe Mamifero
    public Mamifero(String nome, String tipoMamifero) {
        // Chama o construtor da classe base (Animal)
        super(nome);
        this.tipoMamifero = tipoMamifero;
    }

    // Sobrescreve o método emitirSom para mamífero
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " é um mamífero do tipo " + tipoMamifero + " e está emitindo um som de mamífero.");
    }

    // Getter para o atributo tipoMamifero
    public String getTipoMamifero() {
        return tipoMamifero;
    }

    // Setter para o atributo tipoMamifero
    public void setTipoMamifero(String tipoMamifero) {
        this.tipoMamifero = tipoMamifero;
    }
}

package polimorfismo;

/**
 *
 * @author aluno
 */
public class Ave extends Animal {
    // Novo atributo da classe Ave
    private String tipoAve;

    // Construtor da classe Ave
    public Ave(String nome, String tipoAve) {
        // Chama o construtor da classe base (Animal)
        super(nome);
        this.tipoAve = tipoAve;
    }

    // Sobrescreve o método emitirSom para ave
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " é uma ave do tipo " + tipoAve + " e está emitindo um som de ave.");
    }

    // Getter para o atributo tipoAve
    public String getTipoAve() {
        return tipoAve;
    }

    // Setter para o atributo tipoAve
    public void setTipoAve(String tipoAve) {
        this.tipoAve = tipoAve;
    }
}


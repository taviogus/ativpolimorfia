public class Gato extends Animal {
    String corPelo;

    // Construtor
    public Gato(String nome, int idade, String especie, String corPelo) {
        super(nome, idade, especie);
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está miando!");
    }

    public void arranhar() {
        System.out.println(nome + " está arranhando o sofá!");
    }
}

public class Cachorro extends Animal {
    String raca;

    public Cachorro(String nome, int idade, String especie, String raca) {
        super(nome, idade, especie);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está latindo!");
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }
}

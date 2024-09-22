public class Passaro extends Animal {
    double envergaduraAsa;

    public Passaro(String nome, int idade, String especie, double envergaduraAsa) {
        super(nome, idade, especie);
        this.envergaduraAsa = envergaduraAsa;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está cantando!");
    }

    public void voar() {
        System.out.println(nome + " está voando por ai.");
    }
}

public class Animal {
    String nome;
    int idade;
    String especie;

    public Animal() {
        this.nome = "Indefinido";
        this.idade = 0;
        this.especie = "Desconhecida";
    }

    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void emitirSom() {
        System.out.println(nome + " está fazendo algum som.");
    }
}

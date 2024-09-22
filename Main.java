public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Inari", 4, "Canino", "Labrador");
        Animal gato = new Gato("Kayden", 2, "Felino", "Laranja");
        Animal passaro = new Passaro("Piupiu", 1, "Ave", 0.25);

        if (cachorro instanceof Cachorro) {
            ((Cachorro) cachorro).abanarRabo();
        }
        if (gato instanceof Gato) {
            ((Gato) gato).arranhar();
        }
        if (passaro instanceof Passaro) {
            ((Passaro) passaro).voar();
        }


        chamarSom(cachorro);
        chamarSom(gato);
        chamarSom(passaro);
    }

    public static void chamarSom(Animal animal) {
        animal.emitirSom();
    }
}

package zoo;

public class App{
    public static void main(String[] args) {

        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Jacare jacare = new Jacare();

        gato.setCor("Preto");
        gato.setRaca("Vira lata");
        gato.setPeso(10);

        cachorro.setCor("Caramelo");
        cachorro.setRaca("Golden Retriever");
        cachorro.setPeso(10);

        gato.brincar("Gato: ");
        gato.emitirSom("Gato: ");
        gato.saltar("Gato: ");
        System.out.println("Peso: " + gato.getPeso());

        cachorro.brincar("Cachorro: ");
        cachorro.emitirSom("Cachorro: ");
        cachorro.saltar("Cachorro: ");
        System.out.println("Peso: " + cachorro.getPeso());

        jacare.brincar("Jacaré: ");
        System.out.println("Peso: " + jacare.getPeso());
    }
}
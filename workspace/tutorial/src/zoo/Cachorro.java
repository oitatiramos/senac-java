package zoo;

public class Cachorro extends Animal{
	
	private double peso;
	
	public void emitirSom(String animal){
        if (peso <= 3){
            System.out.println(animal + "Au!");
        } if (peso > 3 && peso <= 5){
            System.out.println(animal + "Au, Au!");
        } if (peso > 5){
            System.out.println(animal + "Auuuuuuuu!");
        }
    }
}
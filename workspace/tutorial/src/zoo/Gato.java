package zoo;

public class Gato extends Animal {
	
	private double peso;
	
	public void setGato(double peso){
		if(peso < 0) {
			this.peso = peso;
			System.out.println("o valor foi alterado para 1. Você passou um valor inválido");
		} else {
			this.peso = peso;
		}
	}	
	
	public void emitirSom(String animal){
        if (peso <= 3){
            System.out.println(animal + "Miau!");
        } if (peso > 3 && peso <= 5){
            System.out.println(animal + "Miau, Miau");
        } if (peso > 5){
            System.out.println(animal + "Miaaaaaaau");
        }
    }
}

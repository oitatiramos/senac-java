package zoo;

public class Animal {

	private String cor;
	private String raca;
	private double peso;

    public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void brincar(String animal){
        System.out.println(animal + "brincando...");
    }
    
    public void saltar(String animal) {
		System.out.println(animal + "saltando...");

	}
    
	/*
	 * public void emitirSom(String animal){ if (peso <= 3){
	 * System.out.println("Cachorro: Au, Au!"); } if (peso > 3 && peso <= 5){
	 * System.out.println("Cachorro: Aaaaaau!"); } if (peso > 5){
	 * System.out.println("Cachorro: Au, Au, Au!"); } }
	 */
}

package calculadora;

public class App {

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		System.out.println("O valor da multiplicação: " + calculadora.multiplicar(7, 8));
		System.out.println("O valor da soma: " + calculadora.somar(6, 6));
	}
}

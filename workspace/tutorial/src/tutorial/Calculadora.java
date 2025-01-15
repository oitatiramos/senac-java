package tutorial;

public class Calculadora {
	

	public static void main(String[] args) {
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.somar(2, 2);
		calculadora.somar(4, 3);
		calculadora.somar(5, 5);
		calculadora.multiplicar(2, 5);
		calculadora.multiplicar(7, 3);
		calculadora.multiplicar(5, 5);
	}
	
	public void somar(int n1, int n2) {
		int valor = n1 + n2;
	}
	
	public void multiplicar(int n1, int n2) {
		int valor = n1 * n2;
	}
}

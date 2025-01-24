public class AppLoop {
    public static void main(String[] args) {
        // Loop for
        // Usado quando sabemos o número exato de repetições ou temos um contador com um número fixo de iterações.

        for (int i = 1; i <= 20; i++) {
            System.out.println("Contando " + i + "!");
        }

        // Loop while
        // Usado quando não sabemos o número exato de repetições, mas sabemos a condição que deve ser atendida para continuar o loop.

        boolean acao = true;

        while (acao == true) {
            System.out.println("Outro loop");
            acao = false;
        }

        // Loop do..while
        // Usado quando queremos garantir que o código dentro do loop seja executado pelo menos uma vez,
        // verificando a condição somente após a execução do código.

        do {
            System.out.println("Este é o loop do...");
        } while (acao == true);


        // números pares até 100
        int limite = 100;
        for (int i = 0; i <= limite; i+=2) {

            // String valor = i < limite ? i + ", " : ""; = operador ternário

            if(i < limite) {
                System.out.print( i + ", ");
            } else {
                System.out.println(i);
            }
        }
    }
}





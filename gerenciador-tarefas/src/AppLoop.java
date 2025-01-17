public class AppLoop {
    public static void main(String[] args) {
        // loop for
        for (int i = 1; i <= 20; i++) {
            System.out.println("Contando " + i + "!");
        }

        // while
        boolean acao = true;

        while (acao == true) {
            System.out.println("Outro loop");
            acao = false;
        }

        // do..while
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





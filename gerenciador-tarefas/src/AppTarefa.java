import controller.Controller;
import view.Tela;

import java.util.Scanner;

public class AppTarefa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Tela tela = new Tela();
        Controller controller = new Controller();

        int opcao;

        do {
            tela.exibirMenu();
            opcao = scanner.nextInt();
            controller.verificarOpcao(opcao);
        } while (opcao != 0);
    }
}
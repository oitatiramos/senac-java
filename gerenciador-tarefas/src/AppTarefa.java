import java.util.Scanner;

public class AppTarefa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ MENU PRINCIPAL -----");
        System.out.println("1 - Inclusão de tarefa");
        System.out.println("2 - Consulta de tarefa");
        System.out.println("3 - Alteração de tarefa");
        System.out.println("4 - Exclusão de tarefa");
        System.out.println("0 - F I M");
        System.out.println("Digite a opção desejada:");

        int opcao = scanner.nextInt();
    }
}

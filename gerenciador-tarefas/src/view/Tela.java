package view;

import model.Tarefa;
import java.util.Scanner;

public class Tela {

    public void exibirMenu() {
        System.out.println("------ MENU PRINCIPAL -----");
        System.out.println("1 - Inclusão de tarefa");
        System.out.println("2 - Consulta de tarefa");
        System.out.println("3 - Alteração de tarefa");
        System.out.println("4 - Exclusão de tarefa");
        System.out.println("0 - F I M");
        System.out.println("Digite a opção desejada:");
    }

    public Tarefa exibirInclusao() {
        Scanner scanner = new Scanner(System.in);
        Tarefa tarefa = new Tarefa();

        System.out.println("I N C L U S Ã O");
        System.out.println("Descrição: ");
        tarefa.setDescricao(scanner.nextLine());
        System.out.println("Prazo: ");
        tarefa.setPrazo(scanner.nextInt());
        System.out.println("Finalizada (S/N): ");

        String status = scanner.next();
        tarefa.setFinalizada(status.equalsIgnoreCase("S"));

        return tarefa;
    }

    public void exibirTarefa(Tarefa tarefa) {
        System.out.println("C O N S U L T A");
        System.out.println(tarefa);
        System.out.println("_____________________________________________________________");
    }

    public Tarefa exibirAlteracao(Tarefa tarefa) {

        Scanner scanner = new Scanner(System.in);
        Scanner menu = new Scanner(System.in);

        System.out.println("A L T E R A Ç Ã O");
        System.out.println("_______________________");
        System.out.println("1 - Descrição");
        System.out.println("2 - Prazo");
        System.out.println("3 - Status");
        System.out.println("O que deseja alterar?");

        int opcao = menu.nextInt();

            if (opcao == 1) {
                System.out.println("Nova descrição (atual: " + tarefa.getDescricao() + "):");
                tarefa.setDescricao(scanner.nextLine());
            } else if (opcao == 2) {
                System.out.println("Novo prazo (atual: " + tarefa.getPrazo() + "):");
                tarefa.setPrazo(scanner.nextInt());
            } else if (opcao == 3) {
                System.out.println("Finalizada (S/N, atual: " + (tarefa.isFinalizada() ? "Sim" : "Não") + "):");
                String status = scanner.next();
                tarefa.setFinalizada(status.equalsIgnoreCase("S"));
            } else {
                System.out.println("Opção digitada inválida!");
            }
            return tarefa;
    }

    public Tarefa exibirExclusao(Tarefa tarefa) {
        System.out.println("E X C L U S Ã O");
        tarefa.setDescricao("");
        tarefa.setPrazo(0);
        tarefa.setFinalizada(false);
        System.out.println("Tarefa excluída com sucesso!");
        return tarefa;
    }
}
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
        tarefa.setDescricao(scanner.next());
        System.out.println("Prazo: ");
        tarefa.setPrazo(scanner.nextInt());
        System.out.println("Finalizada (S/N): ");

        String status = scanner.next();

        tarefa.setFinalizada(status.equals("S") || status.equals("s")); // operador ternário (if)

        return tarefa;

    }


    public void exibirConsulta(){
        System.out.println("C O N S U L T A");
        System.out.println();
    }

    public void exibirAlteracao(){
        System.out.println("A L T E R A Ç Ã O");
    }

    public void exibirExclusao(){
        System.out.println("E X C L U S Ã O");
    }
}
package controller;

import model.Tarefa;
import view.Tela;

public class Controller {

    Tarefa tarefa;

    public void verificarOpcao(int opcao){

        Tela tela = new Tela();

        if (opcao == 1) {
            tarefa = tela.exibirInclusao();
        } else if (opcao == 2) {
            tela.exibirTarefa(tarefa);
        } else if (opcao == 3) {
            tarefa = tela.exibirAlteracao(tarefa);
        } else if (opcao == 4) {
            tarefa = tela.exibirExclusao(tarefa);
        } else if (opcao == 0){
            System.out.println("Aplicação encerrada!");
        } else {
            System.out.println("Opção digitada inválida!");
        }
    }
}

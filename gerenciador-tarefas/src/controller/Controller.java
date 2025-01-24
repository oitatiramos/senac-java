package controller;

import view.Tela;

public class Controller {

    public void verificarOpcao(int opcao){

        Tela tela = new Tela();

        if (opcao == 1) {
            tela.exibirInclusao();
        } else if (opcao == 2) {
            tela.exibirAlteracao();
        } else if (opcao == 3) {
            tela.exibirInclusao();
        } else if (opcao == 4) {
            tela.exibirExclusao();
        } else if (opcao == 0){
            System.out.println("Aplicação encerrada!");
        } else {
            System.out.println("Opção digitada inválida!");
        }
    }
}

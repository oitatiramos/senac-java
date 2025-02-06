package controller;

import java.util.ArrayList;
import java.util.List;

import model.Tarefa;
import view.Tela;

public class Controller {
    List<Tarefa> tarefas = new ArrayList<Tarefa>();
    Tarefa tarefa;

    public void verificarOpcao(int opcao) {
        Tela tela = new Tela();

        if(opcao == 1) {
            tarefa = tela.exibirInclusao(gerarIndice(tarefas));
            tarefas.add(tarefa);
        } else if(opcao == 2) {
            tela.exibirTarefa(tarefas, "C O N S U L T A");
        } else if(opcao == 3) {
            tarefas = tela.exibirAlteracao(tarefas);
        } else if(opcao == 4) {
            tarefas = tela.exibirExclusao(tarefas);
        } else if(opcao == 9) {
            tarefas = gerarDadosDeTeste();
        } else if(opcao == 0){
            System.out.println("Aplicação encerrada");
        } else {
            System.out.println("Opção digitada inválida");
        }
    }

    public int gerarIndice(List<Tarefa> lista) {
        int retorno;

        if(lista.isEmpty()) {
            retorno = 1;
        } else {
            retorno = lista.size() + 1;
        }

        return retorno;
    }

    public List<Tarefa> gerarDadosDeTeste(){
        List<Tarefa> lista = new ArrayList<Tarefa>();

        for(int i = 0; i < 5; i++) {
            Tarefa tarefa = new Tarefa();
            tarefa.setId(i);
            tarefa.setDescricao("Comprar algo " + i);
            tarefa.setPrazo(1);
            tarefa.setFinalizada(false);

            lista.add(tarefa);
        }
        return lista;
    }
}
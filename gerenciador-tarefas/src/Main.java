import model.Tarefa;

public class Main {
    public static void main(String[] args) {
        Tarefa tarefa1 = new Tarefa(1, "Estudar Inglês", 1, false);
        Tarefa tarefa2 = new Tarefa(2, "Trabalho", 1, true);

        System.out.println(tarefa1);
        System.out.println(tarefa2);
    }
}
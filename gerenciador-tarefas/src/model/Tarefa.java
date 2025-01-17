package model;

public class Tarefa {
    private int id;
    private String descricao;
    private int prazo;
    private boolean finalizada;

    // Construtor
    public Tarefa(int id, String descricao, int prazo, boolean finalizada) {
        this.id = id;
        this.descricao = descricao;
        this.prazo = prazo;
        this.finalizada = finalizada;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    // Método toString para facilitar a visualização
    @Override
    public String toString() {
        return "Tarefa [" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", prazo=" + prazo +
                ", finalizada=" + finalizada +
                ']';
    }
}
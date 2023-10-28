package com.dutradevs.modelos;

public class Podcast extends Audio implements MostraInfo {

    private final String apresentador;
     private final String descricao;

    public Podcast(String titulo, String apresentador, String descricao) {
        super(titulo);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }

    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public void info() {
        System.out.println("Nome: " + getTitulo() + "\nApresentadores: " + getApresentador() + "\nDescrição: " + getDescricao() + "\n");
    }

    @Override
    public int getClassificacao() {
        if (this.getCurtidas() > 500) {
            return 10;
        } else {
            return 7;
        }
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "apresentador='" + apresentador + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}

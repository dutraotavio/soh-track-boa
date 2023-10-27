package com.dutradevs.modelos;

import java.util.Random;

public class Audio {

    Random random = new Random();

    private String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return totalDeCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalDeCurtidas = this.totalDeReproducoes / random.nextInt(10);
    }

    public void reproduz() {
        this.totalDeReproducoes = random.nextInt(1000);
    }

}

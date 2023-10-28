package com.dutradevs.modelos;

import java.util.Random;

public class Audio {

    Random random = new Random();

    private final String titulo;
    private int totalDeReproducoes;
    private int totalDeCurtidas;

    public Audio(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return 0;
    }

    public void curte() {
        this.totalDeCurtidas = this.totalDeReproducoes / (random.nextInt(5) + 1);
    }

    public void reproduz() {
        this.totalDeReproducoes = random.nextInt(5000);
    }

}

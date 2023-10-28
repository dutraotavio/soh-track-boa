package com.dutradevs.modelos;

public class Favoritos {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é a música que está bombando no momento!");
        } else {
            System.out.println(audio.getTitulo() + " também é um(a) que todos estão curtindo!");
        }
    }
}

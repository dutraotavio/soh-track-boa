package com.dutradevs.principal;

import com.dutradevs.modelos.Favoritos;
import com.dutradevs.modelos.Musica;
import com.dutradevs.modelos.Podcast;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica("Immortality", "One Night Only", 1998, "Céline Dion Ft. Bee Gees");
        Musica musica2 = new Musica("Céu Azul", "Música Popular Caiçara", 2012, "Charlie Brown Jr.");
        Musica musica3 = new Musica("Yellow", "Parachutes", 2000, "Coldplay");

        List<Musica> listaMusica = new LinkedList<>();

        listaMusica.add(musica1);
        listaMusica.add(musica2);
        listaMusica.add(musica3);

        Collections.sort(listaMusica);
        System.out.println("Ordenação por Título\n" + listaMusica + "\n");

        listaMusica.sort(Comparator.comparing(Musica::getLancamento));
        System.out.println("Ordenação por ano de lançamento\n" + listaMusica + "\n");

        musica1.reproduz();
        musica1.curte();

        musica2.reproduz();
        musica2.curte();

        musica3.reproduz();
        musica3.curte();

        musica1.info();
        musica2.info();
        musica3.info();

        System.out.println();

        Favoritos favoritos = new Favoritos();

        favoritos.inclui(musica1);
        favoritos.inclui(musica2);
        favoritos.inclui(musica3);

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        Podcast podcast = new Podcast("PodPah", "Igor Cavalari (Igão) e Thiago Marques (Mítico)",
                "Podpah é um podcast brasileiro formado em 2020." +
                " É considerado um dos maiores podcasts do país, com mais de 7 milhões de inscritos no YouTube.");

        podcast.info();

        favoritos.inclui(podcast);
    }
}
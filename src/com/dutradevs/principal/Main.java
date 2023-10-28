package com.dutradevs.principal;

import com.dutradevs.modelos.Favoritos;
import com.dutradevs.modelos.Musica;
import com.dutradevs.modelos.Podcast;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        Musica musica2 = new Musica();
        Musica musica3 = new Musica();

        LinkedList<Musica> listaMusica = new LinkedList<>();

        musica1.setTitulo("Immortality");
        musica1.setLancamento(1998);
        musica1.setArtista("Céline Dion Ft. Bee Gees");
        musica1.setAlbum("One Night Only");

        musica2.setTitulo("Céu Azul");
        musica2.setLancamento(2012);
        musica2.setArtista("Charlie Brown Jr.");
        musica2.setAlbum("Música Popular Caiçara");

        musica3.setTitulo("Yellow");
        musica3.setLancamento(2000);
        musica3.setArtista("Coldplay");
        musica3.setAlbum("Parachutes");

        listaMusica.add(musica1);
        listaMusica.add(musica2);
        listaMusica.add(musica3);

        System.out.println(listaMusica + "\n");

        musica1.reproduz();
        musica1.curte();
        musica2.reproduz();
        musica2.curte();
        musica3.reproduz();
        musica3.curte();

        System.out.println(musica1.getTitulo() + " foi reproduzida " + musica1.getTotalDeReproducoes() +
                " vezes e recebeu " + musica1.getCurtidas() + " curtidas");

        System.out.println(musica2.getTitulo() + " foi reproduzida " + musica2.getTotalDeReproducoes() +
                " vezes e recebeu " + musica2.getCurtidas() + " curtidas");

        System.out.println(musica3.getTitulo() + " foi reproduzida " + musica3.getTotalDeReproducoes() +
                " vezes e recebeu " + musica3.getCurtidas() + " curtidas\n");

        Favoritos favoritos = new Favoritos();

        favoritos.inclui(musica1);
        favoritos.inclui(musica2);
        favoritos.inclui(musica3);

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        Podcast podcast = new Podcast();

        podcast.setTitulo("PodPah");
        podcast.setApresentador("Igor Cavalari (Igão) e Thiago Marques (Mítico)");
        podcast.setDescricao("Podpah é um podcast brasileiro formado em 2020." +
                " É considerado um dos maiores podcasts do país, com mais de 7 milhões de inscritos no YouTube.");
        System.out.println("Nome: " + podcast.getTitulo() + "\nApresentadores: " + podcast.getApresentador() + "\nDescrição: " + podcast.getDescricao() + "\n");

        favoritos.inclui(podcast);
    }
}
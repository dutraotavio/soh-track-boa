package com.dutradevs.principal;

import com.dutradevs.modelos.Audio;
import com.dutradevs.modelos.Musica;
import com.dutradevs.modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Audio audio = new Audio();

        Musica musica = new Musica();

        musica.setTitulo("Immortality");
        musica.setLancamento(1998);
        musica.setArtista("Céline Dion Ft. Bee Gees");
        musica.setAlbum("One Night Only");
        System.out.println("Música: " + musica.getTitulo() + "\nArtista: " + musica.getArtista() + "\nAlbúm: "
                + musica.getAlbum() + "\nAno de Lançamento: " + musica.getLancamento());

        musica.reproduz();
        musica.curte();

        System.out.println(musica.getTitulo() + " foi reproduzida " + musica.getTotalDeReproducoes() +
                " vezes e foi curtida " + musica.getCurtidas());

        System.out.println("----------------------------------------------------------------------------------------------------------------------");

        Podcast podcast = new Podcast();

        podcast.setTitulo("PodPah");
        podcast.setApresentador("Igor Cavalari (Igão) e Thiago Marques (Mítico)");
        podcast.setDescricao("Podpah é um podcast brasileiro formado em 2020." +
                " É considerado um dos maiores podcasts do país, com mais de 7 milhões de inscritos no YouTube.");
        System.out.println("Nome: " + podcast.getTitulo() + "\nApresentadores: " + podcast.getApresentador() + "\nDescrição: " + podcast.getDescricao());
    }
}
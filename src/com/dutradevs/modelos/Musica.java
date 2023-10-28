package com.dutradevs.modelos;

public class Musica extends Audio {

    private String album;
    private int lancamento;
    private String artista;

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalDeReproducoes() > 2500) {
            return 10;
        } else {
            return 6;
        }
    }

    @Override
    public String toString() {
        return "\nMusica: " + getTitulo() +
                "\nAlbum: " + album +
                "\nLancamento: " + lancamento +
                "\nArtista: " + artista + "\n";
    }
}

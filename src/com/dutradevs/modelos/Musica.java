package com.dutradevs.modelos;

public class Musica extends Audio implements MostraInfo {

    private final String album;
    private final int lancamento;
    private final String artista;

    public Musica(String titulo, String album, int lancamento, String artista) {
        super(titulo);
        this.album = album;
        this.lancamento = lancamento;
        this.artista = artista;
    }

    public int getLancamento() {
        return lancamento;
    }

    @Override
    public void info() {
        System.out.println(getTitulo() + " foi reproduzida " + getTotalDeReproducoes() +
                " vezes e recebeu " + getCurtidas() + " curtidas");
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

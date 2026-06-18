package org.example;

public class Serie extends Contenido {

    private int numeroTemporadas;
    private int numeroEpisodios;

    public Serie(String titulo,
                 String genero,
                 double duracion,
                 int numeroTemporadas,
                 int numeroEpisodios) {

        super(titulo, genero, duracion);
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie: " + titulo);
    }

    @Override
    public String obtenerTipoContenido() {
        return "Serie";
    }

    @Override
    public double obtenerTiempoTotal() {
        return duracion * numeroEpisodios;
    }

    @Override
    public String obtenerDatosParticulares() {
        return "Número de temporadas: " + numeroTemporadas +
                "\nNúmero de episodios: " + numeroEpisodios;
    }

    public int getNumeroEpisodios() {
        return numeroEpisodios;
    }
}
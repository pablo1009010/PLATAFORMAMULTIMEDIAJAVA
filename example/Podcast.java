package org.example;

public class Podcast extends Contenido {

    private String nombrePresentador;

    public Podcast(String titulo,
                   String genero,
                   double duracion,
                   String nombrePresentador) {

        super(titulo, genero, duracion);
        this.nombrePresentador = nombrePresentador;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + titulo);
    }

    @Override
    public String obtenerTipoContenido() {
        return "Podcast";
    }

    @Override
    public double obtenerTiempoTotal() {
        return duracion;
    }

    @Override
    public String obtenerDatosParticulares() {
        return "Presentador: " + nombrePresentador;
    }
}
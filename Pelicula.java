package org.example;

public class Pelicula extends Contenido {

    private String director;

    public Pelicula(String titulo,
                    String genero,
                    double duracion,
                    String director) {

        super(titulo, genero, duracion);
        this.director = director;
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película: " + titulo);
    }

    @Override
    public String obtenerTipoContenido() {
        return "Película";
    }

    @Override
    public double obtenerTiempoTotal() {
        return duracion;
    }

    @Override
    public String obtenerDatosParticulares() {
        return "Director: " + director;
    }
}
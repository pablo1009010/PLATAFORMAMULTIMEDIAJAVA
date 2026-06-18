package org.example;

public abstract class Contenido {

    protected String titulo;
    protected String genero;
    protected double duracion;

    public Contenido(String titulo, String genero, double duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String obtenerDatosGenerales() {
        return "Título: " + titulo +
                "\nGénero: " + genero +
                "\nDuración: " + duracion + " hrs";
    }

    public abstract void reproducir();

    public abstract String obtenerTipoContenido();

    public abstract double obtenerTiempoTotal();

    public abstract String obtenerDatosParticulares();
}
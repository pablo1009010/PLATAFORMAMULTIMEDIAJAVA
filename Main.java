package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ArrayList<Contenido> contenidos = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n===== PLATAFORMA MULTIMEDIA =====");
            System.out.println("1. Registrar película");
            System.out.println("2. Registrar serie");
            System.out.println("3. Registrar podcast");
            System.out.println("4. Mostrar contenido registrado");
            System.out.println("5. Reproducir todo");
            System.out.println("6. Mostrar solo películas");
            System.out.println("7. Mostrar solo series");
            System.out.println("8. Mostrar solo podcasts");
            System.out.println("9. Mostrar tiempo total de cada contenido");
            System.out.println("10. Mostrar episodios de las series");
            System.out.println("11. Salir");
            System.out.print("Opción: ");

            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Título: ");
                    String tituloP = leer.nextLine();

                    System.out.print("Género: ");
                    String generoP = leer.nextLine();

                    System.out.print("Duración (horas): ");
                    double duracionP = leer.nextDouble();
                    leer.nextLine();

                    System.out.print("Director: ");
                    String director = leer.nextLine();

                    contenidos.add(
                            new Pelicula(
                                    tituloP,
                                    generoP,
                                    duracionP,
                                    director
                            )
                    );

                    System.out.println("Película registrada.");
                    break;

                case 2:

                    System.out.print("Título: ");
                    String tituloS = leer.nextLine();

                    System.out.print("Género: ");
                    String generoS = leer.nextLine();

                    System.out.print("Duración por episodio: ");
                    double duracionS = leer.nextDouble();

                    System.out.print("Número de temporadas: ");
                    int temporadas = leer.nextInt();

                    System.out.print("Número de episodios: ");
                    int episodios = leer.nextInt();
                    leer.nextLine();

                    contenidos.add(
                            new Serie(
                                    tituloS,
                                    generoS,
                                    duracionS,
                                    temporadas,
                                    episodios
                            )
                    );

                    System.out.println("Serie registrada.");
                    break;

                case 3:

                    System.out.print("Título: ");
                    String tituloPod = leer.nextLine();

                    System.out.print("Género: ");
                    String generoPod = leer.nextLine();

                    System.out.print("Duración (min): ");
                    double duracionPod = leer.nextDouble();
                    leer.nextLine();

                    System.out.print("Presentador: ");
                    String presentador = leer.nextLine();

                    contenidos.add(
                            new Podcast(
                                    tituloPod,
                                    generoPod,
                                    duracionPod,
                                    presentador
                            )
                    );

                    System.out.println("Podcast registrado.");
                    break;

                case 4:

                    for (Contenido c : contenidos) {

                        System.out.println("\n--------------------");
                        System.out.println(c.obtenerTipoContenido());
                        System.out.println(c.obtenerDatosGenerales());
                        System.out.println(c.obtenerDatosParticulares());
                    }

                    break;

                case 5:

                    for (Contenido c : contenidos) {
                        c.reproducir();
                    }

                    break;

                case 6:

                    for (Contenido c : contenidos) {

                        if (c.obtenerTipoContenido().equals("Película")) {

                            System.out.println("\n--------------------");
                            System.out.println(c.obtenerDatosGenerales());
                            System.out.println(c.obtenerDatosParticulares());
                        }
                    }

                    break;

                case 7:

                    for (Contenido c : contenidos) {

                        if (c.obtenerTipoContenido().equals("Serie")) {

                            System.out.println("\n--------------------");
                            System.out.println(c.obtenerDatosGenerales());
                            System.out.println(c.obtenerDatosParticulares());
                        }
                    }

                    break;

                case 8:

                    for (Contenido c : contenidos) {

                        if (c.obtenerTipoContenido().equals("Podcast")) {

                            System.out.println("\n--------------------");
                            System.out.println(c.obtenerDatosGenerales());
                            System.out.println(c.obtenerDatosParticulares());
                        }
                    }

                    break;

                case 9:

                    for (Contenido c : contenidos) {

                        System.out.println(
                                c.obtenerTipoContenido() +
                                        ": " +
                                        c.obtenerTiempoTotal() +
                                        " minutos"
                        );
                    }

                    break;

                case 10:

                    for (Contenido c : contenidos) {

                        if (c instanceof Serie) {

                            Serie serie = (Serie) c;

                            System.out.println(
                                    serie.obtenerDatosGenerales()
                            );

                            System.out.println(
                                    "Número de episodios: "
                                            + serie.getNumeroEpisodios()
                            );

                            System.out.println();
                        }
                    }

                    break;

                case 11:

                    System.out.println("Saliendo...");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 11);

        leer.close();
    }
}
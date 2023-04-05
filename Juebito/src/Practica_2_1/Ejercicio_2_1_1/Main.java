package Practica_2_1.Ejercicio_2_1_1;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            GregorianCalendar calendario = new GregorianCalendar();
            int eleccion;
            //Favoritos cat = new Favoritos();
            //Catalogo cat = new Catalogo();
            Favoritos_arreglo cat = new Favoritos_arreglo();
            do {
                System.out.println("Bienvenido Usuario, a su lista de favoritos");
                System.out.println("Que desea hacer? 1) Agregar a Favoritos; 2) Remover de Favoritos; 3) Listar Favoritos; 4) Buscar un Titulo Especifico; 0) Salir");
                eleccion = input.nextInt();

                switch (eleccion) {
                    case 1 -> {
                        input.nextLine();
                        ContenidoAudioVisual t = new ContenidoAudioVisual();
                        String titutlo;
                        String autor;
                        int hora, minutos;
                        String dirrector;
                        int fecEstAnio, fecEstMes, fecEstdia;
                        String idiomo;
                        String subtitulos;
                        String genero;
                        String actores;
                        String interpretes;

                        ContenidoAudioVisual p = new ContenidoAudioVisual(
                            "Avengers",
                            "Marvle",
                            "Destin Daniel Cretton",
                            "Acción",
                            "Ingles",
                            "Español",
                            "Robert Downey Jr, Chris Evans, Scarlett Johansson, Jeremy Renner, Marl Ruffalo, Chris Hemsworth",
                            "Alguien, no se",
                            2,
                            26,
                            12,
                            10,
                            2001
                        );
                        
                        System.out.println("Titulo");
                        titutlo = input.nextLine();
                        t.setTitulo(titutlo);

                        System.out.println("Autor");
                        autor = input.nextLine();
                        t.setAutor(autor);

                        System.out.println("Director");
                        dirrector = input.nextLine();
                        t.setDirector(dirrector);

                        System.out.println("Duracion, HH MM");
                        hora = input.nextInt();
                        minutos = input.nextInt();
                        ContenidoAudioVisual.setDuracion(hora, minutos);
                        
                        System.out.println("Fecha de Estreno AAAA-MM-DD");
                        fecEstAnio = input.nextInt();
                        fecEstMes = input.nextInt();
                        fecEstdia = input.nextInt();
                        calendario.set(fecEstAnio, fecEstMes, fecEstdia);
                        t.setFechaEstreno(calendario);
                        input.nextLine();

                        System.out.println("Idioma");
                        idiomo = input.nextLine();
                        t.setIdiomaOriginal(idiomo);

                        System.out.println("Subtitulos");
                        subtitulos = input.nextLine();
                        t.setSubtitulos(subtitulos);

                        System.out.println("Genero");
                        genero = input.nextLine();
                        t.setGenero(genero);

                        System.out.println("Actores");
                        System.out.println("Ingrese los Actores, separados por una ,");
                        actores = input.nextLine();
                        t.setActores(actores);

                        System.out.println("Interpretes");
                        System.out.println("Ingrese los Interpretes, separados por una ,");
                        interpretes = input.nextLine();
                        t.setInterpretes(interpretes);
                        
                        //fav.addContenido(t);
                        cat.addContenido(p);
                        cat.addContenido(t);
                        break;
                    }
                    case 2 -> {
                        int id;
                        System.out.println("Ingrese el ID de la Serie o Pelicula a borrar");
                        id = input.nextInt();
                        cat.deleteContenido(id);
                        break;
                    }
                    case 3 -> {
                        cat.showContenido();
                        break;
                    }
                    case 4 ->{
                        cat.printContenido();
                    }
                    default -> System.out.println("Opcion incorrecta");
                }
            }while (eleccion != 0);
        }
        System.out.println("Adios!!");
    }
}

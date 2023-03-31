package Practica_2_1.Ejercicio_2_1_1;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GregorianCalendar calendario = new GregorianCalendar();
        int eleccion;
        Favoritos fav = new Favoritos();
        do {
            System.out.println("Bienvenido Usuario, a su lista de favoritos");
            System.out.println("Que desea hacer? 1) Agregar a Favoritos; 2) Remover de Favoritos; 3) Listar Favoritos; 4) Salir");
            eleccion = input.nextInt();

            switch (eleccion) {
                case 1:{
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

                    System.out.println("Titulo");
                    titutlo = input.nextLine();
                    t.setTitulo(titutlo);

                    System.out.println("Autor");
                    autor = input.nextLine();
                    t.setAutor(autor);

                    System.out.println("Director");
                    dirrector = input.nextLine();
                    t.setDirector(dirrector);

                    System.out.println("Duracion");
                    minutos = input.nextInt();
                    hora = input.nextInt();
                    t.setDuracion();

                    System.out.println("Fecha de Estreno");
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
                    t.setActores();

                    System.out.println("Interpretes");
                    t.setInterpretes();

                    fav.agregarFaborito(t);
                    break;
                }
                case 2: {
                    String tituto;
                    System.out.println("Ingrese el nombre de la Serie o Pelicula a borrar");
                    tituto = input.nextLine();
                    fav.eliminarFavorito(tituto);
                    break;
                }
                case 3: {
                    System.out.println("Sus favoritos son:");
                    fav.listarFavorito();
                    break;
                }
                default: System.out.println("Opcion incorrecta");break;
            }
        }while (eleccion != 4);
        System.out.println("Adios!!");
    }
}

package Practica_2_1.Ejercicio_2_1_1;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main_v2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleccion;
        Catalogo cat = new Catalogo();
        GregorianCalendar calendario = new GregorianCalendar();
        do{
            System.out.println("Bienvenido Usuario, a su lista de favoritos");
            System.out.println("Que desea hacer? 1) Agregar a Favoritos; 2) Remover de Favoritos; 3) Listar Favoritos; 4) Salir");
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
                    hora = input.nextInt();
                    minutos = input.nextInt();
                    
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
                    System.out.println("Ingrese los Actores, para finalizar ingrese fin");
                    String actor = input.nextLine();
                    do {
                        t.setActores(actor);
                    }while (actor.matches("fin"));

                    System.out.println("Interpretes");
                    System.out.println("Ingrese los Actores, para finalizar ingrese fin");
                    String interprete = input.nextLine();
                    do {
                        t.setInterpretes(interprete);
                    }while (interprete.matches("fin"));

                    cat.addContenido(t);
                }
                case 2 -> {
                    int numero=1;
                    cat.deleteContenido(numero);
                }
                case 3 -> {
                    System.out.println("Sus favoritos son:");
                    cat.showContenido();
                }
                case 4 ->{
                }
                default -> System.out.println("Opcion incorrecta");
            }
        }while (eleccion != 5);
        System.out.println("Adios!!");
    }
}
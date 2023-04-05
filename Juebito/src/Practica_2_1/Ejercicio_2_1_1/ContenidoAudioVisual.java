package Practica_2_1.Ejercicio_2_1_1;
// import java.util.Calendar;
// import java.util.Date;
import java.util.GregorianCalendar;

public class ContenidoAudioVisual {
    private String titulo;
    private String autor;
    // private GregorianCalendar duracion;
    private String director;
    private String interpretes;
    private String actores;
    private GregorianCalendar fechaEstreno;
    private String genero;
    private String idiomaOriginal;
    private String subtitulos;

    static GregorianCalendar calendar = new GregorianCalendar();

    public ContenidoAudioVisual(){};

    public ContenidoAudioVisual(String titulo, String autor, String director, String genero, String idiomaOriginal, String subtitulos, String actores, String interpretes, int hora, int minutos, int dia, int mes, int anio){
        this.titulo=titulo;
        this.autor=autor;
        this.director=director;
        this.genero=genero;
        this.idiomaOriginal=idiomaOriginal;
        this.subtitulos=subtitulos;
        this.actores=actores;
        this.interpretes=interpretes;
        calendar.set(hora, dia, mes, anio, minutos);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // public static int getDuracion() {
    //     return calendar.HOUR + ':' + calendar.MINUTE;
    // }
    public static void setDuracion(int horas, int minutos) {
        calendar.set(GregorianCalendar.HOUR, horas);
        calendar.set(GregorianCalendar.MINUTE, minutos);
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getInterpretes() {
        return this.interpretes;
    }
    public void setInterpretes(String interprete) {
        this.interpretes = interprete;
    }
    public String getActores() {
        return this.actores;
    }
    public void setActores(String actor) {
        this.actores = actor; 
    }
    public GregorianCalendar getFechaEstreno() {
        return fechaEstreno;
    }
    public void setFechaEstreno(GregorianCalendar fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getIdiomaOriginal() {
        return idiomaOriginal;
    }
    public void setIdiomaOriginal(String idiomaOriginal) {
        this.idiomaOriginal = idiomaOriginal;
    }
    public String getSubtitulos() {
        return subtitulos;
    }
    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return 
            " Titulo='" + getTitulo() + "'" +
            ", Autor='" + getAutor() + "'" +
           // ", Duracion='" + getDuracion() + "'" +
            ", Director='" + getDirector() + "'" +
            ", Interpretes='" + getInterpretes() + "'" +
            ", Actores='" + getActores() + "'" +
            ", Fecha de Estreno='" + getFechaEstreno() + "'" +
            ", Genero='" + getGenero() + "'" +
            ", Idioma Original='" + getIdiomaOriginal() + "'" +
            ", Subtitulos='" + getSubtitulos() + "'"
            ;
    }
}
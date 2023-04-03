package Practica_2_1.Ejercicio_2_1_1;

public class Favoritos_arreglo {
    private ContenidoAudioVisual[] favoritos;
    private int indice;

    public void addContenido(ContenidoAudioVisual contenido){
        indice++;
        favoritos[indice] = contenido;
    }

    public void deleteContenido(int id){}
    public void printContenido(){}
    public void showContenido(){}
}

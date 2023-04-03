package Practica_2_1.Ejercicio_2_1_1;
import java.util.Vector;

public class Favoritos {
    private final Vector<ContenidoAudioVisual> vec;


    public Favoritos(){
        vec = new Vector<>();
    }
    public void addContenido(ContenidoAudioVisual cont){
        vec.add(cont);
    }
    public void deleteContenido(String info){
        for(int i=0;i<vec.size();i++){
            if(info.matches(vec.get(i).getTitulo())){
                vec.remove(i);
                System.out.println("Borrado exitoso");
            }
        }
    }
    public void showContenido(){
        for (ContenidoAudioVisual contenidoAudioVisual : vec) {
            contenidoAudioVisual.toString();
        }
    }
}
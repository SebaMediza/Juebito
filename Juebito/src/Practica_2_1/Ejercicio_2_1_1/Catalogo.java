package Practica_2_1.Ejercicio_2_1_1;

import java.util.Hashtable;
import java.util.Scanner;

public class Catalogo {
    private final Hashtable<Integer, ContenidoAudioVisual> cat;
    private int indice=0;
    Scanner input = new Scanner(System.in);
    public Catalogo(){
        cat = new Hashtable<>();
    }

    public void addContenido(ContenidoAudioVisual y){
        indice++;
        cat.put(indice,y);
        System.out.println("Agregado exitosamente");
    }

    public void showContenido(){
        if(!cat.isEmpty()){
            System.out.println("Sus favoritos son:");
            //loop
        }else{
            System.out.println("Lista Vacia");
        }
    }

    public void printContenido(){
        if(!cat.isEmpty()){
            System.out.println("Ingrese el Numero de Id, para ver los detalles");
            int id = input.nextInt();
            System.out.print("Id: " + id);
            System.out.println(cat.get(id).toString());
        }else{
            System.out.println("Lista Vacia");
        }
    }

    public void deleteContenido(int index){
        cat.remove(index);
    }

    // public Hashtable<Integer, ContenidoAudioVisual> buscarContenido(GregorianCalendar fec_1, GregorianCalendar fec_2){
    //     for(Integer i=1;i< cat.size();i++){
    //         if(fec_1.after(cat.get(i).getFechaEstreno()) && fec_2.before(cat.get(i).getFechaEstreno()));
    //     }
        
    // }
}

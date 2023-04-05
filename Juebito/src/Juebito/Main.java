package Juebito;

import java.util.Vector;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Vector<Juego> games = new Vector<>();
      try (Scanner input = new Scanner(System.in)) {
         int eleccion;
         do{
            eleccion = input.nextInt();
            switch(eleccion){
               case 1:
               Dados dice = new Dados();
               games.add(dice);
               games.get(0).jugar();
               System.out.println(games.get(0).mostrarResultado());
               break;
               case 2:
               break;
            }
         }while(eleccion != 0);
      }
   }
}

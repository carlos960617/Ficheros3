package EjerciciosClase.ejsClase5.ej5;

import java.util.ArrayList;
import java.util.Objects;

public class ej5 {

    public static ArrayList<String> obtenerArrListSinCadenasRepetidas(ArrayList<String> al){

        ArrayList<String> nuevo = new ArrayList<>(al);

        /*for(String s: al){
            if(!nuevo.contains(s)){
                nuevo.add(s);
            }
        }*/
        ArrayList<Integer> indices = new ArrayList<>();

        /*int contador = 0;
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    contador++;
                }
                if(contador > 1){
                    indices.add(j);
                }
            }

            contador = 0;
        }

        for(Integer i: indices){
            al.remove(i);
        }*/

        int contador = 0;
        for(int i=0;i<al.size();i++){
            for(int j=0;j<al.size();j++){
                if(al.get(i).equals(al.get(j))){
                    contador++;
                }
                if(contador > 1){
                    nuevo.remove(j);
                }
            }

            contador = 0;
        }

        System.out.println(nuevo);

        /*for(Integer i: indices){
            al.remove(i);
        }*/


        return al;

    }

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("La casa es grande");
        al.add("La casa es grande");
        al.add("Hay cinco pelotas");
        al.add("El niño es pequeño");
        al.add("La casa es grande");
        al.add("El niño es pequeño");
        al.add("La libelula es multicolor");
        al.add("Hay cinco pelotas");

        System.out.println(obtenerArrListSinCadenasRepetidas(al));


    }
}

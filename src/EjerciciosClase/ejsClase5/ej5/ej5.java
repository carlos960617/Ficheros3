package EjerciciosClase.ejsClase5.ej5;

import java.util.ArrayList;
import java.util.Objects;

public class ej5 {

    public static ArrayList<String> obtenerArrListSinCadenasRepetidas(ArrayList<String> al){

        ArrayList<String> nuevo = new ArrayList<>();

        for(String s: al){
            if(!nuevo.contains(s)){
                nuevo.add(s);
            }
        }

        al = nuevo;

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

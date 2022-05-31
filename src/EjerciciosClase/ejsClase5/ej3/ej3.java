package EjerciciosClase.ejsClase5.ej3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class ej3 {

    public static String[] obtenerArrCad5VocalesAL(ArrayList<String> al){

        ArrayList<String> aux = new ArrayList<>();

        int contador = 0;
        for(String s:al){
            String minis = s.toLowerCase();
            if(minis.contains("a") && minis.contains("e") && minis.contains("i") && minis.contains("o") && minis.contains("u")){
                aux.add(s);
                contador ++;
            }
        }

        return aux.toArray(new String[contador]);

    }

    public static void main(String[] args) {

        ArrayList<String> aa = new ArrayList<>();

        aa.add("La casa esta empapada");
        aa.add("El murcielago tiene miedo");
        aa.add("Mi hermana está en su caserio");
        aa.add("A e i o u");
        aa.add("Cincuenta hermanas");

        System.out.println(Arrays.toString(obtenerArrCad5VocalesAL(aa)));

    }
}

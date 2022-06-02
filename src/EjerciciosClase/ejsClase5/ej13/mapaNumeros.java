package EjerciciosClase.ejsClase5.ej13;

import java.util.HashMap;
import java.util.Map;

public class mapaNumeros {

    public static void main(String[] args) {

        Map<String, String> numeros1= new HashMap<>();
        Map<String, String> numeros2= new HashMap<>();
        Map<String, String> numeros3= new HashMap<>();
        Map<String, String> numeros4= new HashMap<>();
        Map<String, String> numeros5= new HashMap<>();
        Map<Integer, Map> traduccion = new HashMap<>();

        numeros1.put("ENG", "three");
        numeros1.put("GER", "drei");
        numeros1.put("CHI", "san");

        numeros2.put("ENG", "two");
        numeros2.put("GER", "swai");
        numeros2.put("CHI", "er");

        numeros3.put("ENG", "one");
        numeros3.put("GER", "ein");
        numeros3.put("CHI", "yi");

        numeros4.put("ENG", "four");
        numeros4.put("GER", "fÜr");
        numeros4.put("CHI", "si");

        numeros5.put("ENG", "five");
        numeros5.put("GER", "funf");
        numeros5.put("CHI", "wu");

        traduccion.put(1, numeros3);
        traduccion.put(2, numeros2);
        traduccion.put(3, numeros1);
        traduccion.put(4, numeros4);
        traduccion.put(5, numeros5);



    }
}

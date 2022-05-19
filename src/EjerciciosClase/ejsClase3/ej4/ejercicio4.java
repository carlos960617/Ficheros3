package EjerciciosClase.ejsClase3.ej4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ejercicio4 {

    public static ArrayList leerCadenaDeArchivo(String nombre) throws FileNotFoundException {

        ArrayList<String> cadenas = new ArrayList<>();


        FileReader fr = new FileReader(nombre+".txt");

        BufferedReader br = new BufferedReader(fr);



        return cadenas;
    }

    public static void main(String[] args) {

    }
}

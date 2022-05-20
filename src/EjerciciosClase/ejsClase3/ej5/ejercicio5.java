package EjerciciosClase.ejsClase3.ej5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ejercicio5 {

    public static void mostrarArchivoPantalla(String nombre) throws IOException {

        FileReader fr = new FileReader(nombre);

        BufferedReader br = new BufferedReader(fr);

        String cadena ="";
        int value = br.read();
        while(value != -1){

            cadena += (char)value;
            value = br.read();

        }

        System.out.println(cadena);

    }

    public static void main(String[] args) throws IOException {

        mostrarArchivoPantalla("DocuEj5");

    }
}

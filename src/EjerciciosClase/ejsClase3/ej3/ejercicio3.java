package EjerciciosClase.ejsClase3.ej3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ejercicio3 {

    public static String[] cadenas={"El búho", "Compra alcachofas", "para alimentar a sus crias", "y lanza los huevos", "contra sus enemgigos"};

    public static void escribirCadenasEnArchivo(String[] cadenas, String archivo) throws IOException {

        FileWriter fw = new FileWriter(archivo+".txt");

        PrintWriter f1 = new PrintWriter(fw);


        for(String s: cadenas){
            f1.print(s+"*");
        }

        f1.flush();
        f1.close();

    }
    public static void main(String[] args) throws IOException {

        escribirCadenasEnArchivo(cadenas, "CadenasAsteriscadas");


    }
}

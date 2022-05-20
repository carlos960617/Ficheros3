package EjerciciosClase.ejsClase3.ej6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import static java.lang.String.CASE_INSENSITIVE_ORDER;

public class ejercicio6 {

    public static void ordenarArchivoAlfab(String name) throws IOException {

        ArrayList<String> AL1 = new ArrayList<>();
        FileReader fr = new FileReader(name);

        BufferedReader br = new BufferedReader(fr);

        String line = br.readLine();
        while(line != null){

            AL1.add(line);

        }

        Collections.sort(AL1, CASE_INSENSITIVE_ORDER);

        FileWriter fw = new FileWriter(name);

        PrintWriter f1 = new PrintWriter(fw);

        /*for()*/

    }

    public static void main(String[] args) throws FileNotFoundException {







    }
}

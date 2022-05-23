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
            line = br.readLine();

        }

        Collections.sort(AL1, CASE_INSENSITIVE_ORDER);

        System.out.println(AL1);

        br.close();

        //Por defecto append es false

        FileWriter fw = new FileWriter(name, false);

        PrintWriter f1 = new PrintWriter(fw);

        for(String s:AL1){
            f1.println(s);
        }

        f1.close();


    }

    public static void main(String[] args) throws IOException {


    ordenarArchivoAlfab("OrdenAlfabetico.txt");




    }
}

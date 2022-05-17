package EjerciciosClase.ejsClase2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class diapo9 {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        FileWriter fw = new FileWriter("pizarra.txt", true);

        PrintWriter f1 = new PrintWriter(fw);

        System.out.println("Introduce tu primera frase: ");

        String linea = sc.nextLine();

        while(!linea.equalsIgnoreCase("FIN")){
            f1.println(linea);

            System.out.println("Introduce la siguiente linea: ");
            linea = sc.nextLine();
        }

        f1.flush();
        f1.close();
    }
}

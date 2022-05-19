package EjerciciosClase.ejsClase4.ej1;

import java.io.*;
import java.util.Scanner;

public class matrizBinarios {

    public static void main(String[] args) throws IOException {

        Double[][] d1 = new Double[2][2];

        Scanner sc = new Scanner(System.in);

        System.out.println("Primer valor");
        double value = sc.nextDouble();

        for(int i=0; i<2; i++) {
            for(int j=0; j<2; j++) {
                d1[i][j] = value;
                System.out.println("Siguiente valor");
                value = sc.nextDouble();
            }

        }

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                System.out.print(d1[i][j]);
            }
            System.out.println();
        }

        FileOutputStream IS = new FileOutputStream("ficheroBinario.dat");

        DataOutputStream DIS =  new DataOutputStream(IS);

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<2; j++) {
                DIS.writeDouble((d1[i][j]));
            }
            System.out.println();
        }

    }
}

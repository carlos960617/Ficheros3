package EjerciciosClase.ejsClase2.ej2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reader {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("pizarra.txt");

        BufferedReader br1 = new BufferedReader(fr);

        String line = br1.readLine();

        System.out.println("Lista con readLine");
        while(line != null){
            System.out.println(line);
            line = br1.readLine();
        }

        System.out.println("");

        FileReader fr2 = new FileReader("pizarra.txt");

        BufferedReader br2 = new BufferedReader(fr2);

        System.out.println("Lista con read");
        int car = br2.read();
        while(car != -1){
            System.out.print((char)car);
            car = br2.read();
        }

    }
}

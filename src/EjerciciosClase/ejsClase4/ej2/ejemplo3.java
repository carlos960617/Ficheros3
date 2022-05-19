package EjerciciosClase.ejsClase4.ej2;

import javax.xml.crypto.Data;
import java.io.*;

public class ejemplo3 {

    public static void main(String[] args) throws FileNotFoundException {


        try{

            FileInputStream FIS = new FileInputStream("ficheroBinario.dat");
            DataInputStream DIS = new DataInputStream(FIS);

            double value = 0;

            for (int i = 0; i<2; i++) {
                for (int j = 0; j<2; j++) {
                    value = DIS.readDouble();
                    System.out.println(value);
                }
                System.out.println();
            }

        }catch(EOFException ex){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

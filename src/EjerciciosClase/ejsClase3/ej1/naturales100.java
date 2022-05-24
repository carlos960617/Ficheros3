package EjerciciosClase.ejsClase3.ej1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class naturales100 {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("numNaturales.txt");

        PrintWriter f1 = new PrintWriter(fw);

        //FileWriter usa write()

        for(int i=1; i<=100;i++){
            if(i%10 == 0){
                f1.println(i+" ");
            }else{
                f1.print(i+" ");
            }

        }

        f1.flush();
        f1.close();
    }
}

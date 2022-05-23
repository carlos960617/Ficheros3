package EjerciciosClase.ejsClase3.ej8;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ejercicio8 {

    public static void actualizarPrecios(String archivo ) throws FileNotFoundException {

        FileInputStream fis = new FileInputStream(archivo);

        DataInputStream dis = new DataInputStream(fis);

        try{

            double num2 = dis.readDouble();

            while(true){
                if(num2 > 100){
                    num2 = num2*0.5;

                }else{
                    num2 = num2*1.5;
                }

                num2 = dis.readDouble();
            }

        }catch(IOException ex){
            System.out.println("No quedan mas numeros por recuperar.");

        }


    }

    public static void main(String[] args) throws FileNotFoundException {

        actualizarPrecios("Catalogo.dat");
    }
}

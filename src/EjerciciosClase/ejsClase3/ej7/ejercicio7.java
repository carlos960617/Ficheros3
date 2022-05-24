package EjerciciosClase.ejsClase3.ej7;

import java.io.*;

public class ejercicio7 {

    public static void escribirArchivoPrecios(int[] lista, double[] precio, String archivo) throws IOException {


        /*FileWriter fw = new FileWriter(archivo, false);

        PrintWriter f1 = new PrintWriter(fw);

        for(int i=0; i<lista.length-1;i++){
            f1.print("Producto Nº "+lista[i]+" = "+precio[i]+" €\n");

        }

        f1.close();*/

        FileOutputStream fos = new FileOutputStream(archivo, false);
        DataOutputStream dos = new DataOutputStream(fos);

        for(int i=0; i<lista.length-1;i++){
            System.out.println(lista[i]);
            dos.writeInt(lista[i]);


            System.out.println(precio[i]);
            dos.writeDouble(precio[i]);



        }



    }

    public static void main(String[] args) throws IOException {

        int[] referencias = {4567,5678,6543,76764,3456,4321};
        double[] precio = {45.67,54.23,44.55,78.12,123.67,89.09};

        escribirArchivoPrecios(referencias, precio, "Catalogo.dat");

    }
}

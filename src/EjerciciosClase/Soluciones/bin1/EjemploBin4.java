package EjerciciosClase.Soluciones.bin1;

import java.io.*;

public class EjemploBin4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int filas, columnas, i, j;
        try {
            fis = new FileInputStream("ficheros/matriz.dat");
            entrada = new DataInputStream(fis);
            filas = entrada.readInt(); //se lee el primer entero del fichero
            columnas = entrada.readInt();//se lee el segundo entero del fichero
            System.out.println("Filas: "+filas+ ", columnas: "+columnas);
            for (i = 0; i < filas; i++) {
                for (j = 0; j < columnas; j++) { // se leen los double y se muestran por pantalla
                    System.out.printf("%8.2f", entrada.readDouble());
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

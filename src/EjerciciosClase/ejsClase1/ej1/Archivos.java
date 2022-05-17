package EjerciciosClase.ejsClase1.ej1;

import java.io.File;

public class Archivos {

    public static void main(String[] args) {

        File f1 = new File("datos.txt");

        System.out.println("Ruta relativa: "+f1.getPath());
        System.out.println("Ruta asboluta: "+f1.getAbsolutePath());
        System.out.println("Ruta padre: "+f1.getParent());
        System.out.println("Nombre del archivo: "+f1.getName());
        System.out.println("Tamaño del archivo: "+f1.length());

    }
}

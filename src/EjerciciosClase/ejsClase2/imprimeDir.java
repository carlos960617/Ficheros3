package EjerciciosClase.ejsClase2;

import java.io.File;
import java.util.Arrays;

public class imprimeDir {

    public static void main(String[] args) {

        /*File lista = new File(".");
        System.out.println(Arrays.toString(lista.list()));*/

        File lista = new File("C:/Users/usuario/Documents");
        System.out.println(Arrays.toString(lista.list()));

    }
}

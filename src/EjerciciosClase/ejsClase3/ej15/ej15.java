package EjerciciosClase.ejsClase3.ej15;

import EjerciciosClase.ejsClase3.ej11_12_13.Punto;

import java.io.*;
import java.util.ArrayList;

public class ej15 {

    public static ArrayList<Punto> obtenerArrayListDeArchivoComoObjeto() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("escribeObjetos.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Punto> alp = new ArrayList<>();

        Punto p = (Punto)ois.readObject();

        //No sirve con null hay que usar el bucle infinito (el que devuelve null es readLine)

        while(p != null){
            alp.add(p);
            p=(Punto)ois.readObject();
        }


        return alp;

    }

    public static void main(String[] args) {

    }
}

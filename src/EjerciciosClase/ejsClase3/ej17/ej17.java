package EjerciciosClase.ejsClase3.ej17;

import EjerciciosClase.ejsClase3.ej11_12_13.Punto;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ej17 {

    public static ArrayList<Punto> leerArrayListEnArchivo() throws IOException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("escribeObjetos.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        ArrayList<Punto> alp = (ArrayList<Punto>)ois.readObject();

        return alp;
    }

    public static void main(String[] args) {

    }
}

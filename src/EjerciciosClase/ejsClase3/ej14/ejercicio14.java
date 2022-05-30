package EjerciciosClase.ejsClase3.ej14;

import EjerciciosClase.ejsClase3.ej11_12_13.Punto;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ejercicio14 {

    static ArrayList<Punto> coleccionPuntos = new ArrayList<>();

    public static void almacenarColPuntosComoObjetos(ArrayList<Punto> cp, String nombre) throws IOException {


        FileOutputStream fos = new FileOutputStream(nombre, false);

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Punto p: cp){
            oos.writeObject(p);
        }

    }

    public static void main(String[] args) throws IOException {

        coleccionPuntos.add(new Punto(3,5,"rojo"));
        coleccionPuntos.add(new Punto(4,8,"naranja"));
        coleccionPuntos.add(new Punto(9,9,"blanco"));

        almacenarColPuntosComoObjetos(coleccionPuntos, "escribeObjetos.txt");

    }
}

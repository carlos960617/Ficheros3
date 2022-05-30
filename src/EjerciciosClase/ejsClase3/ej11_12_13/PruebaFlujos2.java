package EjerciciosClase.ejsClase3.ej11_12_13;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaFlujos2 {

    static ArrayList<Punto> coleccionPuntos = new ArrayList<>();
    static String nombreArchivo="objetoPuntos.txt";

    public static ArrayList<Punto> obtenerArrayListDeArchivoTexto(String nombreArchivo) throws IOException {


        FileReader fr = new FileReader(nombreArchivo);

        BufferedReader br = new BufferedReader(fr);

        String cadena = br.readLine();

        ArrayList<Punto> objetosNuevos = new ArrayList<>();

        List<String> vO = new ArrayList<>();

        while(cadena != null){

            vO = Arrays.asList(cadena.split("#"));
            objetosNuevos.add(new Punto(Integer.parseInt(vO.get(0)), Integer.parseInt(vO.get(1)), vO.get(2)));
            cadena = br.readLine();
        }

        for(Punto p: objetosNuevos){
            System.out.println((p.toString()));
        }

        return objetosNuevos;


    }

    public static void almacenarColPuntosEnArchvioText(ArrayList<Punto> cP, String archivo) throws IOException {

        FileWriter fw1 = new FileWriter(archivo);
        PrintWriter pw1 = new PrintWriter(fw1);

        for(Punto p:cP){
            pw1.println(p.obtenerCoordX()+"#"+p.obtenerCoordY()+"#"+p.obtenerDistOrigen()+"#"+p.obtenerColor());
            System.out.println(p.obtenerCoordX()+"#"+p.obtenerCoordY()+"#"+p.obtenerDistOrigen()+"#"+p.obtenerColor());
        }

        pw1.close();

    }

    public static void main(String[] args) throws IOException {
        coleccionPuntos.add(new Punto(3,5,"rojo"));
        coleccionPuntos.add(new Punto(4,8,"naranja"));
        coleccionPuntos.add(new Punto(9,9,"blanco"));

        almacenarColPuntosEnArchvioText(coleccionPuntos, nombreArchivo);

        obtenerArrayListDeArchivoTexto(nombreArchivo);
    }
}

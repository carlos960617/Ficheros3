package EjerciciosClase.ejsClase3.ej2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sumaNaturales {

    Integer[] numeros = new Integer[100];

    public static int sumaFichero(BufferedReader br) throws IOException {
        int suma=0;
        String listaNumeros = "";

        int valor = br.read();
        while(valor != -1){
            listaNumeros += (char)valor;
            valor = br.read();
        }

        StringTokenizer st = new StringTokenizer (listaNumeros, " \r\n");
        while(st.hasMoreTokens()){
           suma += Integer.parseInt(st.nextToken());
        }

        return suma;
    }

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("numNaturales.txt");

        BufferedReader br = new BufferedReader(fr);


        int resultado = sumaFichero(br);

        System.out.println(resultado);


    }
}

package EjerciciosClase.Soluciones.random;

//public class EjemploRandom3 {
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class EjemploRandom3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RandomAccessFile fichero = null;
        String palabra, cadena;
        StringBuilder auxBuilder;
        long pos = 0;
        int indice;
        try {
            //se abre el fichero para lectura/escritura
            fichero = new RandomAccessFile("datos.txt", "rw");
            //Se pide la palabra a buscar
            System.out.print("Introduce palabra: ");
            palabra = sc.nextLine();

            //lectura del fichero
            fichero.seek(pos);
            cadena = fichero.readLine(); //leemos la primera línea
            while(cadena!=null){ //mientras la cadena contenga información
                indice = cadena.indexOf(palabra); //buscamos la palabra en la línea leída
                while(indice!=-1){ //mientras la línea contenga esa palabra (por si está repetida)
                    //paso la cadena a un StringBuilder para modificarlo
                    //la clase StringBuilder tiene muchos métodos para modificar las cadenas
                    auxBuilder = new StringBuilder(cadena);
                    //replace -> mete un string desde una posición inicial hasta otra final
                    auxBuilder.replace(indice, indice+palabra.length(), palabra.toUpperCase());
                    //volvemos a pasar el StringBuilder a nuestra cadena de manera que vamos actualizando
                    //todas las palabras en la cadena
                    cadena = auxBuilder.toString();

                    ///pos =  posición donde empieza la línea actual s
                    fichero.seek(pos);  //nos posicionamos al principio de la linea actual "pos"
                    fichero.writeBytes(cadena); //se sobreescribe la línea completa

                    //compruebo si se repite la misma palabra en la línea
                    indice = cadena.indexOf(palabra);
                }


                pos = fichero.getFilePointer(); //posición de la línea actual que voy a leer
                cadena = fichero.readLine(); //lectura de la línea
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }finally {
            try {
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

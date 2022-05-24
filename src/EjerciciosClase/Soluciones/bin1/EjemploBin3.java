package EjerciciosClase.Soluciones.bin1;

import java.io.*;

public class EjemploBin3 {
    public static void main(String[] args) {
        System.out.println("Con FileInputStream y DataInputStream....");
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int n;
        try {
            fis = new FileInputStream("ficheros/datos.dat");
            entrada = new DataInputStream(fis);
            //Bucle infinito, cuando se llega al final del fichero se lanza la
            //excepción EOFException que se utiliza para salir del bucle while.
            while (true) {
                n = entrada.readInt(); //se lee un entero del fichero
                System.out.println(n); //se muestra en pantalla
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (EOFException e) {
            System.out.println("Fin de fichero ");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
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

        //Ahora solo con FileInputStream....
        /*System.out.println("Ahora solo con FileInputStream....");
        try {
            fis = new FileInputStream("ficheros/datos2.dat");
            n=fis.read();
            while (n!=-1) {
                System.out.println(n); //se muestra en pantalla
                n = fis.read(); //se lee un entero del fichero
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin de fichero ");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        //Ahora solo con FileReader....   ¿Qué pasará??? pues que como se han guardado los datos en binario,
        // estas clases de ficheros de texto no los reconocen, no los saben interpretar.
        System.out.println("Ahora con FileReader....");
        FileReader fr = null;
        try {
            //Inicializamos el objeto diciendo el fichero que vamos a leer
            fr = new FileReader("ficheros/datos2.dat");
            int num =  fr.read();
            //Con el FileReader lee  bytes, cosas que no puede interpretar
            while (num != -1) {
                System.out.println((char)num);
                num = fr.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        //Ahora solo con FileReader y BufferedReader....
        System.out.println("Ahora con FileReader y BufferedReader....");
        BufferedReader br = null;
        try {
            //Inicializamos el objeto diciendo el fichero que vamos a leer
            fr = new FileReader("ficheros/datos2.dat");
            br = new BufferedReader(fr);
            String cadena = br.readLine();
            while(cadena!=null){
                System.out.println(cadena);
                cadena = br.readLine();
            }
            /*int num =  br.read();
            //Con el FileReader lee  bytes, cosas que no puede interpretar
            while (num != -1) {
                System.out.println((char)num);
                num = br.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }*/
    }
}

package EjerciciosClase.ejsClase3.ej8;

import java.io.*;

public class ejercicio8 {

    public static void actualizarPrecios(File archivo )  {

        try{
            RandomAccessFile raf = new RandomAccessFile(archivo, "rw");

            try {
                double num2 = 0;
                double num = 0;
                long posicion = 0;
                //nos situamos al principio
                raf.seek(0);
                while (true) {
                    num=raf.readInt();
                    System.out.println(num);
                    num2 = raf.readDouble(); //se lee un doble del fichero
                    System.out.println(num2); //se muestra en pantalla
                    if(num2 > 100){
                        posicion = raf.getFilePointer();
                        num2 = num2*0.5;

                    }else{
                        num2 = num2*1.5;
                    }

                    num2 = raf.readDouble();
                }
            } catch (EOFException e) {
                System.out.println("Fin de fichero");
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }


            /*while(true){
                if(num2 > 100){
                    num2 = num2*0.5;

                }else{
                    num2 = num2*1.5;
                }

                num2 = dis.readDouble();
            }*/

        }catch(IOException ex){
            System.out.println("No quedan mas numeros por recuperar.");

        }


    }

    public static void main(String[] args) throws FileNotFoundException {

        actualizarPrecios(new File("Catalogo.dat"));
    }
}

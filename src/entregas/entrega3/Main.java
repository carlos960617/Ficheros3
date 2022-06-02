package entregas.entrega3;

import EjerciciosClase.ejsSerializacion.ej1.persona;

import java.io.*;
import java.util.Scanner;

public class Main {



    public static void mostrarMenu(){
        System.out.println("""
                MENÚ AGENDA
                
                -----------
                
                1: Añadir contacto.
                2: Eliminar contacto.
                3: Mostrar contactos ordenados.
                4: Mostrar contactos que empiecen por cierta letra.
                5: Mostrar contactos según cadena.
                0: Salir y guardar en fichero.
                """);
    }

    public static Agenda recuperarAgenda(File f) throws IOException, ClassNotFoundException {

        Agenda a1;

        if(f.exists() && f.length() != 0){

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a1 = (Agenda)ois.readObject();

        }else{
            a1 = new Agenda();
            f.createNewFile();
        }

        return a1;
    }

    public static void guardarAgenda(File f, Agenda a) throws IOException {

        f.delete();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a);

    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File cajon = new File("Angeda.dat");

        Agenda a1 = recuperarAgenda(cajon);

        Scanner sc = new Scanner(System.in);

        mostrarMenu();

        System.out.println("Introduce la opción deseada:");

        int opcion  = sc.nextInt();
        sc.nextLine();
        String nombre = "";
        while(opcion != 0){

            switch(opcion){
                case 1:
                    System.out.println("Introduce el nombre del contacto a añadir:");
                    nombre = sc.nextLine();
                    System.out.println("Ahora introduce su telefono:");
                    String telefono = sc.nextLine();
                    //sc.nextLine();
                    a1.añadirNuevoContacto(new Contacto(nombre, telefono));
                    break;
                case 2:
                    System.out.println("Introduce el nombre del contacto que deseas eliminar:");
                    nombre = sc.nextLine();
                    a1.eliminarContacto(nombre);
                    break;
                case 3:
                    a1.mostrarContactos();
                    break;
                case 4:
                    System.out.println("Introduce la letra a filtrar:");
                    char letra = sc.nextLine().charAt(0);
                    a1.mostrarContactos(Character.toLowerCase(letra));
                    break;
                case 5:
                    System.out.println("Introduce la cadena a filtrar:");
                    nombre = sc.nextLine();
                    a1.mostrarContactos(nombre);
                    break;
                default:
                    System.out.println("Ese valor no es valido, introduce un numero del 0 al 5.");
            }

            mostrarMenu();
            System.out.println("Introduce la opción deseada:");
            opcion = sc.nextInt();
            sc.nextLine();

        }

        guardarAgenda(cajon, a1);

    }
}

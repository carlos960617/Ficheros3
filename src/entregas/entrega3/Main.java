package entregas.entrega3;

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



    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la opción deseada:");

        int opcion  = sc.nextInt();
        while(opcion != 0){


        }

    }
}

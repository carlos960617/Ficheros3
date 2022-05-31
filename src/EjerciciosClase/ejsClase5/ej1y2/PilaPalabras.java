package EjerciciosClase.ejsClase5.ej1y2;

import java.util.LinkedList;

public class PilaPalabras {

    public static LinkedList<String> ll;

    public PilaPalabras(){

        ll = new LinkedList<String>();

    }

    public void apilarPalabra(String p){

        ll.add(p);
    }

    public String desapilarPalabra(){

        String p = "";
        p = ll.removeLast();
        System.out.println("Se ha eliminado de la pila: "+p);
        return p;
    }

    public String obtenerPalabraCima(){

        String p = "";
        if(!ll.isEmpty()){
            p = ll.getLast();
            System.out.println("El objeto en la cima de la pila es: "+p);
        }else{
            System.out.println("No quedan objetos en la pila");
        }

        return p;
    }

    public boolean pilaPalabraVacia(){

        return ll.isEmpty();
    }

    public static void main(String[] args) {

        PilaPalabras pp = new PilaPalabras();

        pp.apilarPalabra("Rojo");

        pp.apilarPalabra("Morado");

        pp.apilarPalabra("Naranja");

        pp.desapilarPalabra();
        pp.desapilarPalabra();
        pp.desapilarPalabra();

        pp.obtenerPalabraCima();

        System.out.print("La pila está vacía? ");

        System.out.println(pp.pilaPalabraVacia());



    }
}

package entregas.entrega3;



import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Agenda {

    private ArrayList<Contacto> lista;

    public Agenda(){
        lista = new ArrayList<>();
    }

    public ArrayList<Contacto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }

    public void añadirNuevoContacto(Contacto c){

        lista.add(c);

    }

    public void mostrarContactos(){

        System.out.println("Contactos ordenados alfabeticamente");
        for(Contacto c:lista){
                System.out.println(c);
        }

    }

    public void mostrarContactos(char l){

        System.out.println("Contactos que empiezan por la letra \""+l+"\"");
        for(Contacto c:lista){
            if(c.getNombre().charAt(0) == l){
                System.out.println(c);
            }
        }
    }

    public void mostrarContactos(String c){

        System.out.println("Contactos que contienen la cadena \""+c+"\"");
        for(Contacto o:lista){
            if(o.getNombre().contains(c)){
                System.out.println(c);
            }
        }
    }

    public ArrayList<Contacto> buscarContactos(String c){

        ArrayList<Contacto> contieneC = new ArrayList<>();
        int contador = 0;

        for(Contacto o:lista){
            if(o.getNombre().toLowerCase().contains(c)){
                contieneC.add(o);
                contador ++;
            }
        }
        System.out.println("Numero de contactos que contienen la cadena \""+c+"\" = "+contador);

        return contieneC;
    }

    public void eliminarContacto(String c){

        Scanner sc = new Scanner(System.in);
        char opcion;

        for(Contacto o:lista){
            if(o.getNombre().toLowerCase().contains(c)){
                System.out.println("¿Seguro que quieres eliminar el contacto \""+o.getNombre()+"\" ?(s/n)");
                opcion = sc.next().charAt(0);

                if(opcion == 's'){
                    lista.remove(o);
                }else{
                    System.out.println("El contacto no se eliminará.");
                }
            }
        }
    }


}

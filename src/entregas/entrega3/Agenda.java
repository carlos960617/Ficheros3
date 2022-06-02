package entregas.entrega3;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Agenda implements Serializable {

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
        Collections.sort(lista);

        System.out.println("Contacto guardado.");

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
            if(c.getNombre().toLowerCase().charAt(0) == l){
                System.out.println(c);
            }
        }
    }

    public void mostrarContactos(String c){

        System.out.println("Contactos que contienen la cadena \""+c+"\"");
        for(Contacto o:lista){
            if(o.getNombre().toLowerCase().contains(c.toLowerCase())){
                System.out.println(o);
            }
        }
    }

    public ArrayList<Contacto> buscarContactos(String c){

        ArrayList<Contacto> contieneC = new ArrayList<>();
        int contador = 0;

        for(Contacto o:lista){
            if(o.getNombre().toLowerCase().contains(c.toLowerCase())){
                contieneC.add(o);
                contador ++;
            }
        }
        System.out.println("Numero de contactos que contienen la cadena \""+c+"\" = "+contador);

        return contieneC;
    }

    public void eliminarContacto(String c){

        Scanner sc = new Scanner(System.in);

        ArrayList<Contacto> nueva = new ArrayList<>();
        for(int i=0; i<lista.size();i++){
            if(lista.get(i).getNombre().toLowerCase().contains(c.toLowerCase())){
                System.out.println("¿Seguro que quieres eliminar el contacto \""+lista.get(i).getNombre()+"\" ?(s/n)");
                char opcion = sc.nextLine().charAt(0);
                if(opcion == 's'){
                    lista.set(i, null);
                }else{
                    System.out.println("Este contacto no se eliminará.");
                }

            }
        }

        for(Contacto con: lista){
            if (con != null){
                nueva.add(con);
            }
        }

        lista = nueva;
    }


}

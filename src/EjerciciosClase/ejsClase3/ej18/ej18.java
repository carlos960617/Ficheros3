package EjerciciosClase.ejsClase3.ej18;

import EjerciciosClase.ejsClase3.ej11_12_13.Punto;

import java.io.*;
import java.util.ArrayList;

public class ej18 {

    public static void actualizarColPuntosComoObjetos(ArrayList<Punto> alp, String ruta) throws IOException {

        File f1 = new File(ruta);

        /*for(Punto p: alp){
            oos.writeObject(p);
        }*/

        if(f1.exists() && f1.length() != 0){

            FileOutputStream fos = new FileOutputStream(f1, true);

            OOSsinCabecera oos = new OOSsinCabecera(fos);
        }else{
            FileOutputStream fos = new FileOutputStream(f1, true);

            ObjectOutputStream oos = new ObjectOutputStream(fos);
        }

    }

    public static void main(String[] args) {

    }


}

class OOSsinCabecera extends ObjectOutputStream{

    public OOSsinCabecera(FileOutputStream fos) throws IOException {
        super(fos);

    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //Desactivo el metodo borrando all of its codigo
    }
}

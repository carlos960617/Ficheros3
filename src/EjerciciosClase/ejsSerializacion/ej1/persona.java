package EjerciciosClase.ejsSerializacion.ej1;

import java.io.*;

public class persona implements Serializable{

    String nombre="lorena";
    int edad=26;
    Boolean casada=true;

    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", casada=" + casada +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        /*fileoutputstream
                objectoutputstream 2
                objeto p

                        2.writeobject(p)*/

        FileOutputStream fos = new FileOutputStream("objetoPersona.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        persona p1 = new persona();

        oos.writeObject(p1);

        FileInputStream fis = new FileInputStream("objetoPersona.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        persona p2 = (persona)ois.readObject();

        System.out.println(p2);



    }
}

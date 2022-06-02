package entregas.entrega3;

import java.io.Serializable;

public class Contacto implements Comparable<Contacto>, Serializable {

    private String nombre;
    private String telefono;

    public Contacto(String n, String tfno){

        nombre = n;
        telefono = tfno;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre +
                " = " + telefono;
    }

    @Override
    public int compareTo(Contacto o) {

        return this.nombre.toLowerCase().compareTo(o.nombre.toLowerCase());

    }
}

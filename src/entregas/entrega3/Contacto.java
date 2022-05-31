package entregas.entrega3;

public class Contacto implements Comparable<Contacto> {

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
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contacto o) {

        if(this.nombre == o.nombre){
            return 0;
        }else if(this.nombre.compareToIgnoreCase(o.nombre) > 0 ){
            return 1;
        }else{
            return -1;
        }

    }
}


public class Bombero {
    private String dni;
    private String nombre;
    private int sueldobase;
    private int cantidadintervenciones;


    public Bombero(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldobase = 1000;
        this.cantidadintervenciones = 0;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(int sueldobase) {
        this.sueldobase = sueldobase;
    }

    public int getCantidadintervenciones() {
        return cantidadintervenciones;
    }

    public void setCantidadintervenciones(int cantidadintervenciones) {
        this.cantidadintervenciones = cantidadintervenciones;
    }

    @Override
    public String toString() {
        return "Bombero{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sueldobase=" + sueldobase +
                ", cantidadintervenciones=" + cantidadintervenciones +
                '}';
    }
}

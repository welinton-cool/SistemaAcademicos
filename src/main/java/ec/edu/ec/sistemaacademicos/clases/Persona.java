
package ec.edu.ec.sistemaacademicos.clases;


public class Persona {
    private int id;
    private String nombre;
    private String correroPersonal;
    private String cedula;

    public Persona(int id, String nombre, String correroPersonal, String cedula) {
        this.id = id;
        this.nombre = nombre;
        this.correroPersonal = correroPersonal;
        this.cedula = cedula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreroPersonal() {
        return correroPersonal;
    }

    public void setCorreroPersonal(String correroPersonal) {
        this.correroPersonal = correroPersonal;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", correroPersonal=" + correroPersonal + ", cedula=" + cedula + '}';
    }
    
}

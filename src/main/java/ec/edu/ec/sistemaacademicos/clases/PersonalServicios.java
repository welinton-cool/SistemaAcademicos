/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.sistemaacademicos.clases;


public class PersonalServicios extends Empleado {
    private String gremio;

    public PersonalServicios(String gremio, double souelto, String correoInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(souelto, correoInstitucional, id, nombre, correroPersonal, cedula);
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    @Override
    public String toString() {
        return "PersonalServicios{" + "gremio=" + gremio + '}';
    }
    

    
    
}

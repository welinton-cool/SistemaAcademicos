/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.sistemaacademicos.clases;

/**
 *
 * @author HP
 */
public class Empleado extends PersonaInstitucional {
    private double souelto;

    public Empleado(double souelto, String correoInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correroPersonal, cedula);
        this.souelto = souelto;
    }

    public String agregarEmpleado(){
        return"";
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+ "souelto=" + souelto + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.sistemaacademicos.clases;

/**
 *
 * @author HP
 */
public class Estudiantes extends PersonaInstitucional{
    private int codigo;

    public Estudiantes(int codigo, String correoInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correroPersonal, cedula);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +super.toString()+ "codigo=" + codigo + '}';
    }
    
}

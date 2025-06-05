
package ec.edu.ec.sistemaacademicos.clases;


public class PersonaInstitucional extends Persona{
    private String correoInstitucional;

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correroPersonal, String cedula) {
        super(id, nombre, correroPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    @Override
    public String toString() {
        return "PersonaInstitucional{" +super.toString()+ "correoInstitucional=" + correoInstitucional + '}';
    }
    

   
 
    }
    
    
    
    


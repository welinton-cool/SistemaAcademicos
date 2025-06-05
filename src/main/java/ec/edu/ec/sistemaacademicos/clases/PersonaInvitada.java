
package ec.edu.ec.sistemaacademicos.clases;


public class PersonaInvitada extends Persona{

    public PersonaInvitada(int id, String nombre, String correroPersonal, String cedula) {
        super(id, nombre, correroPersonal, cedula);
    }

   
 
    public String agregarPersonaInvitada(){
        return "";
    }

    @Override
    public String toString() {
        return "PersonaInvitada{" + '}'+super.toString();
    }
   
}

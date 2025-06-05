

package ec.edu.ec.sistemaacademicos;

import ec.edu.ec.sistemaacademicos.clases.Persona;
import ec.edu.ec.sistemaacademicos.clases.PersonaInvitada;

public class SistemaAcademicos {

    public static void main(String[] args) {
        System.out.println("DATOS DEL OBJETO PERSONA");
       Persona persona= new Persona(1, "welinton sacon","welinton.sacon@espoch","094764");
        System.out.println("datos"+persona);
        System.out.println("DATOS DEL OBJETO PERSONA INVITADA");
        System.out.println("DATOS DEL OBJETO DE PERSONA INVITADA");
        System.out.println("DATOS DE OBJETO PERSONA INSTITUCIONAL");
        PersonaInvitada personaInvitada=new PersonaInvitada(2,"welinton Isaias","welinton@espoc","09884747");
        System.out.println("DATOS"+persona.toString());
        
    }
}

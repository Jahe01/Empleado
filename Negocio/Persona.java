
package Negocio;

/**
 *
 * @author johanna.huaracxa
 */
public abstract class Persona {
    private String nombres;
    private Fecha fechaNacimiento;
    
    public Persona(String nombres, Fecha fechaNacimiento){
       setPersona(nombres, fechaNacimiento);
    }

    private void setPersona(String nombres, Fecha fechaNacimiento) {
       this.nombres=nombres;
       this.fechaNacimiento=fechaNacimiento;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombres + "\n\nFecha de Nacimiento: " + this.fechaNacimiento ;
    }
    
    
}

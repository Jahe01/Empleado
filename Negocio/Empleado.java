package Negocio;

/**
 * 
 * @author johanna.huaraca
 */
public abstract class Empleado extends Persona implements PorPagar{
    private Fecha fechaIngreso;
  
    public Empleado(String nombres, Fecha fechaNacimiento) {
        super(nombres, fechaNacimiento);
    }

    public Empleado(Fecha fechaIngreso, String nombres, Fecha fechaNacimiento){
        super(nombres, fechaNacimiento);
        this.fechaIngreso=fechaIngreso;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFecha Ingreso: "+fechaIngreso;
    }   
}

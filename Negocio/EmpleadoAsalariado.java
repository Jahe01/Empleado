
package Negocio;
/**
 *
 * @author johanna.huaraca
 */
public class EmpleadoAsalariado extends Empleado {
    private double salarioBasico;

    public EmpleadoAsalariado(Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(fechaIngreso,nombres, fechaNacimiento);
    }
    
    public EmpleadoAsalariado (double salarioBasico, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento){
      super(fechaIngreso, nombres, fechaNacimiento);
      this.salarioBasico= salarioBasico;
    }
     
    
    @Override
    public double getMontoPago() {
       return this.salarioBasico;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nSalario Básico: "+salarioBasico+"\n";
    } 
}

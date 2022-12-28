package Negocio;
/**
 *
 * @author johanna.huaraca 
 */
public class EmpleadoPorComision extends Empleado {
    private double totalVentas;
    private double porcentajeComision;

    public EmpleadoPorComision(Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(fechaIngreso, nombres, fechaNacimiento);}
    
     public EmpleadoPorComision(double totalVentas, double porcentajeComision,Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(fechaIngreso, nombres, fechaNacimiento);
        this.porcentajeComision=porcentajeComision;
        this.totalVentas=totalVentas;
    }
    @Override
    public double getMontoPago() {
        return this.totalVentas*this.porcentajeComision;
    }
    @Override
    public String toString() {
        return super.toString()+"\nTotal de Ventas: "+totalVentas+"\nPorcentaje por comision: "+porcentajeComision;
    }
               
}

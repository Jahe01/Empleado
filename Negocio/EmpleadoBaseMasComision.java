package Negocio;
/**
 *
 * @author johanna.huaraca
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision{
    private double salarioBase;

    public EmpleadoBaseMasComision(double totalVenta, double porcentajeComision, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(totalVenta, porcentajeComision, fechaIngreso, nombres, fechaNacimiento);
    }
    public EmpleadoBaseMasComision(double salarioBase, double totalVenta, double porcentajeComision, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(totalVenta, porcentajeComision, fechaIngreso, nombres, fechaNacimiento);
        this.salarioBase= salarioBase;
    }

    @Override
    public double getMontoPago() {
        return super.getMontoPago()+this.salarioBase;
    }
    @Override
    public String toString() {
        return super.toString()+"\nSalario base:"+salarioBase;
    }    
}

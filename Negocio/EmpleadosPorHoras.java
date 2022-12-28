package Negocio;
/**
 *
 * @author johanna.huaraca
 */
public class EmpleadosPorHoras extends Empleado{
    private float numHoras;
    private float costoHoras;
    
    public EmpleadosPorHoras(Fecha fechaIngreso, String nombres, Fecha fechaNacimiento) {
        super(fechaIngreso, nombres, fechaNacimiento);}  
    
    public EmpleadosPorHoras(float numHoras, float costoHoras, Fecha fechaIngreso, String nombres, Fecha fechaNacimiento ){
       super(fechaIngreso, nombres, fechaNacimiento); 
       this.costoHoras=costoHoras;
       this.numHoras=numHoras;}

    @Override
    public double getMontoPago() {
        double salarioPorHoras=0;
        if(this.numHoras<=40){
            salarioPorHoras=this.numHoras*this.costoHoras;}
        else if (this.numHoras>40){
          salarioPorHoras=this.costoHoras*40+((this.numHoras-40)*(this.costoHoras*1.5));}
        return salarioPorHoras;}

    @Override
    public String toString() {
        return super.toString()+ "\nEmpleado Por Horas: " + "\nNúmero de horas:"+numHoras+"\nCosto por hora:"+
                costoHoras; }  
}

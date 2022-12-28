
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author johanna.huaraca
 */
public class ListaEmpleados {
    private ArrayList <Empleado> lista;
    
    public ListaEmpleados(){
        this.lista = new ArrayList <Empleado>();
    }
    
    public void addEmpleado(Empleado empleado){
        lista.add(empleado);
    }

    @Override
    public String toString() {
        String salida="";
        for(Empleado aux:lista)
            salida+=aux.toString()+"\nSALARIO TOTAL CALCULADO: $"+aux.getMontoPago()+"\n"+"---------------------------------------------------------------------"+"\n";
        return salida;
    }
    
}

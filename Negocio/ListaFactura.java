
package Negocio;

import java.util.ArrayList;

/**
 *
 * @author johanna.huaraca
 */
public class ListaFactura {
     private ArrayList <Factura> lista;
    
    public ListaFactura(){
        this.lista = new ArrayList <Factura>();
    }
    
    public void addFactura(Factura fac){
        lista.add(fac);
    }

    @Override
    public String toString() {
        String salida="";
        for(Factura aux:lista)
            salida+=aux.toString()+"\n PAGO TOTAL CALCULADO: $"+aux.getMontoPago()+"\n"+"---------------------------------------------------------------------"+"\n";
        return salida;
    }
    
    
    
}

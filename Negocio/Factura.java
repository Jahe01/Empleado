
package Negocio;

/**
 *
 * @author johanna.huaraca
 */
public  class Factura implements PorPagar {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;
    
     
     
     
    public Factura(String numeroPieza, String descripcionPieza, int cantidad,double precioPorArticulo){
        this.cantidad=cantidad;
        this.descripcionPieza=descripcionPieza;
        this.numeroPieza=numeroPieza;
        this.precioPorArticulo=precioPorArticulo;
        }
    
    public String getNumeroPieza(){
        return numeroPieza; 
    }
    
    public String getDescripcionPieza(){
        return descripcionPieza;  
    }
    public void establecerCantidad(int cantidad){
        this.cantidad = cantidad;   
    } 
    public int getCantidad(){
        return cantidad;
    }
    
    public void establecerPrecioPorArticulo(double precioPorArticulo){
      this.precioPorArticulo = precioPorArticulo;   
    }
    
    public double getPrecioPorArticulo(){
        return precioPorArticulo;  
    } 

    @Override
    public String toString() {
        return  "\n\nNumero de Pieza:" + getNumeroPieza() + "\n\nDescripcion de la Pieza:" 
                + getDescripcionPieza() + "\n\nCantidad:" + getCantidad()
                + "\n\nPrecioPorArticulo:" + getPrecioPorArticulo()
                +"\n\nPago Vencido:"+getMontoPago();
    }
    
   @Override
    public double getMontoPago() {
       return getCantidad() * getPrecioPorArticulo(); 
    }
    
    
    
}

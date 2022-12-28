
package Negocio;

import java.util.StringTokenizer;

/**
 *
 * @author johanna.huaraca
 */
public class Fecha {
    private int dia, mes, anio;
    
    public Fecha(String fecha){
     setFecha(fecha);
   }

    public void setFecha(String fecha) {
      StringTokenizer tk= new StringTokenizer(fecha,"/");
      this.dia=Integer.parseInt(tk.nextToken());
      this.mes=Integer.parseInt(tk.nextToken());
      this.anio=Integer.parseInt(tk.nextToken());
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
       public boolean validarFecha(Fecha fecha){
        boolean validoFecha=false;
        if (dia<1 || dia>32) {
            validoFecha=true;}

        if (mes<1 || mes>13) {
            validoFecha=true; }
        
        if (mes==2 && dia==29 && anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0) ) {
            validoFecha=true;
            } return validoFecha;
        }
       
    @Override
    public String toString() {
        return "("+dia+"/"+mes+"/"+anio+")"+"\n";
    }
    
    
}

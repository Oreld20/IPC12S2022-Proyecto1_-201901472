
package principal;

public class Informacion {
    String Accion="";
    String Fecha="";
    
    public String getAccion() {
        return Accion;
    }

    public void setAccion(String Accion) {
        this.Accion = Accion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
     public Informacion() {}
     
    public Informacion(String Accion, String Fecha) {
        this.Accion = Accion;
        this.Fecha = Fecha;
    }
}

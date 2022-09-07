
package principal;

public class Transacciones {
    int IdTransaccion=0;
    String Fecha="";
    String Detalle="";
    int CreDebi=0;
    int SaldoRestante=0;

    public int getIdTransaccion() {
        return IdTransaccion;
    }

    public void setIdTransaccion(int IdTransaccion) {
        this.IdTransaccion = IdTransaccion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }

   
    

    public int getCreDebi() {
        return CreDebi;
    }

    public void setCreDebi(int CreDebi) {
        this.CreDebi = CreDebi;
    }

    public int getSaldoRestante() {
        return SaldoRestante;
    }

    public void setSaldoRestante(int SaldoRestante) {
        this.SaldoRestante = SaldoRestante;
    }

    public Transacciones() {
    }
}

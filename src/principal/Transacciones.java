
package principal;

public class Transacciones {
    int IdTransaccion;
    String Fecha;
    String Detalle;
    int CreDebi;
    int SaldoRestante;

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

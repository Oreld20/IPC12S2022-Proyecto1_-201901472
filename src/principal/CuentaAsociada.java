
package principal;

public class CuentaAsociada {
    int Salado;
    int NumeroDeCuentaAsociada;
    boolean Disponibilidad = true;
    
    Informacion info [] = new Informacion[4];

    public boolean getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(boolean Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }
    
    CuentaAsociada(){
    this.Salado=0;
    this.NumeroDeCuentaAsociada=0;
    this.Disponibilidad=true;
    }
    CuentaAsociada(int NumeroDeCuentaAsociada,int Saldo ){
    this.Salado=Saldo;
    this.NumeroDeCuentaAsociada=NumeroDeCuentaAsociada;
    this.Disponibilidad=false;
    
    }


    public int getSalado() {
        return Salado;
    }

    public void setSalado(int Salado) {
        this.Salado = Salado;
    }

    public int getNumeroDeCuentaAsociada() {
        return NumeroDeCuentaAsociada;
    }

    public void setNumeroDeCuentaAsociada(int NumeroDeCuentaAsociada) {
        this.NumeroDeCuentaAsociada = NumeroDeCuentaAsociada;
    }
    
    
    
    
    
    
    
}

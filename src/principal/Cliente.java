
package principal;

public class Cliente {
    public long DocumentoDeIdentificacion;
    public String Nombre;
    public String Apellido;
    

    //Constructor
    public CuentaAsociada listadoDeCuentasAsociadas[]= {new CuentaAsociada(), new CuentaAsociada(),new CuentaAsociada(),new CuentaAsociada(),new CuentaAsociada()};
    
    public Cliente(){}
    
   public Cliente(long DocumentoDeIdentificacion, String Nombre, String Apellido) {
        this.DocumentoDeIdentificacion = DocumentoDeIdentificacion;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
 
   }
   // Asociar un Cuenta
   public void AsociarCuenta(int saldo){
       for (int i = 0; i <this.listadoDeCuentasAsociadas.length; i++) {
           if (this.listadoDeCuentasAsociadas[i].Disponibilidad == true) {
               System.out.println("espacio libre");
               this.listadoDeCuentasAsociadas[i].setSalado(saldo);
               this.listadoDeCuentasAsociadas[i].setDisponibilidad(false);
               break;
           }else{
               System.out.println("espacio ocupado");
           }
       }
   
   
   }
   // Informacion de Cuentas asociadas
   public void informacionDeCuentasAsociadas(){
   for (int i = 0; i <this.listadoDeCuentasAsociadas.length; i++) {
           if (this.listadoDeCuentasAsociadas[i].Disponibilidad == false) {
               System.out.println("espacio libre");
             this.listadoDeCuentasAsociadas[i].getNumeroDeCuentaAsociada();
             this.listadoDeCuentasAsociadas[i].getSalado();
             
               
           }else{
               System.out.println("espacio ocupado");
           }
       }
   
   
   }
   
   
   
   
   // Geter and Seter

    public CuentaAsociada[] getListadoDeCuentasAsociadas() {
        return listadoDeCuentasAsociadas;
    }

    public void setListadoDeCuentasAsociadas(CuentaAsociada[] listadoDeCuentasAsociadas) {
        this.listadoDeCuentasAsociadas = listadoDeCuentasAsociadas;
    }
   

    public long getDocumentoDeIdentificacion() {
        return DocumentoDeIdentificacion;
    }

    public void setDocumentoDeIdentificacion(int DocumentoDeIdentificacion) {
        this.DocumentoDeIdentificacion = DocumentoDeIdentificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
    
    
    
    

}
   
   
    
   
 
   


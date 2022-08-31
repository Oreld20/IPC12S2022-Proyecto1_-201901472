
package principal;

import javax.swing.JOptionPane;

public class CrearUnaCuenta extends javax.swing.JPanel {
 Cliente clientes [] = new Cliente [5];
 CuentaAsociada Asociados0 []= new CuentaAsociada [5];
  public Administrador Madre;

    public CrearUnaCuenta(Administrador ventanaMadre) {
        this.clientes=ventanaMadre.getClientes();
        this.Madre=ventanaMadre;
       initComponents();
       
       if(clientes[0]!=null){
           cboClientes.removeAllItems();
            cboClientes.addItem(clientes[0].getDocumentoDeIdentificacion() + " - " + clientes[0].getNombre() + " " + clientes[0].getApellido() );
       }
       if(clientes[1]!=null){
           cboClientes.removeAllItems();
            cboClientes.addItem(clientes[0].getDocumentoDeIdentificacion() + " - " + clientes[0].getNombre() + " " + clientes[0].getApellido() );
            cboClientes.addItem(clientes[1].getDocumentoDeIdentificacion() + " - " + clientes[1].getNombre() + " " + clientes[1].getApellido() );
       }
       if(clientes[2]!=null){
           cboClientes.removeAllItems();
            cboClientes.addItem(clientes[0].getDocumentoDeIdentificacion() + " - " + clientes[0].getNombre() + " " + clientes[0].getApellido() );
            cboClientes.addItem(clientes[1].getDocumentoDeIdentificacion() + " - " + clientes[1].getNombre() + " " + clientes[1].getApellido() );
            cboClientes.addItem(clientes[2].getDocumentoDeIdentificacion() + " - " + clientes[2].getNombre() + " " + clientes[2].getApellido() );
       }
       if(clientes[3]!=null){
           cboClientes.removeAllItems();
            cboClientes.addItem(clientes[0].getDocumentoDeIdentificacion() + " - " + clientes[0].getNombre() + " " + clientes[0].getApellido() );
            cboClientes.addItem(clientes[1].getDocumentoDeIdentificacion() + " - " + clientes[1].getNombre() + " " + clientes[1].getApellido() );
            cboClientes.addItem(clientes[2].getDocumentoDeIdentificacion() + " - " + clientes[2].getNombre() + " " + clientes[2].getApellido() );
            cboClientes.addItem(clientes[3].getDocumentoDeIdentificacion() + " - " + clientes[3].getNombre() + " " + clientes[3].getApellido() );
       }
       if(clientes[4]!=null){
           cboClientes.removeAllItems();
            cboClientes.addItem(clientes[0].getDocumentoDeIdentificacion() + " - " + clientes[0].getNombre() + " " + clientes[0].getApellido() );
            cboClientes.addItem(clientes[1].getDocumentoDeIdentificacion() + " - " + clientes[1].getNombre() + " " + clientes[1].getApellido() );
            cboClientes.addItem(clientes[2].getDocumentoDeIdentificacion() + " - " + clientes[2].getNombre() + " " + clientes[2].getApellido() );
            cboClientes.addItem(clientes[3].getDocumentoDeIdentificacion() + " - " + clientes[3].getNombre() + " " + clientes[3].getApellido() );
            cboClientes.addItem(clientes[4].getDocumentoDeIdentificacion() + " - " + clientes[4].getNombre() + " " + clientes[4].getApellido() ); 
       }
        

    }

    public CuentaAsociada[] getAsociados0() {
        return Asociados0;
    }

    public void setAsociados0(CuentaAsociada[] Asociados0) {
        this.Asociados0 = Asociados0;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
     
        
        
        
        
        
        
        
        
       
        
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboClientes = new javax.swing.JComboBox<>();
        btnCrear = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Crear una cuenta");

        cboClientes.setBackground(new java.awt.Color(102, 204, 255));
        cboClientes.setForeground(new java.awt.Color(255, 255, 255));
        cboClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboClientesActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(102, 204, 255));
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.setBorder(null);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(293, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(300, 300, 300))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cboClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboClientesActionPerformed


        
        
    }//GEN-LAST:event_cboClientesActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        int saldo =0;
        int contador=0;
        int posicionClienteSeleccionado=cboClientes.getSelectedIndex();
        
       
         if (clientes[posicionClienteSeleccionado]!=null) {
        for (int i = 0; i <clientes[posicionClienteSeleccionado].listadoDeCuentasAsociadas.length; i++) {
                   if (clientes[posicionClienteSeleccionado].listadoDeCuentasAsociadas[i].getDisponibilidad()==false) {
                   contador =contador + 1;
                   }
        
                }}
        
            if (contador == clientes.length) {
                JOptionPane.showMessageDialog(this,"limite de cuentas asociadas alcanzado");
            }else{
                
                    
                    if (clientes[posicionClienteSeleccionado] != null) {
                        for (int j = 0; j <clientes[posicionClienteSeleccionado].listadoDeCuentasAsociadas.length; j++) {
                            if (clientes[posicionClienteSeleccionado].listadoDeCuentasAsociadas[j].Disponibilidad==true) {
                                    int ContadorDeElCliente=Madre.contador+1;
                                   Madre.contador+=1;
                                clientes[posicionClienteSeleccionado].listadoDeCuentasAsociadas[j]=new CuentaAsociada(ContadorDeElCliente, saldo);
                                 System.out.println("El auto incremento es:" + ContadorDeElCliente);
                                 System.out.println("El numero de asociado es: " + clientes [posicionClienteSeleccionado].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada() + " El saldo es: " +clientes [posicionClienteSeleccionado].listadoDeCuentasAsociadas[j].getSalado());
                            break;
                            }
                        }
                      
               
                       
                
               
                    }
                
                    
                JOptionPane.showMessageDialog(this,"Usuario creado con exito");
               





            
    }//GEN-LAST:event_btnCrearActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JComboBox<String> cboClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

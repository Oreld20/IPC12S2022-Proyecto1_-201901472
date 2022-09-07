
package principal;

import javax.swing.JOptionPane;

public class Pagos extends javax.swing.JPanel {
Cliente clientes [] = new Cliente [5];
    public Administrador Madre;
    public Pagos(Administrador ventanaMadre) {
        this.clientes=ventanaMadre.getClientes();
        this.Madre=ventanaMadre;
        initComponents();
        
        for (int i = 0; i <clientes.length; i++) {
            for (int j = 0; j <clientes.length; j++) {
                if (clientes[i]!=null) {
                if (clientes[i].listadoDeCuentasAsociadas[j].Disponibilidad==false) {
                   jcbOrigen.addItem(Integer.toString(clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada())+ " - " + " Cuenta de: " + clientes[i].getNombre() + " " +clientes[i].getApellido()); 
                }
            }
            }
            
        } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbOrigen = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbServicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtxtMonto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Realizar un pago");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cuenta a debitar");

        jcbOrigen.setBackground(new java.awt.Color(102, 204, 255));
        jcbOrigen.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Tipo de servicio");

        jcbServicio.setBackground(new java.awt.Color(102, 204, 255));
        jcbServicio.setForeground(new java.awt.Color(255, 255, 255));
        jcbServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Luz electrica", "Agua", "Servicio telefonico" }));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Monto");

        jtxtMonto.setBackground(new java.awt.Color(255, 255, 255));
        jtxtMonto.setForeground(new java.awt.Color(0, 0, 0));

        btnAceptar.setBackground(new java.awt.Color(102, 204, 255));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorder(null);
        btnAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbOrigen, 0, 242, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcbServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(237, 237, 237))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

   if (jtxtMonto.getText().isEmpty()||Integer.parseInt(jtxtMonto.getText())==0) {
                    JOptionPane.showMessageDialog(this,"El monto debe ser superior a 0");
                }else{
        String dato=String.valueOf(jcbOrigen.getSelectedItem());
        String[] fragmento= dato.split(" ");
        int NoAsociado=Integer.parseInt(fragmento[0]);
        int Monto=Integer.parseInt(jtxtMonto.getText());
        
        
        String destino=String.valueOf(jcbServicio.getSelectedItem());
        System.out.println(destino);
        
        switch(destino){
            case "Luz electrica":
                        for (int i = 0; i <clientes.length; i++) {
            if (clientes[i]!=null) {
            for (int j = 0; j <clientes[i].listadoDeCuentasAsociadas.length; j++) {  
                if (clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada()==NoAsociado) {
                    if (clientes[i].listadoDeCuentasAsociadas[j].getSalado()>=Monto) {
                        
                    
                    int ahora=clientes[i].listadoDeCuentasAsociadas[j].getSalado();
                    clientes[i].listadoDeCuentasAsociadas[j].setSalado(ahora-Monto);
                    int Elec=clientes[i].listadoDeCuentasAsociadas[j].servicio.getLuzElectrica();
                    clientes[i].listadoDeCuentasAsociadas[j].servicio.setLuzElectrica(Elec+Monto);
                    JOptionPane.showMessageDialog(this,"Deposito relizado exitosamente");
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].getSalado());
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].servicio.getLuzElectrica());
                        jtxtMonto.setText("");
                        break;
                }else{
                    JOptionPane.showMessageDialog(this,"La cuenta de origen no tiene suficientes fondos");
                    break;
                    }      
                }
            }
            }
            }
                break; 
            case "Agua":
                for (int i = 0; i <clientes.length; i++) {
            if (clientes[i]!=null) {
            for (int j = 0; j <clientes[i].listadoDeCuentasAsociadas.length; j++) {  
                if (clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada()==NoAsociado) {
                    if (clientes[i].listadoDeCuentasAsociadas[j].getSalado()>=Monto) {
                        
                    
                    int ahora=clientes[i].listadoDeCuentasAsociadas[j].getSalado();
                    clientes[i].listadoDeCuentasAsociadas[j].setSalado(ahora-Monto);
                    int Elec=clientes[i].listadoDeCuentasAsociadas[j].servicio.getAgua();
                    clientes[i].listadoDeCuentasAsociadas[j].servicio.setAgua(Elec+Monto);
                    JOptionPane.showMessageDialog(this,"Deposito relizado exitosamente");
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].getSalado());
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].servicio.getAgua());
                        jtxtMonto.setText("");
                        break;
                }else{
                    JOptionPane.showMessageDialog(this,"La cuenta de origen no tiene suficientes fondos");
                    break;
                    }      
                }
            }
            }
            }
                break;
            case "Servicio telefonico":
                  for (int i = 0; i <clientes.length; i++) {
            if (clientes[i]!=null) {
            for (int j = 0; j <clientes[i].listadoDeCuentasAsociadas.length; j++) {  
                if (clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada()==NoAsociado) {
                    if (clientes[i].listadoDeCuentasAsociadas[j].getSalado()>=Monto) {
                        
                    
                    int ahora=clientes[i].listadoDeCuentasAsociadas[j].getSalado();
                    clientes[i].listadoDeCuentasAsociadas[j].setSalado(ahora-Monto);
                    int Elec=clientes[i].listadoDeCuentasAsociadas[j].servicio.getServicioTelefonico();
                    clientes[i].listadoDeCuentasAsociadas[j].servicio.setServicioTelefonico(Elec+Monto);
                    JOptionPane.showMessageDialog(this,"Deposito relizado exitosamente");
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].getSalado());
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].servicio.getServicioTelefonico());
                        jtxtMonto.setText("");
                        break;
                }else{
                    JOptionPane.showMessageDialog(this,"La cuenta de origen no tiene suficientes fondos");
                    break;
                    }     
                }
            }
            }
            }

                break;
        }

                }
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbOrigen;
    private javax.swing.JComboBox<String> jcbServicio;
    private javax.swing.JTextField jtxtMonto;
    // End of variables declaration//GEN-END:variables
}


package principal;

import javax.swing.JOptionPane;

public class Transferencia extends javax.swing.JPanel {
Cliente clientes [] = new Cliente [5];
    public Administrador Madre;
    public Transferencia(Administrador ventanaMadre) {
        this.clientes=ventanaMadre.getClientes();
        this.Madre=ventanaMadre;
        initComponents();
        
        for (int i = 0; i <clientes.length; i++) {
            for (int j = 0; j <clientes.length; j++) {
                if (clientes[i]!=null) {
                if (clientes[i].listadoDeCuentasAsociadas[j].Disponibilidad==false) {
                   jcbOrigen.addItem(Integer.toString(clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada())+ " - " + " Cuenta de: " + clientes[i].getNombre() + " " +clientes[i].getApellido()); 
                   jcbDestino.addItem(Integer.toString(clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada())+ " - " + " Cuenta de: " + clientes[i].getNombre() + " " +clientes[i].getApellido()); 
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
        jcbDestino = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jtxtMonto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Hacer una Transferencia");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cuenta de origen");

        jcbOrigen.setBackground(new java.awt.Color(102, 204, 255));
        jcbOrigen.setForeground(new java.awt.Color(255, 255, 255));
        jcbOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOrigenActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cuenta de destino");

        jcbDestino.setBackground(new java.awt.Color(102, 204, 255));
        jcbDestino.setForeground(new java.awt.Color(255, 255, 255));

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
                .addGap(306, 306, 306)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbOrigen, 0, 364, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jcbDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(210, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jtxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void jcbOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbOrigenActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        if (jtxtMonto.getText().isEmpty()||Integer.parseInt(jtxtMonto.getText())==0) {
                    JOptionPane.showMessageDialog(this,"El monto debe ser superior a 0");
                }else{
        String dato=String.valueOf(jcbOrigen.getSelectedItem());
        String[] fragmento= dato.split("");
        int NoAsociado=Integer.parseInt(fragmento[0]);
        int Monto=Integer.parseInt(jtxtMonto.getText());
        
         String dato1=String.valueOf(jcbDestino.getSelectedItem());
        String[] fragmento1=dato1.split("");
        int NoAsociado1=Integer.parseInt(fragmento1[0]);
        
        if (NoAsociado!=NoAsociado1) {
            for (int k = 0; k <clientes.length; k++) { 
        for (int i = 0; i <clientes.length; i++) {
            if(clientes[k]!=null){
            if (clientes[i]!=null) {
                for (int l = 0; l <clientes[k].listadoDeCuentasAsociadas.length; l++) {
            for (int j = 0; j <clientes[i].listadoDeCuentasAsociadas.length; j++) {  
                
                    
                    if (clientes[i].listadoDeCuentasAsociadas[j].getNumeroDeCuentaAsociada()==NoAsociado&&clientes[k].listadoDeCuentasAsociadas[l].getNumeroDeCuentaAsociada()==NoAsociado1) {
                           if (clientes[i].listadoDeCuentasAsociadas[j].getSalado()>=Monto) {

                    int ahora=clientes[i].listadoDeCuentasAsociadas[j].getSalado();
                    int ahora1=clientes[k].listadoDeCuentasAsociadas[l].getSalado();
                    clientes[i].listadoDeCuentasAsociadas[j].setSalado(ahora - Monto);
                    clientes[k].listadoDeCuentasAsociadas[l].setSalado(ahora1 + Monto);
                   
                    
                    JOptionPane.showMessageDialog(this,"Transferencia relizada exitosamente");
                        System.out.println(clientes[i].listadoDeCuentasAsociadas[j].getSalado());
                        System.out.println( clientes[k].listadoDeCuentasAsociadas[l].getSalado());
                        jtxtMonto.setText("");
                        break;
                    }else{
                          JOptionPane.showMessageDialog(this,"La cuenta de origen no tiene suficientes fondos"); 
                           } 
                }        
               
                
            }
            
            }    
            }
        }
            }
        }
        }else{
        JOptionPane.showMessageDialog(this,"la cuenta de destino no puede ser igual a la de origen");
        
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
    private javax.swing.JComboBox<String> jcbDestino;
    private javax.swing.JComboBox<String> jcbOrigen;
    private javax.swing.JTextField jtxtMonto;
    // End of variables declaration//GEN-END:variables
}

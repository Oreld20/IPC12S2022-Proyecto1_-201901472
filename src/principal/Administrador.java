
package principal;


public class Administrador extends javax.swing.JFrame {
    public int contador=251;
    public int id=121;
public  Cliente clientes []= new Cliente[5];

    public  Cliente[] getClientes() {
        return clientes;
    }

    public  void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }
   
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelPrincipal pl= new PanelPrincipal();
        pl.setSize(880, 620);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        principal = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        Asociar = new javax.swing.JButton();
        InformesClientes = new javax.swing.JButton();
        DepositoM = new javax.swing.JButton();
        Transferencia = new javax.swing.JButton();
        Servicios = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        principal.setBackground(new java.awt.Color(102, 204, 255));
        principal.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        principal.setForeground(new java.awt.Color(255, 255, 255));
        principal.setText("Principal");
        principal.setBorder(null);
        principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }
        });

        registrar.setBackground(new java.awt.Color(102, 204, 255));
        registrar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        registrar.setForeground(new java.awt.Color(255, 255, 255));
        registrar.setText("Registrar clientes");
        registrar.setBorder(null);
        registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarMouseClicked(evt);
            }
        });
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        Asociar.setBackground(new java.awt.Color(102, 204, 255));
        Asociar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Asociar.setForeground(new java.awt.Color(255, 255, 255));
        Asociar.setText("Crear cuenta");
        Asociar.setBorder(null);
        Asociar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Asociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsociarActionPerformed(evt);
            }
        });

        InformesClientes.setBackground(new java.awt.Color(102, 204, 255));
        InformesClientes.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        InformesClientes.setForeground(new java.awt.Color(255, 255, 255));
        InformesClientes.setText("Visualizar informes de clientes");
        InformesClientes.setBorder(null);
        InformesClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InformesClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformesClientesActionPerformed(evt);
            }
        });

        DepositoM.setBackground(new java.awt.Color(102, 204, 255));
        DepositoM.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        DepositoM.setForeground(new java.awt.Color(255, 255, 255));
        DepositoM.setText("Deposito monetario");
        DepositoM.setBorder(null);
        DepositoM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DepositoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositoMActionPerformed(evt);
            }
        });

        Transferencia.setBackground(new java.awt.Color(102, 204, 255));
        Transferencia.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Transferencia.setForeground(new java.awt.Color(255, 255, 255));
        Transferencia.setText("Realizar transferencia");
        Transferencia.setBorder(null);
        Transferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferenciaActionPerformed(evt);
            }
        });

        Servicios.setBackground(new java.awt.Color(102, 204, 255));
        Servicios.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        Servicios.setForeground(new java.awt.Color(255, 255, 255));
        Servicios.setText("Pago de servicios");
        Servicios.setBorder(null);
        Servicios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServiciosActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 204, 255));
        jButton7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Historial de transacciones");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Servicios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Transferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DepositoM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Asociar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(InformesClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(principal, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Asociar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InformesClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DepositoM, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Transferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Servicios, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 620));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        jPanel1.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 880, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferenciaActionPerformed
        // TODO add your handling code here:
        Administrador ventanaMadre=this;
         Transferencia pl5= new  Transferencia(ventanaMadre);
        pl5.setSize(880, 620);
        pl5.setLocation(0,0);
        
        content.removeAll();
        content.add(pl5);
        content.revalidate();
        content.repaint();
        
        
    }//GEN-LAST:event_TransferenciaActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        // TODO add your handling code here:
        Administrador ventanaMadre=this;
        RegistrarClientes pl1= new RegistrarClientes(ventanaMadre);
        pl1.setSize(880, 620);
        pl1.setLocation(0,0);
        
        content.removeAll();
        content.add(pl1);
        content.revalidate();
        content.repaint();

    }//GEN-LAST:event_registrarActionPerformed

    private void principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_principalActionPerformed
        // TODO add your handling code here:
         PanelPrincipal pl= new PanelPrincipal();
        pl.setSize(880, 620);
        pl.setLocation(0,0);
        
        content.removeAll();
        content.add(pl);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_principalActionPerformed

    private void AsociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsociarActionPerformed
        // TODO add your handling code here:
       Administrador ventanaMadre=this;
         CrearUnaCuenta pl2= new CrearUnaCuenta(ventanaMadre);
         
        pl2.setSize(880, 620);
        pl2.setLocation(0,0);
        
        content.removeAll();
        content.add(pl2);
        content.revalidate();
        content.repaint();
        
        
        
        
        
    }//GEN-LAST:event_AsociarActionPerformed

    private void InformesClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformesClientesActionPerformed

        // TODO add your handling code here:
        
        Administrador ventanaMadre=this;
        VisualizarInformes pl3= new VisualizarInformes(ventanaMadre);
         
        pl3.setSize(880, 620);
        pl3.setLocation(0,0);
        
        content.removeAll();
        content.add(pl3);
        content.revalidate();
        content.repaint();
        
       
        
        
        
    }//GEN-LAST:event_InformesClientesActionPerformed

    private void DepositoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositoMActionPerformed
        // TODO add your handling code here:
        
        Administrador ventanaMadre=this;
         Deposito pl4= new Deposito(ventanaMadre);
         
        pl4.setSize(880, 620);
        pl4.setLocation(0,0);
        
        content.removeAll();
        content.add(pl4);
        content.revalidate();
        content.repaint();
        
        
    }//GEN-LAST:event_DepositoMActionPerformed

    private void ServiciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServiciosActionPerformed
        // TODO add your handling code here:
        Administrador ventanaMadre=this;
         Pagos pl6= new Pagos(ventanaMadre);
         
        pl6.setSize(880, 620);
        pl6.setLocation(0,0);
        
        content.removeAll();
        content.add(pl6);
        content.revalidate();
        content.repaint();
        
        
    }//GEN-LAST:event_ServiciosActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Administrador ventanaMadre=this;
         Historial pl7= new Historial(ventanaMadre);
         
        pl7.setSize(880, 620);
        pl7.setLocation(0,0);
        
        content.removeAll();
        content.add(pl7);
        content.revalidate();
        content.repaint();
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarMouseClicked



      
    }//GEN-LAST:event_registrarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Asociar;
    private javax.swing.JButton DepositoM;
    private javax.swing.JButton InformesClientes;
    private javax.swing.JButton Servicios;
    private javax.swing.JButton Transferencia;
    private javax.swing.JPanel content;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton principal;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}

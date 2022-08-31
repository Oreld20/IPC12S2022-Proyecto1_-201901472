
package principal;

import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;


public class VisualizarInformes extends javax.swing.JPanel {
     DefaultTableModel model = new DefaultTableModel();
        
       
Cliente clientes [] = new Cliente [5];
    public VisualizarInformes(Administrador ventanaMadre) {
        this.clientes=ventanaMadre.getClientes();
        initComponents();
       
        
        
        
        
    }
    public void EnviarDatosATabla (){
    if(clientes[0]!=null){
        
        
    }
    
    
    
    
    }

    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tctBusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtAsociados = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TbClientes = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Informe de clientes");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CUI");

        tctBusqueda.setForeground(new java.awt.Color(0, 0, 0));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar cuentas asociadas");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtAsociados.setBackground(new java.awt.Color(102, 204, 255));
        jtAsociados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cuentas asociadas"
            }
        ));
        jScrollPane2.setViewportView(jtAsociados);

        TbClientes.setBackground(new java.awt.Color(102, 204, 255));
        TbClientes.setBorder(null);
        if(clientes[0]!=null){
            TbClientes.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {clientes[0].getDocumentoDeIdentificacion(),clientes[0].getNombre(),clientes[0].getApellido()},
                    {null,null,null},
                    {null,null,null},
                    {null,null,null},
                    {null,null,null}
                },
                new String [] {
                    "CUI", "Nombre", "Apellido"
                }
            ));
            if(clientes[1]!=null){
                TbClientes.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {clientes[0].getDocumentoDeIdentificacion(),clientes[0].getNombre(),clientes[0].getApellido()},
                        {clientes[1].getDocumentoDeIdentificacion(),clientes[1].getNombre(),clientes[1].getApellido()},
                        {null,null,null},
                        {null,null,null},
                        {null,null,null}

                    },
                    new String [] {
                        "CUI", "Nombre", "Apellido"
                    }
                ));
            }
            if(clientes[2]!=null){
                TbClientes.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {clientes[0].getDocumentoDeIdentificacion(),clientes[0].getNombre(),clientes[0].getApellido()},
                        {clientes[1].getDocumentoDeIdentificacion(),clientes[1].getNombre(),clientes[1].getApellido()},
                        {clientes[2].getDocumentoDeIdentificacion(),clientes[2].getNombre(),clientes[2].getApellido()},
                        {null,null,null},
                        {null,null,null}

                    },
                    new String [] {
                        "CUI", "Nombre", "Apellido"
                    }
                ));
            }
            if(clientes[3]!=null){
                TbClientes.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {clientes[0].getDocumentoDeIdentificacion(),clientes[0].getNombre(),clientes[0].getApellido()},
                        {clientes[1].getDocumentoDeIdentificacion(),clientes[1].getNombre(),clientes[1].getApellido()},
                        {clientes[2].getDocumentoDeIdentificacion(),clientes[2].getNombre(),clientes[2].getApellido()},
                        {clientes[3].getDocumentoDeIdentificacion(),clientes[3].getNombre(),clientes[3].getApellido()},
                        {null,null,null}

                    },
                    new String [] {
                        "CUI", "Nombre", "Apellido"
                    }
                ));
            }
            if(clientes[4]!=null){
                TbClientes.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {
                        {clientes[0].getDocumentoDeIdentificacion(),clientes[0].getNombre(),clientes[0].getApellido()},
                        {clientes[1].getDocumentoDeIdentificacion(),clientes[1].getNombre(),clientes[1].getApellido()},
                        {clientes[2].getDocumentoDeIdentificacion(),clientes[2].getNombre(),clientes[2].getApellido()},
                        {clientes[3].getDocumentoDeIdentificacion(),clientes[3].getNombre(),clientes[3].getApellido()},
                        {clientes[4].getDocumentoDeIdentificacion(),clientes[4].getNombre(),clientes[4].getApellido()}

                    },
                    new String [] {
                        "CUI", "Nombre", "Apellido"
                    }
                ));
            }

        }
        else{
            TbClientes.setModel(new javax.swing.table.DefaultTableModel(

                new Object [][] {
                    {"","",""},
                    {null,null,null},
                    {null,null,null},
                    {null,null,null},
                    {null,null,null}
                },
                new String [] {
                    "CUI", "Nombre", "Apellido"
                }
            ));
        }
        TbClientes.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TbClientesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(TbClientes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tctBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(312, 312, 312))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tctBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
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

    private void TbClientesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TbClientesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_TbClientesAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String Busqueda=tctBusqueda.getText();
       model=new DefaultTableModel();
       model.addColumn("Cuentas Asociadas");
       
            for (int i = 0; i <clientes.length; i++) {
                if (clientes[i]!=null) {
                    if (clientes[i].getDocumentoDeIdentificacion()==Long.parseLong(Busqueda)) {
                        for (int j = 0; j <clientes[i].listadoDeCuentasAsociadas.length; j++) {
                            if (clientes[i].listadoDeCuentasAsociadas[j].Disponibilidad==false) {
                                 model.addRow(new Object[]{clientes[i].listadoDeCuentasAsociadas[j].NumeroDeCuentaAsociada});
                            }

                        }
                         jtAsociados.setModel(model);
                            break;
                    }
                           
                }
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable TbClientes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtAsociados;
    private javax.swing.JTextField tctBusqueda;
    // End of variables declaration//GEN-END:variables
}

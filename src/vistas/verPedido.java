/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableColumnModel;
import static vistas.menuAlumno.conn;


public class verPedido extends javax.swing.JFrame {
    
    
    public static ArrayList<String> listaProductos = new ArrayList<String>();
     DefaultTableModel model = new DefaultTableModel();
            
    public verPedido() {
        initComponents();
        setLocationRelativeTo(null);
        tablaPedido.setModel(model);
        tabla();
        listaProductos =(ArrayList<String>) menuAlumno.listaP.clone();
        limpiarLista();
        agregarDatos();
        
        
        
    }
    
    private void limpiarLista(){
        while (listaProductos.remove(null)) {
        }
    }
    
    private void tabla(){
        
        model.addColumn(""); 
        model.addColumn("");
        
        TableColumnModel columnModel = tablaPedido.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(400);   
       
    }
    
    public void agregarDatos (){
        
        
        
        if(!listaProductos.isEmpty()){
            Set<String> set = new HashSet<>(listaProductos);
            String[] productos = set.toArray(new String[set.size()]);
            int[] productosQty = new int[productos.length];            
            for(int i = 0; i<productos.length; i++){
            
                for(int j = 0; j<listaProductos.size(); j++){

                    if(productos[i].equals(listaProductos.get(j))){
                        productosQty[i]+=1;
                    }               
                }
                
                System.out.println(productos[i] + " " + productosQty[i]);
                
            }
            
        for(int o = 0; o<productos.length; o++){
             model.addRow(new Object[]{productos[o], productosQty[o]});
        }    
            
            
        }else{
            System.out.println("no hay datos");
        }   
               
        
    }
    
    
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPedido = new javax.swing.JTable();
        completarP = new javax.swing.JButton();
        LimpiarP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        tablaPedido.setBackground(new java.awt.Color(255, 255, 255));
        tablaPedido.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaPedido.setForeground(new java.awt.Color(102, 102, 102));
        tablaPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaPedido.setGridColor(new java.awt.Color(204, 204, 204));
        tablaPedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPedido);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        completarP.setText("Completar pedido");
        completarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completarPActionPerformed(evt);
            }
        });

        LimpiarP.setText("Limpiar lista");
        LimpiarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(completarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LimpiarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(completarP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LimpiarP, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LimpiarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarPActionPerformed
        listaProductos.removeAll(listaProductos);
        menuAlumno.listaP.removeAll(menuAlumno.listaP);
        agregarDatos();
        model.setRowCount(0);
    }//GEN-LAST:event_LimpiarPActionPerformed

    private void completarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completarPActionPerformed
            
        String u = menuAlumno.usuarioN;
        String hr = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        int conteoFilas = model.getRowCount();
        Random rand = new Random(System.currentTimeMillis());
        int randNum = rand.nextInt();
        if (randNum < 0) {
            randNum = randNum * -1;
            }
        Connection abrirConexion = menuAlumno.conn.abrirConexion();
        
        for(int i = 0; i<conteoFilas; i++)
        {
          String producto = String.valueOf(tablaPedido.getModel().getValueAt(i, 0));
          int cantidad =  (int) tablaPedido.getModel().getValueAt(i, 1);

        System.out.println(randNum);
          String consulta = "INSERT INTO `pedidos` "
            + "(`Producto`, `Cantidad`, `Hora`, `Estado`, `Estudiante`, `IDpedido`)"
            + " VALUES ('"+producto+"', '"+cantidad+"', '"+hr+"', 'Pendiente', '"+u+"', '"+randNum+"')";
            
            try{
                PreparedStatement ps = abrirConexion.prepareStatement(consulta);
                ps.execute();
                System.out.println("Tu orden se realizo con exito!");
                showMessageDialog(null, "Tu orden se realizo con exito!");
            }catch(Exception e){
                showMessageDialog(null, "Ups, occurio un error al intentar completar tu pedido");
                System.out.println("We got an error " + e);
            }  
        }
        listaProductos.removeAll(listaProductos);
        menuAlumno.listaP.removeAll(menuAlumno.listaP);
        agregarDatos();
        model.setRowCount(0);
        
    }//GEN-LAST:event_completarPActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(verPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LimpiarP;
    private javax.swing.JButton completarP;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPedido;
    // End of variables declaration//GEN-END:variables
}
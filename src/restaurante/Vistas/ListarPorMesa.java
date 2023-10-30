package restaurante.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.Data.MesaData;
import restaurante.Data.PedidoData;
import restaurante.Data.PedidoProductoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.PedidoProducto;

public class ListarPorMesa extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    MesaData mesaData = new MesaData();
    PedidoData pedidoData = new PedidoData();
    PedidoProductoData ppData = new PedidoProductoData();
    

    public ListarPorMesa() {
        initComponents();
        cargarCombo();
        armarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMesas = new javax.swing.JComboBox<>();
        jtfTotal = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jbSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jtPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPedidos);

        jLabel1.setText("Listar pedidos por mesa");

        jLabel2.setText("NRO mesa");

        jcbMesas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMesasActionPerformed(evt);
            }
        });

        jtfTotal.setEditable(false);

        jToggleButton1.setText("Pagar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbSalir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jbSalir))
                .addGap(34, 34, 34))
        );

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

    private void jcbMesasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMesasActionPerformed
        vaciarTabla();
        llenarTabla();        
    }//GEN-LAST:event_jcbMesasActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        boolean estadoMesa;
        boolean estadoPedido;
        
        
        //ppData.
        Mesa mesa = (Mesa)jcbMesas.getSelectedItem();
        int idMesa = mesa.getIdMesa();
        int numMesa = mesa.getNumero();
        mesaData.eliminarMesaPorId(idMesa);
        
        Pedido pedido = pedidoData.buscarPedidoPorIDMesa(idMesa);
        pedidoData.cobrarPedido(pedido);
        
        JOptionPane.showMessageDialog(null, "El pedido fue cobrado con éxito.");
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Mesa> jcbMesas;
    private javax.swing.JTable jtPedidos;
    private javax.swing.JTextField jtfTotal;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        List<Mesa> mesas = mesaData.listarMesaOcupadas();
        for (Mesa mesa : mesas) {
            jcbMesas.addItem(mesa);
        }
    }
    
     private void armarTabla() {
        modelo.addColumn("ID pedido");
        modelo.addColumn("Mesa");
        modelo.addColumn("Mesero");
        modelo.addColumn("Producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Subtotal");
        jtPedidos.setModel(modelo);
    }
     
     private void llenarTabla(){
         double total = 0;
         Mesa mesa = (Mesa)jcbMesas.getSelectedItem();
         int numMesa = mesa.getNumero();
         List <PedidoProducto> ppLista = ppData.listarDetallesSinCobrarPorMesa(numMesa);
         for(PedidoProducto detalle : ppLista){
             modelo.addRow(new Object[]{
                 detalle.getPedido().getId_pedido(),
                 detalle.getPedido().getMesa().getNumero(),
                 detalle.getPedido().getNombre_mesero(),
                 detalle.getProducto().getNombreProducto(),
                 detalle.getProducto().getPrecio(),
                 detalle.getCantidad(),
                 detalle.getSubtotal()
             });
             total += detalle.getSubtotal();
         }
         jtfTotal.setText(total + "");
     }

     private void vaciarTabla(){
         modelo.setRowCount(0);
     }
     
}

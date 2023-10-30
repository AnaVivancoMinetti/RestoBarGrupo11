
package restaurante.Vistas;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Data.MesaData;
import restaurante.Data.PedidoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

/**
 *
 * @author User
 */
public class ModificarPedido extends javax.swing.JInternalFrame {

    PedidoData pedidoData = new PedidoData();
    MesaData mesaData = new MesaData();
    
    public ModificarPedido() {
        initComponents();        
        cargarComboPedido();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfMesero = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jrbCobrado = new javax.swing.JRadioButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jcbPedidos = new javax.swing.JComboBox<>();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("Modificar Pedido");

        jLabel3.setText("Mesero");

        jLabel4.setText("Fecha");

        jLabel5.setText("Hora");

        jtfHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfHora.setText("hh:mm");

        jLabel6.setText("Cobrado");

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("PEDIDO NRO");

        jcbPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(EscritorioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel6)
                                .addGap(19, 19, 19)
                                .addComponent(jrbCobrado))
                            .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EscritorioLayout.createSequentialGroup()
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbModificar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, EscritorioLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(25, 25, 25)
                                    .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jcbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jcbPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(EscritorioLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6))
                    .addComponent(jrbCobrado))
                .addGap(37, 37, 37)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtfHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4))
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbSalir))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(this, "Desea aplicar las modificaciones al pedido?", "Confirmar", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            
            Pedido pedido = (Pedido)jcbPedidos.getSelectedItem();

            pedido.setNombre_mesero(jtfMesero.getText());
            pedido.setFecha(jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
            pedido.setCobrada(jrbCobrado.isSelected());
            pedido.setHora(obtenerHora().toLocalTime());

            JOptionPane.showMessageDialog(null, "Modificando...");
            
            pedidoData.modificarPedido(pedido);
            
            vaciarCampos();

             } else {
            JOptionPane.showMessageDialog(null, "Cancelando modificación...");
        }
            
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPedidosActionPerformed
        mostrarDatos();        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Pedido> jcbPedidos;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JRadioButton jrbCobrado;
    private javax.swing.JTextField jtfHora;
    private javax.swing.JTextField jtfMesero;
    // End of variables declaration//GEN-END:variables


private void cargarComboPedido(){
    ArrayList<Pedido> pedidos = pedidoData.pedidosTodos();
    for(Pedido pedido : pedidos){
        jcbPedidos.addItem(pedido);
    }
}
    
private void vaciarCampos(){
        jtfMesero.setText("");
        jtfHora.setText("");
        jrbCobrado.setSelected(false);
        jdcFecha.setDate(null);
    }

private Time obtenerHora() {

        String horaTF;
        Time hora = null;
        if (jtfHora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la hora");
        } else {
            horaTF = jtfHora.getText();
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
                java.util.Date parsedDate = dateFormat.parse(horaTF);

                Calendar calendar = Calendar.getInstance();
                calendar.setTime(parsedDate);
                calendar.set(Calendar.SECOND, 0);
                hora = new Time(calendar.getTimeInMillis());
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Error al obtener horario, intente nuevamente" + ex.getMessage());
            }
        }
        return hora;
    }

private void mostrarDatos(){
    Pedido pedido = (Pedido)jcbPedidos.getSelectedItem(); 
    jtfMesero.setText(pedido.getNombre_mesero());
    jdcFecha.setDate(Date.valueOf(pedido.getFecha()));
    jtfHora.setText(pedido.getHora()+"");
    jrbCobrado.setSelected(pedido.isCobrada());
    
}

}

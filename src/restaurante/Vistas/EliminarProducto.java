
package restaurante.Vistas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import restaurante.Data.ProductoData;
import restaurante.Entidades.Producto;
import static restaurante.Vistas.ModificarProducto.contieneSoloNumeros;


public class EliminarProducto extends javax.swing.JInternalFrame {

     private ProductoData productoData;
     
    public EliminarProducto() {
        initComponents();
        
         productoData = new ProductoData(); // Asegúrate de que la conexión a la base de datos esté configurada en ProductoData


        // Crear una instancia de ProductoData pasando la conexión
        productoData = new ProductoData();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerStock = new javax.swing.JSpinner();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ELIMINAR PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel2.setText("NOMBRE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 100, 50, -1));
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, -1));

        jLabel3.setText("PRECIO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("$");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 20, 20));

        jTextFieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 60, -1));

        jLabel4.setText("STOCK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel1.add(jSpinnerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jRadioButtonEstado.setText("ACTIVO");
        jRadioButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButtonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButtonEliminar.setText("ELIMINAR");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, -1));

        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        jButtonBuscar.setText("BUSCAR");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 380));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 500, 10));

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

    private void jTextFieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPrecioActionPerformed

    private void jRadioButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonEstadoActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        eliminarProducto();   

limpiarCampos();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       String numeroProducto = jTextFieldNombre.getText();
        validarCampo(numeroProducto);
        
        Producto producto = productoData.obtenerProductoPorNnombre(numeroProducto);
        
        jTextFieldNombre.setText(producto.getNombreProducto());
        jTextFieldPrecio.setText(producto.getPrecio()+ " ");
        jSpinnerStock.setValue((Integer)producto.getStock());
        jRadioButtonEstado.setSelected(producto.isEstado());
        
    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerStock;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPrecio;
    // End of variables declaration//GEN-END:variables

public void eliminarProducto() {

 String nombreProducto = jTextFieldNombre.getText();

        if (!nombreProducto.isEmpty()) {
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de eliminar el producto?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                productoData.EliminarProducto(nombreProducto);
                JOptionPane.showMessageDialog(null, "Producto eliminado con éxito.");
                limpiarCampos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un nombre de producto válido.");
        }
       
}

private void limpiarCampos(){
    jTextFieldNombre.setText(" ");
        jTextFieldPrecio.setText(" ");
        jSpinnerStock.setValue((Integer)0);
        jRadioButtonEstado.setSelected(false);
}
public void validarCampo(String text){

    if(text.isEmpty()){
         JOptionPane.showMessageDialog(null, "No se admiten campos vaciaos");
    }
    if(contieneSoloNumeros(text)){
         JOptionPane.showMessageDialog(null, "No se admiten campos CON NUMEROS");
    }
   
}
public static boolean contieneSoloNumeros(String text) {
        Pattern pattern = Pattern.compile("[0-9]+");// Valida que solo sean numeros (expresiones regulares)
        Matcher matcher = pattern.matcher(text); // Compara el texto con lo que le pasamos de patron.

        return matcher.matches(); // retorna verdadero si el patron que le pasamos arriba se cumple con el texto.
    }

}


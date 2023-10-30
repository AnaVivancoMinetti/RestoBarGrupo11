
package restaurante.Vistas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import restaurante.Data.MesaData;
import restaurante.Entidades.Mesa;

public class JInternalFrameEdit extends javax.swing.JInternalFrame {

    MesaData mesaData;
    public JInternalFrameEdit() {
        initComponents();
        mesaData = new MesaData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2b = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonEstado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCapasidad = new javax.swing.JTextField();
        jButtonEdit = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();

        jLabel1.setText("Editar Mesa");

        jLabel2b.setText("Numero de mesa:");

        jLabel3.setText("Estado mesa ");

        jLabel4.setText("Capacidad:");

        jButtonEdit.setText("Editar");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jLabel5.setText("ingrese ID:");

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButtonEdit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jButtonSalir)
                        .addGap(89, 89, 89))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(134, 134, 134)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(jRadioButtonEstado))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(53, 53, 53)
                                    .addComponent(jTextFieldCapasidad))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2b)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(202, 202, 202)
                            .addComponent(jLabel1)))
                    .addContainerGap(118, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEdit)
                    .addComponent(jButtonSalir))
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addComponent(jLabel1)
                    .addGap(93, 93, 93)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2b)
                        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jRadioButtonEstado))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jTextFieldCapasidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(136, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try{
            String idString = jTextFieldID.getText();
        validarSoloNumeros(idString);
        String numeroMesa = jTextFieldNumero.getText();
        validarSoloNumeros(numeroMesa);
        String capacidadMesa = jTextFieldCapasidad.getText();
        validarSoloNumeros(capacidadMesa);
        
        int idMesa = Integer.parseInt(idString);
        int numero= Integer.parseInt(numeroMesa);
        boolean estado = jRadioButtonEstado.isSelected();
        int capacidad = Integer.parseInt(capacidadMesa);
        
        Mesa mesa = new Mesa(idMesa, numero, estado, capacidad);
        
        mesaData.modificarMesa(mesa);
        clearFields();
        }catch(NullPointerException ex){
            System.out.println("");
        }catch(NumberFormatException e){
            System.out.println("");
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        try{
            String stringId = jTextFieldID.getText();
        validarSoloNumeros(stringId);
        int idMesa = Integer.parseInt(stringId);
        
        Mesa mesa = mesaData.buscarMesaPorId(idMesa);
        
        jTextFieldNumero.setText(mesa.getNumero()+"");
        jRadioButtonEstado.setSelected(mesa.isEstado_mesa());
        jTextFieldCapasidad.setText(mesa.getCapacidad()+"");     
        }catch(NullPointerException ex){
            System.out.println("");
        }catch(NumberFormatException e){
            System.out.println("");
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2b;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButtonEstado;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldCapasidad;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNumero;
    // End of variables declaration//GEN-END:variables

    
    private void clearFields(){
        jTextFieldNumero.setText("");
        jTextFieldCapasidad.setText("");
        jRadioButtonEstado.setSelected(false);
        jTextFieldID.setText("");
    }
    
    
    private boolean contieneSoloNumeros(String texto) {
        Pattern pattern = Pattern.compile("[0-9]+");// Valida que solo sean numeros (expresiones regulares)
        Matcher matcher = pattern.matcher(texto); // Compara el texto con lo que le pasamos de patron.

        return matcher.matches(); // retorna verdadero si el patron que le pasamos arriba se cumple con el texto.
    }
    
    private void validarSoloNumeros(String text){
        if(!contieneSoloNumeros(text) || text.isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo no admite nulos o letras");
        }
    }
    
}

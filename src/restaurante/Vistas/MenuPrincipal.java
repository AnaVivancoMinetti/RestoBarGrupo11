/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.Vistas;

/**
 *
 * @author CRISTIAN SALINAS
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem9 = new javax.swing.JMenuItem();
        jDesktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuAñadirProducto = new javax.swing.JMenuItem();
        jMenuModificarPedido = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuBuscarxMesero = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAgregar = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jmiSalir = new javax.swing.JMenu();

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktop.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopLayout = new javax.swing.GroupLayout(jDesktop);
        jDesktop.setLayout(jDesktopLayout);
        jDesktopLayout.setHorizontalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jDesktopLayout.setVerticalGroup(
            jDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );

        jMenu1.setText("MESAS");

        jMenuItem1.setText("Agregar Mesa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar Mesa");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar Mesa");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("PEDIDOS");

        jMenuAñadirProducto.setText("Añadir pedido");
        jMenuAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAñadirProductoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAñadirProducto);

        jMenuModificarPedido.setText("Modificar pedido");
        jMenuModificarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuModificarPedidoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuModificarPedido);

        jMenu5.setText("Buscar");

        jMenuItem11.setText("Por fecha");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuBuscarxMesero.setText("Por mesero");
        jMenuBuscarxMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBuscarxMeseroActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuBuscarxMesero);

        jMenuItem13.setText("Por fecha y hora");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenu2.add(jMenu5);

        jMenuItem5.setText("Añadir detalle");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem10.setText("Detalles");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("PRODUCTOS");

        jMenuItemAgregar.setText("Agregar Productos");
        jMenuItemAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAgregarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAgregar);

        jMenuItem7.setText("Modificar Productos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem6.setText("Eliminar Productos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem8.setText("Lista de Productos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jmiSalir.setText("SALIR");
        jmiSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmiSalirMouseClicked(evt);
            }
        });
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmiSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //AGREGAR MESA// TODO add your handling code here:
        jDesktop.removeAll();
        jDesktop.repaint();
        JInternalFrameAdd nuevaMesa = new JInternalFrameAdd();
        nuevaMesa.setVisible(true);
        jDesktop.add(nuevaMesa);
        jDesktop.moveToFront(nuevaMesa);
        int x = (jDesktop.getWidth() - nuevaMesa.getWidth()) / 2;
        int y = (jDesktop.getHeight() - nuevaMesa.getHeight()) / 2;
        nuevaMesa.setLocation(x, y);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //MODIFICAR MESA// TODO add your handling code here:
        jDesktop.removeAll();
        jDesktop.repaint();
        JInternalFrameEdit modificarMesa = new JInternalFrameEdit();
        modificarMesa.setVisible(true);
        jDesktop.add(modificarMesa);
        jDesktop.moveToFront(modificarMesa);
        int x = (jDesktop.getWidth() - modificarMesa.getWidth()) / 2;
        int y = (jDesktop.getHeight() - modificarMesa.getHeight()) / 2;
        modificarMesa.setLocation(x, y);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//ELIMINAR MESA        // TODO add your handling code here:
        jDesktop.removeAll();
        jDesktop.repaint();
        JInternalFrameDelete eliminarMesa = new JInternalFrameDelete();
        eliminarMesa.setVisible(true);
        jDesktop.add(eliminarMesa);
        jDesktop.moveToFront(eliminarMesa);
        int x = (jDesktop.getWidth() - eliminarMesa.getWidth()) / 2;
        int y = (jDesktop.getHeight() - eliminarMesa.getHeight()) / 2;
        eliminarMesa.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAgregarActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        AgregarProducto nuevoProducto = new AgregarProducto();
        nuevoProducto.setVisible(true);
        jDesktop.add(nuevoProducto);
        jDesktop.moveToFront(nuevoProducto);
        int x = (jDesktop.getWidth() - nuevoProducto.getWidth()) / 2;
        int y = (jDesktop.getHeight() - nuevoProducto.getHeight()) / 2;
        nuevoProducto.setLocation(x, y);
    }//GEN-LAST:event_jMenuItemAgregarActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        ModificarProducto nuevoProducto = new ModificarProducto();
        nuevoProducto.setVisible(true);
        jDesktop.add(nuevoProducto);
        jDesktop.moveToFront(nuevoProducto);
        int x = (jDesktop.getWidth() - nuevoProducto.getWidth()) / 2;
        int y = (jDesktop.getHeight() - nuevoProducto.getHeight()) / 2;
        nuevoProducto.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        EliminarProducto eliminarProducto = new EliminarProducto();
        eliminarProducto.setVisible(true);
        jDesktop.add(eliminarProducto);
        jDesktop.moveToFront(eliminarProducto);
        int x = (jDesktop.getWidth() - eliminarProducto.getWidth()) / 2;
        int y = (jDesktop.getHeight() - eliminarProducto.getHeight()) / 2;
        eliminarProducto.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        ListaDeProducto listaProducto = new ListaDeProducto();
        listaProducto.setVisible(true);
        jDesktop.add(listaProducto);
        jDesktop.moveToFront(listaProducto);
        int x = (jDesktop.getWidth() - listaProducto.getWidth()) / 2;
        int y = (jDesktop.getHeight() - listaProducto.getHeight()) / 2;
        listaProducto.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jmiSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmiSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jmiSalirMouseClicked

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jMenuAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAñadirProductoActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        AñadirPedido añadirPedido = new AñadirPedido();
        añadirPedido.setVisible(true);
        jDesktop.add(añadirPedido);
        jDesktop.moveToFront(añadirPedido);
        int x = (jDesktop.getWidth() - añadirPedido.getWidth()) / 2;
        int y = (jDesktop.getHeight() - añadirPedido.getHeight()) / 2;
        añadirPedido.setLocation(x, y);
    }//GEN-LAST:event_jMenuAñadirProductoActionPerformed

    private void jMenuModificarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuModificarPedidoActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        ModificarPedido modificarPedido = new ModificarPedido();
        modificarPedido.setVisible(true);
        jDesktop.add(modificarPedido);
        jDesktop.moveToFront(modificarPedido);
        int x = (jDesktop.getWidth() - modificarPedido.getWidth()) / 2;
        int y = (jDesktop.getHeight() - modificarPedido.getHeight()) / 2;
        modificarPedido.setLocation(x, y);
    }//GEN-LAST:event_jMenuModificarPedidoActionPerformed

    private void jMenuBuscarxMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBuscarxMeseroActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        BuscarPedidoPorMesero buscarPorMesero = new BuscarPedidoPorMesero();
        buscarPorMesero.setVisible(true);
        jDesktop.add(buscarPorMesero);
        jDesktop.moveToFront(buscarPorMesero);
        int x = (jDesktop.getWidth() - buscarPorMesero.getWidth()) / 2;
        int y = (jDesktop.getHeight() - buscarPorMesero.getHeight()) / 2;
        buscarPorMesero.setLocation(x, y);
    }//GEN-LAST:event_jMenuBuscarxMeseroActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        AñadirDetalle añadirDetalle = new AñadirDetalle();
        añadirDetalle.setVisible(true);
        jDesktop.add(añadirDetalle);
        jDesktop.moveToFront(añadirDetalle);
        int x = (jDesktop.getWidth() - añadirDetalle.getWidth()) / 2;
        int y = (jDesktop.getHeight() - añadirDetalle.getHeight()) / 2;
        añadirDetalle.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        jDesktop.removeAll();
        jDesktop.repaint();
        ListarPorMesa listarxMesa = new ListarPorMesa();
        listarxMesa.setVisible(true);
        jDesktop.add(listarxMesa);
        jDesktop.moveToFront(listarxMesa);
        int x = (jDesktop.getWidth() - listarxMesa.getWidth()) / 2;
        int y = (jDesktop.getHeight() - listarxMesa.getHeight()) / 2;
        listarxMesa.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed

        jDesktop.removeAll();
        jDesktop.repaint();
        IngresosPedXFecha ingresosFecha = new IngresosPedXFecha();
        ingresosFecha.setVisible(true);
        jDesktop.add(ingresosFecha);
        jDesktop.moveToFront(ingresosFecha);
        int x = (jDesktop.getWidth() - ingresosFecha.getWidth()) / 2;
        int y = (jDesktop.getHeight() - ingresosFecha.getHeight()) / 2;
        ingresosFecha.setLocation(x, y);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed

         jDesktop.removeAll();
        jDesktop.repaint();
        buscarPedido buscarPedido = new buscarPedido();
        buscarPedido.setVisible(true);
        jDesktop.add(buscarPedido);
        jDesktop.moveToFront(buscarPedido);
        int x = (jDesktop.getWidth() - buscarPedido.getWidth()) / 2;
        int y = (jDesktop.getHeight() - buscarPedido.getHeight()) / 2;
        buscarPedido.setLocation(x, y);
        
    }//GEN-LAST:event_jMenuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuItem jMenuAñadirProducto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBuscarxMesero;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemAgregar;
    private javax.swing.JMenuItem jMenuModificarPedido;
    private javax.swing.JMenu jmiSalir;
    // End of variables declaration//GEN-END:variables
}

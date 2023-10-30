package restaurante.Vistas;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import restaurante.Data.PedidoData;
import restaurante.Entidades.Pedido;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class buscarPedido extends javax.swing.JInternalFrame {

    
    private DefaultTableModel model = new DefaultTableModel();
    private PedidoData pedidoData;
  
    public buscarPedido() {
        initComponents();
        armarCabecera();
        pedidoData = new PedidoData();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TabalPedidos = new javax.swing.JTable();
        escritorio = new javax.swing.JPanel();
        buscarPedido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ingresaHora1 = new javax.swing.JTextField();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        ingresaHora2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nroMesa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePedidos = new javax.swing.JTable();

        TabalPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Mesa", "Mesero", "Importe"
            }
        ));
        jScrollPane1.setViewportView(TabalPedidos);

        escritorio.setAutoscrolls(true);

        buscarPedido.setText("Buscar pedido Por fecha y hora");
        buscarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPedidoActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese fecha");

        jLabel2.setText("Rango de horas");

        jLabel3.setText("Nro de Mesa:");

        jTablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePedidos);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buscarPedido))
                    .addGroup(escritorioLayout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(escritorioLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addGap(87, 87, 87)
                                        .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(nroMesa)))
                                    .addGroup(escritorioLayout.createSequentialGroup()
                                        .addComponent(ingresaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                        .addComponent(ingresaHora2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(30, 30, 30))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ingresaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresaHora2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(buscarPedido)
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPedidoActionPerformed
 
          
        LocalTime horaInicial = obtenerHora(ingresaHora1.getText()).toLocalTime();
//
//// Obténgo la hora final desde el campo ingresaHora2
      LocalTime horaFinal = obtenerHora(ingresaHora2.getText()).toLocalTime();

        if (horaInicial != null && horaFinal != null) {
    // Ambas horas se obtuvieron correctamente, realiza la búsqueda
    Date fechaSeleccionada = jdcFecha.getDate();

    if (fechaSeleccionada == null) {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fecha.");
        return;  // Salir del método si la fecha es nula
    }

    LocalDate fecha = jdcFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    int numeroMesa = 0;

    try {
        numeroMesa = Integer.parseInt(nroMesa.getText());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Número de Mesa inválido. Debe ser un número entero.");
        return;  
    }

   
    clearTable();
        System.out.println("antes de la lista");
        List<Pedido> pedidos = pedidoData.buscarPedidosPorFechaYHora(numeroMesa, fecha, horaInicial, horaFinal);
        //System.out.println("size: "+pedidos.get(0));
        // Agrega los resultados a la tabla
        clearTable();
       
        for(Pedido iterador : pedidos){
            System.out.println("dentro del for");
            model.addRow(new Object[] {
                iterador.getMesa().getNumero(),
                iterador.getNombre_mesero(),
                iterador.getImporte()
            });
        }
    }


    }
private Time obtenerHora(String horaTF) {
    if (horaTF.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Debe ingresar la hora.");
        return Time.valueOf("00:00:00"); // Devuelve una hora predeterminada (00:00:00) en caso de error
    } else {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
            java.util.Date parsedDate = dateFormat.parse(horaTF);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(parsedDate);
            calendar.set(Calendar.SECOND, 0);
            return new Time(calendar.getTimeInMillis());
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la hora. Asegúrese de ingresar el formato correcto (HH:mm).");
            return Time.valueOf("00:00:00"); // Devuelve una hora predeterminada en caso de error
        }
    }

    }//GEN-LAST:event_buscarPedidoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabalPedidos;
    private javax.swing.JButton buscarPedido;
    private javax.swing.JPanel escritorio;
    private javax.swing.JTextField ingresaHora1;
    private javax.swing.JTextField ingresaHora2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePedidos;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTextField nroMesa;
    // End of variables declaration//GEN-END:variables
private Time obtenerHora() {

        String horaTF;
        Time hora = null;
        if (ingresaHora1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la hora");
        } else {
            horaTF = ingresaHora1.getText();
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
private void clearTable(){
    int i = jTablePedidos.getRowCount()-1;
    for(;i>=0;i--){
        model.removeRow(i);
    }
}
    private void armarCabecera() {
        model.addColumn("Numero de mesa");
        model.addColumn("nombre Mesero");
        model.addColumn("Importe");
        jTablePedidos.setModel(model);
        
    }
}

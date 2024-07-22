/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package biblotecapro;

import controlador.controladorPrestamo;
import java.awt.BorderLayout;
import java.time.LocalDate;
import javax.swing.JPanel;
import modelo.modeloPrestamo;
import vista.Principal;
import vista.Préstamos;

/**
 *
 * @author ederd
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        date();
        showWindows(new Principal());
    }
    
    public void date(){
        LocalDate now=LocalDate.now();
        int year=now.getYear();
        int day=now.getDayOfMonth();
        int month=now.getMonthValue();
        String [] meses={
            "Enero","Febrero","Marzp","Abirl","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
        };
        lblFecha.setText("Hoy es "+day+" de "+meses[month-1]+" del  "+year);
    }
    
    public void showWindows(JPanel vista){
        vista.setSize(760, 640);
        vista.setLocation(0,0);
        
        panelVista.removeAll();
        panelVista.add(vista,BorderLayout.CENTER);
        panelVista.revalidate();
        panelVista.repaint();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondoPrincipal = new javax.swing.JPanel();
        panelMenuLateral = new javax.swing.JPanel();
        lblLib = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnPrincipal = new javax.swing.JButton();
        btnPrestamo = new javax.swing.JButton();
        btnDevoluciones = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnLibros = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        panelEnCabezado = new javax.swing.JPanel();
        lblTItulo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        panelVista = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelFondoPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelFondoPrincipal.setPreferredSize(new java.awt.Dimension(1020, 640));

        panelMenuLateral.setBackground(new java.awt.Color(0, 0, 255));

        lblLib.setFont(new java.awt.Font("Segoe UI Light", 2, 36)); // NOI18N
        lblLib.setForeground(new java.awt.Color(255, 255, 255));
        lblLib.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLib.setText("LIB");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnPrincipal.setBackground(new java.awt.Color(51, 51, 255));
        btnPrincipal.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btnPrincipal.setText("Principal");
        btnPrincipal.setBorder(null);
        btnPrincipal.setContentAreaFilled(false);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setHideActionText(true);
        btnPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrincipalMouseExited(evt);
            }
        });
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });

        btnPrestamo.setBackground(new java.awt.Color(51, 51, 255));
        btnPrestamo.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        btnPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Prestamo.png"))); // NOI18N
        btnPrestamo.setText("Préstamo");
        btnPrestamo.setBorder(null);
        btnPrestamo.setContentAreaFilled(false);
        btnPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPrestamo.setMaximumSize(new java.awt.Dimension(100, 32));
        btnPrestamo.setMinimumSize(new java.awt.Dimension(100, 32));
        btnPrestamo.setPreferredSize(new java.awt.Dimension(100, 32));
        btnPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrestamoMouseExited(evt);
            }
        });
        btnPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoActionPerformed(evt);
            }
        });

        btnDevoluciones.setBackground(new java.awt.Color(51, 51, 255));
        btnDevoluciones.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        btnDevoluciones.setForeground(new java.awt.Color(255, 255, 255));
        btnDevoluciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Calender.png"))); // NOI18N
        btnDevoluciones.setText("Devoluciones");
        btnDevoluciones.setBorder(null);
        btnDevoluciones.setContentAreaFilled(false);
        btnDevoluciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDevoluciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDevoluciones.setMaximumSize(new java.awt.Dimension(100, 32));
        btnDevoluciones.setMinimumSize(new java.awt.Dimension(100, 32));
        btnDevoluciones.setPreferredSize(new java.awt.Dimension(100, 32));
        btnDevoluciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDevolucionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDevolucionesMouseExited(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(51, 51, 255));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Users.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setMaximumSize(new java.awt.Dimension(100, 32));
        btnUsuarios.setMinimumSize(new java.awt.Dimension(100, 32));
        btnUsuarios.setPreferredSize(new java.awt.Dimension(100, 32));
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });

        btnLibros.setBackground(new java.awt.Color(51, 51, 255));
        btnLibros.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(255, 255, 255));
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/book.png"))); // NOI18N
        btnLibros.setText("Libros");
        btnLibros.setBorder(null);
        btnLibros.setContentAreaFilled(false);
        btnLibros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLibros.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibrosMouseExited(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(51, 51, 255));
        btnReportes.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Reportes.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setBorder(null);
        btnReportes.setContentAreaFilled(false);
        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLateralLayout = new javax.swing.GroupLayout(panelMenuLateral);
        panelMenuLateral.setLayout(panelMenuLateralLayout);
        panelMenuLateralLayout.setHorizontalGroup(
            panelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPrestamo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDevoluciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLateralLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                    .addComponent(lblLib, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(btnLibros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLateralLayout.setVerticalGroup(
            panelMenuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLateralLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblLib)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDevoluciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelEnCabezado.setBackground(new java.awt.Color(51, 102, 255));

        lblTItulo.setFont(new java.awt.Font("Segoe UI Light", 2, 18)); // NOI18N
        lblTItulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTItulo.setText("Administracion de Bibloteca");

        lblFecha.setFont(new java.awt.Font("Segoe UI Light", 2, 24)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Hoy es {dayname} {dia} del {mes} del {año}");

        javax.swing.GroupLayout panelEnCabezadoLayout = new javax.swing.GroupLayout(panelEnCabezado);
        panelEnCabezado.setLayout(panelEnCabezadoLayout);
        panelEnCabezadoLayout.setHorizontalGroup(
            panelEnCabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnCabezadoLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panelEnCabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTItulo)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        panelEnCabezadoLayout.setVerticalGroup(
            panelEnCabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnCabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTItulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelVista.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelVistaLayout = new javax.swing.GroupLayout(panelVista);
        panelVista.setLayout(panelVistaLayout);
        panelVistaLayout.setHorizontalGroup(
            panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        panelVistaLayout.setVerticalGroup(
            panelVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelFondoPrincipalLayout = new javax.swing.GroupLayout(panelFondoPrincipal);
        panelFondoPrincipal.setLayout(panelFondoPrincipalLayout);
        panelFondoPrincipalLayout.setHorizontalGroup(
            panelFondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelFondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelEnCabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panelFondoPrincipalLayout.setVerticalGroup(
            panelFondoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenuLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelFondoPrincipalLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(panelEnCabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseEntered
        // TODO add your handling code here:
        btnPrincipal.setOpaque(true);
    }//GEN-LAST:event_btnPrincipalMouseEntered

    private void btnPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrincipalMouseExited
        // TODO add your handling code here:
        btnPrincipal.setOpaque(false);
    }//GEN-LAST:event_btnPrincipalMouseExited

    private void btnPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoMouseEntered
        // TODO add your handling code here:
        btnPrestamo.setOpaque(true);
    }//GEN-LAST:event_btnPrestamoMouseEntered

    private void btnPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoMouseExited
        // TODO add your handling code here:
        btnPrestamo.setOpaque(false);
    }//GEN-LAST:event_btnPrestamoMouseExited

    private void btnDevolucionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucionesMouseEntered
        // TODO add your handling code here:
        btnDevoluciones.setOpaque(true);
    }//GEN-LAST:event_btnDevolucionesMouseEntered

    private void btnDevolucionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolucionesMouseExited
        // TODO add your handling code here:
        btnDevoluciones.setOpaque(false);
    }//GEN-LAST:event_btnDevolucionesMouseExited

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        // TODO add your handling code here:
        btnUsuarios.setOpaque(true);
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        // TODO add your handling code here:
        btnUsuarios.setOpaque(false);
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseEntered
        // TODO add your handling code here:
        btnLibros.setOpaque(true);
    }//GEN-LAST:event_btnLibrosMouseEntered

    private void btnLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseExited
        // TODO add your handling code here:
        btnLibros.setOpaque(false);
    }//GEN-LAST:event_btnLibrosMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        // TODO add your handling code here:
        btnReportes.setOpaque(true);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        // TODO add your handling code here:
        btnReportes.setOpaque(false);
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoActionPerformed
        // TODO add your handling code here:
                // Crear la vista de Préstamos y el modelo
        Préstamos vistaPrestamos = new Préstamos();
        modeloPrestamo modeloPrestamo = new modeloPrestamo();
        // Crear el controlador
        controladorPrestamo controlador = new controladorPrestamo(vistaPrestamos, modeloPrestamo);
        controlador.addMouseListenerToButtons();
        
        // Mostrar la vista de Préstamos en tu ventana principal
        showWindows(vistaPrestamos);
    }//GEN-LAST:event_btnPrestamoActionPerformed

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        // TODO add your handling code here:
        showWindows(new Principal());
    }//GEN-LAST:event_btnPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDevoluciones;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnPrestamo;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLib;
    private javax.swing.JLabel lblTItulo;
    private javax.swing.JPanel panelEnCabezado;
    private javax.swing.JPanel panelFondoPrincipal;
    private javax.swing.JPanel panelMenuLateral;
    private javax.swing.JPanel panelVista;
    // End of variables declaration//GEN-END:variables
}

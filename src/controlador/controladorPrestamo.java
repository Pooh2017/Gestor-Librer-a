/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import modelo.modeloPrestamo;
import vista.Préstamos;

/**
 *
 * @author ederd
 */
public class controladorPrestamo implements ActionListener {
    private Préstamos view;
    private modeloPrestamo modelo;
    
    public controladorPrestamo(Préstamos view,modeloPrestamo modelo){
        this.view=view;
        this.modelo=modelo;
        this.view.btnPrestar.addActionListener(this);
        addMouseListenerToButtons();
    }
    
    public void actionPerformed(ActionEvent e){
        modelo.setFolioUsuario(Integer.parseInt( view.txtFolioUsuario.getText()));
        modelo.setIdLibro(Integer.parseInt(view.txtIdLibro.getText()));
        modelo.setEstadoPrestamo(true);
        String mensaje=modelo.mensajeRegistro();
        JOptionPane.showMessageDialog(null, "Se hizo el registro");
    }
     public void addMouseListenerToButtons() {
        this.view.btnPrestar.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                view.btnPrestar.setBackground(new Color(0x003EFF)); // Cambia el color de fondo a amarillo
                view.btnPrestar.setForeground(new Color(0xFFFFFF));
            }
            public void mouseExited(MouseEvent e) {
                view.btnPrestar.setBackground(new Color(0x6699FF)); // Restaura el color de fondo original
                view.btnPrestar.setForeground(new Color(0xFFFFFF));
            }
        });
    }
    
}

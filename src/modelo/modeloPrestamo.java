/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author ederd
 */
public class modeloPrestamo {
    private int folioUsuario;
    private int idLibro;
    private boolean estadoPrestamo;

    public modeloPrestamo(){
        
    }
    public modeloPrestamo(int folioUsuario, int idLibro, boolean estadoPrestamo) {
        this.folioUsuario = folioUsuario;
        this.idLibro = idLibro;
        this.estadoPrestamo = estadoPrestamo;
    }
    
    public int getFolioUsuario(){
        return folioUsuario;
    }
    public void setFolioUsuario(int folioUsuario){
        this.folioUsuario=folioUsuario;
    }
   
    public int getIdLibro(){
        return idLibro;
    }
    public void setIdLibro(int idLibro){
        this.idLibro=idLibro;
    }

    public boolean isEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(boolean estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }
    
    public String mensajeRegistro(){
        if(estadoPrestamo){
            return "Se hizo el préstamo";
        }else{
            return "No se puede hacer el prestamo";
        }
    }   
}

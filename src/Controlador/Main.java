package Controlador;

import Vista.Interfaz;
import javax.swing.JOptionPane;

public class Main {
    
    static ControladorPrincipal control;
    
    static Interfaz vista = new Interfaz();
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Pulse 'Aceptar' y espere, por favor.");
        
        control = new ControladorPrincipal(vista);
        control.iniciar();
    }
    
}
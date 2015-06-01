package Controlador;

import Modelo.ModeloPrincipal;
import Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class ControladorPrincipal implements ActionListener, MouseListener{
    
    Interfaz vista = Main.vista;
    
    ModeloPrincipal modelo;
    
    public enum AccionMVC{
        btnAccederProyecto,
        btnSalirInterfaz,
        btnNuevoProyecto,
        btnEliminarProyecto,
        btnAceptarNuevoProyecto,
        btnCancelarNuevoProyecto,
        btnSiEliminarProyecto,
        btnNoEliminarProyecto,
        
        btnAñadirAutor,
        btnEliminarAutor,
        btnObras,
        btnEnlaces,
        btnSalirAutores,
        btnAceptarNuevoAutor,
        btnCancelarNuevoAutor,
        btnSiEliminarAutor,
        btnNoEliminarAutor,
        
        btnAñadirObra,
        btnEliminarObra,
        btnSalirObras,
        btnAceptarNuevaObra,
        btnCancelarNuevaObra,
        btnSiEliminarObra,
        btnNoEliminarObra,
        
        btnAñadirEnlace,
        btnEliminarEnlace,
        btnSalirEnlaces,
        btnAceptarNuevoEnlace,
        btnCancelarNuevoEnlace,
        btnSiEliminarEnlace,
        btnNoEliminarEnlace
    }
    
    public ControladorPrincipal(Interfaz vista){
        this.vista = vista;
    }
    
    public void iniciar(){
        try{
            modelo = new ModeloPrincipal();
            
            this.vista.setVisible(true);
            this.vista.setLocation(100,100);
            
            this.vista.btnAccederProyecto.setActionCommand("btnAccederProyecto");
            this.vista.btnAccederProyecto.addActionListener(this);
            this.vista.btnSalirInterfaz.setActionCommand("btnSalirInterfaz");
            this.vista.btnSalirInterfaz.addActionListener(this);
            this.vista.btnNuevoProyecto.setActionCommand("btnNuevoProyecto");
            this.vista.btnNuevoProyecto.addActionListener(this);
            this.vista.btnEliminarProyecto.setActionCommand("btnEliminarProyecto");
            this.vista.btnEliminarProyecto.addActionListener(this);
            this.vista.btnAceptarNuevoProyecto.setActionCommand("btnAceptarNuevoProyecto");
            this.vista.btnAceptarNuevoProyecto.addActionListener(this);
            this.vista.btnCancelarNuevoProyecto.setActionCommand("btnCancelarNuevoProyecto");
            this.vista.btnCancelarNuevoProyecto.addActionListener(this);
            this.vista.btnSiEliminarProyecto.setActionCommand("btnSiEliminarProyecto");
            this.vista.btnSiEliminarProyecto.addActionListener(this);
            this.vista.btnNoEliminarProyecto.setActionCommand("btnNoEliminarProyecto");
            this.vista.btnNoEliminarProyecto.addActionListener(this);
            
            this.vista.btnAñadirAutor.setActionCommand("btnAñadirAutor");
            this.vista.btnAñadirAutor.addActionListener(this);
            this.vista.btnEliminarAutor.setActionCommand("btnEliminarAutor");
            this.vista.btnEliminarAutor.addActionListener(this);
            this.vista.btnObras.setActionCommand("btnObras");
            this.vista.btnObras.addActionListener(this);
            this.vista.btnEnlaces.setActionCommand("btnEnlaces");
            this.vista.btnEnlaces.addActionListener(this);
            this.vista.btnSalirAutores.setActionCommand("btnSalirAutores");
            this.vista.btnSalirAutores.addActionListener(this);
            this.vista.btnAceptarNuevoAutor.setActionCommand("btnAceptarNuevoAutor");
            this.vista.btnAceptarNuevoAutor.addActionListener(this);
            this.vista.btnCancelarNuevoAutor.setActionCommand("btnCancelarNuevoAutor");
            this.vista.btnCancelarNuevoAutor.addActionListener(this);
            this.vista.btnSiEliminarAutor.setActionCommand("btnSiEliminarAutor");
            this.vista.btnSiEliminarAutor.addActionListener(this);
            this.vista.btnNoEliminarAutor.setActionCommand("btnNoEliminarAutor");
            this.vista.btnNoEliminarAutor.addActionListener(this);
            
            this.vista.btnAñadirObra.setActionCommand("btnAñadirObra");
            this.vista.btnAñadirObra.addActionListener(this);
            this.vista.btnEliminarObra.setActionCommand("btnEliminarObra");
            this.vista.btnEliminarObra.addActionListener(this);
            this.vista.btnSalirObras.setActionCommand("btnSalirObras");
            this.vista.btnSalirObras.addActionListener(this);
            this.vista.btnAceptarNuevaObra.setActionCommand("btnAceptarNuevaObra");
            this.vista.btnAceptarNuevaObra.addActionListener(this);
            this.vista.btnCancelarNuevaObra.setActionCommand("btnCancelarNuevaObra");
            this.vista.btnCancelarNuevaObra.addActionListener(this);
            this.vista.btnSiEliminarObra.setActionCommand("btnSiEliminarObra");
            this.vista.btnSiEliminarObra.addActionListener(this);
            this.vista.btnNoEliminarObra.setActionCommand("btnNoEliminarObra");
            this.vista.btnNoEliminarObra.addActionListener(this);
            
            this.vista.btnAñadirEnlace.setActionCommand("btnAñadirEnlace");
            this.vista.btnAñadirEnlace.addActionListener(this);
            this.vista.btnEliminarEnlace.setActionCommand("btnEliminarEnlace");
            this.vista.btnEliminarEnlace.addActionListener(this);
            this.vista.btnSalirEnlaces.setActionCommand("btnSalirEnlaces");
            this.vista.btnSalirEnlaces.addActionListener(this);
            this.vista.btnAceptarNuevoEnlace.setActionCommand("btnAceptarNuevoEnlace");
            this.vista.btnAceptarNuevoEnlace.addActionListener(this);
            this.vista.btnCancelarNuevoEnlace.setActionCommand("btnCancelarNuevoEnlace");
            this.vista.btnCancelarNuevoEnlace.addActionListener(this);
            this.vista.btnSiEliminarEnlace.setActionCommand("btnSiEliminarEnlace");
            this.vista.btnSiEliminarEnlace.addActionListener(this);
            this.vista.btnNoEliminarEnlace.setActionCommand("btnNoEliminarEnlace");
            this.vista.btnNoEliminarEnlace.addActionListener(this);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar el Controlador");
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case btnAccederProyecto:
                vista.setVisible(false);
                break;
            case btnSalirInterfaz:
                System.exit(0);
                break;
            case btnNuevoProyecto:
                vista.setVisible(false);
                break;
            case btnEliminarProyecto:
                break;
            case btnAceptarNuevoProyecto:
                vista.nuevoProyecto.setVisible(false);
                break;
            case btnCancelarNuevoProyecto:
                vista.nuevoProyecto.setVisible(false);
                break;
            case btnSiEliminarProyecto:
                vista.eliminarProyecto.setVisible(false);
                break;
            case btnNoEliminarProyecto:
                vista.eliminarProyecto.setVisible(false);
                break;

            case btnAñadirAutor:
                vista.autores.setVisible(false);
                break;
            case btnEliminarAutor:
                break;
            case btnObras:
                vista.autores.setVisible(false);
                break;
            case btnEnlaces:
                vista.autores.setVisible(false);
                break;
            case btnSalirAutores:
                vista.autores.setVisible(false);
                break;
            case btnAceptarNuevoAutor:
                vista.nuevoAutor.setVisible(false);
                break;
            case btnCancelarNuevoAutor:
                vista.nuevoAutor.setVisible(false);
                break;
            case btnSiEliminarAutor:
                vista.eliminarAutor.setVisible(false);
                break;
            case btnNoEliminarAutor:
                vista.eliminarAutor.setVisible(false);
                break;

            case btnAñadirObra:
                vista.obras.setVisible(false);
                break;
            case btnEliminarObra:
                break;
            case btnSalirObras:
                vista.obras.setVisible(false);
                break;
            case btnAceptarNuevaObra:
                vista.nuevaObra.setVisible(false);
                break;
            case btnCancelarNuevaObra:
                vista.nuevaObra.setVisible(false);
                break;
            case btnSiEliminarObra:
                vista.eliminarObra.setVisible(false);
                break;
            case btnNoEliminarObra:
                vista.eliminarObra.setVisible(false);
                break;

            case btnAñadirEnlace:
                vista.enlaces.setVisible(false);
                break;
            case btnEliminarEnlace:
                break;
            case btnSalirEnlaces:
                vista.enlaces.setVisible(false);
                break;
            case btnAceptarNuevoEnlace:
                vista.nuevoEnlace.setVisible(false);
                break;
            case btnCancelarNuevoEnlace:
                vista.nuevoEnlace.setVisible(false);
                break;
            case btnSiEliminarEnlace:
                vista.eliminarEnlace.setVisible(false);
                break;
            case btnNoEliminarEnlace:
                vista.eliminarEnlace.setVisible(false);
                break;
        }
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        
    }

    public void mouseExited(MouseEvent e) {
        
    }   
}
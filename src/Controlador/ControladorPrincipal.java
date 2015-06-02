package Controlador;

import Modelo.ModeloPrincipal;
import Vista.Interfaz;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class ControladorPrincipal implements ActionListener, MouseListener{
    
    Interfaz vista = Main.vista;
    
    ModeloPrincipal modelo;
    
    String nombreProyectoSeleccionado = "";
    String nombreAutorSeleccionado = "";
    String apellidosAutorSeleccionado = "";
    String nombreObraSeleccionada = "";
    String nombreEnlaceSeleccionado = "";
    
    String proyecto = "";
    String autor = "";
    String obra = "";
    String enlace = "";
    String autorApe = "";
    
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
            vista.setTitle("Psicolisto");
            
            modelo = new ModeloPrincipal();
            
            this.vista.tablaProyectos.setModel(modelo.getTablaProyectos());
            
            JOptionPane.showMessageDialog(null, "Bienvenido, Luis.");
            
            this.vista.setVisible(true);
            vista.setLocationRelativeTo(null);
            
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
            
            this.vista.tablaProyectos.addMouseListener(this);
            this.vista.tablaProyectos.setModel(modelo.getTablaProyectos());
            this.vista.tablaProyectos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaProyectos.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaProyectos.getTableHeader().setResizingAllowed(false);
            
            this.vista.tablaAutores.addMouseListener(this);
            this.vista.tablaAutores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaAutores.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaAutores.getTableHeader().setResizingAllowed(false);
            
            this.vista.tablaObras.addMouseListener(this);
            this.vista.tablaObras.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaObras.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaObras.getTableHeader().setResizingAllowed(false);
            
            this.vista.tablaEnlaces.addMouseListener(this);
            this.vista.tablaEnlaces.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            this.vista.tablaEnlaces.getTableHeader().setReorderingAllowed(false);
            this.vista.tablaEnlaces.getTableHeader().setResizingAllowed(false);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al cargar el Controlador.");
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {
        switch (AccionMVC.valueOf(e.getActionCommand())){
            case btnAccederProyecto:
                if(nombreProyectoSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un proyecto.");
                }else{
                    vista.setVisible(false);
                    vista.tablaAutores.setModel(modelo.getTablaAutores(proyecto));
                    vista.autores.setTitle("Psicolisto"+" ("+proyecto+")");
                    vista.autores.pack();
                    vista.autores.setLocationRelativeTo(null);
                    vista.autores.setVisible(true);
                }
                break;
            case btnSalirInterfaz:
                System.exit(0);
                break;
            case btnNuevoProyecto:
                vista.setVisible(false);
                vista.nuevoProyecto.pack();
                vista.nuevoProyecto.setLocationRelativeTo(null);
                vista.nuevoProyecto.setVisible(true);
                break;
            case btnEliminarProyecto:
                if(nombreProyectoSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un proyecto.");
                }else{
                    vista.setVisible(false);
                    vista.eliminarProyecto.pack();
                    vista.eliminarProyecto.setLocationRelativeTo(null);
                    vista.eliminarProyecto.setVisible(true);
                }
                break;
            case btnAceptarNuevoProyecto:
                String nombreP = vista.txtNombreNuevoProyecto.getText();
                String notaP = vista.txtNotaNuevoProyecto.getText();
                if(nombreP != ""){
                    int resuP = modelo.comprobarExistenciaProyecto(nombreP);
                    if(resuP == 1){
                        JOptionPane.showMessageDialog(null, "El nombre del proyecto ya está en uso.");
                    }else{
                        modelo.nuevoProyecto(nombreP, notaP);
                        vista.nuevoProyecto.setVisible(false);
                        vista.tablaProyectos.setModel(modelo.getTablaProyectos());
                        vista.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Introduzca un nombre para el nuevo proyecto.");
                }
                break;
            case btnCancelarNuevoProyecto:
                vista.nuevoProyecto.setVisible(false);
                vista.setVisible(true);
                break;
            case btnSiEliminarProyecto:
                modelo.eliminarProyecto(proyecto);
                vista.eliminarProyecto.setVisible(false);
                this.vista.tablaProyectos.setModel(modelo.getTablaProyectos());
                vista.notaProyectos.setText("");
                vista.setVisible(true);
                break;
            case btnNoEliminarProyecto:
                vista.eliminarProyecto.setVisible(false);
                vista.setVisible(true);
                break;

            case btnAñadirAutor:
                vista.autores.setVisible(false);
                vista.nuevoAutor.pack();
                vista.nuevoAutor.setLocationRelativeTo(null);
                vista.nuevoAutor.setVisible(true);
                break;
            case btnEliminarAutor:
                if(nombreAutorSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un autor.");
                }else{
                    vista.autores.setVisible(false);
                    vista.eliminarAutor.pack();
                    vista.eliminarAutor.setLocationRelativeTo(null);
                    vista.eliminarAutor.setVisible(true);
                }
                break;
            case btnObras:
                if(nombreAutorSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un autor.");
                }else{
                    vista.autores.setVisible(false);
                    this.vista.tablaObras.setModel(modelo.getTablaObras(autor));
                    vista.obras.setTitle("Psicolisto"+" ("+proyecto+": "+autor+")");
                    vista.obras.pack();
                    vista.obras.setLocationRelativeTo(null);
                    vista.obras.setVisible(true);
                }
                break;
            case btnEnlaces:
                if(nombreAutorSeleccionado.equals("")){
                    JOptionPane.showMessageDialog(null, "Seleccione un autor.");
                }else{
                    vista.autores.setVisible(false);
                    this.vista.tablaEnlaces.setModel(modelo.getTablaEnlaces(autor));
                    vista.obras.setTitle("Psicolisto"+" ("+proyecto+": "+autor+")");
                    vista.enlaces.pack();
                    vista.enlaces.setLocationRelativeTo(null);
                    vista.enlaces.setVisible(true);
                }
                break;
            case btnSalirAutores:
                vista.autores.setVisible(false);
                vista.setTitle("Psicolisto");
                vista.setVisible(true);
                autor = "";
                autorApe = "";
                nombreAutorSeleccionado = "";
                break;
            case btnAceptarNuevoAutor:
                String nombreA = vista.txtNombreNuevoAutor.getText();
                String apellidosA = vista.txtApellidosNuevoAutor.getText();
                String fechaNA = vista.txtFechaNacimientoNuevoAutor.getText();
                String fechaDA = vista.txtFechaDefuncionNuevoAutor.getText();
                String corrienteA = vista.txtCorrienteNuevoAutor.getText();
                String notaA = vista.txtNotaNuevoAutor.getText();
                if(nombreA != "" || apellidosA != ""){
                    int resuA = modelo.comprobarExistenciaAutor(proyecto, nombreA, apellidosA);
                    if(resuA == 1){
                        JOptionPane.showMessageDialog(null, "El autor ya existe en este proyecto.");
                    }else{
                        modelo.nuevoAutor(nombreA, apellidosA, fechaNA, fechaDA, corrienteA, notaA, proyecto);
                        this.vista.tablaAutores.setModel(modelo.getTablaAutores(proyecto));
                        vista.autores.setVisible(true);
                        vista.nuevoAutor.setVisible(false);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Introduzca el nombre o apellido del nuevo autor.");
                }
                
                break;
            case btnCancelarNuevoAutor:
                vista.nuevoAutor.setVisible(false);
                vista.autores.setVisible(true);
                break;
            case btnSiEliminarAutor:
                modelo.eliminarAutor(autor);
                vista.eliminarAutor.setVisible(false);
                this.vista.tablaAutores.setModel(modelo.getTablaAutores(proyecto));
                vista.notaAutores.setText("");
                vista.autores.setVisible(true);
                break;
            case btnNoEliminarAutor:
                vista.eliminarAutor.setVisible(false);
                vista.autores.setVisible(true);
                break;

            case btnAñadirObra:
                vista.obras.setVisible(false);
                vista.nuevaObra.pack();
                vista.nuevaObra.setLocationRelativeTo(null);
                vista.nuevaObra.setVisible(true);
                break;
            case btnEliminarObra:
                vista.obras.setVisible(false);
                vista.eliminarObra.pack();
                vista.eliminarObra.setLocationRelativeTo(null);
                vista.eliminarObra.setVisible(true);
                break;
            case btnSalirObras:
                vista.obras.setVisible(false);
                vista.autores.setTitle("Psicolisto"+" ("+proyecto+")");
                vista.autores.setVisible(true);
                obra = "";
                nombreObraSeleccionada = "";
                break;
            case btnAceptarNuevaObra:
                String tituloO = vista.txtTituloNuevaObra.getText();
                String fechaPO = vista.txtFechaPublicacionNuevaObra.getText();
                String temaO = vista.txtTemaNuevaObra.getText();
                String notaO = vista.txtNotaNuevaObra.getText();
                if(tituloO != ""){
                    int resuO = modelo.comprobarExistenciaObra(proyecto, autor, autorApe, tituloO);
                    if(resuO == 1){
                        JOptionPane.showMessageDialog(null, "La obra de este autor ya ha sido archivada.");
                    }else{
                        modelo.nuevaObra(tituloO, fechaPO, temaO, notaO, autor);
                        vista.nuevaObra.setVisible(false);
                        this.vista.tablaObras.setModel(modelo.getTablaObras(autor));
                        vista.obras.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Introduzca el título de la nueva obra.");
                }
                break;
            case btnCancelarNuevaObra:
                vista.nuevaObra.setVisible(false);
                vista.obras.setVisible(true);
                break;
            case btnSiEliminarObra:
                modelo.eliminarObra(obra);
                vista.eliminarObra.setVisible(false);
                this.vista.tablaObras.setModel(modelo.getTablaObras(autor));
                vista.notaObras.setText("");
                vista.obras.setVisible(true);
                break;
            case btnNoEliminarObra:
                vista.eliminarObra.setVisible(false);
                vista.obras.setVisible(true);
                break;

            case btnAñadirEnlace:
                vista.enlaces.setVisible(false);
                vista.nuevoEnlace.pack();
                vista.nuevoEnlace.setLocationRelativeTo(null);
                vista.nuevoEnlace.setVisible(true);
                break;
            case btnEliminarEnlace:
                vista.eliminarEnlace.setVisible(false);
                vista.enlaces.setVisible(true);
                break;
            case btnSalirEnlaces:
                vista.enlaces.setVisible(false);
                vista.autores.setTitle("Psicolisto"+" ("+proyecto+")");
                vista.autores.setVisible(true);
                enlace = "";
                nombreEnlaceSeleccionado = "";
                break;
            case btnAceptarNuevoEnlace:
                String nombreE = vista.txtNombreNuevoEnlace.getText();
                String rutaE = vista.txtRutaNuevoEnlace.getText();
                String temaE = vista.txtTemaNuevoEnlace.getText();
                String notaE = vista.txtNotaNuevoEnlace.getText();
                if(rutaE != ""){
                    int resuE = modelo.comprobarExistenciaEnlace(proyecto, autor, autorApe, nombreE);
                    if(resuE == 1){
                        JOptionPane.showMessageDialog(null, "Ya existe otro enlace de este autor con ese nombre.");
                    }else{
                        modelo.nuevoEnlace(nombreE, rutaE, temaE, notaE, autor);
                        vista.nuevoEnlace.setVisible(false);
                        vista.tablaEnlaces.setModel(modelo.getTablaEnlaces(autor));
                        vista.enlaces.setVisible(true);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Introduzca la ruta del nuevo enlace.");
                }
                break;
            case btnCancelarNuevoEnlace:
                vista.nuevoEnlace.setVisible(false);
                vista.enlaces.setVisible(true);
                break;
            case btnSiEliminarEnlace:
                modelo.eliminarEnlace(enlace);
                vista.eliminarEnlace.setVisible(false);
                vista.tablaEnlaces.setModel(modelo.getTablaEnlaces(autor));
                vista.notaEnlaces.setText("");
                vista.enlaces.setVisible(true);
                break;
            case btnNoEliminarEnlace:
                vista.eliminarEnlace.setVisible(false);
                vista.enlaces.setVisible(true);
                break;
        }
    }

    public void mouseClicked(MouseEvent e) {
        int filaProyecto = this.vista.tablaProyectos.rowAtPoint(e.getPoint());
        int filaAutor = this.vista.tablaAutores.rowAtPoint(e.getPoint());
        int filaObra = this.vista.tablaObras.rowAtPoint(e.getPoint());
        int filaEnlace = this.vista.tablaEnlaces.rowAtPoint(e.getPoint());
            
        if (filaProyecto > -1){
            nombreProyectoSeleccionado = String.valueOf(this.vista.tablaProyectos.getValueAt(filaProyecto, 0));
            proyecto = nombreProyectoSeleccionado;
            String notaP = modelo.getNotaProyecto(proyecto);
            vista.notaProyectos.setText(notaP);
        }else{
            nombreProyectoSeleccionado = "";
        }
        if (filaAutor > -1){
            nombreAutorSeleccionado = String.valueOf(this.vista.tablaAutores.getValueAt(filaAutor, 0));
            apellidosAutorSeleccionado = String.valueOf(this.vista.tablaAutores.getValueAt(filaAutor, 1));
            autor = nombreAutorSeleccionado;
            autorApe = apellidosAutorSeleccionado;
            String notaA = modelo.getNotaAutor(autor);
            vista.notaAutores.setText(notaA);
        }else{
            nombreAutorSeleccionado = "";
        }
        if (filaObra > -1){
            nombreObraSeleccionada = String.valueOf(this.vista.tablaObras.getValueAt(filaObra, 0));
            obra = nombreObraSeleccionada;
            String notaO = modelo.getNotaObra(obra);
            vista.notaObras.setText(notaO);
        }else{
            nombreObraSeleccionada = "";
        }
        if (filaEnlace > -1){
            nombreEnlaceSeleccionado = String.valueOf(this.vista.tablaEnlaces.getValueAt(filaEnlace, 0));
            enlace = nombreEnlaceSeleccionado;
            String notaE = modelo.getNotaEnlace(enlace);
            String rutaE = modelo.getRutaEnlace(enlace);
            vista.notaEnlaces.setText(notaE);
            vista.rutaEnlaces.setText(rutaE);
        }else{
            nombreEnlaceSeleccionado = "";
        }
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
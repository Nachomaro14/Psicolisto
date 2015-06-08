package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ModeloPrincipal extends Database{
    
    public ModeloPrincipal(){
        
    }
    
    public class ModeloTablaNoEditable extends DefaultTableModel {

        public boolean isCellEditable(int row, int column){  
            return false;  
        }
    }
    
    public DefaultTableModel getTablaProyectos(){
        
        DefaultTableModel modelotabla = new ModeloTablaNoEditable();
        
        String[] columnNames = {"Nombre","Fecha"};
        int registros = 0;
        
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT count(*) as total FROM Proyectos");
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        Object[][] data = new String[registros][2];
        
        try{

            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT * FROM Proyectos");
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while(res.next()){
                data[i][0] = res.getString("Nombre");
                data[i][1] = res.getString("Fecha_Creacion");
                i++;
            }
            res.close();

            modelotabla.setDataVector(data, columnNames);
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        
        return modelotabla;
    }
    
    public DefaultTableModel getTablaAutores(String p){
        
        DefaultTableModel modelotabla = new ModeloTablaNoEditable();
        
        String[] columnNames = {"Nombre","Apellidos","Nacimiento","Defunción","Corriente"};
        int registros = 0;
        
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+p+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT count(*) as total FROM Autores WHERE ID_Proyecto = "+id);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                registros = res2.getInt("total");
                res2.close();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }

            Object[][] data = new String[registros][5];

            try{

                PreparedStatement pstm3 = this.getConexion().prepareStatement("SELECT * FROM Autores WHERE ID_Proyecto = "+id);
                ResultSet res3 = pstm3.executeQuery();
                int i = 0;
                while(res3.next()){
                    data[i][0] = res3.getString("Nombre");
                    data[i][1] = res3.getString("Apellidos");
                    data[i][2] = res3.getString("Fecha_Nacimiento");
                    data[i][3] = res3.getString("Fecha_Defuncion");
                    data[i][4] = res3.getString("Corriente");
                    i++;
                }
                res3.close();

                modelotabla.setDataVector(data, columnNames);
            }catch(SQLException e){
                System.err.println(e.getMessage());
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        return modelotabla;
    }
    
    public DefaultTableModel getTablaObras(String p, String a){
        
        DefaultTableModel modelotabla = new ModeloTablaNoEditable();
        
        String[] columnNames = {"Título","Publicación","Tema"};
        int registros = 0;
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+p+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id1 = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+a+"' AND ID_Proyecto = "+id1);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                int id2 = res2.getInt("ID_Autor");
                res1.close();
                try{
                    PreparedStatement pstm3 = this.getConexion().prepareStatement("SELECT count(*) as total FROM Obras WHERE ID_Autor = "+id2);
                    ResultSet res3 = pstm3.executeQuery();
                    res3.next();
                    registros = res3.getInt("total");
                    res3.close();
                }catch(SQLException e){
                    System.err.println( e.getMessage() );
                }

                Object[][] data = new String[registros][3];

                try{

                    PreparedStatement pstm3 = this.getConexion().prepareStatement("SELECT * FROM Obras WHERE ID_Autor = "+id2);
                    ResultSet res3 = pstm3.executeQuery();
                    int i = 0;
                    while(res3.next()){
                        data[i][0] = res3.getString("Titulo");
                        data[i][1] = res3.getString("Fecha_publicacion");
                        data[i][2] = res3.getString("Tema");
                        i++;
                    }
                    res3.close();

                    modelotabla.setDataVector(data, columnNames);
                }catch(SQLException e){
                    System.err.println(e.getMessage());
                }
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        return modelotabla;
    }
    
    public DefaultTableModel getTablaEnlaces(String p, String a){
        
        DefaultTableModel modelotabla = new ModeloTablaNoEditable();
        
        String[] columnNames = {"Nombre","Tema"};
        int registros = 0;
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+p+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            int id1 = res.getInt("ID_Proyecto");
            res.close();
            try{
                PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+a+"' AND ID_Proyecto = "+id1);
                ResultSet res1 = pstm1.executeQuery();
                res1.next();
                int id = res1.getInt("ID_Autor");
                res1.close();
                try{
                    PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT count(*) as total FROM Enlaces WHERE ID_Autor = "+id);
                    ResultSet res2 = pstm2.executeQuery();
                    res2.next();
                    registros = res2.getInt("total");
                    res2.close();
                }catch(SQLException e){
                    System.err.println( e.getMessage() );
                }

                Object[][] data = new String[registros][2];

                try{

                    PreparedStatement pstm3 = this.getConexion().prepareStatement("SELECT * FROM Enlaces WHERE ID_Autor = "+id);
                    ResultSet res3 = pstm3.executeQuery();
                    int i = 0;
                    while(res3.next()){
                        data[i][0] = res3.getString("Nombre");
                        data[i][1] = res3.getString("Tema");
                        i++;
                    }
                    res3.close();

                    modelotabla.setDataVector(data, columnNames);
                }catch(SQLException e){
                    System.err.println(e.getMessage());
                }
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        
        return modelotabla;
    }
    
    public String getNotaProyecto(String p){
        String nota = "";
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT Nota FROM Proyectos WHERE Nombre = '"+p+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            nota = res1.getString("Nota");
            res1.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return nota;
    }
    
    public String getNotaAutor(String a){
        String nota = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nota FROM Autores WHERE Nombre = '"+a+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            nota = res.getString("Nota");
            res.close();
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return nota;
    }
    
    public String getNotaObra(String o){
        String nota = "";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT Nota FROM Obras WHERE Titulo = '"+o+"'");
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                nota = res2.getString("Nota");
                res2.close();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        return nota;
    }
    
    public String getNotaEnlace(String en){
        String nota = "";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT Nota FROM Enlaces WHERE Nombre = '"+en+"'");
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                nota = res2.getString("Nota");
                res2.close();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        return nota;
    }
    
    public String getRutaEnlace(String en){
        String nota = "";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT Ruta FROM Enlaces WHERE Nombre = '"+en+"'");
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                nota = res2.getString("Ruta");
                res2.close();
            }catch(SQLException e){
                System.err.println( e.getMessage() );
            }
        return nota;
    }
    
    public void nuevoProyecto(String nombre, String nota){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = String.valueOf(dateFormat.format(date));
        String pro = "INSERT INTO Proyectos (Nombre, Fecha_Creacion, Nota) VALUES('"+nombre+"', '"+fecha+"', '"+nota+"')";
        try{
            PreparedStatement pstm2 = this.getConexion().prepareStatement(pro);
            pstm2.execute();
            pstm2.close();
            JOptionPane.showMessageDialog(null, "Proyecto creado.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al insertar nuevo proyecto.");
            ex.getStackTrace();
        }
    }
    
    public void nuevoAutor(String nombre, String apellidos, String fechaN, String fechaD, String corriente, String nota, String proyecto){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id = res1.getInt("ID_Proyecto");
            res1.close();
            String au = "INSERT INTO Autores (Nombre, Apellidos, Fecha_Nacimiento, Fecha_Defuncion, Corriente, Nota, ID_Proyecto) "
                    + "VALUES('"+nombre+"', '"+apellidos+"', '"+fechaN+"', '"+fechaD+"', '"+corriente+"', '"+nota+"', "+id+")";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(au);
                pstm2.execute();
                pstm2.close();
                JOptionPane.showMessageDialog(null, "Autor creado.");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al insertar nuevo autor.");
                ex.getStackTrace();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al crear nuevo autor.");
            ex.getStackTrace();
        }
    }
    
    public void nuevaObra(String titulo, String fechaP, String tema, String nota, String autor){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+autor+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id = res1.getInt("ID_Autor");
            res1.close();
            String au = "INSERT INTO Obras (Titulo, Fecha_publicacion, Tema, Nota, ID_Autor) "
                    + "VALUES('"+titulo+"', '"+fechaP+"', '"+tema+"', '"+nota+"', "+id+")";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(au);
                pstm2.execute();
                pstm2.close();
                JOptionPane.showMessageDialog(null, "Obra creada.");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al insertar nueva obra.");
                ex.getStackTrace();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al crear nueva obra.");
            ex.getStackTrace();
        }
    }
    
    public void nuevoEnlace(String nombre, String ruta, String tema, String nota, String autor){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+autor+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id = res1.getInt("ID_Autor");
            res1.close();
            String au = "INSERT INTO Enlaces (Nombre, Ruta, Tema, Nota, ID_Autor) "
                    + "VALUES('"+nombre+"', '"+ruta+"', '"+tema+"', '"+nota+"', "+id+")";
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement(au);
                pstm2.execute();
                pstm2.close();
                JOptionPane.showMessageDialog(null, "Enlace creado.");
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al insertar nuevo enlace.");
                ex.getStackTrace();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al crear nuevo enlace.");
            ex.getStackTrace();
        }
    }
    
    public void eliminarProyecto(String proyecto){
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("DELETE FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Proyecto eliminado.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al eliminar proyecto.");
            ex.getStackTrace();
        }
    }
    
    public void eliminarAutor(String proyecto, String autor){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm = this.getConexion().prepareStatement("DELETE FROM Autores WHERE Nombre = '"+autor+"' AND ID_Proyecto = "+id);
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null, "Autor eliminado.");
            }catch(SQLException ex1){
                JOptionPane.showMessageDialog(null, "Error al eliminar autor.");
                ex1.getStackTrace();
            }
        }catch(SQLException ex2){
            JOptionPane.showMessageDialog(null, "Error al obtener ID.");
            ex2.getStackTrace();
        }
    }
    
    public void eliminarObra(String proyecto, String autor, String obra){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id1 = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+autor+"' AND ID_Proyecto = "+id1);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                int id2 = res2.getInt("ID_Autor");
                res2.close();
                try{
                    PreparedStatement pstm3 = this.getConexion().prepareStatement("DELETE FROM Obras WHERE Titulo = '"+obra+"' AND ID_Autor = "+id2);
                    pstm3.execute();
                    pstm3.close();
                    JOptionPane.showMessageDialog(null, "Obra eliminada.");
                }catch(SQLException ex1){
                    JOptionPane.showMessageDialog(null, "Error al eliminar obra.");
                    ex1.getStackTrace();
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "Error al obtener ID_Autor.");
                ex2.getStackTrace();
            }
        }catch(SQLException ex3){
            JOptionPane.showMessageDialog(null, "Error al obtener ID_Proyecto.");
            ex3.getStackTrace();
        }
    }
    
    public void eliminarEnlace(String proyecto, String autor, String enlace){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id1 = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+autor+"' AND ID_Proyecto = "+id1);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                int id2 = res2.getInt("ID_Autor");
                res2.close();
                try{
                    PreparedStatement pstm3 = this.getConexion().prepareStatement("DELETE FROM Enlaces WHERE Nombre = '"+enlace+"' AND ID_Autor = "+id2);
                    pstm3.execute();
                    pstm3.close();
                    JOptionPane.showMessageDialog(null, "Enlace eliminado.");
                }catch(SQLException ex1){
                    JOptionPane.showMessageDialog(null, "Error al eliminar enlace.");
                    ex1.getStackTrace();
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "Error al obtener ID_Autor.");
                ex2.getStackTrace();
            }
        }catch(SQLException ex3){
            JOptionPane.showMessageDialog(null, "Error al obtener ID_Proyecto.");
            ex3.getStackTrace();
        }
    }
    
    public int comprobarExistenciaProyecto(String p){
        int resu = 0;
        String nombre = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre FROM Proyectos WHERE Nombre = '"+p+"'");
            ResultSet res = pstm.executeQuery();
            res.next();
            nombre = res.getString("Nombre");
            res.close();
            if(nombre.equals("")){
                resu = 0;
            }else{
                resu = 1;
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return resu;
    }
    
    public int comprobarExistenciaAutor(String p, String n, String a){
        int resu = 0;
        String nombre = "";
        String apellidos = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre, Apellidos FROM Autores WHERE Nombre = '"+n+"'"
                    + " AND Apellidos = '"+a+"' AND ID_Proyecto = (SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+p+"')");
            ResultSet res = pstm.executeQuery();
            res.next();
            nombre = res.getString("Nombre");
            apellidos = res.getString("Apellidos");
            res.close();
            if(nombre.equals("") && apellidos.equals("")){
                resu = 0;
            }else{
                resu = 1;
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return resu;
    }
    
    public int comprobarExistenciaObra(String p, String n, String a, String t){
        int resu = 0;
        String titulo = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Titulo FROM Obras WHERE Titulo = '"+t+"'"
                    + " AND ID_Autor = (SELECT ID_Autor FROM Autores WHERE Nombre = '"+n+"'"
                    + " AND Apellidos = '"+a+"' AND ID_Proyecto = (SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+p+"'))");
            ResultSet res = pstm.executeQuery();
            res.next();
            titulo = res.getString("Titulo");
            res.close();
            if(titulo.equals("")){
                resu = 0;
            }else{
                resu = 1;
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return resu;
    }
    
    public int comprobarExistenciaEnlace(String p, String n, String a, String en){
        int resu = 0;
        String nombre = "";
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("SELECT Nombre FROM Enlaces WHERE Nombre = '"+en+"'"
                    + " AND ID_Autor = (SELECT ID_Autor FROM Autores WHERE Nombre = '"+n+"'"
                    + " AND Apellidos = '"+a+"' AND ID_Proyecto = (SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+p+"'))");
            ResultSet res = pstm.executeQuery();
            res.next();
            nombre = res.getString("Nombre");
            res.close();
            if(nombre.equals("")){
                resu = 0;
            }else{
                resu = 1;
            }
        }catch(SQLException e){
            System.err.println( e.getMessage() );
        }
        return resu;
    }
    
    public void actualizarNotaProyecto(String nuevaNota, String proyecto){
        try{
            PreparedStatement pstm = this.getConexion().prepareStatement("UPDATE Proyectos SET Nota = '"+nuevaNota+"' WHERE Nombre = '"+proyecto+"'");
            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Nota actualizada.");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al actualizar nota.");
            ex.getStackTrace();
        }
    }
    
    public void actualizarNotaAutor(String nuevaNota, String proyecto, String autor){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm = this.getConexion().prepareStatement("UPDATE Autores SET Nota = '"+nuevaNota+"' WHERE Nombre = '"+autor+"' AND ID_Proyecto = "+id);
                pstm.execute();
                pstm.close();
                JOptionPane.showMessageDialog(null, "Nota actualizada.");
            }catch(SQLException ex1){
                JOptionPane.showMessageDialog(null, "Seleccione un autor.");
                ex1.getStackTrace();
            }
        }catch(SQLException ex2){
            JOptionPane.showMessageDialog(null, "Seleccione un proyecto.");
            ex2.getStackTrace();
        }
    }
    
    public void actualizarNotaObra(String nuevaNota, String proyecto, String autor, String obra){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id1 = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+autor+"' AND ID_Proyecto = "+id1);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                int id2 = res2.getInt("ID_Autor");
                res2.close();
                try{
                    PreparedStatement pstm = this.getConexion().prepareStatement("UPDATE Obras SET Nota = '"+nuevaNota+"' WHERE Titulo = '"+obra+"' AND ID_Autor = "+id2);
                    pstm.execute();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Nota actualizada.");
                }catch(SQLException ex1){
                    JOptionPane.showMessageDialog(null, "Seleccione una obra.");
                    ex1.getStackTrace();
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "Seleccione un autor.");
                ex2.getStackTrace();
            }
        }catch(SQLException ex3){
            JOptionPane.showMessageDialog(null, "Seleccione un proyecto.");
            ex3.getStackTrace();
        }
    }
    
    public void actualizarNotaRutaEnlace(String nuevaRuta, String nuevaNota, String proyecto, String autor, String enlace){
        try{
            PreparedStatement pstm1 = this.getConexion().prepareStatement("SELECT ID_Proyecto FROM Proyectos WHERE Nombre = '"+proyecto+"'");
            ResultSet res1 = pstm1.executeQuery();
            res1.next();
            int id1 = res1.getInt("ID_Proyecto");
            res1.close();
            try{
                PreparedStatement pstm2 = this.getConexion().prepareStatement("SELECT ID_Autor FROM Autores WHERE Nombre = '"+autor+"' AND ID_Proyecto = "+id1);
                ResultSet res2 = pstm2.executeQuery();
                res2.next();
                int id2 = res2.getInt("ID_Autor");
                res2.close();
                try{
                    PreparedStatement pstm = this.getConexion().prepareStatement("UPDATE Enlaces SET Nota = '"+nuevaNota+"', Ruta = '"+nuevaRuta+"' WHERE Nombre = '"+enlace+"' AND ID_Autor = "+id2);
                    pstm.execute();
                    pstm.close();
                    JOptionPane.showMessageDialog(null, "Nota y ruta actualizadas.");
                }catch(SQLException ex1){
                    JOptionPane.showMessageDialog(null, "Seleccione un enlace.");
                    ex1.getStackTrace();
                }
            }catch(SQLException ex2){
                JOptionPane.showMessageDialog(null, "Seleccione un autor.");
                ex2.getStackTrace();
            }
        }catch(SQLException ex3){
            JOptionPane.showMessageDialog(null, "Seleccione un proyecto.");
            ex3.getStackTrace();
        }
    }
}
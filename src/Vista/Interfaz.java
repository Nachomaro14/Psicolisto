package Vista;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        autores.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        obras.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        enlaces.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        nuevoProyecto.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        nuevoAutor.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        nuevaObra.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        nuevoEnlace.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        eliminarProyecto.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        eliminarAutor.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        eliminarObra.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        eliminarEnlace.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nuevoProyecto = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreNuevoProyecto = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtNotaNuevoProyecto = new javax.swing.JTextPane();
        btnAceptarNuevoProyecto = new javax.swing.JButton();
        btnCancelarNuevoProyecto = new javax.swing.JButton();
        eliminarProyecto = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        btnSiEliminarProyecto = new javax.swing.JButton();
        btnNoEliminarProyecto = new javax.swing.JButton();
        autores = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAutores = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        notaAutores = new javax.swing.JTextPane();
        btnAñadirAutor = new javax.swing.JButton();
        btnEliminarAutor = new javax.swing.JButton();
        btnObras = new javax.swing.JButton();
        btnEnlaces = new javax.swing.JButton();
        btnSalirAutores = new javax.swing.JButton();
        btnModificarAutor = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        txtAutorSeleccionado = new javax.swing.JLabel();
        txtApellidosAutorSeleccionado = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        nuevoAutor = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreNuevoAutor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidosNuevoAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCorrienteNuevoAutor = new javax.swing.JTextField();
        txtFechaNacimientoNuevoAutor = new javax.swing.JFormattedTextField();
        txtFechaDefuncionNuevoAutor = new javax.swing.JFormattedTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtNotaNuevoAutor = new javax.swing.JTextPane();
        btnAceptarNuevoAutor = new javax.swing.JButton();
        btnCancelarNuevoAutor = new javax.swing.JButton();
        eliminarAutor = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        btnSiEliminarAutor = new javax.swing.JButton();
        btnNoEliminarAutor = new javax.swing.JButton();
        obras = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaObras = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        notaObras = new javax.swing.JTextPane();
        btnAñadirObra = new javax.swing.JButton();
        btnEliminarObra = new javax.swing.JButton();
        btnSalirObras = new javax.swing.JButton();
        btnModificarObra = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtObraSeleccionada = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        nuevaObra = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtTituloNuevaObra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTemaNuevaObra = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtFechaPublicacionNuevaObra = new javax.swing.JFormattedTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtNotaNuevaObra = new javax.swing.JTextPane();
        btnAceptarNuevaObra = new javax.swing.JButton();
        btnCancelarNuevaObra = new javax.swing.JButton();
        eliminarObra = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        btnSiEliminarObra = new javax.swing.JButton();
        btnNoEliminarObra = new javax.swing.JButton();
        enlaces = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaEnlaces = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        notaEnlaces = new javax.swing.JTextPane();
        btnAñadirEnlace = new javax.swing.JButton();
        btnEliminarEnlace = new javax.swing.JButton();
        btnSalirEnlaces = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        rutaEnlaces = new javax.swing.JTextPane();
        btnModificarEnlace = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtEnlaceSeleccionado = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        nuevoEnlace = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtNombreNuevoEnlace = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtRutaNuevoEnlace = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtTemaNuevoEnlace = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtNotaNuevoEnlace = new javax.swing.JTextPane();
        btnAceptarNuevoEnlace = new javax.swing.JButton();
        btnCancelarNuevoEnlace = new javax.swing.JButton();
        eliminarEnlace = new javax.swing.JDialog();
        jLabel20 = new javax.swing.JLabel();
        btnSiEliminarEnlace = new javax.swing.JButton();
        btnNoEliminarEnlace = new javax.swing.JButton();
        proyectos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProyectos = new javax.swing.JTable();
        btnAccederProyecto = new javax.swing.JButton();
        btnSalirInterfaz = new javax.swing.JButton();
        btnNuevoProyecto = new javax.swing.JButton();
        btnEliminarProyecto = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        notaProyectos = new javax.swing.JTextPane();
        btnModificarProyecto = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtProyectoSeleccionado = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();

        nuevoProyecto.setResizable(false);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Proyecto"));

        jLabel1.setText("Nombre:");

        jLabel2.setText("Nota:");

        jScrollPane10.setViewportView(txtNotaNuevoProyecto);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreNuevoProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane10))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAceptarNuevoProyecto.setText("Aceptar");

        btnCancelarNuevoProyecto.setText("Cancelar");

        javax.swing.GroupLayout nuevoProyectoLayout = new javax.swing.GroupLayout(nuevoProyecto.getContentPane());
        nuevoProyecto.getContentPane().setLayout(nuevoProyectoLayout);
        nuevoProyectoLayout.setHorizontalGroup(
            nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoProyectoLayout.createSequentialGroup()
                        .addComponent(btnAceptarNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnCancelarNuevoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        nuevoProyectoLayout.setVerticalGroup(
            nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarNuevoProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnAceptarNuevoProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        eliminarProyecto.setResizable(false);

        jLabel3.setText("¿Estás seguro de que deseas eliminar el proyecto?");

        btnSiEliminarProyecto.setText("SÍ");

        btnNoEliminarProyecto.setText("NO");

        javax.swing.GroupLayout eliminarProyectoLayout = new javax.swing.GroupLayout(eliminarProyecto.getContentPane());
        eliminarProyecto.getContentPane().setLayout(eliminarProyectoLayout);
        eliminarProyectoLayout.setHorizontalGroup(
            eliminarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProyectoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel3)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(eliminarProyectoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnSiEliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNoEliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        eliminarProyectoLayout.setVerticalGroup(
            eliminarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarProyectoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(eliminarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiEliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoEliminarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        autores.setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Autores"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaAutores);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 1006, 376));

        notaAutores.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));
        jScrollPane3.setViewportView(notaAutores);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 449, 1006, 144));

        btnAñadirAutor.setText("Añadir Autor");
        jPanel1.add(btnAñadirAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 611, 131, 40));

        btnEliminarAutor.setText("Eliminar Autor");
        jPanel1.add(btnEliminarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 611, 131, 40));

        btnObras.setText("Obras");
        jPanel1.add(btnObras, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 611, 145, 40));

        btnEnlaces.setText("Enlaces");
        jPanel1.add(btnEnlaces, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 611, 145, 40));

        btnSalirAutores.setText("Salir");
        jPanel1.add(btnSalirAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(803, 611, 219, 40));

        btnModificarAutor.setText("Modificar");
        jPanel1.add(btnModificarAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 611, 145, 40));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Autor:");
        jLabel23.setOpaque(true);
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 409, -1, -1));

        txtAutorSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        txtAutorSeleccionado.setOpaque(true);
        jPanel1.add(txtAutorSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 409, 960, 14));

        txtApellidosAutorSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidosAutorSeleccionado.setOpaque(true);
        jPanel1.add(txtApellidosAutorSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 429, 960, 14));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marc2.JPG"))); // NOI18N
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 1040, 650));

        javax.swing.GroupLayout autoresLayout = new javax.swing.GroupLayout(autores.getContentPane());
        autores.getContentPane().setLayout(autoresLayout);
        autoresLayout.setHorizontalGroup(
            autoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(autoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        autoresLayout.setVerticalGroup(
            autoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, autoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        nuevoAutor.setResizable(false);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Autor"));

        jLabel4.setText("Nombre:");

        jLabel5.setText("Nota:");

        jLabel6.setText("Apellidos:");

        jLabel7.setText("Fecha de nacimiento:");

        jLabel8.setText("Fecha de defunción:");

        jLabel9.setText("Corriente:");

        try {
            txtFechaNacimientoNuevoAutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFechaDefuncionNuevoAutor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane11.setViewportView(txtNotaNuevoAutor);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane11))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreNuevoAutor)
                            .addComponent(txtCorrienteNuevoAutor)
                            .addComponent(txtApellidosNuevoAutor)
                            .addComponent(txtFechaNacimientoNuevoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                            .addComponent(txtFechaDefuncionNuevoAutor))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidosNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaNacimientoNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaDefuncionNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorrienteNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAceptarNuevoAutor.setText("Aceptar");

        btnCancelarNuevoAutor.setText("Cancelar");

        javax.swing.GroupLayout nuevoAutorLayout = new javax.swing.GroupLayout(nuevoAutor.getContentPane());
        nuevoAutor.getContentPane().setLayout(nuevoAutorLayout);
        nuevoAutorLayout.setHorizontalGroup(
            nuevoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoAutorLayout.createSequentialGroup()
                        .addComponent(btnAceptarNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        nuevoAutorLayout.setVerticalGroup(
            nuevoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nuevoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptarNuevoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnCancelarNuevoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        eliminarAutor.setResizable(false);

        jLabel10.setText("¿Estás seguro de que deseas eliminar el autor?");

        btnSiEliminarAutor.setText("SÍ");

        btnNoEliminarAutor.setText("NO");

        javax.swing.GroupLayout eliminarAutorLayout = new javax.swing.GroupLayout(eliminarAutor.getContentPane());
        eliminarAutor.getContentPane().setLayout(eliminarAutorLayout);
        eliminarAutorLayout.setHorizontalGroup(
            eliminarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarAutorLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnSiEliminarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnNoEliminarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarAutorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(76, 76, 76))
        );
        eliminarAutorLayout.setVerticalGroup(
            eliminarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarAutorLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addGroup(eliminarAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiEliminarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoEliminarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        obras.setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Obras"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaObras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaObras);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 586, 376));

        notaObras.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));
        jScrollPane5.setViewportView(notaObras);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 52, 392, 224));

        btnAñadirObra.setText("Añadir Obra");
        jPanel2.add(btnAñadirObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 294, 184, 40));

        btnEliminarObra.setText("Eliminar Obra");
        jPanel2.add(btnEliminarObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 294, 182, 40));

        btnSalirObras.setText("Salir");
        jPanel2.add(btnSalirObras, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 363, 182, 40));

        btnModificarObra.setText("Modificar");
        jPanel2.add(btnModificarObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 363, 184, 40));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Obra:");
        jLabel21.setOpaque(true);
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 27, -1, -1));

        txtObraSeleccionada.setBackground(new java.awt.Color(255, 255, 255));
        txtObraSeleccionada.setOpaque(true);
        jPanel2.add(txtObraSeleccionada, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 27, 350, 14));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marc3.jpg"))); // NOI18N
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, 1030, 410));

        javax.swing.GroupLayout obrasLayout = new javax.swing.GroupLayout(obras.getContentPane());
        obras.getContentPane().setLayout(obrasLayout);
        obrasLayout.setHorizontalGroup(
            obrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        obrasLayout.setVerticalGroup(
            obrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(obrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        nuevaObra.setResizable(false);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Obra"));

        jLabel11.setText("Título:");

        jLabel12.setText("Año de publicación:");

        jLabel13.setText("Tema:");

        jLabel14.setText("Nota:");

        try {
            txtFechaPublicacionNuevaObra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jScrollPane12.setViewportView(txtNotaNuevaObra);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTemaNuevaObra, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtTituloNuevaObra)
                            .addComponent(txtFechaPublicacionNuevaObra))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTituloNuevaObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtFechaPublicacionNuevaObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTemaNuevaObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAceptarNuevaObra.setText("Aceptar");

        btnCancelarNuevaObra.setText("Cancelar");

        javax.swing.GroupLayout nuevaObraLayout = new javax.swing.GroupLayout(nuevaObra.getContentPane());
        nuevaObra.getContentPane().setLayout(nuevaObraLayout);
        nuevaObraLayout.setHorizontalGroup(
            nuevaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevaObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevaObraLayout.createSequentialGroup()
                        .addComponent(btnAceptarNuevaObra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(btnCancelarNuevaObra, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        nuevaObraLayout.setVerticalGroup(
            nuevaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevaObraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(nuevaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarNuevaObra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(btnAceptarNuevaObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        eliminarObra.setResizable(false);

        jLabel15.setText("¿Estás seguro de que deseas eliminar la obra?");

        btnSiEliminarObra.setText("SÍ");

        btnNoEliminarObra.setText("NO");

        javax.swing.GroupLayout eliminarObraLayout = new javax.swing.GroupLayout(eliminarObra.getContentPane());
        eliminarObra.getContentPane().setLayout(eliminarObraLayout);
        eliminarObraLayout.setHorizontalGroup(
            eliminarObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarObraLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnSiEliminarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnNoEliminarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(eliminarObraLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        eliminarObraLayout.setVerticalGroup(
            eliminarObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarObraLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(27, 27, 27)
                .addGroup(eliminarObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiEliminarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoEliminarObra, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        enlaces.setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Enlaces"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEnlaces.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablaEnlaces);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, 586, 249));

        notaEnlaces.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));
        jScrollPane7.setViewportView(notaEnlaces);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 52, 392, 224));

        btnAñadirEnlace.setText("Añadir Enlace");
        jPanel3.add(btnAñadirEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 294, 184, 40));

        btnEliminarEnlace.setText("Eliminar Enlace");
        jPanel3.add(btnEliminarEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 294, 182, 40));

        btnSalirEnlaces.setText("Salir");
        jPanel3.add(btnSalirEnlaces, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 363, 182, 40));

        rutaEnlaces.setBorder(javax.swing.BorderFactory.createTitledBorder("Ruta"));
        jScrollPane8.setViewportView(rutaEnlaces);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 294, 586, 109));

        btnModificarEnlace.setText("Modificar");
        jPanel3.add(btnModificarEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 363, 184, 40));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Enlace:");
        jLabel22.setOpaque(true);
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 27, -1, -1));

        txtEnlaceSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        txtEnlaceSeleccionado.setOpaque(true);
        jPanel3.add(txtEnlaceSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 27, 340, 14));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marc4.jpg"))); // NOI18N
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1020, 390));

        javax.swing.GroupLayout enlacesLayout = new javax.swing.GroupLayout(enlaces.getContentPane());
        enlaces.getContentPane().setLayout(enlacesLayout);
        enlacesLayout.setHorizontalGroup(
            enlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enlacesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        enlacesLayout.setVerticalGroup(
            enlacesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enlacesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        nuevoEnlace.setResizable(false);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Enlace"));

        jLabel16.setText("Nombre:");

        jLabel17.setText("Ruta:");

        jLabel18.setText("Tema:");

        jLabel19.setText("Nota:");

        jScrollPane13.setViewportView(txtNotaNuevoEnlace);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRutaNuevoEnlace)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTemaNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 506, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane13)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtNombreNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtRutaNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtTemaNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAceptarNuevoEnlace.setText("Aceptar");
        btnAceptarNuevoEnlace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarNuevoEnlaceActionPerformed(evt);
            }
        });

        btnCancelarNuevoEnlace.setText("Cancelar");

        javax.swing.GroupLayout nuevoEnlaceLayout = new javax.swing.GroupLayout(nuevoEnlace.getContentPane());
        nuevoEnlace.getContentPane().setLayout(nuevoEnlaceLayout);
        nuevoEnlaceLayout.setHorizontalGroup(
            nuevoEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoEnlaceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(nuevoEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nuevoEnlaceLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(nuevoEnlaceLayout.createSequentialGroup()
                        .addGap(0, 179, Short.MAX_VALUE)
                        .addComponent(btnAceptarNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnCancelarNuevoEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        nuevoEnlaceLayout.setVerticalGroup(
            nuevoEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoEnlaceLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(nuevoEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelarNuevoEnlace, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnAceptarNuevoEnlace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        eliminarEnlace.setResizable(false);

        jLabel20.setText("¿Estás seguro de que deseas eliminar el enlace?");

        btnSiEliminarEnlace.setText("SÍ");

        btnNoEliminarEnlace.setText("NO");

        javax.swing.GroupLayout eliminarEnlaceLayout = new javax.swing.GroupLayout(eliminarEnlace.getContentPane());
        eliminarEnlace.getContentPane().setLayout(eliminarEnlaceLayout);
        eliminarEnlaceLayout.setHorizontalGroup(
            eliminarEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarEnlaceLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnSiEliminarEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnNoEliminarEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, eliminarEnlaceLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(76, 76, 76))
        );
        eliminarEnlaceLayout.setVerticalGroup(
            eliminarEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarEnlaceLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel20)
                .addGap(27, 27, 27)
                .addGroup(eliminarEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiEliminarEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNoEliminarEnlace, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        proyectos.setBorder(javax.swing.BorderFactory.createTitledBorder("Proyectos"));
        proyectos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaProyectos);

        proyectos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 27, -1, 233));

        btnAccederProyecto.setText("Acceder");
        proyectos.add(btnAccederProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 282, 217, 35));

        btnSalirInterfaz.setText("Salir");
        proyectos.add(btnSalirInterfaz, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 333, 217, 35));

        btnNuevoProyecto.setText("Nuevo Proyecto");
        proyectos.add(btnNuevoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 282, 217, 35));

        btnEliminarProyecto.setText("Eliminar Proyecto");
        proyectos.add(btnEliminarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 333, 217, 35));

        notaProyectos.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));
        jScrollPane9.setViewportView(notaProyectos);

        proyectos.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 47, 242, 270));

        btnModificarProyecto.setText("Modificar");
        proyectos.add(btnModificarProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 333, 252, 35));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Proyecto:");
        jLabel24.setOpaque(true);
        proyectos.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 27, -1, -1));

        txtProyectoSeleccionado.setBackground(new java.awt.Color(255, 255, 255));
        txtProyectoSeleccionado.setOpaque(true);
        proyectos.add(txtProyectoSeleccionado, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 27, 190, 14));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Marc1.jpg"))); // NOI18N
        proyectos.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 760, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarNuevoEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarNuevoEnlaceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarNuevoEnlaceActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog autores;
    public javax.swing.JButton btnAccederProyecto;
    public javax.swing.JButton btnAceptarNuevaObra;
    public javax.swing.JButton btnAceptarNuevoAutor;
    public javax.swing.JButton btnAceptarNuevoEnlace;
    public javax.swing.JButton btnAceptarNuevoProyecto;
    public javax.swing.JButton btnAñadirAutor;
    public javax.swing.JButton btnAñadirEnlace;
    public javax.swing.JButton btnAñadirObra;
    public javax.swing.JButton btnCancelarNuevaObra;
    public javax.swing.JButton btnCancelarNuevoAutor;
    public javax.swing.JButton btnCancelarNuevoEnlace;
    public javax.swing.JButton btnCancelarNuevoProyecto;
    public javax.swing.JButton btnEliminarAutor;
    public javax.swing.JButton btnEliminarEnlace;
    public javax.swing.JButton btnEliminarObra;
    public javax.swing.JButton btnEliminarProyecto;
    public javax.swing.JButton btnEnlaces;
    public javax.swing.JButton btnModificarAutor;
    public javax.swing.JButton btnModificarEnlace;
    public javax.swing.JButton btnModificarObra;
    public javax.swing.JButton btnModificarProyecto;
    public javax.swing.JButton btnNoEliminarAutor;
    public javax.swing.JButton btnNoEliminarEnlace;
    public javax.swing.JButton btnNoEliminarObra;
    public javax.swing.JButton btnNoEliminarProyecto;
    public javax.swing.JButton btnNuevoProyecto;
    public javax.swing.JButton btnObras;
    public javax.swing.JButton btnSalirAutores;
    public javax.swing.JButton btnSalirEnlaces;
    public javax.swing.JButton btnSalirInterfaz;
    public javax.swing.JButton btnSalirObras;
    public javax.swing.JButton btnSiEliminarAutor;
    public javax.swing.JButton btnSiEliminarEnlace;
    public javax.swing.JButton btnSiEliminarObra;
    public javax.swing.JButton btnSiEliminarProyecto;
    public javax.swing.JDialog eliminarAutor;
    public javax.swing.JDialog eliminarEnlace;
    public javax.swing.JDialog eliminarObra;
    public javax.swing.JDialog eliminarProyecto;
    public javax.swing.JDialog enlaces;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    public javax.swing.JTextPane notaAutores;
    public javax.swing.JTextPane notaEnlaces;
    public javax.swing.JTextPane notaObras;
    public javax.swing.JTextPane notaProyectos;
    public javax.swing.JDialog nuevaObra;
    public javax.swing.JDialog nuevoAutor;
    public javax.swing.JDialog nuevoEnlace;
    public javax.swing.JDialog nuevoProyecto;
    public javax.swing.JDialog obras;
    public javax.swing.JPanel proyectos;
    public javax.swing.JTextPane rutaEnlaces;
    public javax.swing.JTable tablaAutores;
    public javax.swing.JTable tablaEnlaces;
    public javax.swing.JTable tablaObras;
    public javax.swing.JTable tablaProyectos;
    public javax.swing.JLabel txtApellidosAutorSeleccionado;
    public javax.swing.JTextField txtApellidosNuevoAutor;
    public javax.swing.JLabel txtAutorSeleccionado;
    public javax.swing.JTextField txtCorrienteNuevoAutor;
    public javax.swing.JLabel txtEnlaceSeleccionado;
    public javax.swing.JFormattedTextField txtFechaDefuncionNuevoAutor;
    public javax.swing.JFormattedTextField txtFechaNacimientoNuevoAutor;
    public javax.swing.JFormattedTextField txtFechaPublicacionNuevaObra;
    public javax.swing.JTextField txtNombreNuevoAutor;
    public javax.swing.JTextField txtNombreNuevoEnlace;
    public javax.swing.JTextField txtNombreNuevoProyecto;
    public javax.swing.JTextPane txtNotaNuevaObra;
    public javax.swing.JTextPane txtNotaNuevoAutor;
    public javax.swing.JTextPane txtNotaNuevoEnlace;
    public javax.swing.JTextPane txtNotaNuevoProyecto;
    public javax.swing.JLabel txtObraSeleccionada;
    public javax.swing.JLabel txtProyectoSeleccionado;
    public javax.swing.JTextField txtRutaNuevoEnlace;
    public javax.swing.JTextField txtTemaNuevaObra;
    public javax.swing.JTextField txtTemaNuevoEnlace;
    public javax.swing.JTextField txtTituloNuevaObra;
    // End of variables declaration//GEN-END:variables
}
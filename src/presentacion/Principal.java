package presentacion;

import conexion.ConexionBD;
import controladores.ControllerObra;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import modelo.Obra;

/**
 *
 * @author tolis
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        setResizable(false);
        ocultarVentanas();
    }

    //OPCIONES OBRA   
    public boolean consultarObrasFlag;
    public boolean consultarObraFlag;
    public boolean crearObraFlag;
    public boolean modificarObraFlag;
    public boolean eliminarObraFlag;
    public boolean repHerramientasEnObraFlag;

    public void inhabilitarBanderasObra() {
        consultarObrasFlag = false;
        consultarObraFlag = false;
        crearObraFlag = false;
        modificarObraFlag = false;
        eliminarObraFlag = false;
        repHerramientasEnObraFlag = false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        ventanaCargo = new javax.swing.JInternalFrame();
        labelTituloCargo = new javax.swing.JLabel();
        labelOperacionCargo = new javax.swing.JLabel();
        labelNombreCargo = new javax.swing.JLabel();
        btEjecutarCargo = new javax.swing.JButton();
        tfNombreCargo = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        menuOpcionesCargo = new javax.swing.JMenuBar();
        opcionConsultarCargo = new javax.swing.JMenu();
        consultarCargos = new javax.swing.JMenu();
        consultarCargo = new javax.swing.JMenu();
        opcionCrearCargo = new javax.swing.JMenu();
        opcionModificarCargo = new javax.swing.JMenu();
        opcionEliminarCargo = new javax.swing.JMenu();
        ventanaEmpleado = new javax.swing.JInternalFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        tatablaEmpelado = new javax.swing.JTable();
        labelTituloEmpelado = new javax.swing.JLabel();
        labelOperacionEmpleado = new javax.swing.JLabel();
        labelReportesEmpelado = new javax.swing.JLabel();
        labelIdEmpleado = new javax.swing.JLabel();
        labelNombresEmpleado = new javax.swing.JLabel();
        labelApellidosEmpleado = new javax.swing.JLabel();
        labelCargoEmpleado = new javax.swing.JLabel();
        labelFotoEmpleado = new javax.swing.JLabel();
        tfIdEmpleado = new javax.swing.JTextField();
        tfNombresEmpelado = new javax.swing.JTextField();
        cbCargoEmpelado = new javax.swing.JComboBox<>();
        tfApellidosEmpleado = new javax.swing.JTextField();
        labelImagenEmpleado = new javax.swing.JLabel();
        btEjecutarEmpleado = new javax.swing.JButton();
        btReporteHerramientasACargo = new javax.swing.JButton();
        btTomarFotoEmpelado = new javax.swing.JButton();
        menuOpcionEmpleado = new javax.swing.JMenuBar();
        opcionConsultarEmpleado = new javax.swing.JMenu();
        consultarEmpleados = new javax.swing.JMenuItem();
        consultarEmpleado = new javax.swing.JMenuItem();
        opcionCrearEmpleado = new javax.swing.JMenu();
        opcionModificarEmpelado = new javax.swing.JMenu();
        opcionEliminarEmpleado = new javax.swing.JMenu();
        ventanaHerramienta = new javax.swing.JInternalFrame();
        labelTituloHerramienta = new javax.swing.JLabel();
        labelIdHerramienta = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelLugarCompra = new javax.swing.JLabel();
        labelPrecioCompra = new javax.swing.JLabel();
        labelResponsable = new javax.swing.JLabel();
        labelReportesHerramienta = new javax.swing.JLabel();
        tfIdHerramienta = new javax.swing.JTextField();
        tfNombreHerramienta = new javax.swing.JTextField();
        tfLugarCompraHerramienta = new javax.swing.JTextField();
        tfPrecioCompraHerramienta = new javax.swing.JTextField();
        cbResponsableerramienta = new javax.swing.JComboBox<>();
        labelEstadoHerramienta = new javax.swing.JLabel();
        labelFoto = new javax.swing.JLabel();
        labelFechaCompra = new javax.swing.JLabel();
        tfFechaCompraHerramienta = new javax.swing.JTextField();
        btRepoTiempoVida = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHerramienta = new javax.swing.JTable();
        btTomarFoto = new javax.swing.JButton();
        btEjecutarHerramienta = new javax.swing.JButton();
        labelOperacionHerramienta = new javax.swing.JLabel();
        menuOpcionesHerramientas = new javax.swing.JMenuBar();
        opcionConsultarHerramienta = new javax.swing.JMenu();
        consultarHerramientas = new javax.swing.JMenu();
        consultarHerramienta = new javax.swing.JMenu();
        opcionCrearHerramienta = new javax.swing.JMenu();
        opcionModificarHerramienta = new javax.swing.JMenu();
        opcionEliminarHerramienta = new javax.swing.JMenu();
        opcionMovimiento = new javax.swing.JMenu();
        entradaObra = new javax.swing.JMenu();
        salidaObra = new javax.swing.JMenu();
        ventanaObra = new javax.swing.JInternalFrame();
        labelTituloObra = new javax.swing.JLabel();
        labelIdObra = new javax.swing.JLabel();
        labelNombreObra = new javax.swing.JLabel();
        labelDireccionObra = new javax.swing.JLabel();
        tfIdObra = new javax.swing.JTextField();
        tfNombreObra = new javax.swing.JTextField();
        tfUbicacionObra = new javax.swing.JTextField();
        btEjecutarConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaObras = new javax.swing.JTable();
        labelOperacionObra = new javax.swing.JLabel();
        labelReportesObra = new javax.swing.JLabel();
        btRepHerramientasEnObra = new javax.swing.JButton();
        menuOpcionesObra = new javax.swing.JMenuBar();
        opcionConsultarObra = new javax.swing.JMenu();
        consultarObras = new javax.swing.JMenuItem();
        consultarObra = new javax.swing.JMenuItem();
        opcionCrearObra = new javax.swing.JMenu();
        opcionModificarObra = new javax.swing.JMenu();
        opcionEliminarObra = new javax.swing.JMenu();
        menuElementos = new javax.swing.JMenuBar();
        menuObra = new javax.swing.JMenu();
        menuEmpleado = new javax.swing.JMenu();
        menuHerramienta = new javax.swing.JMenu();
        menuCargo = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DE HERRAMIENTAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ventanaCargo.setMaximumSize(new java.awt.Dimension(700, 756));
        ventanaCargo.setPreferredSize(new java.awt.Dimension(700, 756));
        ventanaCargo.setVisible(true);

        labelTituloCargo.setText("jLabel1");

        labelOperacionCargo.setText("jLabel2");

        labelNombreCargo.setText("jLabel4");

        btEjecutarCargo.setText("jButton1");

        tfNombreCargo.setText("jTextField2");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(jTable1);

        opcionConsultarCargo.setText("File");

        consultarCargos.setText("jMenu5");
        opcionConsultarCargo.add(consultarCargos);

        consultarCargo.setText("jMenu6");
        opcionConsultarCargo.add(consultarCargo);

        menuOpcionesCargo.add(opcionConsultarCargo);

        opcionCrearCargo.setText("Edit");
        menuOpcionesCargo.add(opcionCrearCargo);

        opcionModificarCargo.setText("jMenu3");
        menuOpcionesCargo.add(opcionModificarCargo);

        opcionEliminarCargo.setText("jMenu4");
        menuOpcionesCargo.add(opcionEliminarCargo);

        ventanaCargo.setJMenuBar(menuOpcionesCargo);

        javax.swing.GroupLayout ventanaCargoLayout = new javax.swing.GroupLayout(ventanaCargo.getContentPane());
        ventanaCargo.getContentPane().setLayout(ventanaCargoLayout);
        ventanaCargoLayout.setHorizontalGroup(
            ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaCargoLayout.createSequentialGroup()
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ventanaCargoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEjecutarCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaCargoLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaCargoLayout.createSequentialGroup()
                                .addComponent(labelTituloCargo)
                                .addGap(137, 137, 137)
                                .addComponent(labelOperacionCargo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ventanaCargoLayout.createSequentialGroup()
                                .addComponent(labelNombreCargo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(891, 891, 891))
            .addGroup(ventanaCargoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaCargoLayout.setVerticalGroup(
            ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaCargoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloCargo)
                    .addComponent(labelOperacionCargo))
                .addGap(74, 74, 74)
                .addGroup(ventanaCargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreCargo)
                    .addComponent(tfNombreCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btEjecutarCargo)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ventanaEmpleado.setPreferredSize(new java.awt.Dimension(1256, 756));
        ventanaEmpleado.setVisible(true);

        tatablaEmpelado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tatablaEmpelado);

        labelTituloEmpelado.setText("EMPLEADOS");

        labelReportesEmpelado.setText("REPORTES");

        labelIdEmpleado.setText("Identificación");

        labelNombresEmpleado.setText("Nombres");

        labelApellidosEmpleado.setText("Apellidos");

        labelCargoEmpleado.setText("Cargo");

        labelFotoEmpleado.setText("Foto");

        cbCargoEmpelado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tfApellidosEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfApellidosEmpleadoActionPerformed(evt);
            }
        });

        labelImagenEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btEjecutarEmpleado.setText("EJECUTAR");

        btReporteHerramientasACargo.setText("HERRAMIENTAS A CARGO");

        btTomarFotoEmpelado.setText("TOMAR FOTO");

        opcionConsultarEmpleado.setText("Consultar");

        consultarEmpleados.setText("Todos los Empleados");
        opcionConsultarEmpleado.add(consultarEmpleados);

        consultarEmpleado.setText("Empleado");
        opcionConsultarEmpleado.add(consultarEmpleado);

        menuOpcionEmpleado.add(opcionConsultarEmpleado);

        opcionCrearEmpleado.setText("Crear");
        menuOpcionEmpleado.add(opcionCrearEmpleado);

        opcionModificarEmpelado.setText("Modificar");
        menuOpcionEmpleado.add(opcionModificarEmpelado);

        opcionEliminarEmpleado.setText("Eliminar");
        menuOpcionEmpleado.add(opcionEliminarEmpleado);

        ventanaEmpleado.setJMenuBar(menuOpcionEmpleado);

        javax.swing.GroupLayout ventanaEmpleadoLayout = new javax.swing.GroupLayout(ventanaEmpleado.getContentPane());
        ventanaEmpleado.getContentPane().setLayout(ventanaEmpleadoLayout);
        ventanaEmpleadoLayout.setHorizontalGroup(
            ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIdEmpleado)
                                    .addComponent(labelCargoEmpleado)
                                    .addComponent(labelApellidosEmpleado)
                                    .addComponent(labelNombresEmpleado))
                                .addGap(84, 84, 84)
                                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btEjecutarEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(tfIdEmpleado)
                                    .addComponent(tfNombresEmpelado)
                                    .addComponent(cbCargoEmpelado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tfApellidosEmpleado)))
                            .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                                .addComponent(labelTituloEmpelado)
                                .addGap(102, 102, 102)
                                .addComponent(labelOperacionEmpleado)))
                        .addGap(87, 87, 87)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelFotoEmpleado)
                            .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btTomarFotoEmpelado, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelImagenEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(89, 89, 89)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btReporteHerramientasACargo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelReportesEmpelado))))
                .addContainerGap())
        );
        ventanaEmpleadoLayout.setVerticalGroup(
            ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmpleadoLayout.createSequentialGroup()
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTituloEmpelado)
                            .addComponent(labelOperacionEmpleado)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ventanaEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelFotoEmpleado)
                            .addComponent(labelReportesEmpelado))))
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelIdEmpleado)
                            .addComponent(tfIdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombresEmpleado)
                            .addComponent(tfNombresEmpelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelApellidosEmpleado)
                            .addComponent(tfApellidosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCargoEmpelado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCargoEmpleado)))
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelImagenEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ventanaEmpleadoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btReporteHerramientasACargo)))
                .addGap(18, 18, 18)
                .addGroup(ventanaEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTomarFotoEmpelado)
                    .addComponent(btEjecutarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        ventanaHerramienta.setPreferredSize(new java.awt.Dimension(1256, 752));
        ventanaHerramienta.setVisible(true);

        labelTituloHerramienta.setText("HERRAMIENTA");

        labelIdHerramienta.setText("Referencia");

        labelNombre.setText("Nombre");

        labelLugarCompra.setText("Lugar de compra");

        labelPrecioCompra.setText("Precio de compra");

        labelResponsable.setText("Responsable");

        labelReportesHerramienta.setText("REPORTES");

        tfLugarCompraHerramienta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLugarCompraHerramientaActionPerformed(evt);
            }
        });

        cbResponsableerramienta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        labelEstadoHerramienta.setText("Estado");

        labelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelFechaCompra.setText("Fecha de compra");

        tfFechaCompraHerramienta.setToolTipText("MM/DD/AA");

        btRepoTiempoVida.setText("TIEMPO DE VIDA");

        tablaHerramienta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaHerramienta);

        btTomarFoto.setText("TOMAR FOTO");

        btEjecutarHerramienta.setText("EJECUTAR");

        opcionConsultarHerramienta.setText("Consultar");

        consultarHerramientas.setText("Todas las herramientas");
        opcionConsultarHerramienta.add(consultarHerramientas);

        consultarHerramienta.setText("Herramienta");
        opcionConsultarHerramienta.add(consultarHerramienta);

        menuOpcionesHerramientas.add(opcionConsultarHerramienta);

        opcionCrearHerramienta.setText("Crear");
        menuOpcionesHerramientas.add(opcionCrearHerramienta);

        opcionModificarHerramienta.setText("Modificar");
        menuOpcionesHerramientas.add(opcionModificarHerramienta);

        opcionEliminarHerramienta.setText("Eliminar");
        menuOpcionesHerramientas.add(opcionEliminarHerramienta);

        opcionMovimiento.setText("Movimiento");

        entradaObra.setText("Entrada a Obra");
        opcionMovimiento.add(entradaObra);

        salidaObra.setText("Salida de Obra");
        opcionMovimiento.add(salidaObra);

        menuOpcionesHerramientas.add(opcionMovimiento);

        ventanaHerramienta.setJMenuBar(menuOpcionesHerramientas);

        javax.swing.GroupLayout ventanaHerramientaLayout = new javax.swing.GroupLayout(ventanaHerramienta.getContentPane());
        ventanaHerramienta.getContentPane().setLayout(ventanaHerramientaLayout);
        ventanaHerramientaLayout.setHorizontalGroup(
            ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addComponent(labelTituloHerramienta)
                        .addGap(80, 80, 80)
                        .addComponent(labelOperacionHerramienta))
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelLugarCompra)
                                    .addComponent(labelPrecioCompra)
                                    .addComponent(labelResponsable))
                                .addGap(48, 48, 48)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPrecioCompraHerramienta)
                                    .addComponent(cbResponsableerramienta, 0, 272, Short.MAX_VALUE)
                                    .addComponent(tfLugarCompraHerramienta)))
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelIdHerramienta)
                                    .addComponent(labelNombre)
                                    .addComponent(labelFechaCompra))
                                .addGap(49, 49, 49)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIdHerramienta)
                                    .addComponent(tfNombreHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                                    .addComponent(tfFechaCompraHerramienta))))
                        .addGap(79, 79, 79)
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEstadoHerramienta)
                            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btTomarFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelReportesHerramienta)
                    .addComponent(btRepoTiempoVida))
                .addGap(242, 242, 242))
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(btEjecutarHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ventanaHerramientaLayout.setVerticalGroup(
            ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTituloHerramienta)
                    .addComponent(labelReportesHerramienta)
                    .addComponent(labelOperacionHerramienta))
                .addGap(18, 18, 18)
                .addComponent(labelEstadoHerramienta)
                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelIdHerramienta)
                                    .addComponent(tfIdHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombre)
                                    .addComponent(tfNombreHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelFechaCompra)
                                    .addComponent(tfFechaCompraHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelLugarCompra)
                                    .addComponent(tfLugarCompraHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelPrecioCompra)
                                    .addComponent(tfPrecioCompraHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(labelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaHerramientaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelResponsable)
                                .addComponent(cbResponsableerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btTomarFoto)))
                    .addGroup(ventanaHerramientaLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btRepoTiempoVida)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEjecutarHerramienta, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        ventanaObra.setVisible(true);

        labelTituloObra.setText("OBRA");

        labelIdObra.setText("Centro de Costo");

        labelNombreObra.setText("Nombre");

        labelDireccionObra.setText("Direccion");

        btEjecutarConsulta.setText("EJECUTAR");
        btEjecutarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEjecutarConsultaActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tablaObras);

        labelReportesObra.setText("REPORTES");

        btRepHerramientasEnObra.setText("HERRAMIENTAS EN OBRA");

        opcionConsultarObra.setText("Consultar");

        consultarObras.setText("Todas las obras");
        consultarObras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarObrasActionPerformed(evt);
            }
        });
        opcionConsultarObra.add(consultarObras);

        consultarObra.setText("Obra");
        consultarObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarObraActionPerformed(evt);
            }
        });
        opcionConsultarObra.add(consultarObra);

        menuOpcionesObra.add(opcionConsultarObra);

        opcionCrearObra.setText("Crear");
        opcionCrearObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionCrearObraMenuSelected(evt);
            }
        });
        menuOpcionesObra.add(opcionCrearObra);

        opcionModificarObra.setText("Modificar");
        opcionModificarObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionModificarObraMenuSelected(evt);
            }
        });
        menuOpcionesObra.add(opcionModificarObra);

        opcionEliminarObra.setText("Eliminar");
        opcionEliminarObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                opcionEliminarObraMenuSelected(evt);
            }
        });
        menuOpcionesObra.add(opcionEliminarObra);

        ventanaObra.setJMenuBar(menuOpcionesObra);

        javax.swing.GroupLayout ventanaObraLayout = new javax.swing.GroupLayout(ventanaObra.getContentPane());
        ventanaObra.getContentPane().setLayout(ventanaObraLayout);
        ventanaObraLayout.setHorizontalGroup(
            ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaObraLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1207, Short.MAX_VALUE)
                    .addGroup(ventanaObraLayout.createSequentialGroup()
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombreObra)
                            .addComponent(labelIdObra)
                            .addComponent(labelDireccionObra)
                            .addComponent(labelTituloObra))
                        .addGap(63, 63, 63)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOperacionObra)
                            .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNombreObra)
                                .addComponent(tfUbicacionObra)
                                .addComponent(tfIdObra)
                                .addComponent(btEjecutarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addGap(257, 257, 257)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelReportesObra)
                            .addComponent(btRepHerramientasEnObra, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaObraLayout.setVerticalGroup(
            ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelTituloObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelOperacionObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(labelReportesObra))
                .addGap(31, 31, 31)
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaObraLayout.createSequentialGroup()
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ventanaObraLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(labelIdObra)
                                .addGap(21, 21, 21)
                                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelNombreObra)
                                    .addComponent(tfNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btRepHerramientasEnObra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccionObra)
                            .addComponent(tfUbicacionObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfIdObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btEjecutarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        menuObra.setText("Obra");
        menuObra.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                menuObraMenuSelected(evt);
            }
        });
        menuElementos.add(menuObra);

        menuEmpleado.setText("Empleado");
        menuElementos.add(menuEmpleado);

        menuHerramienta.setText("Herramienta");
        menuElementos.add(menuHerramienta);

        menuCargo.setText("Cargo");
        menuElementos.add(menuCargo);

        setJMenuBar(menuElementos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaObra)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaObra)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaHerramienta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(ventanaCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1298, 847));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_menuObraMenuSelected
        ocultarVentanas();
        ventanaObra.setVisible(true);
        inhabilitarCamposObra();
    }//GEN-LAST:event_menuObraMenuSelected

    private void consultarObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarObraActionPerformed
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacionObra.setText("CONSULTAR");
        consultarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        btEjecutarConsulta.setEnabled(true);


    }//GEN-LAST:event_consultarObraActionPerformed

    private void opcionCrearObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionCrearObraMenuSelected
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacionObra.setText("CREAR");
        crearObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        tfNombreObra.setEnabled(true);
        tfNombreObra.setBackground(Color.white);
        tfUbicacionObra.setEnabled(true);
        tfUbicacionObra.setBackground(Color.white);
        btEjecutarConsulta.setEnabled(true);

// TODO add your handling code here:
    }//GEN-LAST:event_opcionCrearObraMenuSelected

    private void opcionModificarObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionModificarObraMenuSelected
        inhabilitarBanderasObra();
//        inhabilitarCamposObra();
        labelOperacionObra.setText("MODIFICAR");
        modificarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        tfNombreObra.setEnabled(true);
        tfNombreObra.setBackground(Color.white);
        tfUbicacionObra.setEnabled(true);
        tfUbicacionObra.setBackground(Color.white);
        btEjecutarConsulta.setEnabled(true);
    }//GEN-LAST:event_opcionModificarObraMenuSelected

    private void opcionEliminarObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionEliminarObraMenuSelected
        inhabilitarBanderasObra();
//        inhabilitarCamposObra();
        labelOperacionObra.setText("ELIMINAR");
        eliminarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        btEjecutarConsulta.setEnabled(true);
    }//GEN-LAST:event_opcionEliminarObraMenuSelected

    private void consultarObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarObrasActionPerformed
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacionObra.setText("CONSULTAR TODO");
        consultarObrasFlag = true;
        btEjecutarConsulta.setEnabled(true);

    }//GEN-LAST:event_consultarObrasActionPerformed

    private void btEjecutarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEjecutarConsultaActionPerformed
        if (consultarObrasFlag) {
            ControllerObra obraCt = new ControllerObra();
            obraCt.verObras(tablaObras);
            inhabilitarCamposObra();
        } else if (crearObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
            obra.setNombreObra(tfNombreObra.getText());
            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.registrar(obra);
            inhabilitarCamposObra();
        } else if (modificarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
            obra.setNombreObra(tfNombreObra.getText());
            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.actualizar(obra);
            inhabilitarCamposObra();
        } else if (eliminarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
//            obra.setNombreObra(tfNombreObra.getText());
//            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.eliminar(obra);
            inhabilitarCamposObra();
        } else if (consultarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
//            obra.setNombreObra(tfNombreObra.getText());
//            obra.setDireccionObra(tfUbicacionObra.getText());
//            obraCt.verObra(tablaObras, obra);
            obra = obraCt.consultarObra(obra);
            tfNombreObra.setText(obra.getNombreObra());
            tfUbicacionObra.setText(obra.getDireccionObra());
//            inhabilitarCamposObra();
        }
    }//GEN-LAST:event_btEjecutarConsultaActionPerformed

    private void tfLugarCompraHerramientaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLugarCompraHerramientaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLugarCompraHerramientaActionPerformed

    private void tfApellidosEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfApellidosEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfApellidosEmpleadoActionPerformed

    private void inhabilitarCamposObra() {
        tfIdObra.setEnabled(false);
        tfIdObra.setBackground(Color.gray);
        tfIdObra.setText("");
        tfNombreObra.setEnabled(false);
        tfNombreObra.setBackground(Color.gray);
        tfNombreObra.setText("");
        tfUbicacionObra.setEnabled(false);
        tfUbicacionObra.setBackground(Color.gray);
        tfUbicacionObra.setText("");
        btEjecutarConsulta.setEnabled(false);
        labelOperacionObra.setText("");
    }

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEjecutarCargo;
    private javax.swing.JButton btEjecutarConsulta;
    private javax.swing.JButton btEjecutarEmpleado;
    private javax.swing.JButton btEjecutarHerramienta;
    private javax.swing.JButton btRepHerramientasEnObra;
    private javax.swing.JButton btRepoTiempoVida;
    private javax.swing.JButton btReporteHerramientasACargo;
    private javax.swing.JButton btTomarFoto;
    private javax.swing.JButton btTomarFotoEmpelado;
    private javax.swing.JComboBox<String> cbCargoEmpelado;
    private javax.swing.JComboBox<String> cbResponsableerramienta;
    private javax.swing.JMenu consultarCargo;
    private javax.swing.JMenu consultarCargos;
    private javax.swing.JMenuItem consultarEmpleado;
    private javax.swing.JMenuItem consultarEmpleados;
    private javax.swing.JMenu consultarHerramienta;
    private javax.swing.JMenu consultarHerramientas;
    private javax.swing.JMenuItem consultarObra;
    private javax.swing.JMenuItem consultarObras;
    private javax.swing.JMenu entradaObra;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelApellidosEmpleado;
    private javax.swing.JLabel labelCargoEmpleado;
    private javax.swing.JLabel labelDireccionObra;
    private javax.swing.JLabel labelEstadoHerramienta;
    private javax.swing.JLabel labelFechaCompra;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel labelFotoEmpleado;
    private javax.swing.JLabel labelIdEmpleado;
    private javax.swing.JLabel labelIdHerramienta;
    private javax.swing.JLabel labelIdObra;
    private javax.swing.JLabel labelImagenEmpleado;
    private javax.swing.JLabel labelLugarCompra;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelNombreCargo;
    private javax.swing.JLabel labelNombreObra;
    private javax.swing.JLabel labelNombresEmpleado;
    private javax.swing.JLabel labelOperacionCargo;
    private javax.swing.JLabel labelOperacionEmpleado;
    private javax.swing.JLabel labelOperacionHerramienta;
    private javax.swing.JLabel labelOperacionObra;
    private javax.swing.JLabel labelPrecioCompra;
    private javax.swing.JLabel labelReportesEmpelado;
    private javax.swing.JLabel labelReportesHerramienta;
    private javax.swing.JLabel labelReportesObra;
    private javax.swing.JLabel labelResponsable;
    private javax.swing.JLabel labelTituloCargo;
    private javax.swing.JLabel labelTituloEmpelado;
    private javax.swing.JLabel labelTituloHerramienta;
    private javax.swing.JLabel labelTituloObra;
    private javax.swing.JMenu menuCargo;
    private javax.swing.JMenuBar menuElementos;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuHerramienta;
    private javax.swing.JMenu menuObra;
    private javax.swing.JMenuBar menuOpcionEmpleado;
    private javax.swing.JMenuBar menuOpcionesCargo;
    private javax.swing.JMenuBar menuOpcionesHerramientas;
    private javax.swing.JMenuBar menuOpcionesObra;
    private javax.swing.JMenu opcionConsultarCargo;
    private javax.swing.JMenu opcionConsultarEmpleado;
    private javax.swing.JMenu opcionConsultarHerramienta;
    private javax.swing.JMenu opcionConsultarObra;
    private javax.swing.JMenu opcionCrearCargo;
    private javax.swing.JMenu opcionCrearEmpleado;
    private javax.swing.JMenu opcionCrearHerramienta;
    private javax.swing.JMenu opcionCrearObra;
    private javax.swing.JMenu opcionEliminarCargo;
    private javax.swing.JMenu opcionEliminarEmpleado;
    private javax.swing.JMenu opcionEliminarHerramienta;
    private javax.swing.JMenu opcionEliminarObra;
    private javax.swing.JMenu opcionModificarCargo;
    private javax.swing.JMenu opcionModificarEmpelado;
    private javax.swing.JMenu opcionModificarHerramienta;
    private javax.swing.JMenu opcionModificarObra;
    private javax.swing.JMenu opcionMovimiento;
    private javax.swing.JMenu salidaObra;
    private javax.swing.JTable tablaHerramienta;
    private javax.swing.JTable tablaObras;
    private javax.swing.JTable tatablaEmpelado;
    private javax.swing.JTextField tfApellidosEmpleado;
    private javax.swing.JTextField tfFechaCompraHerramienta;
    private javax.swing.JTextField tfIdEmpleado;
    private javax.swing.JTextField tfIdHerramienta;
    private javax.swing.JTextField tfIdObra;
    private javax.swing.JTextField tfLugarCompraHerramienta;
    private javax.swing.JTextField tfNombreCargo;
    private javax.swing.JTextField tfNombreHerramienta;
    private javax.swing.JTextField tfNombreObra;
    private javax.swing.JTextField tfNombresEmpelado;
    private javax.swing.JTextField tfPrecioCompraHerramienta;
    private javax.swing.JTextField tfUbicacionObra;
    private javax.swing.JInternalFrame ventanaCargo;
    private javax.swing.JInternalFrame ventanaEmpleado;
    private javax.swing.JInternalFrame ventanaHerramienta;
    private javax.swing.JInternalFrame ventanaObra;
    // End of variables declaration//GEN-END:variables

    private void ocultarVentanas() {
        ventanaObra.dispose();
    }

    public static ResultSet getTabla(String consulta) {
        Connection con = ConexionBD.connect();
        Statement st;
        ResultSet datos = null;
        try {
            st = con.createStatement();
            datos = st.executeQuery(consulta);
        } catch (SQLException ex) {

        }
        return datos;
    }
}

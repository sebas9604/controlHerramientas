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
        labelOperacion = new javax.swing.JLabel();
        menuOpcionesObra = new javax.swing.JMenuBar();
        opcionConsultarObra = new javax.swing.JMenu();
        consultarObras = new javax.swing.JMenuItem();
        consultarObra = new javax.swing.JMenuItem();
        opcionCrearObra = new javax.swing.JMenu();
        opcionModificarObra = new javax.swing.JMenu();
        opcionEliminarObra = new javax.swing.JMenu();
        opcionReportes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuElementos = new javax.swing.JMenuBar();
        menuObra = new javax.swing.JMenu();
        menuEmpleado = new javax.swing.JMenu();
        menuHerramienta = new javax.swing.JMenu();
        menuMantenimiento = new javax.swing.JMenu();
        menuReportes = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONTROL DE HERRAMIENTAS");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        ventanaObra.setVisible(true);

        labelTituloObra.setText("OBRA");

        labelIdObra.setText("Identificacion");

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

        opcionReportes.setText("Reportes");

        jMenuItem1.setText("jMenuItem1");
        opcionReportes.add(jMenuItem1);

        menuOpcionesObra.add(opcionReportes);

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
                            .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNombreObra)
                                .addComponent(tfUbicacionObra)
                                .addComponent(tfIdObra)
                                .addComponent(btEjecutarConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addComponent(labelOperacion))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ventanaObraLayout.setVerticalGroup(
            ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaObraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelTituloObra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ventanaObraLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(labelIdObra)
                        .addGap(21, 21, 21)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombreObra)
                            .addComponent(tfNombreObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(ventanaObraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDireccionObra)
                            .addComponent(tfUbicacionObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tfIdObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btEjecutarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
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

        menuMantenimiento.setText("Mantenimiento");
        menuElementos.add(menuMantenimiento);

        menuReportes.setText("Reportes");
        menuElementos.add(menuReportes);

        setJMenuBar(menuElementos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaObra)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ventanaObra)
                .addContainerGap())
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
        labelOperacion.setText("CONSULTAR");
        consultarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        btEjecutarConsulta.setEnabled(true);


    }//GEN-LAST:event_consultarObraActionPerformed

    private void opcionCrearObraMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_opcionCrearObraMenuSelected
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacion.setText("CREAR");
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
        inhabilitarCamposObra();
        labelOperacion.setText("MODIFICAR");
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
        inhabilitarCamposObra();
        labelOperacion.setText("ELIMINAR");
        eliminarObraFlag = true;
        tfIdObra.setEnabled(true);
        tfIdObra.setBackground(Color.white);
        btEjecutarConsulta.setEnabled(true);
    }//GEN-LAST:event_opcionEliminarObraMenuSelected

    private void consultarObrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarObrasActionPerformed
        inhabilitarBanderasObra();
        inhabilitarCamposObra();
        labelOperacion.setText("CONSULTAR TODO");
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
            obra.setNombreObra(tfNombreObra.getText());
            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.eliminar(obra);
            inhabilitarCamposObra();
        } else if (consultarObraFlag) {
            Obra obra = new Obra();
            ControllerObra obraCt = new ControllerObra();
            obra.setIdObra(tfIdObra.getText());
            obra.setNombreObra(tfNombreObra.getText());
            obra.setDireccionObra(tfUbicacionObra.getText());
            obraCt.verObra(tablaObras, obra);
            inhabilitarCamposObra();
        }
    }//GEN-LAST:event_btEjecutarConsultaActionPerformed

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
        labelOperacion.setText("");
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
    private javax.swing.JButton btEjecutarConsulta;
    private javax.swing.JMenuItem consultarObra;
    private javax.swing.JMenuItem consultarObras;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDireccionObra;
    private javax.swing.JLabel labelIdObra;
    private javax.swing.JLabel labelNombreObra;
    private javax.swing.JLabel labelOperacion;
    private javax.swing.JLabel labelTituloObra;
    private javax.swing.JMenuBar menuElementos;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenu menuHerramienta;
    private javax.swing.JMenu menuMantenimiento;
    private javax.swing.JMenu menuObra;
    private javax.swing.JMenuBar menuOpcionesObra;
    private javax.swing.JMenu menuReportes;
    private javax.swing.JMenu opcionConsultarObra;
    private javax.swing.JMenu opcionCrearObra;
    private javax.swing.JMenu opcionEliminarObra;
    private javax.swing.JMenu opcionModificarObra;
    private javax.swing.JMenu opcionReportes;
    private javax.swing.JTable tablaObras;
    private javax.swing.JTextField tfIdObra;
    private javax.swing.JTextField tfNombreObra;
    private javax.swing.JTextField tfUbicacionObra;
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

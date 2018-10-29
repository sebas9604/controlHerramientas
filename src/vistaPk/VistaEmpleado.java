/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPk;

import java.sql.ResultSet;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Empleados;

/**
 *
 * @author tolis
 */
public class VistaEmpleado {

    public void verEmpleado(ResultSet empleados, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idEmpleado", "nombresEmpleado", "apellidosEmpleado", "cargoEmpleado", "fotoEmpleado"});

        try {

            while (empleados.next()) {
                modelo.addRow(new Object[]{empleados.getInt("idEmpleado"), empleados.getString("nombresEmpleado"), empleados.getString("apellidosEmpleado"),
                    empleados.getString("cargoEmpleado"), empleados.getString("fotoEmpleado")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

    }

    public void verEmpleados(ResultSet empleados, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idEmpleado", "nombresEmpleado", "apellidosEmpleado", "cargoEmpleado"});

        try {
            while (empleados.next()) {
                modelo.addRow(new Object[]{empleados.getInt("idEmpleado"), empleados.getString("nombresEmpleado"), empleados.getString("apellidosEmpleado"),
                    empleados.getString("idCargo")});            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
            System.out.println("vistaPk.VistaEmpleado.verEmpleados()");
            ex.printStackTrace();
        }

}
    
    
    
    public void verHerramientasACargo(ResultSet empleados, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idEmpleado", "nombresEmpleado", "apellidosEmpleado", "idHerramienta", "nombreHerramienta"});

        try {
            while (empleados.next()) {
                modelo.addRow(new Object[]{empleados.getInt("idEmpleado"), empleados.getString("nombresEmpleado"), empleados.getString("apellidosEmpleado"),
                    empleados.getString("idCargo")});            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
            System.out.println("vistaPk.VistaEmpleado.verEmpleados()");
            ex.printStackTrace();
        }

}
}

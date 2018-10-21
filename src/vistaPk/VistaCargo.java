/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPk;

import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tolis
 */
public class VistaCargo {

    public void verCargo(ResultSet cargos, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idCargo", "nombreCargo"});

        try {

            while (cargos.next()) {
                modelo.addRow(new Object[]{cargos.getInt("idEmpleado"), cargos.getString("nombreCargo")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

    }

    public void verCargos(ResultSet cargos, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idCargo", "nombreCargo"});

        try {
            while (cargos.next()) {
                modelo.addRow(new Object[]{cargos.getInt("idCargo"), cargos.getString("nombrecargo")});            
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

}
}
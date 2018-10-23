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
 * @author jlinares
 */
public class VistaHerramienta {
        public void verHerramienta(ResultSet herramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idHerramienta", "nombreHerramienta", "lugarCompraHerramienta", "idObra", "precioCompraHerramienta",
            "idEmpleado"});

        try {

            while (herramientas.next()) {
                modelo.addRow(new Object[]{herramientas.getString("idHerramienta"), herramientas.getString("nombreHerramienta"), herramientas.getString("lugarCompraHerramienta"),
                    herramientas.getInt("idObra"), herramientas.getInt("precioCompraHerramienta"), herramientas.getInt("idEmpleado")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

    }

    public void verHerramientas(ResultSet herramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idHerramienta", "nombreHerramienta", "lugarCompraHerramienta", "fechaCompraHerramienta", "precioCompraHerramienta"});

        try {

            while (herramientas.next()) {
                modelo.addRow(new Object[]{herramientas.getString("idHerramienta"), herramientas.getString("nombreHerramienta"), herramientas.getString("lugarCompraHerramienta"),
                    herramientas.getString("fechaCompraHerramienta"), herramientas.getInt("precioCompraHerramienta")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

}
}

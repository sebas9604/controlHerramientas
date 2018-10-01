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
public class VistaMantenimientoHerramienta {
            public void verMantenimientoHerramienta(ResultSet mantenimientoHerramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idFacturaMantenimiento", "idHerramienta", "lugarMantenimiento", "fechaEntradaMantenimiento", 
            "fechaSalidaMantenimiento", "descripcionMantenimiento", "fotoAntesMantenimiento", "fotoDespuesMantenimiento"});

        try {

            while (mantenimientoHerramientas.next()) {
                modelo.addRow(new Object[]{mantenimientoHerramientas.getInt("idFacturaMantenimiento"), mantenimientoHerramientas.getString("idHerramienta"), 
                    mantenimientoHerramientas.getString("lugarMantenimiento"), mantenimientoHerramientas.getDate("fechaEntradaMantenimiento"), 
                    mantenimientoHerramientas.getInt("fechaSalidaMantenimiento"), mantenimientoHerramientas.getInt("descripcionMantenimiento"),
                mantenimientoHerramientas.getInt("fotoAntesMantenimiento"),mantenimientoHerramientas.getInt("fotoDespuesMantenimiento")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

    }

    public void verMantenimientoHerramientas(ResultSet mantenimientoHerramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"idFacturaMantenimiento", "idHerramienta", "lugarMantenimiento", "fechaEntradaMantenimiento", 
            "fechaSalidaMantenimiento", "descripcionMantenimiento", "fotoAntesMantenimiento", "fotoDespuesMantenimiento"});

        try {

            while (mantenimientoHerramientas.next()) {
                modelo.addRow(new Object[]{mantenimientoHerramientas.getInt("idFacturaMantenimiento"), mantenimientoHerramientas.getString("idHerramienta"), 
                    mantenimientoHerramientas.getString("lugarMantenimiento"), mantenimientoHerramientas.getDate("fechaEntradaMantenimiento"), 
                    mantenimientoHerramientas.getInt("fechaSalidaMantenimiento"), mantenimientoHerramientas.getInt("descripcionMantenimiento"),
                mantenimientoHerramientas.getInt("fotoAntesMantenimiento"),mantenimientoHerramientas.getInt("fotoDespuesMantenimiento")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

}
}

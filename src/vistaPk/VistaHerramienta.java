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


    public void tiempoVidaHerramienta(ResultSet herramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Referencia", "Herramienta", "Compra", "Tiempo de Vida"});

        try {

            while (herramientas.next()) {
                modelo.addRow(new Object[]{herramientas.getString("Referencia"), herramientas.getString("Herramienta"), herramientas.getString("Compra"),
                    herramientas.getString("Tiempo de Vida")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

}
    
        public void mantenimientosHerramienta(ResultSet herramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Factura", "Referencia", "Lugar_Mantenimiento", "Fecha_Entrada", "Fecha_Salida", "Descripcion"});

        try {

            while (herramientas.next()) {
                modelo.addRow(new Object[]{herramientas.getString("Factura"), herramientas.getString("Referencia"), herramientas.getString("Lugar_Mantenimiento"),
                    herramientas.getString("Fecha_Entrada"), herramientas.getString("Fechas_Salida"), herramientas.getString("Descripcion")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }

}
        
        public void ubicacionHerramienta(ResultSet herramientas, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Referencia", "Nombre_Herramienta", "Centro_Costo", "Nombre_Centro_Costo", "Fecha_Entrada", "Fecha_Salida"});

        try {

            while (herramientas.next()) {
                modelo.addRow(new Object[]{herramientas.getString("Referencia"), herramientas.getString("Nombre_Herramienta"), herramientas.getString("Centro_Costo"),
                    herramientas.getString("Nombre_Centro_Costo"), herramientas.getString("Fecha_Entrada"), herramientas.getString("Fecha_Salida")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
            System.out.println("vistaPk.VistaHerramienta.ubicacionHerramienta() " + ex);
        }

}
}

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
import modelo.Obra;
import static presentacion.Principal.getTabla;

/**
 *
 * @author tolis
 */
public class VistaObra {

    public void verObra(ResultSet obras, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Centro de costo", "Nombre", "Dirección"});

        try {

            while (obras.next()) {
                modelo.addRow(new Object[]{obras.getInt("idObra"), obras.getString("nombreObra"), obras.getString("direccionObra")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }
    }

//    public void verObras(JTable tabla) {
//        DefaultTableModel modelo = new DefaultTableModel();
//        ResultSet rs = getTabla("SELECT idObra, nombreObra, direccionObra "
//                + "FROM obra ORDER BY idObra");
//        modelo.setColumnIdentifiers(new Object[]{"Identificación", "Nombre", "Dirección"});
//        try {
//            while (rs.next()) {
//                modelo.addRow(new Object[]{rs.getInt("idObra"), rs.getString("nombreObra"), rs.getString("direccionObra")});
//            }
//            tabla.setModel(modelo);
//        } catch (Exception ex) {
//        }
//    }
    public void verObras(ResultSet obras, JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Centro de Costo", "Nombre", "Dirección"});

        try {
            while (obras.next()) {
                modelo.addRow(new Object[]{obras.getInt("idObra"), obras.getString("nombreObra"), obras.getString("direccionObra")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }
    }
    
    public void reporteHerramientasEnObra(ResultSet obras, JTable tabla){
            DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Centro de Costo", "Nombre", "Referencia Herramienta", "Herramienta"});

        try {
            while (obras.next()) {
                modelo.addRow(new Object[]{obras.getInt("idObra"), obras.getString("nombreObra"), obras.getString("idHerramienta"), obras.getString("nombreHerramienta")});
            }
            tabla.setModel(modelo);

        } catch (Exception ex) {
        }
    }

}

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
public class vistaObra {

    public void verObra(Obra obra) {
        System.out.println("Datos de la Obra: " + obra);
    }

    public JTable verObras(JTable tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = getTabla("SELECT idObra, nombreObra, direccionObra "
                + "FROM obra");
        modelo.setColumnIdentifiers(new Object[]{"Identificación", "Nombre", "Dirección"});
        try {
            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("idObra"), rs.getString("nombreObra"), rs.getString("direccionObra")});
            }
            tabla.setModel(modelo);
        } catch (Exception ex) {
        }
        return tabla;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import interfaces.IHerramientasXObraDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.HerramientasXObra;

/**
 *
 * @author tolis
 */
public class HerramientasXObraImpl implements IHerramientasXObraDao {

    @Override
    public boolean registrarMovimiento(HerramientasXObra objeto) {
        boolean registrar = false;
        Connection con;
        try {

            String sql = "INSERT INTO herramientasxobra "
                    + "(idObra, idHerramienta, fechaEntradaObraHerramienta) "
                    + "VALUES (?,?,?);";
            con = ConexionBD.connect();
            String x = consultaridObraXnombreObra(objeto.getIdObra());
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setString(1, x);
            psql.setString(2, objeto.getIdHerramienta());
            psql.setString(3, objeto.getFechaEntradaObraHerramienta());

            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error generando entrada de movimiento" + ex);
        }

        return registrar;
    }

    @Override
    public boolean actualizarMovimiento(HerramientasXObra objeto) {
        Connection con = null;
        Statement stm = null;
        boolean actualizar = false;

        try {
            String sql = "UPDATE herramientasxobra "
                    + "SET fechasalidaobraherramienta = ?"
                    + "WHERE id = ?;";
            String x = consultarIdXIdHerramienta(objeto.getIdHerramienta());
            con = ConexionBD.connect();
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setString(1, objeto.getFechaSalidaObraHerramienta());
            psql.setString(2, x);
            psql.executeUpdate();
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase HxODaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;    }

    @Override
    public List<String> llenarComboObra() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT nombreObra FROM obra ORDER BY nombreObra;";
        List<String> listaObras = new ArrayList<String>();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                //este es el Jcombobox
                listaObras.add(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
        }
        return listaObras;
    }

    public String consultaridObraXnombreObra(String nombreObra) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT idObra "
                + "from obra "
                + "where nombreObra = '" + nombreObra + "';";
        System.out.println("SQL query = " + sql);
        String rt = "";
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                rt = rs.getString(1);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("rt ::." + rt);
        return rt;
    }
    
        public String consultarIdXIdHerramienta(String idHerramienta) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT id "
                + "from herramientasxobra "
                + "where idHerramienta = '" + idHerramienta + "' ORDER BY 1 DESC;";
        System.out.println("SQL query = " + sql);
        String rt = "";
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                rt = rs.getString(1);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("rt ::." + rt);
        return rt;
    }
}

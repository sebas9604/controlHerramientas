/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import java.util.List;
import modelo.Herramientas;
import interfaces.IHerramientasDao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jlinares
 */
public class HerramientasDaoImpl implements IHerramientasDao {

    @Override
    public boolean registrarNuevaHerramienta(Herramientas herramienta) {
        boolean registrar = false;
        Connection con;
        try {
            File archivoImg = new File(herramienta.getEstadoHerramienta());
            String sql = "INSERT INTO herramientas (idHerramienta, nombreHerramienta, lugarCompraHerramienta, "
                    + "idObra, precioCompraHerramienta, idEmpleado, estadoHerramienta)" + "VALUES (?,?,?,?,?,?,?);";
            con = ConexionBD.connect();
            FileInputStream convertir_imagen = new FileInputStream(archivoImg);
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setString(1, herramienta.getIdHerramienta());
            psql.setString(2, herramienta.getNombreHerramienta());
            psql.setString(3, herramienta.getLugarCompraHerramienta());
            psql.setInt(4, herramienta.getIdObra());
            psql.setInt(5, herramienta.getPrecioCompraHerramienta());
            psql.setInt(5, herramienta.getIdEmpleado());
            psql.setBlob(6, convertir_imagen, archivoImg.length());
            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (FileNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando al herramienta" + ex);
        }

        return registrar;
    }

    @Override
    public ResultSet obtenerHerramientas() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idHerramienta, nombreHerramienta, lugarCompraHerramienta, precioCompraHerramienta,"
                + " idObra, fechaEntradaObraHerramienta, fechaSalidaObraHerramienta, idEmpleado, estadoHerramienta"
                + "FROM empleados ORDER BY idEmpleado";
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
//            stm.close();
//            rs.close();
//            con.close();
        } catch (Exception e) {
        }

        return rs;
    }

    @Override
    public boolean actualizarHerramienta(Herramientas herramienta) {
        Connection connect = null;
        Statement stm = null;

        boolean actualizar = false;

        String sql = "UPDATE herramientas SET idHerramienta='" + herramienta.getIdHerramienta() + "', nombreHerramienta='" + herramienta.getNombreHerramienta()
                + "', lugarCompraHerramienta='" + herramienta.getLugarCompraHerramienta() + "', precioCompraHerramienta=" + herramienta.getPrecioCompraHerramienta()
                + ", idObra=" + herramienta.getIdObra() + ", fechaEntradaObraHerramienta='" + herramienta.getFechaEntradaObraHerramienta() + "', fechaSalidaObraHerramienta='" + herramienta.getFechaSalidaObraHerramienta()
                + "', idHerramienta=" + herramienta.getIdHerramienta() + ", estadoHerramienta='" + herramienta.getEstadoHerramienta()
                + "' WHERE idHerramienta=" + herramienta.getIdHerramienta();
        try {
            connect = ConexionBD.connect();
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminarHerramienta(Herramientas herramienta) {
        Connection connect = null;
        Statement stm = null;

        boolean eliminar = false;

        String sql = "DELETE FROM herramientas WHERE idHerramienta=" + herramienta.getIdEmpleado();
        try {
            connect = ConexionBD.connect();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método eliminar");
            e.printStackTrace();
        }
        return eliminar;
    }

    @Override
    public ResultSet obtenerHerramienta(Herramientas herramienta) {
         Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idHerramienta, nombreHerramienta, lugarCompraHerramienta, precioCompraHerramienta,"
                + " idObra, fechaEntradaObraHerramienta, fechaSalidaObraHerramienta, idEmpleado, estadoHerramienta"
                + "FROM herramientas WHERE idHerramienta = " +  herramienta.getIdHerramienta();
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
//            stm.close();
//            rs.close();
//            con.close();
        } catch (Exception e) {
        }

        return rs;
    }

}

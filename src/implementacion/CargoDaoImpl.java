/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import interfaces.ICargoDao;
import interfaces.IObraDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Cargo;
import modelo.Obra;

/**
 *
 * @author tolis
 */
public class CargoDaoImpl implements ICargoDao {

    @Override
    public boolean registrarNuevaCargo(Cargo cargo) {
        boolean registrar = false;
        Connection con;
        try {

            ResultSet rs;
            rs = obtenerCargo(cargo);
            if (!rs.next()) {
                String sql = "INSERT INTO cargo (idCargo, nombreCargo) " + "VALUES (?,?);";
                con = ConexionBD.connect();
                PreparedStatement psql = con.prepareStatement(sql);
                psql.setInt(1, cargo.getIdCargo());
                psql.setString(2, cargo.getNombreCargo());
                psql.executeUpdate();
                registrar = true;
                psql.close();
                con.close();
                JOptionPane.showMessageDialog(null, "Operación Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Ya existe un registro con la identificación: " + cargo.getIdCargo());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando el cargo " + ex);
        }

        return registrar;
    }

    @Override
    public ResultSet obtenerCargo(Cargo cargo) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idCargo, nombreCargo "
                + "FROM cargo WHERE idCargo = " + cargo.getIdCargo() + ";";
        System.out.println(sql);
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
//            stm.close();
//            rs.close();
//            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (Exception e) {
        }

        return rs;
    }

    @Override
    public ResultSet obtenerCargos() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idCargo, nombreCargo "
                + "FROM cargo ORDER BY idCargo";
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
    public Cargo consultarCargo(Cargo cargo) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idCargo, nombrecargo FROM cargo WHERE idCargo = " + cargo.getIdCargo() + ";";
        Cargo c = new Cargo();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                c.setIdCargo(rs.getInt(1));
                c.setNombreCargo(rs.getString(2));

            }
            stm.close();
            rs.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (SQLException e) {
            System.out.println("Error: Clase CargoDaoImple, método consultarCargo");
            e.printStackTrace();
        }
        return c;

    }

    @Override
    public boolean actualizarCargo(Cargo cargo) {
        Connection connect = null;
        Statement stm = null;
        boolean actualizar = false;
        try {
            ResultSet rs;
            rs = obtenerCargo(cargo);

            if (rs.next()) {
                String sql = "UPDATE cargo SET idCargo='" + cargo.getIdCargo()
                        + "', nombrecargo='" + cargo.getNombreCargo() + "';";

                connect = ConexionBD.connect();
                stm = connect.createStatement();
                stm.execute(sql);
                actualizar = true;
                JOptionPane.showMessageDialog(null, "Operación Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El registro no existe");
            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CargoDaoImpl, método actualizar");
            e.printStackTrace();
        }
        return actualizar;
    }

    @Override
    public boolean eliminarCargo(Cargo cargo) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;

        try {
            ResultSet rs = obtenerCargo(cargo);
            if (rs.next()) {

                String sql = "DELETE FROM cargo WHERE idCargo = "
                        + cargo.getIdCargo() + ";";

                connect = ConexionBD.connect();
                stm = connect.createStatement();
                stm.execute(sql);
                eliminar = true;
                JOptionPane.showMessageDialog(null, "Operación Exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "El registro no existe");

            }
        } catch (SQLException e) {
            System.out.println("Error: Clase CargoDaoImpl, método eliminar");
            e.printStackTrace();
        }
        return eliminar;

    }

}

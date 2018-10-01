/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Empleados;
import interfaces.IEmpleadosDao;

/**
 *
 * @author tolis
 */
public class EmpleadosDaoImpl implements IEmpleadosDao {

    @Override
    public boolean registrarNuevoEmpleado(Empleados empleado) {
             boolean registrar = false;
            Connection con;
        try {
            File archivoImg = new File(empleado.getFotoEmpleado());
            String sql = "INSERT INTO empleados (idEmpleado, nombresEmpleado, apellidosEmpleado, cargoEmpleado, fotoEmpleado)" + "VALUES (?,?,?,?,?);";
            con = ConexionBD.connect();
            FileInputStream convertir_imagen = new FileInputStream(archivoImg);
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setInt(1, empleado.getIdEmpleado());
            psql.setString(2, empleado.getNombresEmpleado());
            psql.setString(3, empleado.getApellidosEmpleado());
            psql.setString(4, empleado.getCargoEmpleado());
            psql.setBlob(5, convertir_imagen, archivoImg.length());
            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (FileNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando al empleado" + ex);
        }

        return registrar;
    }

    @Override
    public ResultSet obtenerEmpleados() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idEmpleado, nombresEmpleado, apellidosEmpleado, cargoEmpleado, fotoEmpleado "
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
    public boolean actualizarEmpleado(Empleados empleado) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE empleados SET idEmpleado="+empleado.getIdEmpleado()+", nombresEmpleado='"+empleado.getNombresEmpleado()
                        +"', apellidosEmpleado='"+empleado.getApellidosEmpleado()+"', cargoEmpleado='"+empleado.getCargoEmpleado()
                        +"', fotoEmpleado='"+empleado.getFotoEmpleado()+"' WHERE idEmpleado="+empleado.getIdEmpleado();
		try {
			connect=ConexionBD.connect();
			stm=connect.createStatement();
			stm.execute(sql);
			actualizar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;    
    }

    @Override
    public boolean eliminarEmpleado(Empleados empleado) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM empleados WHERE idEmpleado="+empleado.getIdEmpleado();
		try {
			connect=ConexionBD.connect();
			stm=connect.createStatement();
			stm.execute(sql);
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase ClienteDaoImple, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
    }

    @Override
    public ResultSet obtenerEmpleado(Empleados empleado) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idEmpleado, nombresEmpleado, apellidosEmpleado, cargoEmpleado, fotoEmpleado "
                + "FROM empleados WHERE idEmpleado = " + empleado.getIdEmpleado()+ ";";
        System.out.println(sql);
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

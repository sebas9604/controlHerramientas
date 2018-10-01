/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import java.util.List;
import modelo.MantenimientoHerramienta;
import interfaces.IMantenimientoHerramientaDao;
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
public class MantenimientoHerramientaDaoImpl implements IMantenimientoHerramientaDao{

    @Override
    public boolean registrarNuevoMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta) {
             boolean registrar = false;
            Connection con;
        try {
            File archivoImgAntes = new File(mantenimientoHerramienta.getFotoAntesMantenimiento());
            File archivoImgDespues = new File(mantenimientoHerramienta.getFotoDespuesMantenimiento());

            String sql = "INSERT INTO mantenimiemtoHerramienta (idFacturaMantenimiento, idHerramienta, lugarMantenimiento, "
                    + "fechaEntradaMantenimiento, fechaSalidaMantenimiento, descripcionMantenimiento, fotoAntesMantenimiento, fotoDespuesMantenimiento)" + "VALUES (?,?,?,?,?,?,?,?);";
            con = ConexionBD.connect();
            FileInputStream convertir_imagen_antes = new FileInputStream(archivoImgAntes);
            FileInputStream convertir_imagen_despues = new FileInputStream(archivoImgDespues);            
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setInt(1, mantenimientoHerramienta.getIdFacturaMantenimiento());
            psql.setString(2, mantenimientoHerramienta.getIdHerramienta());
            psql.setString(3, mantenimientoHerramienta.getLugarMantenimiento());
            psql.setDate(4, mantenimientoHerramienta.getFechaEntradaMantenimiento());
            psql.setDate(5, mantenimientoHerramienta.getFechaSalidaMantenimiento());
            psql.setString(6, mantenimientoHerramienta.getDescripcionMantenimiento());
            psql.setBlob(7, convertir_imagen_antes, archivoImgAntes.length());
            psql.setBlob(8, convertir_imagen_despues, archivoImgDespues.length());            
            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (FileNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando al mantenimientoHerramienta" + ex);
        }

        return registrar;
    }

    @Override
    public ResultSet obtenerMantenimientoHerramientas() {
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
    public boolean actualizarMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE mantenimientoherramientas SET idFacturaMantenimiento='"+mantenimientoHerramienta.getIdFacturaMantenimiento()
                        +"', idHerramienta='"+mantenimientoHerramienta.getIdHerramienta()
                        +"', lugarMantenimiento='"+mantenimientoHerramienta.getLugarMantenimiento()
                        +"', fechaEntradaMantenimiento='"+mantenimientoHerramienta.getFechaEntradaMantenimiento()
                        +"', fechaSalidaMantenimiento='"+mantenimientoHerramienta.getFechaSalidaMantenimiento()
                        +"', descripcionMantenimiento='"+mantenimientoHerramienta.getDescripcionMantenimiento()
                        +"', fotoAntesMantenimiento='"+mantenimientoHerramienta.getFotoAntesMantenimiento()
                        +"', fotoDespuesMantenimiento='"+mantenimientoHerramienta.getFotoDespuesMantenimiento()
                        +"' WHERE idFacturaMantenimiento="+mantenimientoHerramienta.getIdFacturaMantenimiento();
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
    public boolean eliminarMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM mantenimientoHerramienta WHERE idFacturaMantenimiento="
                        +mantenimientoHerramienta.getIdFacturaMantenimiento();
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
    public ResultSet obtenerMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta) {
{
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT idFacturaMantenimiento, idHerramienta, lugarMantenimiento, fechaEntradaMantenimiento,"
                + " fechaSalidaMantenimiento, descripcionMantenimiento, fotoAntesMantenimiento, fotoDespuesMantenimiento"
                + "FROM empleados WHERE idHerramienta = " + mantenimientoHerramienta.getIdFacturaMantenimiento();
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
    
}

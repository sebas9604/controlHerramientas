/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import interfaces.IObraDao;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Obra;

/**
 *
 * @author jlinares
 */
public class ObraDaoImpl implements IObraDao {

    @Override
    public boolean registrarNuevaObra(Obra obra) {
        boolean registrar = false;
        Connection con;
        try {

            String sql = "INSERT INTO obra (idObra, nombreObra, direccionObra) " + "VALUES (?,?,?);";
            con = ConexionBD.connect();
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setInt(1, obra.getIdObra());
            psql.setString(2, obra.getNombreObra());
            psql.setString(3, obra.getDireccionObra());
            psql.executeUpdate();
            registrar = true;
            psql.close();
            con.close();
            JOptionPane.showMessageDialog(null, "Operación Exitosa");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error insertando al obra" + ex);
        }

        return registrar;
    }

    @Override
    public List<Obra> obtenerObra() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT * FROM obra ORDER BY idObra";
        List<Obra> listaObras = new ArrayList<Obra>();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Obra e = new Obra();
                e.setIdObra(rs.getInt(1));
                e.setNombreObra(rs.getString(2));
                e.setDireccionObra(rs.getString(3));

                listaObras.add(e);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (Exception e) {
        }

        return listaObras;
    }

    @Override
    public boolean actualizarObra(Obra obra) {
		Connection connect= null;
		Statement stm= null;
		
		boolean actualizar=false;
				
		String sql="UPDATE obras SET idObra='"+obra.getIdObra()
                        +"', nombreObra='"+obra.getNombreObra()
                        +"', direccionObra='"+obra.getDireccionObra()
                        +"' WHERE idObra="+obra.getIdObra();
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
    public boolean eliminarObra(Obra obra) {
		Connection connect= null;
		Statement stm= null;
		
		boolean eliminar=false;
				
		String sql="DELETE FROM obra WHERE idObra = "
                        +obra.getIdObra() + ";";
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
    
}

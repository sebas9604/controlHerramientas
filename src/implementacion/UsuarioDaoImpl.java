/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import conexion.ConexionBD;
import interfaces.IUsuarioDao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author jcarranza
 */
public class UsuarioDaoImpl implements IUsuarioDao{

    @Override
    public boolean consultarUsuario(Usuario usuario) {
        
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        boolean b = false;

        String sql = "SELECT idUsuario, usuarioContrasena FROM usuario WHERE idUsuario = '" + usuario.getIdUsuario() + "';";
        Usuario u = new Usuario();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                u.setIdUsuario(rs.getString(1));
                u.setContrasenaUsuario(rs.getString(2));
            }
            if (u.getIdUsuario()== null) {
                JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña son erroneos", "Inicio Sesión", JOptionPane.ERROR_MESSAGE);
                b = false;
            } else {
              JOptionPane.showMessageDialog(null, "Validando Datos", "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
               if(usuario.getContrasenaUsuario().equals(u.getContrasenaUsuario()))
               {
                    b = true;
               }else
               {
                    JOptionPane.showMessageDialog(null, "El usuario y/o la contraseña no son erroneos", "Inicio Sesión", JOptionPane.ERROR_MESSAGE);
               }
            }
            stm.close();
            rs.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("implementacion.UsuarioDaoImpl.consultarUsuario()");
            e.printStackTrace();
        }
        return b;   
    }
    
}

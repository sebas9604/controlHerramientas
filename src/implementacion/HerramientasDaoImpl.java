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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import modelo.Empleados;

/**
 *
 * @author jlinares
 */
public class HerramientasDaoImpl implements IHerramientasDao {

    @Override
    public boolean registrarNuevaHerramienta(Herramientas herramienta, String responsable) {
        boolean registrar = false;
        Connection con;
        try {
            File archivoImg = new File(herramienta.getEstadoHerramienta());
            String sql = "INSERT INTO herramientas (idHerramienta, nombreHerramienta, lugarCompraHerramienta, "
                    + "fechaCompraHerramienta, precioCompraHerramienta, idEmpleado, estadoHerramienta)" + "VALUES (?,?,?,?,?,?,?);";
            con = ConexionBD.connect();
            int x = consultarIdResponsableporNombresyApellidos(responsable);
            FileInputStream convertir_imagen = new FileInputStream(archivoImg);
            PreparedStatement psql = con.prepareStatement(sql);
            psql.setString(1, herramienta.getIdHerramienta());
            psql.setString(2, herramienta.getNombreHerramienta());
            psql.setString(3, herramienta.getLugarCompraHerramienta());
            psql.setString(4, herramienta.getFechaCompraHerramienta());
            psql.setInt(5, herramienta.getPrecioCompraHerramienta());
            psql.setInt(6, x);
            psql.setBlob(7, convertir_imagen, archivoImg.length());
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

        String sql = "SELECT idHerramienta, nombreHerramienta, lugarCompraHerramienta, fechaCompraHerramienta, precioCompraHerramienta,"
                + " idEmpleado "
                + "FROM herramientas ORDER BY idHerramienta";
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
                + "FROM herramientas WHERE idHerramienta = " + herramienta.getIdHerramienta();
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
    public List<String> llenarComboResponsable() {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT nombresEmpleado, apellidosEmpleado FROM empleados ORDER BY nombresEmpleado;";
        List<String> listaCargos = new ArrayList<String>();

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                //este es el Jcombobox
                listaCargos.add(rs.getString(1) + " " + rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
        }

        return listaCargos;
    }

    @Override
    public Herramientas consultarHerramienta(Herramientas herramienta) {
        ImageIcon ii = getFoto(herramienta);
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String s = consultarResponsablePorIdEmpleado(herramienta);
        String sql = "SELECT idHerramienta, nombreHerramienta, lugarCompraHerramienta, fechaCompraHerramienta, "
                + "precioCompraHerramienta, idEmpleado, estadoHerramienta FROM herramientas WHERE idHerramienta = " + herramienta.getIdHerramienta() + ";";
        Herramientas h = new Herramientas();
        System.out.println(sql);
        JOptionPane.showMessageDialog(null, "Operación Exitosa");

        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                h.setIdHerramienta(rs.getString(1));
                h.setNombreHerramienta(rs.getString(2));
                h.setLugarCompraHerramienta(rs.getString(3));
                h.setFechaCompraHerramienta(rs.getString(4));
                h.setPrecioCompraHerramienta(rs.getInt(5));
                h.setIdEmpleado(rs.getInt(6));
                h.setEstadoHerramienta(rs.getString(7));

//                Blob bytesImagen = rs.getBlob("fotoEmpleado");
//                byte[] bytesLeidos = bytesImagen.getBytes(1, (int) bytesImagen.length());
//
//                ImageIcon image = new ImageIcon(bytesLeidos);
                h.setFotoHerr(ii);
            }
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: Clase HeramientaDaoImple, método consultarHerramietna");
            ex.printStackTrace();
        }
        return h;
    }

    public ImageIcon getFoto(Herramientas herramienta) {

        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "SELECT estadoHerramienta FROM herramientas WHERE idHerramienta = " + herramienta.getIdHerramienta() + ";";
        ImageIcon ii = null;
        InputStream is = null;
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            if (rs.next()) {
                is = rs.getBinaryStream(1);
                BufferedImage bi = ImageIO.read(is);
                ii = new ImageIcon(bi);
            }
        } catch (Exception e) {
        }
        return ii;
    }

    @Override
    public String consultarResponsablePorIdEmpleado(Herramientas herramienta) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;

        String sql = "select nombresEmpleado, apellidosEmpleado from empleados where idEmpleado = " + herramienta.getIdEmpleado() + ";";
        Empleados e = new Empleados();
        String rt = "";
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                e.setNombresEmpleado(rs.getString(1));
                e.setApellidosEmpleado(rs.getString(2));
            }
            rt = e.getNombresEmpleado() + " " + e.getApellidosEmpleado();
            stm.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return rt;
    }

    public int consultarIdResponsableporNombresyApellidos(String responsable) {
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        System.out.println("Immlpresponsabe: = " + responsable);
        String sql = "SELECT idEmpleado "
                + "from empleados "
                + "where concat(nombresEmpleado,' ',apellidosEmpleado) = '" + responsable +"';";
        System.out.println("SQL query = " + sql);
        int rt = -1;
        try {
            con = ConexionBD.connect();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);
            if (rs.next()) {
                System.out.println("getint " + rs.getInt(1) + "getstring" + rs.getString(1));
            rt = rs.getInt(1);
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

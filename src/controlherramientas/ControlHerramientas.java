package controlherramientas;

import conexion.ConexionBD;
import java.sql.Connection;

/**
 *
 * @author tolis
 */
public class ControlHerramientas {

    public static void main(String[] args) {
        try {
                    Connection con = ConexionBD.connect();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

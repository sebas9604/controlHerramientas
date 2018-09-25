package controlherramientas;

import conexion.ConexionBD;
import java.sql.Connection;
import presentacion.Principal;

/**
 *
 * @author tolis
 */
public class ControlHerramientas {

    public static void main(String[] args) {
        try {
//                    Connection con = ConexionBD.connect();
Principal framePrincipal = new Principal();
framePrincipal.setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

package controlherramientas;

import presentacion.Inicio;
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
Inicio frameInicio = new Inicio();
frameInicio.setVisible(true);

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

}

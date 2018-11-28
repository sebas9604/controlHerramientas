    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.MantenimientoHerramientaDaoImpl;
import interfaces.IMantenimientoHerramientaDao;
import java.sql.ResultSet;
import javax.swing.JTable;
import modelo.MantenimientoHerramienta;
import vistaPk.VistaMantenimientoHerramienta;

/**
 *
 * @author jlinares
 */
public class ControllerMantenimientoHerramienta {
          private VistaMantenimientoHerramienta vista = new VistaMantenimientoHerramienta();

    //llama al DAO para guardar un mantenimiento de herramienta
    public void registrar(MantenimientoHerramienta mantenimientoHerramienta) {
        IMantenimientoHerramientaDao dao = new MantenimientoHerramientaDaoImpl();
        dao.registrarNuevoMantenimientoHerramienta(mantenimientoHerramienta);
    }

    //llama al DAO para actualizar un mantenimiento de herramienta
    public void actualizar(MantenimientoHerramienta mantenimientoHerramienta) {
        IMantenimientoHerramientaDao dao = new MantenimientoHerramientaDaoImpl();
        dao.actualizarMantenimientoHerramienta(mantenimientoHerramienta);
    }

    //llama al DAO para eliminar un mantenimiento de herramienta
    public void eliminar(MantenimientoHerramienta mantenimientoHerramienta) {
        IMantenimientoHerramientaDao dao = new MantenimientoHerramientaDaoImpl();
        dao.eliminarMantenimientoHerramienta(mantenimientoHerramienta);
    }

    //llama al DAO para obtener todos los mantenimiento de herramientas y luego los muestra en la vista
    public void verMantenimientoHerramientas(JTable tabla) {
        ResultSet herramientas = null;
        IMantenimientoHerramientaDao dao = new MantenimientoHerramientaDaoImpl();
        herramientas = dao.obtenerMantenimientoHerramientas();
        vista.verMantenimientoHerramientas(herramientas, tabla);
    }

    public void verHerramienta(JTable tabla, MantenimientoHerramienta mantenimientoHerramienta) {
        ResultSet herramientas = null;
        IMantenimientoHerramientaDao dao = new MantenimientoHerramientaDaoImpl();
        herramientas = dao.obtenerMantenimientoHerramientas();
        vista.verMantenimientoHerramienta(herramientas, tabla);
    }  
}

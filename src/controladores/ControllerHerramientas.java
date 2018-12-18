/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.HerramientasDaoImpl;
import interfaces.IHerramientasDao;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JTable;
import modelo.Herramientas;
import vistaPk.VistaHerramienta;

/**
 *
 * @author jlinares
 */
public class ControllerHerramientas {

    private VistaHerramienta vista = new VistaHerramienta();

    //llama al DAO para guardar un herramienta
    public void registrar(Herramientas herramienta, String responsable) {
        IHerramientasDao dao = new HerramientasDaoImpl();
        dao.registrarNuevaHerramienta(herramienta, responsable);
    }

    //llama al DAO para actualizar un herramienta
    public void actualizar(Herramientas herramienta, String responsable) {
        IHerramientasDao dao = new HerramientasDaoImpl();
        dao.actualizarHerramienta(herramienta, responsable);
    }

    //llama al DAO para eliminar un herramienta
    public void eliminar(Herramientas herramienta) {
        IHerramientasDao dao = new HerramientasDaoImpl();
        dao.eliminarHerramienta(herramienta);
    }

    //llama al DAO para obtener todos los herramientas y luego los muestra en la vista
    public void verHerramientas(JTable tabla) {
        ResultSet herramientas = null;
        IHerramientasDao dao = new HerramientasDaoImpl();
        herramientas = dao.obtenerHerramientas();
        vista.verHerramientas(herramientas, tabla);
    }

    public void verHerramienta(JTable tabla, Herramientas herramienta) {
        ResultSet herramientas = null;
        IHerramientasDao dao = new HerramientasDaoImpl();
        herramientas = dao.obtenerHerramienta(herramienta);
        vista.verHerramienta(herramientas, tabla);
    }

    public void verTiempoVida(JTable tabla, Herramientas herramienta) {
        ResultSet herramientas = null;
        IHerramientasDao dao = new HerramientasDaoImpl();
        herramientas = dao.tiempoDeVida(herramienta);
        vista.tiempoVidaHerramienta(herramientas, tabla);
    }
    
    public void verMantenimientos(JTable tabla, Herramientas herramienta) {
        ResultSet herramientas = null;
        IHerramientasDao dao = new HerramientasDaoImpl();
        herramientas = dao.mantenimientosHerramienta(herramienta);
        vista.mantenimientosHerramienta(herramientas, tabla);
    }

    public void verUbicacionHerramienta(JTable tabla, Herramientas herramienta) {
        ResultSet herramientas = null;
        IHerramientasDao dao = new HerramientasDaoImpl();
        herramientas = dao.ubicacionHerramienta(herramienta);
        vista.ubicacionHerramienta(herramientas, tabla);
    }
    public Herramientas consultarHerramienta(Herramientas herramienta) {
        IHerramientasDao dao = new HerramientasDaoImpl();
        Herramientas h;
        h = dao.consultarHerramienta(herramienta);
        return h;
    }

    public List<String> llenarComboResponsable() {
        IHerramientasDao dao = new HerramientasDaoImpl();
        List<String> list = dao.llenarComboResponsable();

        return list;
    }

    public String consultarResponsablePorIdEmpleado(Herramientas herramienta) {
        IHerramientasDao dao = new HerramientasDaoImpl();
        String h;
        h = dao.consultarResponsablePorIdEmpleado(herramienta);
        return h;
    }
}

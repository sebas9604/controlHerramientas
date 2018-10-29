/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.EmpleadosDaoImpl;
import modelo.Empleados;
import vistaPk.VistaEmpleado;
import interfaces.IEmpleadosDao;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author tolis
 */
public class ControllerEmpleados {

    private VistaEmpleado vista = new VistaEmpleado();

    //llama al DAO para guardar un empleado
    public void registrar(Empleados empleado) {
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        dao.registrarNuevoEmpleado(empleado);
    }

    //llama al DAO para actualizar un empleado
    public void actualizar(Empleados empleado) {
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        dao.actualizarEmpleado(empleado);
    }

    //llama al DAO para eliminar un empleado
    public void eliminar(Empleados empleado) {
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        dao.eliminarEmpleado(empleado);
    }

    //llama al DAO para obtener todos los empleados y luego los muestra en la vista
    public void verEmpleados(JTable tabla) {
        ResultSet empleados = null;
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        empleados = dao.obtenerEmpleados();
        vista.verEmpleados(empleados, tabla);
    }

    public void verEmpleado(JTable tabla, Empleados empleado) {
        ResultSet empleados = null;
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        empleados = dao.obtenerEmpleado(empleado);
        vista.verEmpleado(empleados, tabla);
    }

    public Empleados consultarEmpleado(Empleados empleado) {
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        Empleados e;
        e = dao.consultarEmpleado(empleado);
        return e;
    }

    public List<String> llenarComboCargo() {
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        List<String> list = dao.llenarComboEmpleado();

        return list;
    }

    public String consultarCargoPorIdCargo(Empleados empleado) {
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        String h;
        h = dao.consultarCargoPorIdCargo(empleado);
        return h;
    }
    
        public void verHerramientasACargo(JTable tabla) {
        ResultSet herramientasACargo = null;
        IEmpleadosDao dao = new EmpleadosDaoImpl();
        herramientasACargo = dao.obtenerHerramientasACargo();
        vista.verHerramientasACargo(herramientasACargo, tabla);
    }
}

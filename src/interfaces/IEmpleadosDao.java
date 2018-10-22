package interfaces;

import java.sql.ResultSet;
import java.util.List;
import modelo.Empleados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tolis
 */
public interface IEmpleadosDao {
    	public boolean registrarNuevoEmpleado(Empleados empleado);
	public ResultSet obtenerEmpleados();
	public boolean actualizarEmpleado(Empleados empleado);
	public boolean eliminarEmpleado(Empleados empleado);
        public ResultSet obtenerEmpleado(Empleados empleado);
        public Empleados consultarEmpleado(Empleados empleado);
}

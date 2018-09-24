package interfaces;

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
public interface IEmpleadosDAO {
    	public boolean registrarNuevoEmpleado(Empleados empleado);
	public List<Empleados> obtenerEmpleados();
	public boolean actualizarEmpleado(Empleados empleado);
	public boolean eliminarEmpleado(Empleados empleado);
}

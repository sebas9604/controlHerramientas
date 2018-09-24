/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.EmpleadosDAOImpl;
import interfaces.IEmpleadosDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleados;
import vistaPk.vistaEmpleado;

/**
 *
 * @author tolis
 */
public class controllerEmpleados {
    
    private vistaEmpleado vista = new vistaEmpleado();
    
    	//llama al DAO para guardar un empleado
	public void registrar(Empleados empleado ) {
		IEmpleadosDAO dao= new  EmpleadosDAOImpl();
		dao.registrarNuevoEmpleado(empleado);
	}
	
	//llama al DAO para actualizar un empleado
	public void actualizar(Empleados empleado) {
		IEmpleadosDAO dao= new  EmpleadosDAOImpl();
		dao.actualizarEmpleado(empleado);
	}
	
	//llama al DAO para eliminar un empleado
	public void eliminar(Empleados empleado) {
		IEmpleadosDAO dao= new  EmpleadosDAOImpl();
		dao.eliminarEmpleado(empleado);
	}
	
	//llama al DAO para obtener todos los empleados y luego los muestra en la vista
	public void verEmpleados(){
		List<Empleados> empleados = new ArrayList<Empleados>();
		IEmpleadosDAO dao= new  EmpleadosDAOImpl();
		empleados=dao.obtenerEmpleados();
                vista.verEmpleados(empleados);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.EmpleadosDaoImpl;
import java.util.ArrayList;
import java.util.List;
import modelo.Empleados;
import vistaPk.VistaEmpleado;
import interfaces.IEmpleadosDao;
import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author tolis
 */
public class ControllerEmpleados {
    
    private VistaEmpleado vista = new VistaEmpleado();
    
    	//llama al DAO para guardar un empleado
	public void registrar(Empleados empleado ) {
		IEmpleadosDao dao= new  EmpleadosDaoImpl();
		dao.registrarNuevoEmpleado(empleado);
	}
	
	//llama al DAO para actualizar un empleado
	public void actualizar(Empleados empleado) {
		IEmpleadosDao dao= new  EmpleadosDaoImpl();
		dao.actualizarEmpleado(empleado);
	}
	
	//llama al DAO para eliminar un empleado
	public void eliminar(Empleados empleado) {
		IEmpleadosDao dao= new  EmpleadosDaoImpl();
		dao.eliminarEmpleado(empleado);
	}
	
	//llama al DAO para obtener todos los empleados y luego los muestra en la vista
	public void verEmpleados(JTable tabla, Empleados empleado){

	}
}

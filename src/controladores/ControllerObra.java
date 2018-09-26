/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.ObraDaoImpl;
import interfaces.IObraDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import modelo.Obra;
import vistaPk.vistaObra;

/**
 *
 * @author tolis
 */
public class ControllerObra {
        private vistaPk.vistaObra vista = new vistaObra();
    
    	//llama al DAO para guardar un empleado
	public void registrar(Obra empleado ) {
		IObraDao dao= new  ObraDaoImpl();
		dao.registrarNuevaObra(empleado);
	}
	
	//llama al DAO para actualizar un empleado
	public void actualizar(Obra empleado) {
		IObraDao dao= new  ObraDaoImpl();
		dao.actualizarObra(empleado);
	}
	
	//llama al DAO para eliminar un empleado
	public void eliminar(Obra empleado) {
		IObraDao dao= new  ObraDaoImpl();
		dao.eliminarObra(empleado);
	}
	
	//llama al DAO para obtener todos los empleados y luego los muestra en la vista
	public void verObras(JTable tablaObras){
		
                vista.verObras(tablaObras);
	}
}

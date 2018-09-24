/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistaPk;

import java.util.List;
import modelo.Empleados;

/**
 *
 * @author tolis
 */
public class vistaEmpleado {
    
	public void verEmpleado(Empleados empleado) {
		System.out.println("Datos del Empleado: "+empleado);
	}
	
	public void verEmpleados(List<Empleados> empleados) {
		for (Empleados empleado : empleados) {
			System.out.println("Datos del Empleado: "+empleado);
		}		
	}

}

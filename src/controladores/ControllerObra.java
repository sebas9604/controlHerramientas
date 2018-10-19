/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.ObraDaoImpl;
import interfaces.IObraDao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import modelo.Obra;
import vistaPk.VistaObra;

/**
 *
 * @author tolis
 */
public class ControllerObra {
        private vistaPk.VistaObra vista = new VistaObra();
    
    	//llama al DAO para guardar un obra
	public void registrar(Obra obra ) {
		IObraDao dao= new  ObraDaoImpl();
		dao.registrarNuevaObra(obra);
	}
	
	//llama al DAO para actualizar un obra
	public void actualizar(Obra obra) {
		IObraDao dao= new  ObraDaoImpl();
		dao.actualizarObra(obra);
	}
	
	//llama al DAO para eliminar un obra
	public void eliminar(Obra obra) {
		IObraDao dao= new  ObraDaoImpl();
		dao.eliminarObra(obra);
	}
	
	//llama al DAO para obtener todos los obras y luego los muestra en la vista
//	public void verObras(JTable tablaObras){
//		
//                vista.verObras(tablaObras);
//	}
        
        	//llama al DAO para obtener todos los obras y luego los muestra en la vista
	public void verObras(JTable tabla){
		ResultSet obras = null;
		IObraDao dao= new  ObraDaoImpl();
		obras=dao.obtenerObras();
                vista.verObras(obras, tabla);
	}
        
        public void verObra(JTable tabla, Obra obra){
		ResultSet obras = null;
		IObraDao dao= new ObraDaoImpl();
		obras=dao.obtenerObra(obra);
                vista.verObra(obras, tabla);
	}
        
        public Obra consultarObra(Obra obra){
        IObraDao dao = new ObraDaoImpl();
        Obra o;
        o = dao.consultarObra(obra);
            return o;
        }
}

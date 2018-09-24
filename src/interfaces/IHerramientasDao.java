/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.Herramientas;

/**
 *
 * @author tolis
 */
public interface IHerramientasDao {
        public boolean registrarNuevaHerramienta(Herramientas herramienta);
	public List<Herramientas> obtenerHerramientas();
	public boolean actualizarHerramienta(Herramientas herramienta);
	public boolean eliminarHerramienta(Herramientas herramienta);
}

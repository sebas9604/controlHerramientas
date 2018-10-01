/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.ResultSet;
import java.util.List;
import modelo.MantenimientoHerramienta;

/**
 *
 * @author tolis
 */
public interface IMantenimientoHerramientaDao {
        public boolean registrarNuevoMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta);
	public ResultSet obtenerMantenimientoHerramientas();
	public boolean actualizarMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta);
	public boolean eliminarMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta);
        public ResultSet obtenerMantenimientoHerramienta(MantenimientoHerramienta mantenimientoHerramienta);

}

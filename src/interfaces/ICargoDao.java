/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.ResultSet;
import modelo.Cargo;

/**
 *
 * @author tolis
 */
public interface ICargoDao {
    
    public boolean registrarNuevaCargo(Cargo cargo);

    public ResultSet obtenerCargo(Cargo cargo, Boolean msj);

    public ResultSet obtenerCargos();
    
    public Cargo consultarCargo(Cargo cargo);

    public boolean actualizarCargo(Cargo cargo);

    public boolean eliminarCargo(Cargo cargo);
}

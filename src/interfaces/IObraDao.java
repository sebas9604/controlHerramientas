/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.ResultSet;
import java.util.List;
import modelo.Obra;

/**
 *
 * @author tolis
 */
public interface IObraDao {

    public boolean registrarNuevaObra(Obra obra);

    public ResultSet obtenerObra(Obra obra);

    public ResultSet obtenerObras();
    
    public Obra consultarObra(Obra obra);

    public boolean actualizarObra(Obra obra);

    public boolean eliminarObra(Obra obra);
}

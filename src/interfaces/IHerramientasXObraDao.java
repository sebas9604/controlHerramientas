/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import modelo.HerramientasXObra;

/**
 *
 * @author tolis
 */
public interface IHerramientasXObraDao {

    public boolean registrarMovimiento(HerramientasXObra objeto);

    public boolean actualizarMovimiento(HerramientasXObra objeto);

    public List<String> llenarComboObra();

}

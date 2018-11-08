/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.HerramientasXObraImpl;
import interfaces.IHerramientasXObraDao;
import java.util.List;
import modelo.HerramientasXObra;

/**
 *
 * @author tolis
 */
public class ControllerHerramientasXObra {
    //llama al DAO para guardar un cargo

    public void registrar(HerramientasXObra objeto) {
        IHerramientasXObraDao dao = new HerramientasXObraImpl();
        dao.registrarMovimiento(objeto);
    }

    //llama al DAO para actualizar un cargo
    public void actualizar(HerramientasXObra objeto) {
        IHerramientasXObraDao dao = new HerramientasXObraImpl();
        dao.actualizarMovimiento(objeto);
    }

    public List<String> llenarComboCentroCosto() {
        IHerramientasXObraDao dao = new HerramientasXObraImpl();
        List<String> list = dao.llenarComboObra();

        return list;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import implementacion.UsuarioDaoImpl;
import interfaces.IUsuarioDao;
import modelo.Usuario;

/**
 *
 * @author jcarranza
 */
public class ControllerUsuario {
    
    
        public boolean consultarUsuario(Usuario usuario) {
            boolean b;
        IUsuarioDao dao = new UsuarioDaoImpl();
        Usuario u;
        b = dao.consultarUsuario(usuario);
        return b;
    }
}

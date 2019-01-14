/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jcarranza
 */
public class Usuario {

    public String idUsuario;
    public String contrasenaUsuario;

    /**
     * @return the idUsuario
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the contrasenaUsuario
     */
    public String getContrasenaUsuario() {
        return contrasenaUsuario;
    }

    /**
     * @param contrasenaUsuario the contrasenaUsuario to set
     */
    public void setContrasenaUsuario(String contrasenaUsuario) {
        this.contrasenaUsuario = contrasenaUsuario;
    }

}

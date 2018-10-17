/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author tolis
 */
public class Obra {

    public Obra() {
    }

    public Obra(String idObra, String nombreObra, String direccionObra) {
        this.idObra = idObra;
        this.nombreObra = nombreObra;
        this.direccionObra = direccionObra;
    }
    
    
    private String idObra;
    private String nombreObra;
    private String direccionObra;

    public String getIdObra() {
        return idObra;
    }

    public void setIdObra(String idObra) {
        this.idObra = idObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public void setNombreObra(String nombreObra) {
        this.nombreObra = nombreObra;
    }

    public String getDireccionObra() {
        return direccionObra;
    }

    public void setDireccionObra(String direccionObra) {
        this.direccionObra = direccionObra;
    }

    @Override
    public String toString() {
        return "Obra{" + "idObra=" + idObra + ", nombreObra=" + nombreObra + ", direccionObra=" + direccionObra + '}';
    }
    
    
}

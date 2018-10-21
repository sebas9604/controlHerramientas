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
public class Cargo {

    public Cargo(int idCargo, String nombreCargo) {
        this.idCargo = idCargo;
        this.nombreCargo = nombreCargo;
    }
    
    
    private int idCargo;
    private String nombreCargo;

    public Cargo() {
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    @Override
    public String toString() {
        return "Cargo{" + "idCargo=" + idCargo + ", nombreCargo=" + nombreCargo + '}';
    }
    
    
}

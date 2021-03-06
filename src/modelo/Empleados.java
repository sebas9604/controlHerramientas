/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author tolis
 */
public class Empleados {

    public Empleados() {
    }

    public Empleados(String idEmpleado, String nombresEmpleado, String apellidosEmpleado, String cargoEmpleado, String fotoEmpleado) {
        this.idEmpleado = idEmpleado;
        this.nombresEmpleado = nombresEmpleado;
        this.apellidosEmpleado = apellidosEmpleado;
        this.cargoEmpleado = cargoEmpleado;
        this.fotoEmpleado = fotoEmpleado;
    }
    
    
    private String idEmpleado;
    private String nombresEmpleado;
    private String apellidosEmpleado;
    private String cargoEmpleado;
    private String fotoEmpleado;
    private ImageIcon fotoEmp;

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombresEmpleado() {
        return nombresEmpleado;
    }

    public void setNombresEmpleado(String nombresEmpleado) {
        this.nombresEmpleado = nombresEmpleado;
    }

    public String getApellidosEmpleado() {
        return apellidosEmpleado;
    }

    public void setApellidosEmpleado(String apellidosEmpleado) {
        this.apellidosEmpleado = apellidosEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public String getFotoEmpleado() {
        return fotoEmpleado;
    }

    public void setFotoEmpleado(String fotoEmpleado) {
        this.fotoEmpleado = fotoEmpleado;
    }

    public ImageIcon getFotoEmp() {
        return fotoEmp;
    }

    public void setFotoEmp(ImageIcon fotoEmp) {
        this.fotoEmp = fotoEmp;
    }

    @Override
    public String toString() {
        return "Empleados{" + "idEmpleado=" + idEmpleado + ", nombresEmpleado=" + nombresEmpleado + ", apellidosEmpleado=" + apellidosEmpleado + ", cargoEmpleado=" + cargoEmpleado + ", fotoEmpleado=" + fotoEmpleado + '}';
    }
    
    
    
}

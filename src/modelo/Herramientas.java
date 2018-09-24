/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author tolis
 */
public class Herramientas {

    public Herramientas() {
    }

    public Herramientas(String idHerramienta, String nombreHerramienta, String lugarCompraHerramienta, int precioCompraHerramienta, int idEmpleado, String estadoHerramienta) {
        this.idHerramienta = idHerramienta;
        this.nombreHerramienta = nombreHerramienta;
        this.lugarCompraHerramienta = lugarCompraHerramienta;
        this.precioCompraHerramienta = precioCompraHerramienta;
        this.idEmpleado = idEmpleado;
        this.estadoHerramienta = estadoHerramienta;
    }

    public Herramientas(String idHerramienta, int idObra, Date fechaEntradaObraHerramienta, Date fechaSalidaObraHerramienta, int idEmpleado) {
        this.idHerramienta = idHerramienta;
        this.idObra = idObra;
        this.fechaEntradaObraHerramienta = fechaEntradaObraHerramienta;
        this.fechaSalidaObraHerramienta = fechaSalidaObraHerramienta;
        this.idEmpleado = idEmpleado;
    }

    public Herramientas(String idHerramienta, String nombreHerramienta, String lugarCompraHerramienta, int precioCompraHerramienta, int idObra, Date fechaEntradaObraHerramienta, Date fechaSalidaObraHerramienta, int idEmpleado, String estadoHerramienta) {
        this.idHerramienta = idHerramienta;
        this.nombreHerramienta = nombreHerramienta;
        this.lugarCompraHerramienta = lugarCompraHerramienta;
        this.precioCompraHerramienta = precioCompraHerramienta;
        this.idObra = idObra;
        this.fechaEntradaObraHerramienta = fechaEntradaObraHerramienta;
        this.fechaSalidaObraHerramienta = fechaSalidaObraHerramienta;
        this.idEmpleado = idEmpleado;
        this.estadoHerramienta = estadoHerramienta;
    }
    
    
    
    private String idHerramienta;
    private String nombreHerramienta;
    private String lugarCompraHerramienta;
    private int precioCompraHerramienta;
    private int idObra;
    private Date fechaEntradaObraHerramienta;
    private Date fechaSalidaObraHerramienta;
    private int idEmpleado;
    private String estadoHerramienta;

    public String getIdHerramienta() {
        return idHerramienta;
    }

    public void setIdHerramienta(String idHerramienta) {
        this.idHerramienta = idHerramienta;
    }

    public String getNombreHerramienta() {
        return nombreHerramienta;
    }

    public void setNombreHerramienta(String nombreHerramienta) {
        this.nombreHerramienta = nombreHerramienta;
    }

    public String getLugarCompraHerramienta() {
        return lugarCompraHerramienta;
    }

    public void setLugarCompraHerramienta(String lugarCompraHerramienta) {
        this.lugarCompraHerramienta = lugarCompraHerramienta;
    }

    public int getPrecioCompraHerramienta() {
        return precioCompraHerramienta;
    }

    public void setPrecioCompraHerramienta(int precioCompraHerramienta) {
        this.precioCompraHerramienta = precioCompraHerramienta;
    }

    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public Date getFechaEntradaObraHerramienta() {
        return fechaEntradaObraHerramienta;
    }

    public void setFechaEntradaObraHerramienta(Date fechaEntradaObraHerramienta) {
        this.fechaEntradaObraHerramienta = fechaEntradaObraHerramienta;
    }

    public Date getFechaSalidaObraHerramienta() {
        return fechaSalidaObraHerramienta;
    }

    public void setFechaSalidaObraHerramienta(Date fechaSalidaObraHerramienta) {
        this.fechaSalidaObraHerramienta = fechaSalidaObraHerramienta;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEstadoHerramienta() {
        return estadoHerramienta;
    }

    public void setEstadoHerramienta(String estadoHerramienta) {
        this.estadoHerramienta = estadoHerramienta;
    }

    @Override
    public String toString() {
        return "Herramientas{" + "idHerramienta=" + idHerramienta + ", nombreHerramienta=" + nombreHerramienta + ", lugarCompraHerramienta=" + lugarCompraHerramienta + ", precioCompraHerramienta=" + precioCompraHerramienta + ", idObra=" + idObra + ", fechaEntradaObraHerramienta=" + fechaEntradaObraHerramienta + ", fechaSalidaObraHerramienta=" + fechaSalidaObraHerramienta + ", idEmpleado=" + idEmpleado + ", estadoHerramienta=" + estadoHerramienta + '}';
    }
    
    
}

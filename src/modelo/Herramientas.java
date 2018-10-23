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
public class Herramientas {

    public Herramientas() {
    }

    private String idHerramienta;
    private String nombreHerramienta;
    private String lugarCompraHerramienta;
    private int precioCompraHerramienta;
    private String fechaCompraHerramienta;
    private int idObra;
    private String fechaEntradaObraHerramienta;
    private String fechaSalidaObraHerramienta;
    private int idEmpleado;
    private String estadoHerramienta;
    private ImageIcon fotoHerr;

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

    public String getFechaEntradaObraHerramienta() {
        return fechaEntradaObraHerramienta;
    }

    public void setFechaEntradaObraHerramienta(String fechaEntradaObraHerramienta) {
        this.fechaEntradaObraHerramienta = fechaEntradaObraHerramienta;
    }

    public String getFechaSalidaObraHerramienta() {
        return fechaSalidaObraHerramienta;
    }

    public void setFechaSalidaObraHerramienta(String fechaSalidaObraHerramienta) {
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
    
    public String getFechaCompraHerramienta() {
        return fechaCompraHerramienta;
    }

    public void setFechaCompraHerramienta(String fechaCompraHerramienta) {
        this.fechaCompraHerramienta = fechaCompraHerramienta;
    }

    public ImageIcon getFotoHerr() {
        return fotoHerr;
    }

    public void setFotoHerr(ImageIcon fotoHerr) {
        this.fotoHerr = fotoHerr;
    }

    @Override
    public String toString() {
        return "Herramientas{" + "idHerramienta=" + idHerramienta + ", nombreHerramienta=" + nombreHerramienta + ", lugarCompraHerramienta=" + lugarCompraHerramienta + ", precioCompraHerramienta=" + precioCompraHerramienta + ", idObra=" + idObra + ", fechaEntradaObraHerramienta=" + fechaEntradaObraHerramienta + ", fechaSalidaObraHerramienta=" + fechaSalidaObraHerramienta + ", idEmpleado=" + idEmpleado + ", estadoHerramienta=" + estadoHerramienta + '}';
    }
    
    
}

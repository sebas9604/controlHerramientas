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
public class HerramientasXObra {
   private String idObra;
   private String idHerramienta;
   private String fechaEntradaObraHerramienta;
   private String fechaSalidaObraHerramienta;

    public String getIdObra() {
        return idObra;
    }

    public void setIdObra(String idObra) {
        this.idObra = idObra;
    }

    public String getIdHerramienta() {
        return idHerramienta;
    }

    public void setIdHerramienta(String idHerramienta) {
        this.idHerramienta = idHerramienta;
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

    @Override
    public String toString() {
        return "HerramientasXObra{" + "idObra=" + idObra + ", idHerramienta=" + idHerramienta + ", fechaEntradaObraHerramienta=" + fechaEntradaObraHerramienta + ", fechaSalidaObraHerramienta=" + fechaSalidaObraHerramienta + '}';
    }
   
   
}

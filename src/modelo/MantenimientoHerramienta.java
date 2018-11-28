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
public class MantenimientoHerramienta {

    public MantenimientoHerramienta() {
    }

    public MantenimientoHerramienta(int idFacturaMantenimiento, String idHerramienta, String lugarMantenimiento, String fechaEntradaMantenimiento, String descripcionMantenimiento, String fotoAntesMantenimiento) {
        this.idFacturaMantenimiento = idFacturaMantenimiento;
        this.idHerramienta = idHerramienta;
        this.lugarMantenimiento = lugarMantenimiento;
        this.fechaEntradaMantenimiento = fechaEntradaMantenimiento;
        this.descripcionMantenimiento = descripcionMantenimiento;
        this.fotoAntesMantenimiento = fotoAntesMantenimiento;
    }

    public MantenimientoHerramienta(int idFacturaMantenimiento, String idHerramienta, String lugarMantenimiento, String fechaEntradaMantenimiento, String fechaSalidaMantenimiento, String descripcionMantenimiento, String fotoAntesMantenimiento, String fotoDespuesMantenimiento) {
        this.idFacturaMantenimiento = idFacturaMantenimiento;
        this.idHerramienta = idHerramienta;
        this.lugarMantenimiento = lugarMantenimiento;
        this.fechaEntradaMantenimiento = fechaEntradaMantenimiento;
        this.fechaSalidaMantenimiento = fechaSalidaMantenimiento;
        this.descripcionMantenimiento = descripcionMantenimiento;
        this.fotoAntesMantenimiento = fotoAntesMantenimiento;
        this.fotoDespuesMantenimiento = fotoDespuesMantenimiento;
    }
    
    
    private int idFacturaMantenimiento;
    private String idHerramienta;
    private String lugarMantenimiento;
    private String fechaEntradaMantenimiento;
    private String fechaSalidaMantenimiento;
    private String descripcionMantenimiento;
    private String fotoAntesMantenimiento;
    private String fotoDespuesMantenimiento;

    public int getIdFacturaMantenimiento() {
        return idFacturaMantenimiento;
    }

    public void setIdFacturaMantenimiento(int idFacturaMantenimiento) {
        this.idFacturaMantenimiento = idFacturaMantenimiento;
    }

    public String getIdHerramienta() {
        return idHerramienta;
    }

    public void setIdHerramienta(String idHerramienta) {
        this.idHerramienta = idHerramienta;
    }

    public String getLugarMantenimiento() {
        return lugarMantenimiento;
    }

    public void setLugarMantenimiento(String lugarMantenimiento) {
        this.lugarMantenimiento = lugarMantenimiento;
    }

    public String getFechaEntradaMantenimiento() {
        return fechaEntradaMantenimiento;
    }

    public void setFechaEntradaMantenimiento(String fechaEntradaMantenimiento) {
        this.fechaEntradaMantenimiento = fechaEntradaMantenimiento;
    }

    public String getFechaSalidaMantenimiento() {
        return fechaSalidaMantenimiento;
    }

    public void setFechaSalidaMantenimiento(String fechaSalidaMantenimiento) {
        this.fechaSalidaMantenimiento = fechaSalidaMantenimiento;
    }

    public String getDescripcionMantenimiento() {
        return descripcionMantenimiento;
    }

    public void setDescripcionMantenimiento(String descripcionMantenimiento) {
        this.descripcionMantenimiento = descripcionMantenimiento;
    }

    public String getFotoAntesMantenimiento() {
        return fotoAntesMantenimiento;
    }

    public void setFotoAntesMantenimiento(String fotoAntesMantenimiento) {
        this.fotoAntesMantenimiento = fotoAntesMantenimiento;
    }

    public String getFotoDespuesMantenimiento() {
        return fotoDespuesMantenimiento;
    }

    public void setFotoDespuesMantenimiento(String fotoDespuesMantenimiento) {
        this.fotoDespuesMantenimiento = fotoDespuesMantenimiento;
    }

    @Override
    public String toString() {
        return "MantenimientoHerramienta{" + "idFacturaMantenimiento=" + idFacturaMantenimiento + ", idHerramienta=" + idHerramienta + ", lugarMantenimiento=" + lugarMantenimiento + ", fechaEntradaMantenimiento=" + fechaEntradaMantenimiento + ", fechaSalidaMantenimiento=" + fechaSalidaMantenimiento + ", descripcionMantenimiento=" + descripcionMantenimiento + ", fotoAntesMantenimiento=" + fotoAntesMantenimiento + ", fotoDespuesMantenimiento=" + fotoDespuesMantenimiento + '}';
    }
    
    
}

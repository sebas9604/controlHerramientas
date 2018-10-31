package interfaces;

import java.sql.ResultSet;
import java.util.List;
import javax.swing.JComboBox;
import modelo.Empleados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tolis
 */
public interface IEmpleadosDao {

    public boolean registrarNuevoEmpleado(Empleados empleado);

    public ResultSet obtenerEmpleados();
    
    public ResultSet obtenerHerramientasACargo(Empleados empleadp);

    public boolean actualizarEmpleado(Empleados empleado);

    public boolean eliminarEmpleado(Empleados empleado);

    public ResultSet obtenerEmpleado(Empleados empleado);

    public Empleados consultarEmpleado(Empleados empleado);

    public List<String> llenarComboEmpleado();

    public String consultarCargoPorIdCargo(Empleados empleado);
}

package ejercicio17;
public class Empleado {
 private int codEmpleado;
 private Sueldo sueldoEmpleado;

    /**
     * @return the codEmpleado
     */
    public int getCodEmpleado() {
        return codEmpleado;
    }

    /**
     * @param codEmpleado the codEmpleado to set
     */
    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    /**
     * @return the sueldoEmpleado
     */
    public Sueldo getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    /**
     * @param sueldoEmpleado the sueldoEmpleado to set
     */
    public void setSueldoEmpleado(Sueldo sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }
}

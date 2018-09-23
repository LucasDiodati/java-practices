
package ejercicio15;
public class Alumno {
    private Comision comision;
    private double parcial;
    private String nombre;
    private static int cantidad;
    
    public void setAlumno(String nom, Comision com, double parc){
    nombre = nom;
    setComision(com);
    parcial = parc;
    cantidad++;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    public Comision getComision(){
        return comision;
    }
    
    public double getNota(){
        return parcial;
    }
    
    public static int getCantidad() {
        return cantidad;
    }

    /**
     * @param comision the comision to set
     */
    public void setComision(Comision comision) {
        this.comision = comision;
    }
    
}
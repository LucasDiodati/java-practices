package ejercicio15;
public class Comision {
    private int cantidadDeAlumnos;
    private double notaPromedio;
    private int numeroComision;


    public int getCantidadDeAlumnos() {
        return cantidadDeAlumnos;
    }


    public void setCantidadDeAlumnos(int numeroComision) {
        this.cantidadDeAlumnos = numeroComision;
    }


    public double getNotaPromedio() {
        return notaPromedio;
    }


    public void setNotaPromedio(double notaPromedio) {
        this.notaPromedio = notaPromedio;
    }

    /**
     * @return the numeroComision
     */
    public int getNumeroComision() {
        return numeroComision;
    }

    /**
     * @param numeroComision the numeroComision to set
     */
    public void setNumeroComision(int numeroComision) {
        this.numeroComision = numeroComision;
    }
}

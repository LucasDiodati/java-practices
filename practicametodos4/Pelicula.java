package practicametodos4;
public class Pelicula {
    private int codigoPelicula;
    private String nombrePelicula;
    private Fecha fecha;
    
    public void setCodigo(int cod){
    this.codigoPelicula = cod;
    }

    public int getCodigo(){
    return this.codigoPelicula;
    }
    
    public void setNombre(String nombre){
    this.nombrePelicula = nombre;
    }
    
    public String getNombre(){
    return this.nombrePelicula;
    }
    
    public void setFecha(Fecha date){
    this.fecha = date;
    }
    
    public Fecha getFecha(){
    return this.fecha;
    }
    
}
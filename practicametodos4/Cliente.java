package practicametodos4;
public class Cliente {
    private int codigoCliente;
    private String nombre;
    private Fecha fechaAlta;
    private int edad;
    
    public void setCodigoCliente(int cod){
    this.codigoCliente = cod;
    }
    
    public int getCodigoCliente(){
    return this.codigoCliente;
    }
    
    public void setNombre(String nom){
    this.nombre = nom;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public void setFecha(Fecha date){
    this.fechaAlta = date;
    }
    
    public Fecha getFecha(){
    return this.fechaAlta;
    }
    
    public void setEdad(int age){
    this.edad = age;
    }
    
    public int getEdad(){
    return this.edad;
    }
    
    
}

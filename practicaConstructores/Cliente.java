package practicaConstructores;

public class Cliente {
    private int codigoCliente;
    private String nombre;
    private Fecha alta;
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

    public void setFechaCli(Fecha date){
    this.alta = date;
    }
    
    public Fecha getFechaCli(){
    return this.alta;
    }
    
    public void setEdad(int age){
    this.edad = age;
    }
    
    public int getEdad(){
    return this.edad;
    }   
}
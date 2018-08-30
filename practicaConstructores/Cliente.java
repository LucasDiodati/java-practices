package practicaConstructores;

public class Cliente {
    private int codigoCliente;
    private String nombre;
    private Fecha alta;
    private int edad;
    private String contraseña;
    private boolean valido;
    
    // metodo que valida el largo de contraseña
    public void validar(boolean vale){
    int largo = this.contraseña.length();
        if(largo >= 8){
        vale = true;
        System.out.println("La contraseña es valida");
        }else{
        System.out.println("La contraseña es invalida");
        vale = false;
        }
    }
    
    // Constructor que recibe el valor de contraseña instanciado y llama al metodo de validacion
    public Cliente(int cdg, String nm, int ant, String contr){
    this.codigoCliente = cdg;
    this.nombre = nm;
    this.edad = ant;
    this.contraseña = contr;
    validar(this.valido);
    }
    
    
    
    public Cliente(){}
    
    
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
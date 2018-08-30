package practicaConstructores;
public class Pelicula {

    //variables privadas, solo accesibles dentro del scope de la clase Pelicula
    private int codigoPelicula;
    private String nombrePelicula;
    private Fecha fecha;

    
    //declaracion de metodo referenciando al tipo de dato del constructor
    public void mostrarNombre(String nomb){
    String salida = "Instanciaste una pelicula nueva! \n El nombre de la pelicula es " + nomb;
    System.out.println(salida); 
    }

    //Constructor Pelicula con todos los paametros
    public Pelicula(int cod, String nom, Fecha alq){
     this.codigoPelicula = cod;
     this.nombrePelicula = nom;
     this.fecha = alq;
     
     
    //llamada al metodo 
    mostrarNombre(nom);
    }
    
    
    //Constructor sin parametros (si no haces una clase constructora esto viene implicito en la clase)
    //en el constructor por defecto se llama con "this" a otro constructor y se le pasa los parametros implicitamente
    public Pelicula(){
    
        
    this(1,"Pelicula nueva");
    }
    
    // Constructor con solo dos parametros
    // En este tambien se llama al metodo "mostrar nombre"
    public Pelicula(int cdg, String nmbr){
    this.codigoPelicula = cdg;
    this.nombrePelicula = nmbr;
        mostrarNombre(nmbr);

    }

    
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
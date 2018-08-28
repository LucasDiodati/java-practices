package practicametodos4;
public class Practicametodos4 {
    public static void main(String[] args) {
        
        Fecha hoy = new Fecha();       
        hoy.setFecha(28, 8, 2018);
        
        Fecha ayer = new Fecha();
        ayer.setFecha(27, 8, 2018);
        
        Pelicula peli1 = new Pelicula();
        peli1.setCodigo(7);
        peli1.setNombre("La llamada");
        
        Cliente humano1 = new Cliente();
        humano1.setCodigoCliente(45);
        humano1.setNombre("Lucas");
        humano1.setEdad(27);
        humano1.setFecha(hoy);
        
        Cliente humano2 = new Cliente();
        humano2.setCodigoCliente(77);
        humano2.setNombre("Martin");
        humano2.setEdad(49);
        humano2.setFecha(ayer);
               
        if(humano1.getEdad()>humano2.getEdad()){
        System.out.println("El primer cliente es mayor");
        }else if(humano1.getEdad()<humano2.getEdad()){
        System.out.println("El segundo cliente es mayor");
        } else {
        System.out.println("Los clientes tienen la misma edad");
        }
        
        
        
    }
}
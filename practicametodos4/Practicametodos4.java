package practicametodos4;
public class Practicametodos4 {
    public static void main(String[] args) {
        
        Fecha hoy = new Fecha();
        hoy.setDia(28);
        hoy.setMes(8);
        hoy.setAño(2018);
        
        Fecha ayer = new Fecha();
        ayer.setDia(27);
        ayer.setMes(8);
        ayer.setAño(2018);
        
        Pelicula peli1 = new Pelicula();
        peli1.setCodigo(7);
        peli1.setNombre("La llamada");
        
           
        Cliente humano1 = new Cliente();
        humano1.setCodigoCliente(45);
        humano1.setNombre("Lucas");
        humano1.setEdad(27);
        humano1.setFechaCli(hoy);
        
        
        Cliente humano2 = new Cliente();
        humano2.setCodigoCliente(77);
        humano2.setNombre("Martin");
        humano2.setEdad(49);
        humano2.setFechaCli(ayer);
               
        if(humano1.getEdad()>humano2.getEdad()){
        System.out.println("El primer cliente es mayor");
        }else if(humano1.getEdad()<humano2.getEdad()){
        System.out.println("El segundo cliente es mayor");
        } else {
        System.out.println("Los clientes tienen la misma edad");
        }

        int año1 = humano1.getFechaCli().getAño();
        int año2 = humano2.getFechaCli().getAño();
        
        if(año1 > año2){
        System.out.println("El primer año es mayor");
        }else if(año2 > año1){
        System.out.println("El segundo año es mayor");
        }else{
        System.out.println("Los años son iguales");
        }
        
    }
}
package practicametodos4;
public class Practicametodos4 {
    public static void main(String[] args) {
        
        Fecha hoy = new Fecha();
        
        hoy.dia = 28;
        hoy.mes = 8;
        hoy.año = 2018;
        
        Pelicula peli1 = new Pelicula();
        peli1.setCodigo(35);
        peli1.setNombre("La llamada");
        peli1.setFecha(hoy);

    }
    
}

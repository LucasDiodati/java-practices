package ejercicio14;
public class Ejercicio14 {
    public static void main(String[] args) {
        /*Se tienen como dato los importes de todas las facturas correspondientes
        al mes que acaba de finalizar de un comercio (no se sabe cuántas son). 
        Se desea conocer:
            •cuántas ventas se realizaron
            •importe promedio de las mismas
            •cuántos son los importes que superan los 30 pesos
        */

        double min = 1.00;
        double max = 1000.00;
        double factura;
        int totalVentas = 0;
        int mayorTreinta = 0;
        double promedioB = 0;
        double promedioA = 0;
        double promedio= 0;
        
        System.out.println("-----------------------------------");
        System.out.println("Facturas a consumidor final: ");
        
        for(int i=1; i <=29; i++){
        factura = Math.floor(Math.random() * max)/ min;      
        System.out.println("Factura FB000"+i+" = $"+factura+".- ");
        totalVentas++;
        if(factura>30){
         mayorTreinta++;
        }
        promedioB = (factura + promedioB)/2;
        }
        System.out.println("-----------------------------------");
        System.out.println("Facturas a responsables inscriptos: ");
        
        for(int e=1; e <=24; e++){
        factura = Math.floor(Math.random() * max)/ min;      
        System.out.println("Factura FA000"+e+" = $"+factura+".- ");
        totalVentas++;
        if(factura>30){
        mayorTreinta++;
        }
        promedioA = (factura + promedioB)/2;
        }
        promedio = Math.round((promedioA + promedioB)/2);
        
        System.out.println("------------------------------------------------------");
        System.out.println("El total de ventas mensual es: "+totalVentas);
        System.out.println("El importe promedio es: $"+promedio+".-");
        System.out.println("La cantidad de facturas que superan los $30 es : "+mayorTreinta);
    }
    
}

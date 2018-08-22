package ejercicio3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner entero = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de factura: ");
        int numFactura = entero.nextInt();
        
        System.out.println("Ingrese el monto total con el formato 0,00: ");
        double montoFactura = dobles.nextDouble();
        
        String monto = new DecimalFormat("#.##").format(montoFactura);
        String sinIva =  new DecimalFormat("#.##").format(montoFactura / 1.21);
        
        if(montoFactura > 0){
        System.out.println("El monto total de la factura "+numFactura+" es $"+monto+". El costo de bonificarlo es $"+sinIva+"+iva.-");
        }
        

    }
    
}

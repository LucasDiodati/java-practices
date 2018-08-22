package ejercicio4;
import java.util.Scanner;
import java.text.DecimalFormat;
/*Al monto obtenido calcularle el IVA (21%). 
Finalmente informar: el importe bruto, el valor de la bonificación, el importe bruto bonificado,
el monto correspondiente al IVA y el importe neto resultante.*/
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner entero = new Scanner(System.in);
        Scanner dobles = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de factura: ");
        int numFactura = entero.nextInt();
        
        System.out.println("Ingrese el monto total con el formato 0,00: ");
        double montoFactura = dobles.nextDouble();
        
        String monto = new DecimalFormat("#.##").format(montoFactura);
        double neto = montoFactura / 1.21;
        String sinIva =  new DecimalFormat("#.##").format(neto);
        String iva = new DecimalFormat("#.##").format(montoFactura - neto);
        
        if(montoFactura > 0){
        System.out.println("El monto total de la factura "+numFactura+" es $"+monto+".\n El importe bruto es $"+sinIva+".\n El monto del iva es: "+iva);
        }
        

    }
    
}

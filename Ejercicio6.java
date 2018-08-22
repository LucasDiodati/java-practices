package ejercicio6;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Ingrese el primer valor: ");
            int x = entrada.nextInt();

            System.out.println("Ingrese el primer valor: ");
            int y = entrada.nextInt();
            
            System.out.println("Ingrese el primer valor: ");
            int z = entrada.nextInt();
            
            System.out.println("Orden inicial: "+x+" "+y+" "+z);
            
            int zi = z;
            int yi = y;
            int xi = x;
            x = zi;
            y = xi;
            z = yi;
            
            System.out.println("Rotación: "+x+" "+y+" "+z);   
    }
    
}

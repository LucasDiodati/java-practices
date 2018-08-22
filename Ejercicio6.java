package ejercicio6;
import java.util.Scanner;
/*Ingresar 3 valores en 3 variables X,Y y Z. Se desea obtener una rotación de sus valores, 
es decir que el contenido de Z pase a X, el contenido de X pase a Y, y el contenido de Y pase a Z.
Se debe mostrar las variables X, Y y Z con sus valores originales y mostrar X, Y y Z con los valores luego de la rotación.
*/

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

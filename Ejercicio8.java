package ejercicio8;
import java.util.Scanner;
/*Dada la medida de cada uno de los tres ángulos de un triángulo
determinar e informar mediante un mensaje si pertenecen o no a un triángulo rectángulo.*/
public class Ejercicio8 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Ingrese el primer ángulo: ");
      int a = entrada.nextInt();
      
      System.out.println("Ingrese el primer ángulo: ");
      int b = entrada.nextInt();
      
      System.out.println("Ingrese el primer ángulo: ");
      int c = entrada.nextInt();
      
      if(a == 90 || b == 90 || c == 90){
      System.out.println("El triángulo es rectángulo");
      }else{
      System.out.println("El triángulo no es rectángulo");
      } 
    }
    
}

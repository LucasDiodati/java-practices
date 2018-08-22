package ejercicio8;
import java.util.Scanner;
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

package ejercicio7;
import java.util.Scanner;

/*Dado un número determinar si es positivo o negativo.*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int entero = valor.nextInt();
        
        if (entero >0) {
        System.out.println("El valor es positivo");
        }else if(entero < 0){
        System.out.println("El valor es negativo");
        }else {
        System.out.println("El valor es 0");
        }
    }
    
}

package operaciones;
import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        
        /*Dados dos números enteros obtener su suma, resta, multiplicación y división*/
                
        Scanner enteros = new Scanner(System.in);
        Scanner cadenas = new Scanner(System.in);
        int numUno = 0;
        int numDos = 0;
        int resultado = 0;
        String operacion = "";

        System.out.print("Ingrese el primer numero: ");
        numUno = enteros.nextInt();
// Si uso el mismo Scanner para int y string se genera un conflicto y no funciona Scanner. Hay que usar DOS diferentes
        System.out.print("Ingrese operador: ");
        operacion = cadenas.nextLine();       
        
        System.out.print("Ingrese el segundo numero: ");
        numDos = enteros.nextInt();
           
        switch(operacion){
            case "+":
            resultado = numUno + numDos;
            System.out.println(resultado);
            break;
             case "-":
            resultado = numUno - numDos;
            System.out.println(resultado);
            break;
            case "*":
            resultado = numUno * numDos;
            System.out.println(resultado);
            break;
            case "/":
            resultado = numUno / numDos;
            System.out.println("El resultado es: " + resultado);
            break;
            default:
            System.out.println("Error, la operación ingresada es invalida!");
            break;
        }
        
        
    }
    
}

package practicafunciones;
import java.util.Scanner;
public class PracticaFunciones {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Ingrese 1 para suma, 2 para resta y 3 para multiplicación: ");
        int operador = entrada.nextInt();
        
        switch(operador){
            case 1:
            suma(num1,num2);
            break;
            case 2:
            resta(num1,num2);
            break;
            case 3:
            multiplica(num1,num2);
            break;
            default:
            System.out.println("Error: el operador es incorrecto");
        }
        
    }
public static int suma(int n1, int n2){
    int resultado = n1 + n2;
System.out.println(resultado);
    return resultado;
}
public static int resta(int n1, int n2){
    int resultado = n1 - n2;
System.out.println(resultado);
    return resultado;
}
public static int multiplica(int n1, int n2){
    int resultado = n1 * n2;
System.out.println(resultado);
    return resultado;
}
    
}
package ejercicio8b;
import java.util.Scanner;
public class Ejercicio8b {
    public static void main(String[] args) {

        /*Se dan dos valores cualesquiera enteros.
        Si el primero es mayor que el segundo, restarle al primero un 20%,
        pero si el segundo es el mayor restarle al segundo un 15%.
        Con estos nuevos valores, si el primero quedo mayor a 100 y el segundo mayor a 150,
        se lo consideran valores correctos, de lo contrario es un intervalo de riesgo.*/
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer valor: ");
        int valor1 = entrada.nextInt();
        System.out.println("Ingrese el segundo valor: ");
        int valor2 = entrada.nextInt();
        
        if(valor1 > valor2){
        double resultado1 = valor1-(valor1*0.2);
        System.out.println("Valor1: "+resultado1+"\n Valor2: "+valor2);
        if(valor1 > 100 && valor2 >150){System.out.println("Los valores son correctos");}else{System.out.println("Intervalo de risgo");}
        }else{
        double resultado2 = valor2-(valor2*0.15);
        System.out.println("Valor1: "+valor1+"\n Valor2: "+resultado2);
        if(valor1 > 100 && valor2 >150){System.out.println("Los valores son correctos");}else{System.out.println("Intervalo de risgo");}
        }
    }
}

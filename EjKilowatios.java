package ejkilowatios;
import java.util.Scanner;
/*Dado como dato la cantidad de kilowatios consumidos por un usuario en un mes, calcular el importe a pagar por el mismo teniendo en cuenta que:
Si la cantidad de kilowatios consumidos es menor ó igual a 200, el precio del kilowatio es de 0.05 pesos.
Si la cantidad de kilowatios consumidos es mayor que 200 y menor que 1000, el precio del kilowatio es de 0.1 pesos.
Si la cantidad de kilowatios consumidos es mayor ó igual que 1000, el precio del kilowatio es de 0.15 pesos.
*/
public class EjKilowatios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el monto de kilowatios: ");
        int kw = entrada.nextInt();
        
        double precio = 0;
        
        if(kw <= 200){
        precio = 0.05;
        }else if(kw > 200 && kw < 1000){
        precio = 0.1;
        }else if(kw >= 1000){
        precio = 0.15;
        }else{
        System.out.println("El valor ingresado es incorrecto");
        }
        double consumo = kw * precio;
        
        System.out.println("La cantidad mensual consumida es: "+kw+" Kw. \n El precio por Kw es de : $"+precio+". \n El consumo es de: $"+consumo);

    }
    
}

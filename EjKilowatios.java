package ejkilowatios;
import java.util.Scanner;
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

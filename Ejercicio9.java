package ejercicio9;
public class Ejercicio9 {
    public static void main(String[] args) {
        /*Calcular el sueldo de cada uno de los 50 operarios de una fábrica dados como datos
        la remuneración por hora (es la misma para todos los operarios)
        y la cantidad de horas que trabajó en el mes cada operario.*/

        double remXHora = 106.50;
        
        // Clase de operarios:
        int maximoHoras = 80;
        int minimoHoras = 100;
        int opNumero = 1;

        for(int i = 1; i <=50; i++){
        double clase = Math.round(Math.random() * maximoHoras + minimoHoras);
        double sueldo = remXHora * clase;
        System.out.println("El operario N."+opNumero+" trabaja "+clase+" horas mensuales, y gana $"+sueldo+".");
        
        opNumero++;
        }


    }
    
}

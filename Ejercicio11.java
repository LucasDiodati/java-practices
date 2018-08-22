package ejercicio11;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;

public class Ejercicio11 {

    public static int generateRandomIntIntRange(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
}
    public static void main(String[] args) {
    /*Dada una lista de 93 números, determinar e informar el valor máximo y el orden en el que fue ingresado.*/

    System.out.println("Lista de 93 numeros al azar:");
    
    int[] lista;
    lista = new int[93];
    int a = 0;

    for(int i=1;i<=93;i++){
    lista[a] = generateRandomIntIntRange(1,99);
    System.out.print(lista[a]+" ");
    a++;
    }
    
    System.out.println(" ");
    IntSummaryStatistics stat = Arrays.stream(lista).summaryStatistics();
    int min = stat.getMin();
    int max = stat.getMax();
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);

    System.out.println("Array ordenado: ");
    Arrays.sort(lista);
    System.out.print(Arrays.toString(lista)+" ");
    
    }
}

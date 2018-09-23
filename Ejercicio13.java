package ejercicio13;
public class Ejercicio13 {

    /*
    Dado un conjunto de números enteros, determinar cuántos de ellos son mayores ó iguales que 100.
    Un número igual a cero indica fin de datos.
     */
    public static void main(String[] args) {

        
        int[] numeros = {45,100,123,654,24,7657,36,2,8,253,99,35,321,1,0,56};
        System.out.println("Secuencia de numeros: ");
        //Inicializo un acumulador para saber la cantidad de mayores
        int mayores = 0;
        //Bucle for para imprimir iterando los valores del arreglo
        for(int i = 1; i<numeros.length; i++){
            // Intercalo la condicion de de fin de datos para 0
            if(numeros[i] != 0 ){
        System.out.print(numeros[i]+ " ");
            }else{
        System.out.print("Se encontró un \"0\". Fin de datos ");
            }
        //Con la condicion if voy contando la cantidad de numeros mayores o iguales a 100
        if(numeros[i]>=100){mayores++;}
        }
        System.out.println("\n Hay "+mayores+" numeros mayores o iguales a 100");
        


        
        
    }
    
}

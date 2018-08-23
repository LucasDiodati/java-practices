package clasefunciones;

public class ClaseFunciones {

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 8;
        //llamada comun a variable
        System.out.println("numero1: "+num1 +" numero2: "+ num2);
        //llamada a funcion void
        funcion1(num1,num2);
        //asignacion de retorno a variable
        int suma = funcion2(num1,num2);
       //llamada a diferencia
        int dif = dif(num1,num2);
        //llamada a comparacion asignando
        String compara = comparacion(num1,num2);
        System.out.println(compara);
        //llamada a comparacion directamente
        System.out.println(comparacion(num1,num2));
        
    }
    
    //declaracion de funcion void
    public static void funcion1(int n1, int n2){
        //pisa declaracion de variable localmente
        n1 = 9;
        n2 = 8;
        int suma = n1 + n2;
    System.out.println("La suma de "+n1+" + "+n2+" es: "+suma);
    };
   //declaracion de funcion con retorno
    public static int funcion2(int n1, int n2){
        int suma = n1 + n2;
    System.out.println("La suma de los valores es: "+suma);
    return suma;
    };
    
    //declaracion de funcion de comparacion
    public static String comparacion(int n1, int n2){
    if(n1>n2){
        String resultado = "El primer numero es mayor al segundo";
        return resultado;
    }else if(n1<n2){
        String resultado = "El segundo numero es mayor al primero";
        return resultado;
    }else{
        String resultado = "Los valores son iguales";
        return resultado;
        }
    }
    
    //declaracion de funcion que determina la diferencia
    public static int dif(int n1, int n2){
    if(n1>n2){
        int diferencia = n1 - n2;
        System.out.println("El primer numero es mayor al segundo por: "+diferencia);
        return diferencia;
    }else{
    int diferencia = n2 - n1;
        System.out.println("El segundo numero es mayor al primero por: "+diferencia);
        return diferencia;
        }
    }
    
}
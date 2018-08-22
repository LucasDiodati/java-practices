package ejercicio10;
public class Ejercicio10 {
    public static void main(String[] args) {
        /*Dados como datos 200 números enteros, obtener y mostrar su suma.*/
        
        System.out.print("La suma de los números: ");
        int total = 0;
        
        for(int i=1; i <=200; i++){
        
        int min = 4;
        int max = 78;
        double numero = Math.round(Math.random() * max + min);
        float flotante = Math.round(numero);
        int num = Math.round(flotante);
        
        if(i <=199){
            System.out.print(num+"+");
            
            }else{
            System.out.print(num);
                 }
        total = total + num;
        }
        
        System.out.println(" \n Total="+total);
    }
}

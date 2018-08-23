package practicafunciones2;
//import javax.swing.JOptionPane;

import java.util.Scanner;

public class PracticaFunciones2 {
    public static void main(String[] args) {
    
      Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();
        
        System.out.println("Ingrese 1 para suma, 2 para resta y 3 para multiplicación: ");
        int operador = entrada.nextInt();
        
        //instancio un objeto de la clase operaciones
        Operaciones obj1 = new Operaciones();
        
        switch(operador){
            case 1:
            obj1.suma(num1, num2);
            break;
            case 2:
            obj1.resta(num1,num2);
            break;
            case 3:
            obj1.multiplica(num1,num2);
            break;
            default:
            System.out.println("Error: el operador es incorrecto");
            break;
        }
  
        /*

    String opciones[] = {"Suma","Resta","Multiplicación"};

    String salida1 = JOptionPane.showInputDialog("Ingresa el primer numero");

    String salida2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
    
    int salidaO = JOptionPane.showOptionDialog(null,"Seleccione una opcion: ",
    "Operador",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
    null, opciones, opciones[0]);
    
        Operaciones obj2 = new Operaciones();
        
        switch(operador){
            case 1:
            obj2.suma(num1, num2);
            break;
            case 2:
            obj2.resta(num1,num2);
            break;
            case 3:
            obj2.multiplica(num1,num2);
            break;
            default:
            System.out.println("Error: el operador es incorrecto");
            break;
        }
*/

    }
    
}

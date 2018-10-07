package ejercicio20;

import javax.swing.JOptionPane;

public class Ejercicio20 {
    public static void main(String[] args) {
/*Se desea realizar un proceso iterativo que resuelva el siguiente Menú de Opciones invocando a procedimientos:
MENU DE OPCIONES
1. Suma de dos números
2. Cuadrado de un número
3. Producto de dos números
4. Seno de un ángulo
0. Fin de Proceso
*/
        String entrada = "";
        do{
        entrada = JOptionPane.showInputDialog(null, "Ingrese 1 para suma de dos números,"
                + " 2 para cuadrado de un numero,"
                + " 3 para producto de dos numeros,"
                + " 4 para el seno de un angulo,"
                + "0 para salir");
        switch(entrada){
            case "1":
            double num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
            double resultado = Math.round(num1 + num2);
            JOptionPane.showMessageDialog(null, num1+"+"+num2+"="+resultado);
            break;
            case "2":
            double numPot = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero: "));
            double resultadoP = Math.round(numPot * numPot);
            JOptionPane.showMessageDialog(null, numPot+"*"+numPot+"="+resultadoP);
            break;
            case "3":
            double prod1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero: "));
            double prod2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo numero: "));
            double resultadoProd = Math.round(prod1 * prod2);
            JOptionPane.showMessageDialog(null, prod1+"*"+prod2+"="+resultadoProd);
            break;
            case "4":
            double angulo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el ángulo: "));
            double seno = Math.sin(angulo);
            JOptionPane.showMessageDialog(null, "Sin("+angulo+")="+seno);
            break;
            }
        
        
        }while(!entrada.equals("0"));

    }
    
}

package ejercicio17;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio17 {
    public static void main(String[] args) {
    /*Se dispone de una planilla con los sueldos a pagar a los empleados de una empresa.
    Se desea conocer cuál es el sueldo promedio que se debe abonar. 
    Como no se conoce la cantidad de empleados, luego de ingresar cada sueldo 
    deberá aparecer en la pantalla el siguiente cartel:
    ‘¿Continúa o finaliza? (C-F)’; el operador entonces deberá ingresar un ‘C’ o una ‘F’, 
    según quiera continuar ingresando datos o no.*/

    ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
String continua = "";    
        int i = 1;
        JOptionPane.showMessageDialog(null, "Bienvenido al sistema de registro de empleados!");

    do{
            Empleado empleado = new Empleado();
            Sueldo sueldo = new Sueldo();
            empleado.setCodEmpleado(i);
            String entradaSueldo = JOptionPane.showInputDialog(null, "Ingrese el sueldo para el empleado nº"+empleado.getCodEmpleado());
            sueldo.setMonto(Double.parseDouble(entradaSueldo));
            empleado.setSueldoEmpleado(sueldo);
            empleados.add(empleado);
            continua = JOptionPane.showInputDialog(null, "¿Continúa o finaliza? (C-F)");
            i++;
        
    }while(continua.equals("c") || continua.equals("C"));
       
        System.out.println("Planilla de empleados: ");
        
        double sueldoProm = 0;
        for (int j = 0; j < empleados.size(); j++) {
            System.out.println("Empleado "+empleados.get(j).getCodEmpleado()+" \t Sueldo: "+empleados.get(j).getSueldoEmpleado().getMonto());
        sueldoProm = sueldoProm + empleados.get(j).getSueldoEmpleado().getMonto();
        }
        System.out.println("Sueldo promedio: "+Math.round(sueldoProm/empleados.size()));
    
    
    
    
    }
}

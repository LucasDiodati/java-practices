package ejercicio18;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio18 {
    public static void main(String[] args) {
    /*Diseñar un algoritmo que permita llevar el control del movimiento diario
    de la caja de un negocio, teniendo en cuenta lo siguiente:
    Al abrir el negocio, se debe leer el saldo existente en caja
    Cada vez que se realiza un movimiento de caja, se debe:
    tipear el código (‘C’: compra; ‘V’: venta) y el importe de la operación
    en caso de realizarse una compra se debe verificar que el efectivo existente en caja sea suficiente para el pago,
    y si no lo es, se debe exhibir un cartel con el valor faltante para poder emitir un cheque por ese valor.
    Al finalizar el día, se debe indicar el fin de datos, tipeando ‘F’ en lugar de ‘C’ ó ‘V’
    Entonces se debe mostrar:
    > el saldo final de la caja
    > la cantidad de cheques emitidos
    > el valor de la venta máxima */
    double montoDeCaja = 600.75;
    double ventaMax = 0;
    ArrayList<Cheque> cheques = new ArrayList<Cheque>();
    int n = 1;
    String entrada = "";
    String montoIngreso = "";
    JOptionPane.showMessageDialog(null, " Monto inicial: $"+montoDeCaja);
    System.out.println(" Monto inicial: $"+montoDeCaja);
    do{
       entrada = JOptionPane.showInputDialog(null," Ingrese 'C' para compra o 'V' para venta ");
       if(entrada.equals("c") || entrada.equals("C")){
        // para compra
        montoIngreso = JOptionPane.showInputDialog(null," Ingrese el monto de la transacción: ");
       double monto = Double.parseDouble(montoIngreso);
            System.out.println("Compra: ");
            System.out.println("Monto de caja: $"+montoDeCaja);
            System.out.println("Monto de la transacción: $"+monto);
        if(montoDeCaja<monto){
        // si excede el monto de la caja
        double diferencia = monto-montoDeCaja;
        System.out.println("Diferencia: $"+diferencia);
        String cheque = JOptionPane.showInputDialog("El monto ingresado excede el monto de la caja, ¿Desea emitir un cheque por $"+diferencia+"? -- Ingrese (Si) o (No): ");
       if(cheque.equals("si")||cheque.equals("SI")||cheque.equals("Si")){
        // si se quiere emitir un cheque
       Cheque chequeX = new Cheque();
       chequeX.setNumCheque(n);
       chequeX.setMontoCheque(diferencia);
       cheques.add(chequeX);
       montoDeCaja = 0;
        System.out.println("Cheque #"+n+" por $"+diferencia+" realizado con éxito!");
        n++;
        System.out.println("Monto de caja: $"+montoDeCaja); 
       }else if(cheque.equals("no")||cheque.equals("NO")||cheque.equals("No")){
        // si no se emite el cheque
           System.out.println("Cheque cancelado, gracias, vuelva prontos! ");
       }
        }else if(montoDeCaja>=monto){
        // si el monto ingresado es menor al de la caja
            montoDeCaja = montoDeCaja - monto;
            System.out.println("Transacción realizada con éxito!");
           System.out.println("Monto de caja: $"+montoDeCaja); 
        }
       }else if(entrada.equals("v") || entrada.equals("V")){
        montoIngreso = JOptionPane.showInputDialog(null," Ingrese el monto de la transacción: ");
        double monto = Double.parseDouble(montoIngreso);        
        // para venta
        if(monto>ventaMax){
        ventaMax = monto;
        }
            System.out.println("Venta; ");
            System.out.println("Monto de caja: "+montoDeCaja);
            System.out.println("Monto de venta: $"+montoIngreso);
            System.out.println("Transacción realizada con éxito!");
            montoDeCaja = montoDeCaja + monto;
            System.out.println("Monto de caja: "+montoDeCaja);
            
       }else if(entrada.equals("F") || entrada.equals("f")){
       // para cerrar caja
           System.out.println("------------------------------------------------------------------------------");
           System.out.println("--------------------------------Cierre de caja--------------------------------");
           System.out.println("Saldo Final de la caja: "+montoDeCaja);
           System.out.println("Cantidad de cheques emitidos: "+cheques.size());
           System.out.println("Venta máxima: "+ventaMax);
           System.out.println("------------------------------------------------------------------------------");
           
       }else{
        entrada = JOptionPane.showInputDialog(null, " Ingrese 'C' para compra o 'V' para venta  // 'F' para cerrar caja");
       }
        
        
    }while(entrada.equals("c")||entrada.equals("C")||entrada.equals("v")||entrada.equals("V"));

    }
}

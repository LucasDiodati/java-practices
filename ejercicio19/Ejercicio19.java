package ejercicio19;

import java.util.ArrayList;

public class Ejercicio19 {
    public static void main(String[] args) {
/*Se dispone del conjunto de facturas emitidas por un restaurante. De cada factura se tienen los siguientes datos:
•Nro. de factura (nro entero cualquiera)
•Nro. de mozo que atendió (1..5)
•Importe
Las facturas están desordenadas y no se sabe cuántas son. 
Se desea saber la comisión que se deberá pagar a cada uno de los 5 mozos.
Cada uno de ellos recibe el 5% del importe total que facturó.
Con número de factura igual a 0 se indica fin de datos.
*/
    ArrayList<Mozo> mozos = new ArrayList<Mozo>();
    ArrayList<Factura> facturas = new ArrayList<Factura>();
        for (int i = 1; i < 6; i++) {
        Mozo mozo = new Mozo();
        mozo.setComision(0.05);
        mozo.setNumeroMozo(i);
        mozos.add(mozo);
            System.out.println("Mozo n"+i+" = "+mozo.getNumeroMozo());
        }
        for (int i = 1; i < 50; i++) {
            Factura fact = new Factura();
            fact.setNumFactura(i);
            int max = 979;
            int min = 20;
            fact.setImporte(Math.round(Math.random()*max+min));
            Mozo mozoX = null;
            int minM = 1;
            int maxM = 5;
            int numeroMozo = 0;
            for (int j = 1; j <5; j++) {
            numeroMozo = (int) Math.floor(Math.random() * maxM)/ minM;  
            mozoX = mozos.get(numeroMozo);
            }
            mozoX.setMontoFacturado(mozoX.getMontoFacturado()+fact.getImporte());
            fact.setMozoF(mozoX);
            facturas.add(fact);
        }
        System.out.println("Listado de facturas: ");
        for (int i = 0; i < facturas.size(); i++) {
            System.out.println("F"+facturas.get(i).getNumFactura()
                    + " Importe: $"+facturas.get(i).getImporte()
                    +".- \t Mozo: "
                    +facturas.get(i).getMozoF().getNumeroMozo());
        }
        
        for (int i = 0; i < mozos.size(); i++) {
            System.out.println("Monto facturado por el mozo"+mozos.get(i).getNumeroMozo()+": $"+mozos.get(i).getMontoFacturado());
            double comisionMozo =mozos.get(i).getMontoFacturado() * mozos.get(i).getComision();
            System.out.println("Comisión: "+comisionMozo);

        }


    }
}

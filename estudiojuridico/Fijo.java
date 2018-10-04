package estudiojuridico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Fijo extends Abogado{
    private double monto;

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
     public String liquidar(ArrayList<Causa> causasLiq){
         double montoFijo = getMonto();
         int causasAb = getTotalCausas();
        double liquidacion = Math.round(montoFijo*causasAb);
        JOptionPane.showMessageDialog(null, "Abogado fijo: "
                    +"\n Monto fijo: $"+montoFijo
                    +"\n Cantidad de causas a liquidar: "+causasAb
                    +"\n Liquidacion $"+liquidacion);
        return "Fijo"; 
    }
}

package estudiojuridico;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Porcentaje extends Abogado {

    /**
     * @return the porc
     */
    public double getPorc() {
        return porc;
    }

    /**
     * @param porc the porc to set
     */
    public void setPorc(double porc) {
        this.porc = porc;
    }
    private double porc;
    
     public String liquidar(ArrayList<Causa> causasLiq){
         double porcentaje = 0;
         double total = 0;
         for (int i=0;i<causasLiq.size();i++){
         porcentaje = getPorc();
         total += causasLiq.get(i).getSent().getMonto();
         }
        double liquidacion = Math.round(total/porcentaje);
        
        JOptionPane.showMessageDialog(null,"Abogado por porcentaje: "
                +"\n Porcentaje: "+porcentaje+"%"
                +"\n Total a liquidar: $"+total
                +"\n Liquidacion $"+liquidacion );
        return "Porcentaje"; 
    }
    
    
}

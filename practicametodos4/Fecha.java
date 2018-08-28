package practicametodos4;
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    private Fecha fecha;
    
    public void setFecha(int d, int m, int a){
    this.dia = d;
    this.mes = m;
    this.año = a;
    }

    public int getDia(){
    return this.dia;
    }
    public int getMes(){
    return this.mes;
    }
    public int getAño(){
    return this.año;
    }
    
   
    
}

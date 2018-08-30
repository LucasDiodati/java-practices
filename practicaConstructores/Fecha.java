package practicaConstructores;

public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public void setDia(int d){
    this.dia = d;
    }
    
    public void setMes(int m){
    this.mes = m;
    }
    
    public void setAño(int a){
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

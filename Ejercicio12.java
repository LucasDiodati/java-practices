package ejercicio12;
public class Ejercicio12 {

    public static void main(String[] args) {
        /*Una comisión tiene 55 alumnos, 
        de cada uno de los cuales se tienen las notas de los 6 parciales que han rendido.
        Obtener el promedio de las notas de cada uno de los alumnos.*/


        
        System.out.println("_____________________________________________________________________________________________________");      
        System.out.println("Alumno N. | parcial 1 \t| parcial 2 \t| parcial 3 \t| parcial 4 \t| parcial 5 \t| parcial 6 |\t promedio");
        System.out.println("_____________________________________________________________________________________________________");

        int num = 1;
        
        int min = 1;
        int max = 8;
        
        
        double p1;
        double p2;
        double p3;
        double p4;
        double p5;
        double p6;
        double pro;
        Alumno uno = new Alumno();
        for(int i=1; i <=55; i++){
        p1 = Math.round(Math.random() * max + min);      
        p2 = Math.round(Math.random() * max + min);      
        p3 = Math.round(Math.random() * max + min);      
        p4 = Math.round(Math.random() * max + min);      
        p5 = Math.round(Math.random() * max + min);      
        p6 = Math.round(Math.random() * max + min);  
        pro = (p1 + p2 + p3 + p4 + p5 + p6)/6;
        uno.codAlumno = num;
        uno.parcial1 = p1;
        uno.parcial2 = p2;
        uno.parcial3 = p3;
        uno.parcial4 = p4;
        uno.parcial5 = p5;
        uno.parcial6 = p6;
        uno.promedio = Math.round(pro);

        
        
        
        System.out.println(uno.codAlumno+"\t  | "+uno.parcial1+"\t\t| "+uno.parcial2+"\t \t| "+uno.parcial3+"\t \t| "+uno.parcial4+"\t \t| "+uno.parcial5+"\t \t| "+uno.parcial6+" \t |\t\t"+uno.promedio);

        num++;
        }


    }
    
}
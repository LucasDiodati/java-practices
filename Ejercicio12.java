package ejercicio12;
public class Ejercicio12 {

    public static void main(String[] args) {
        /*Una comisión tiene 55 alumnos, 
        de cada uno de los cuales se tienen las notas de los 6 parciales que han rendido.
        Obtener el promedio de las notas de cada uno de los alumnos.*/


        
        System.out.println("_____________________________________________________________________________________________________");      
        System.out.println("Alumno N. | parcial 1 \t| parcial 2 \t| parcial 3 \t| parcial 4 \t| parcial 5 \t| parcial 6 |");
        System.out.println("_____________________________________________________________________________________________________");

        int num = 1;
        
        int min = 1;
        int max = 8;
        
        
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        Alumno uno = new Alumno();
        for(int i=1; i <=55; i++){
        p1 = DecimalFormat("#.##").format(Math.random());      
        p2 = Math.round(Math.random() * max + min);      
        p3 = Math.round(Math.random() * max + min);      
        p4 = Math.round(Math.random() * max + min);      
        p5 = Math.round(Math.random() * max + min);      
        p6 = Math.round(Math.random() * max + min);      
        uno.codAlumno = num;
        uno.parcial1 = p1;
        uno.parcial2 = p2;
        uno.parcial3 = p3;
        uno.parcial4 = p4;
        uno.parcial5 = p5;
        uno.parcial6 = p6;

        System.out.println(uno.codAlumno+"\t  | "+uno.parcial1+"\t| "+uno.parcial2+"\t \t| "+uno.parcial3+"\t \t| "+uno.parcial4+"\t \t| "+uno.parcial5+"\t \t| "+uno.parcial6);

        num++;
        }
        /*
        double[][] alumnos = new double[54][5];
        alumnos[0][0] = uno.parcial1;
        alumnos[0][1] = uno.parcial2;
        alumnos[0][2] = uno.parcial3;
        alumnos[0][3] = uno.parcial4;
        alumnos[0][4] = uno.parcial5;
        alumnos[0][5] = uno.parcial6;
*/

    }
    
}

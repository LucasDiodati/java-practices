package ejercicio15;

import java.text.DecimalFormat;

public class Ejercicio15 {
    public static void main(String[] args) {
        /*De cada uno de los alumnos de primer año de la facultad se tienen los siguientes datos:
        •Nº de comisión
        • Nota del parcial
        No se sabe la cantidad de comisiones ni la cantidad de alumnos por comisión. Los datos están ordenados por comisión.
        Determinar, para cada una de las comisiones, el número de comisión y el promedio de las notas de dicho parcial.
        */

    System.out.println("Listado de alumnos: ");
    // Establezco un minimo y maximo para las notas y nro de comision
    int min = 1;
    int max = 9;
    // Declaro el formato para la nota
    DecimalFormat df = new DecimalFormat("#,##");
    // Inicializo las comisiones
    Comision comision1 = new Comision();
    comision1.setCantidadDeAlumnos(0);
    comision1.setNumeroComision(1);
    Comision comision2 =  new Comision();  
    comision2.setCantidadDeAlumnos(0);
    comision2.setNumeroComision(2);
    Comision comision3 =  new Comision();
    comision3.setCantidadDeAlumnos(0);
    comision3.setNumeroComision(3);
    Comision comision4 =  new Comision();
    comision4.setCantidadDeAlumnos(0);
    comision4.setNumeroComision(4);
    Comision comision5 =  new Comision();
    comision5.setCantidadDeAlumnos(0);
    comision5.setNumeroComision(5);
    Comision comision6 =  new Comision();
    comision6.setCantidadDeAlumnos(0);
    comision6.setNumeroComision(6);
    Comision comision7 =  new Comision();
    comision7.setCantidadDeAlumnos(0);
    comision7.setNumeroComision(7);
    Comision comision8 =  new Comision();
    comision8.setCantidadDeAlumnos(0);
    comision8.setNumeroComision(8);
    Comision comision9 =  new Comision();
    comision9.setCantidadDeAlumnos(0);    
    comision9.setNumeroComision(9);
    // Itero por la cantidad de alumnos que quiero generar
    for(int i=1; i<31; i++){
    // Instancio los alumnos
    Alumno alumno1 = new Alumno();
    // Esto es para el formato del nombre, como un zerofill
    String nomb ="";
    if(i>=10){nomb = "Estudiante-0"+i;}else{
     nomb = "Estudiante-00"+i;}
    
    // La nota y la comision son numeros aleatorios
    String notaString = df.format(Math.random() * max + min);
    // La parseo a double para sacar el promedio despues
    double nota = Double.parseDouble(notaString);
    
    
   int comisionX = (int) (Math.random() * max + min);
   switch(comisionX){
    case 1:
    alumno1.setComision(comision1);
    comision1.setCantidadDeAlumnos(comision1.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision1, nota);
    comision1.setNotaPromedio(comision1.getNotaPromedio()+alumno1.getNota());
    break;
    case 2:
    alumno1.setComision(comision2);
    comision2.setCantidadDeAlumnos(comision2.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision2, nota);
    comision2.setNotaPromedio(comision2.getNotaPromedio()+alumno1.getNota());
    break;
    case 3:
    alumno1.setComision(comision3);
    comision3.setCantidadDeAlumnos(comision3.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision3, nota);
    comision3.setNotaPromedio(comision3.getNotaPromedio()+alumno1.getNota());
    break;
    case 4:
    alumno1.setComision(comision4);
    comision4.setCantidadDeAlumnos(comision4.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision4, nota);
    comision4.setNotaPromedio(comision4.getNotaPromedio()+alumno1.getNota());
    break;
    case 5:
    alumno1.setComision(comision5);
    comision5.setCantidadDeAlumnos(comision5.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision5, nota);
    comision5.setNotaPromedio(comision5.getNotaPromedio()+alumno1.getNota());
    break;
    case 6:
    alumno1.setComision(comision6);
    comision6.setCantidadDeAlumnos(comision6.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision6, nota);
    comision6.setNotaPromedio(comision6.getNotaPromedio()+alumno1.getNota());
    break;
    case 7:
    alumno1.setComision(comision7);
    comision7.setCantidadDeAlumnos(comision7.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision7, nota);
    comision7.setNotaPromedio(comision7.getNotaPromedio()+alumno1.getNota());
    break;
    case 8:
    alumno1.setComision(comision8);
    comision8.setCantidadDeAlumnos(comision8.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision8, nota);
    comision8.setNotaPromedio(comision8.getNotaPromedio()+alumno1.getNota());
    break;
    case 9:
    alumno1.setComision(comision9);
    comision9.setCantidadDeAlumnos(comision9.getCantidadDeAlumnos()+1);
    alumno1.setAlumno(nomb, comision9, nota);
    comision9.setNotaPromedio(comision9.getNotaPromedio()+alumno1.getNota());
    break;
   }
    
    
System.out.println("Alumno: "+alumno1.getNombre()+"\t Comision: "
        +alumno1.getComision().getNumeroComision()+" \t Nota: "+alumno1.getNota());
 

}
    System.out.println("----------------------------------------------------");
    System.out.println("Resumen: ");
    
for(int e=1; e<=9;e++){
   Comision comisionX = new Comision();
   if(e == 1){
   comisionX = comision1;
   }else if(e == 2){
   comisionX = comision2;
   }else if(e == 3){
   comisionX = comision3;
   }else if(e == 4){
   comisionX = comision4;
   }else if(e == 5){
   comisionX = comision5;
   }else if(e == 6){
   comisionX = comision6;
   }else if(e == 7){
   comisionX = comision7;
   }else if(e == 8){
   comisionX = comision8;
   }else{
   comisionX = comision9;
   }
   double promedio =  Math.round(comisionX.getNotaPromedio()/comisionX.getCantidadDeAlumnos());
   
    System.out.println( "Comision"+e+
            ": Cantidad de alumnos: "+ comisionX.getCantidadDeAlumnos()+
            " \t Promedio de notas de Comision"+e+
            ": "+promedio);
}


    


        
        
    }
    
}

package ejercicio16;

import java.util.ArrayList;

public class Ejercicio16 {
    public static void main(String[] args) {
/* Una empresa de alquiler de autos, los clasifica en categorías (20 categorías numéricas en total).
   Se tiene una planilla donde se encuentran, ordenados por categoría, de cada viaje realizado por cada auto:
   la categoría, el kilometraje recorrido y el monto del viaje.
   Se pide:
   *obtener el total de kilómetros recorridos por cada categoría.
 *la categoría que haya realizado el viaje de mayor monto. */
    
    ArrayList<Auto> autos = new ArrayList<Auto>();
    ArrayList<Categoria> categorias = new ArrayList<Categoria>();
    for(int i= 1; i < 21; i++) {
            Categoria cat = new Categoria();
            cat.setNumCategoria(i);
            categorias.add(cat);
        }
    int max = 18;
    int min = 1;
    double maxKm = 50;
    double minKm = 0.5;
    double tarifa = 1.75;
    double bajada = 15;
        System.out.println(" \t\t -----------------------");
        System.out.println(" \t\t\t Planilla: ");
        System.out.println(" \t\t -----------------------");
    for(int j=0; j<51;j++){
    Auto auto = new Auto();
    int rand = (int) Math.round(Math.random()*max+min);
    Categoria categoriaX = categorias.get(rand);
    double randKm = Math.round(Math.random()*maxKm+minKm);
    double randMonto = bajada + (randKm * tarifa);
    auto.setCategoria(categoriaX);
    auto.setKilometraje(randKm);
    auto.setMonto(randMonto);
    autos.add(auto);
    }

    for (int j = 1; j < categorias.size()+1; j++) {
    System.out.println("categoria "+j+":");
    double acum =0;
            for (int i = 1; i < autos.size(); i++) {

                if(autos.get(i).getCategoria().getNumCategoria() == j){
                    acum = acum + autos.get(i).getKilometraje();
         System.out.println(" \t Auto#"+i+": "
        + "Kilometraje: "+autos.get(i).getKilometraje()+" Km\t "
        + "Monto: $"+autos.get(i).getMonto()+".- \t"
        + "Categoria Nº: "+autos.get(i).getCategoria().getNumCategoria());
         

                }

            }
            
            System.out.println("---Kilometros recorridos: "+acum+"--- \t");
        acum = 0;
            
    }
        
            int categoriaMayor = 0;
            double montoMayor = 0;

        for (int i = 0; i < autos.size(); i++) {
            if(autos.get(i).getMonto()>montoMayor){
            montoMayor = autos.get(i).getMonto();
            categoriaMayor = autos.get(i).getCategoria().getNumCategoria();
            }
        }
        System.out.println("La categoria "+categoriaMayor+" tuvo el viaje con monto de $"+montoMayor+".-");
    
    

    }
    }
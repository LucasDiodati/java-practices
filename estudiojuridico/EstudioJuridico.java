package estudiojuridico;
import java.util.ArrayList;

public class EstudioJuridico {
    public static void main(String[] args) {
        // Causas[];
        Causa causa1 = new Causa();
        causa1.setNroCausa(15);
        
        ArrayList<Causa> ListCausas = new ArrayList<Causa>();
        ListCausas.add(causa1);
        
        
        //Instancio un objeto de la clase ArrayList<> donde meto objetos "Abogado"
        ArrayList<Abogado> ListAbog = new ArrayList<Abogado>();
        // Instancio un par de abogados
        Abogado abogado1 = new Abogado();
        abogado1.setCodAbogado(7122);
        abogado1.setCantAbiertas(5);
        abogado1.setFuero("Laboral");
        abogado1.setCausasAbogado(ListCausas);
        //Abogado2
        Abogado abogado2 = new Abogado();
        abogado2.setCodAbogado(45);
        abogado2.setCantAbiertas(2);
        abogado2.setFuero("Penal");
        //Agrego los objetos "Abogado" al arrayList
        ListAbog.add(abogado1);
        ListAbog.add(abogado2);
        // Uso el metodo Get() de arraylist y lo guardo en una variable tipo Abogado
        Abogado abConsultado = ListAbog.get(0);
        //Imprimo desde la nueva variable local
        System.out.println(abConsultado.getFuero());
        // Imprimo directamente desde el arraylist
        System.out.println(ListAbog.get(1).getFuero());
        

        
        System.out.println(abogado1.getCausasAbogado().get(0).getNroCausa());
        
        
    }
}

package estudiojuridico;
import java.util.ArrayList;

public class EstudioJuridico {
    public static void main(String[] args) {
        // Causas[];
        Causa causa1 = new Causa();
        causa1.setNroCausa(15);
        causa1.setDemandado("Lopez");
        causa1.setDemandante("Planes");
        causa1.setFechaIni("13/07/2018");
        causa1.setJuzgado("Federal 1ero");
        causa1.setMotivo("Accidente de transito");
        causa1.setSent(null);
        //causa2
        Causa causa2 = new Causa();
        causa2.setNroCausa(14);
        causa2.setDemandado("Belgrano");
        causa2.setDemandante("San Martin");
        causa2.setFechaIni("11/05/2018");
        causa2.setJuzgado("Provincial 15ero");
        causa2.setMotivo("Despidos");
        causa2.setSent(null);
        //causa3
        Causa causa3 = new Causa();
        causa3.setNroCausa(11);
        causa3.setDemandado("Sarmiento");
        causa3.setDemandante("Rosas");
        causa3.setFechaIni("11/05/2015");
        causa3.setJuzgado("Provincial 15ero");
        causa3.setMotivo("Pago de haberes");
        causa3.setSent(null);
        //causa4
        Causa causa4 = new Causa();
        causa4.setNroCausa(5);
        causa4.setDemandado("Sanchez");
        causa4.setDemandante("San Martin");
        causa4.setFechaIni("07/05/2018");
        causa4.setJuzgado("Provincial 15ero");
        causa4.setMotivo("Divorcio");
        causa4.setSent(null);
        //causa5
        Causa causa5 = new Causa();
        causa5.setNroCausa(77);
        causa5.setDemandado("Paz");
        causa5.setDemandante("Fernandez");
        causa5.setFechaIni("11/05/2017");
        causa5.setJuzgado("Federal 1ero");
        causa5.setMotivo("Estafa");
        causa5.setSent(null);
        //causa6
        Causa causa6 = new Causa();
        causa6.setNroCausa(56);
        causa6.setDemandado("Rey");
        causa6.setDemandante("Poe");
        causa6.setFechaIni("14/02/2018");
        causa6.setJuzgado("Provincial 15ero");
        causa6.setMotivo("Responsabilidad parental");
        causa6.setSent(null); 
        
        //Agrego las causas al arraylist de causas general
        ArrayList<Causa> ListCausasGeneral = new ArrayList<Causa>();
        ListCausasGeneral.add(causa1);
        ListCausasGeneral.add(causa2);
        ListCausasGeneral.add(causa3);
        ListCausasGeneral.add(causa4);
        ListCausasGeneral.add(causa5);
        ListCausasGeneral.add(causa6);
        

        // Lista de causas para el abogado1
        ArrayList<Causa> ListCausaAbog1 = new ArrayList<Causa>();
        ListCausaAbog1.add(causa1);
        // Lista de causas para el abogado2
        ArrayList<Causa> ListCausaAbog2 = new ArrayList<Causa>();
        ListCausaAbog2.add(causa2);
        ListCausaAbog2.add(causa3);
        // Lista de causas para el abogado3
        ArrayList<Causa> ListCausaAbog3 = new ArrayList<Causa>();
        ListCausaAbog3.add(causa4);
        ListCausaAbog3.add(causa5);
        // Lista de causas para el abogado4
        ArrayList<Causa> ListCausaAbog4 = new ArrayList<Causa>();
        ListCausaAbog4.add(causa6);    
        
        
        // Instancio un par de abogados
        Abogado abogado1 = new Abogado();
        abogado1.setCodAbogado(7122);
        abogado1.setCantAbiertas(1);
        abogado1.setFuero("Laboral");
        abogado1.setApellidoNombre("Perez Juan");
        abogado1.setDomicilio("Salta 1515");
        abogado1.setEmail("juanperez666765@hotmail.com");
        abogado1.setTipoDocumento("DNI");
        abogado1.setNroDocumento(31072565);
        abogado1.setTotalCausas(1);
        abogado1.setCausasAbogado(ListCausaAbog1);
        //Abogado2
        Abogado abogado2 = new Abogado();
        abogado2.setCodAbogado(45);
        abogado2.setCantAbiertas(2);
        abogado2.setFuero("Penal");
        abogado2.setApellidoNombre("Luis Rodriguez");
        abogado2.setCausasAbogado(ListCausaAbog2);
        abogado2.setDomicilio("Andrade 1201");
        abogado2.setEmail("luisr@gmail.com");
        abogado2.setNroDocumento(33070334);
        abogado2.setTipoDocumento("DNI");
        abogado2.setTotalCausas(2);
        //Abogado3
        Abogado abogado3 = new Abogado();
        abogado3.setCodAbogado(12);
        abogado3.setCantAbiertas(2);
        abogado3.setFuero("Comercial");
        abogado3.setApellidoNombre("Agustina Forholtz");
        abogado3.setCausasAbogado(ListCausaAbog3);
        abogado3.setDomicilio("Entre rios 1444");
        abogado3.setEmail("agusf@yahoo.com");
        abogado3.setNroDocumento(36887523);
        abogado3.setTipoDocumento("DNI");
        abogado3.setTotalCausas(2);
        //Abogado4
        Abogado abogado4 = new Abogado();
        abogado4.setCodAbogado(43);
        abogado4.setCantAbiertas(1);
        abogado4.setFuero("Laboral");
        abogado4.setApellidoNombre("Marcos Juarez");
        abogado4.setCausasAbogado(ListCausaAbog4); // asignar a su propia lista
        abogado4.setDomicilio("San Luis 55");
        abogado4.setEmail("mjuarezabogado@estudio.com");
        abogado4.setNroDocumento(12088743);
        abogado4.setTipoDocumento("LC");
        abogado4.setTotalCausas(1);        
        
       
        //Instancio un objeto de la clase ArrayList<> donde meto objetos "Abogado"
        ArrayList<Abogado> ListAbog = new ArrayList<Abogado>();
        //Agrego los objetos "Abogado" al arrayList
        ListAbog.add(abogado1);
        ListAbog.add(abogado2);
        ListAbog.add(abogado3);
        ListAbog.add(abogado4);
        
        
        // Uso el metodo Get() de arraylist y lo guardo en una variable tipo Abogado
        /*Abogado abConsultado = ListAbog.get(0);
        //Imprimo desde la nueva variable local
        System.out.println(abConsultado.getFuero());
        // Imprimo directamente desde el arraylist
        System.out.println(ListAbog.get(1).getFuero());
        

        
        System.out.println(abogado1.getCausasAbogado().get(0).getNroCausa());
        */
        
    }
}

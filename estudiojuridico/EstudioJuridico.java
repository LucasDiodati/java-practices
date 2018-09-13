package estudiojuridico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EstudioJuridico {
    // Pasa como variable de clase para darle visibilidad fuera del main
    static ArrayList<Abogado>  ListAbog;
    
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
        abogado2.setFuero("Laboral");
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
        abogado4.setFuero("Civil");
        abogado4.setApellidoNombre("Marcos Juarez");
        abogado4.setCausasAbogado(ListCausaAbog4); // asignar a su propia lista
        abogado4.setDomicilio("San Luis 55");
        abogado4.setEmail("mjuarezabogado@estudio.com");
        abogado4.setNroDocumento(12088743);
        abogado4.setTipoDocumento("LC");
        abogado4.setTotalCausas(1);        
        
       
        //Instancio un objeto de la clase ArrayList<> donde meto objetos "Abogado"
        ListAbog = new ArrayList<Abogado>();
        //Agrego los objetos "Abogado" al arrayList
        ListAbog.add(abogado1);
        ListAbog.add(abogado2);
        ListAbog.add(abogado3);
        ListAbog.add(abogado4);
        //Inicializo el valor de ingreso fuera del bucle
        int num1 = 0;       
        JOptionPane.showMessageDialog(null,">> Bienvenido al sistema de Estudio Juridico <<");
        do{
String entrada = JOptionPane.showInputDialog("*Ingrese 1 si quiere abrir una causa"
                + "                         \n*Ingrese 2 si quiere cargar un nuevo abogado"
                + "                         \n*Ingrese 3 si quiere cerrar una causa"
                + "                         \n*Ingrese 4 si quiere efectuar la liquidación de abogados"
                + "                         \n*Ingrese 0 si quiere salir del programa");
        //casteo a int el valor ingresado
        num1 = Integer.parseInt(entrada);
        switch(num1){
            case 1:
            abrirCausa();
            break;
            case 2:
            // cargarAbogado();
            break;
            case 3:
            // cerrarCausa();
            break;
            case 4:
            // liquidarAbogados();
            break;
        }
            }while(num1 != 0);

    }
    
    // Todo esto afuera del main 
    
    public static void abrirCausa(){
    String fuero = JOptionPane.showInputDialog("Ingrese el fuero:");
    // Creo una coleccion para validar el fuero
    ArrayList<Abogado> abogadosConsultados = new ArrayList<Abogado>();
    // Consulto la cantidad total de abogados para iterar la cantidad total en un for
    for(int i = 0; i< ListAbog.size();i++){
    // ListAbog.get(i) = traer el objeto iterado de la lista general -- pido el fuero de ese abogado -- Lo comparo con el fuero ingresado
    if(ListAbog.get(i).getFuero().equals(fuero)){
    // Agrega el abogado iterado a la lista de abogados consultados
    abogadosConsultados.add(ListAbog.get(i));
    }
    }
    // Inicializo la posicion donde encuentro al abogado, el maximo de causas que pueden tener y el abogado iterado
    int posicion = 0;
    int maxCausas = 100;
    Abogado abogadoX;
    // Consulto la cantidad de abogados de la nueva coleccion para iterarlos
    for(int i = 0; i < abogadosConsultados.size();i++){
    // si el objeto iterado (lo de get(i)) tiene una cantidad de causas abiertas mayor 
    if(abogadosConsultados.get(i).getCantAbiertas()<maxCausas){
    // asigno a maxCausas, la cantidad de causas del abogado iterado
    maxCausas = abogadosConsultados.get(i).getCantAbiertas();
    // asigno la posicion a i para que se guarde en algun indice en la lista de abogados
    posicion = i;
    }
    }
    // asigno la posicion (lo del if de arriba) a un "abogadoX" para que se guarde momentaneamente y los pueda comparar
    abogadoX = abogadosConsultados.get(posicion);
    String abogadoXNombre = abogadoX.getApellidoNombre();
   
    JOptionPane.showMessageDialog(null,"Abogado seleccionado para la causa: "+abogadoXNombre);
    
    };
    
    
}
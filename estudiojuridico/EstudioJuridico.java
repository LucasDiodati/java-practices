package estudiojuridico;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class EstudioJuridico {
    // Pasa como variable de clase para darle visibilidad fuera del main
    static ArrayList<Abogado>  ListAbog;
    static ArrayList<Causa> ListCausasGeneral;

    public static void main(String[] args) {
        // Causas[];
        Causa causa1 = new Causa();
        causa1.setNroCausa(15);
        causa1.setDemandado("Lopez");
        causa1.setDemandante("Planes");
        causa1.setFechaIni("13/07/2018");
        causa1.setJuzgado("Federal 1ero");
        causa1.setMotivo("Accidente de transito");
        causa1.setFuero("Civil");
        causa1.setSent(null);
        //causa2
        Causa causa2 = new Causa();
        causa2.setNroCausa(14);
        causa2.setDemandado("Belgrano");
        causa2.setDemandante("San Martin");
        causa2.setFechaIni("11/05/2018");
        causa2.setJuzgado("Provincial 15ero");
        causa2.setMotivo("Despidos");
        causa2.setFuero("Penal");
        causa2.setSent(null);
        //causa3
        Causa causa3 = new Causa();
        causa3.setNroCausa(11);
        causa3.setDemandado("Sarmiento");
        causa3.setDemandante("Rosas");
        causa3.setFechaIni("11/05/2015");
        causa3.setJuzgado("Provincial 15ero");
        causa3.setMotivo("Pago de haberes");
        causa3.setFuero("Civil");
        causa3.setSent(null);
        //causa4
        Causa causa4 = new Causa();
        causa4.setNroCausa(5);
        causa4.setDemandado("Sanchez");
        causa4.setDemandante("San Martin");
        causa4.setFechaIni("07/05/2018");
        causa4.setJuzgado("Provincial 15ero");
        causa4.setMotivo("Divorcio");
        causa1.setFuero("Laboral");
        causa4.setSent(null);
        //causa5
        Causa causa5 = new Causa();
        causa5.setNroCausa(77);
        causa5.setDemandado("Paz");
        causa5.setDemandante("Fernandez");
        causa5.setFechaIni("11/05/2017");
        causa5.setJuzgado("Federal 1ero");
        causa1.setFuero("Penal");
        causa5.setMotivo("Estafa");
        causa5.setSent(null);
        //causa6
        Causa causa6 = new Causa();
        causa6.setNroCausa(56);
        causa6.setDemandado("Rey");
        causa6.setDemandante("Poe");
        causa6.setFechaIni("14/02/2018");
        causa6.setJuzgado("Provincial 15ero");
        causa1.setFuero("Civil");
        causa6.setMotivo("Responsabilidad parental");
        causa6.setSent(null); 
        
        //Agrego las causas al arraylist de causas general
        ListCausasGeneral = new ArrayList<Causa>();
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
        
        
        // Instancio un par de abogados directamente en la subclase
        Abogado abogado1 = new Fijo();
        abogado1.setCodAbogado(7122);
        abogado1.setCantAbiertas(1);
        abogado1.setFuero("Laboral");
        abogado1.setApellidoNombre("Perez Juan");
        abogado1.setDomicilio("Salta 1515");
        abogado1.setEmail("juanperez666765@hotmail.com");
        abogado1.setTipoDocumento("DNI");
        abogado1.setNroDocumento("31072565");
        abogado1.setTotalCausas(1);
        abogado1.setCausasAbogado(ListCausaAbog1);
        //Abogado2
        Abogado abogado2 = new Porcentaje();
        abogado2.setCodAbogado(45);
        abogado2.setCantAbiertas(2);
        abogado2.setFuero("Penal");
        abogado2.setApellidoNombre("Luis Rodriguez");
        abogado2.setCausasAbogado(ListCausaAbog2);
        abogado2.setDomicilio("Andrade 1201");
        abogado2.setEmail("luisr@gmail.com");
        abogado2.setNroDocumento("33070334");
        abogado2.setTipoDocumento("DNI");
        abogado2.setTotalCausas(2);
        //Abogado3
        Abogado abogado3 = new Porcentaje();
        abogado3.setCodAbogado(12);
        abogado3.setCantAbiertas(2);
        abogado3.setFuero("Civil");
        abogado3.setApellidoNombre("Agustina Ricci");
        abogado3.setCausasAbogado(ListCausaAbog3);
        abogado3.setDomicilio("Entre rios 1444");
        abogado3.setEmail("agusr@yahoo.com");
        abogado3.setNroDocumento("36887523");
        abogado3.setTipoDocumento("DNI");
        abogado3.setTotalCausas(2);
        //Abogado4
        Abogado abogado4 = new Fijo();
        abogado4.setCodAbogado(43);
        abogado4.setCantAbiertas(1);
        abogado4.setFuero("Civil");
        abogado4.setApellidoNombre("Marcos Juarez");
        abogado4.setCausasAbogado(ListCausaAbog4); // asignar a su propia lista
        abogado4.setDomicilio("San Luis 55");
        abogado4.setEmail("mjuarezabogado@estudio.com");
        abogado4.setNroDocumento("12088743");
        abogado4.setTipoDocumento("LC");
        abogado4.setTotalCausas(1);        
        
        //Instancio un objeto de la clase ArrayList<> donde meto todos los objetos "Abogado"
        ListAbog = new ArrayList<Abogado>();
        //Agrego los objetos "Abogado" al arrayList
        ListAbog.add(abogado1);
        ListAbog.add(abogado2);
        ListAbog.add(abogado3);
        ListAbog.add(abogado4);
        
        
        
        //Inicializo el valor de ingreso fuera del bucle
        int num1;       
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
            cargarAbogado();
            break;
            case 3:
            cerrarCausa();
            break;
            case 4:
            // liquidarAbogados();
            break;
        }
            }while(num1 != 0);

    }
    
    // Todo esto afuera del main 
    
    public static Abogado buscarAbogado(String fuer){
    // Crea una lista temporal de abogados para iterar los abogados de la lista general (el fuero) contra el que viene por parametro
    ArrayList<Abogado> ListAb = new ArrayList<Abogado>();
    Abogado abo1 = new Abogado();
    int max = 200;
    // for itera por la cantidad de abogados (con size())
    // if compara los fueros y si coinciden, guarda los abogados en el nuevo ArrayList<>
    for(int i=0;i<ListAbog.size();i++){
    if(ListAbog.get(i).getFuero().equals(fuer)){
    ListAb.add(ListAbog.get(i));
    }
    }
    //en otro for itero la lista temporal de abogados colectados (todos los que tengan el fuero ingresado)
    // el if compara la cantidad de causas abiertas, guardando el valor en "max" y comparando 1 contra 1 (bubble sort?)
    for(int i=0;i<ListAb.size();i++){
     if(ListAb.get(i).getCantAbiertas()<max){
    abo1 = ListAb.get(i);
    max = ListAb.get(i).getCantAbiertas();
        }
    }
    // guardamos el nombre del abogado seleccionado y lo muestro
    String aboNom = abo1.getApellidoNombre();
    JOptionPane.showMessageDialog(null,"Abogado seleccionado para la causa: "+aboNom);
    return abo1;
    };
    
    public static void abrirCausa(){
    //Instancio una nueva causa
    Causa caus1 = new Causa();
    // Guardo el input en una variable que voy a usar para buscar abogado
    String fuero = JOptionPane.showInputDialog("Ingrese el fuero:");
    // Lo seteo como atributo del objeto instanciado
    caus1.setFuero(fuero);
    // llamo a buscar abogado pasandole el fuero como parametro
    Abogado asig = buscarAbogado(caus1.getFuero());// asig es el abogado con menos causas
    // Le cargo la causa a la lista de causas del este abogado
    asig.getCausasAbogado().add(caus1);
    };
    
    public static void cargarAbogado(){
  
    String tipo = JOptionPane.showInputDialog("Ingrese *f* si el abogado cobra monto fijo \n Ingrese *p* si cobra un porcentaje de la causa");

    switch(tipo){
    case"f":
    // instanciar el abogado como fijo
    Fijo abogF = new Fijo();
    
    int codigo =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de abogado: "));
    abogF.setCodAbogado(codigo);
    
    String apellidoNombre = JOptionPane.showInputDialog("Ingrese el nombre y apellido del abogado: ");
    abogF.setApellidoNombre(apellidoNombre);
    
    String tipoDocumento = JOptionPane.showInputDialog("Ingrese el tipo de documento(DNI/LC/LE): ");
    abogF.setTipoDocumento(tipoDocumento);
    
    String nroDocumento = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
    abogF.setNroDocumento(nroDocumento);
    
    String Domicilio = JOptionPane.showInputDialog("Ingrese el domicilio: ");
    abogF.setDomicilio(Domicilio);
    
    String telefono = JOptionPane.showInputDialog("Ingrese el telefono sin el 0 o 15: ");
    abogF.setTelefono(telefono);
    
    String email = JOptionPane.showInputDialog("Ingrese el email: ");
    abogF.setEmail(email);
    
    String fuero = JOptionPane.showInputDialog("Ingrese el fuero del abogado: ");
    abogF.setFuero(fuero);

    // Lo agrego al arrayList<>
    ListAbog.add(abogF);

    JOptionPane.showMessageDialog(null, "El abogado ingresado: \n "
            + "\n*Codigo: "+abogF.getCodAbogado()
            +"\n*Nombre: "+abogF.getApellidoNombre()
            +"\n*Documento "+abogF.getTipoDocumento()+" Nº: "+abogF.getNroDocumento()
            +"\n*Domicilio : "+abogF.getDomicilio()
            +"\n*Telefono: "+abogF.getTelefono()
            +"\n*Email: "+abogF.getEmail()
            +"\n*Fuero: "+abogF.getFuero());
    
    break;
    case "p":
    // instanciar el abogado como porcentaje
    Porcentaje abogP = new Porcentaje();
    
    int codigop =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de abogado: "));
    abogP.setCodAbogado(codigop);
    
    String apellidoNombrep = JOptionPane.showInputDialog("Ingrese el nombre y apellido del abogado: ");
    abogP.setApellidoNombre(apellidoNombrep);
    
    String tipoDocumentop = JOptionPane.showInputDialog("Ingrese el tipo de documento(DNI/LC/LE): ");
    abogP.setTipoDocumento(tipoDocumentop);
    
    String nroDocumentop = JOptionPane.showInputDialog("Ingrese el numero de documento: ");
    abogP.setNroDocumento(nroDocumentop);
    
    String Domiciliop = JOptionPane.showInputDialog("Ingrese el domicilio: ");
    abogP.setDomicilio(Domiciliop);
    
    String telefonop = JOptionPane.showInputDialog("Ingrese el telefono sin el 0 o 15: ");
    abogP.setTelefono(telefonop);
    
    String emailp = JOptionPane.showInputDialog("Ingrese el email: ");
    abogP.setEmail(emailp);
    
    String fuerop = JOptionPane.showInputDialog("Ingrese el fuero del abogado: ");
    abogP.setFuero(fuerop);
    
    // Lo agrego al arrayList<>
    ListAbog.add(abogP);
    
    JOptionPane.showMessageDialog(null, "El abogado ingresado: \n "
            + "\n*Codigo: "+abogP.getCodAbogado()
            +"\n*Nombre: "+abogP.getApellidoNombre()
            +"\n*Documento "+abogP.getTipoDocumento()+" Nº: "+abogP.getNroDocumento()
            +"\n*Domicilio : "+abogP.getDomicilio()
            +"\n*Telefono: "+abogP.getTelefono()
            +"\n*Email: "+abogP.getEmail()
            +"\n*Fuero: "+abogP.getFuero());
    

    break;
    default: 
    JOptionPane.showMessageDialog(null, "El tipo ingresado es incorrecto");    
    break;
    }
    
    }
    
    public static void cerrarCausa(){
        // Esto es solo para mostrar las causas
        JOptionPane.showMessageDialog(null, "Seleccione el numero de la causa que quiera cerrar a continuacion: ");
        for(int i=0;i<ListCausasGeneral.size();i++){
        JOptionPane.showMessageDialog(null, ">"+ListCausasGeneral.get(i).getNroCausa()+"<  CAUSA: "+ListCausasGeneral.get(i).getFuero()+" "+ListCausasGeneral.get(i).getFechaIni()+" "+ListCausasGeneral.get(i).getDemandante()+" contra "+ListCausasGeneral.get(i).getDemandado()+" sobre "+ListCausasGeneral.get(i).getMotivo()+" en juzgado "+ListCausasGeneral.get(i).getJuzgado());    
        
        }
        // Ingreso de numero de causa
        int numeroCausa = Integer.parseInt(JOptionPane.showInputDialog(""));
        for(int i=0;i<ListCausasGeneral.size();i++){
        if(ListCausasGeneral.get(i).getNroCausa() == numeroCausa){
            // Cargo una nueva sentencia
            Sentencia sentencia1 = new Sentencia();
            String fechaSentencia = JOptionPane.showInputDialog("Ingrese la fecha de sentencia: ");
            sentencia1.setFechaSentencia(fechaSentencia);
            
            String tipoSentencia = JOptionPane.showInputDialog("Ingrese el tipo de sentencia: (pos para positivo y neg para negativo) ");
            sentencia1.setTipoSentencia(tipoSentencia);
            
            String motivoSentencia = JOptionPane.showInputDialog("Ingrese el motivo: ");
            sentencia1.setMotivo(motivoSentencia);
            
            double montoSentencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la sentencia: "));
            // Agrego la sentencia a la causa
            ListCausasGeneral.get(i).setSent(sentencia1);
            }
        }
        // Todo esto para eliminarle la causa al abogado
        for(int i=0;i<ListAbog.size();i++){
        for(int e=0; e<ListAbog.get(i).getCausasAbogado().size();e++){
        if(ListAbog.get(i).getCausasAbogado().get(e).getNroCausa() == numeroCausa){
        // Le quito la causa del arrayList de causas 
        ListAbog.get(i).getCausasAbogado().remove(e);
        // Le quito uno a la cantidad de causas abiertas
        int totalAbiertas = ListAbog.get(i).getCantAbiertas();
        ListAbog.get(i).setCantAbiertas(totalAbiertas - 1);
        }
        }
        }

    }

}
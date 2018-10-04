package estudiojuridico;
import java.util.ArrayList;
public class Abogado {
    private int codAbogado;
    private String apellidoNombre;
    private String tipoDocumento;
    private String nroDocumento;
    private String Domicilio;
    private String telefono;
    private String email;
    private String fuero;
    private ArrayList<Causa> causasAbogado = new ArrayList<Causa>();
    private int totalCausas;
    private int cantAbiertas;
    
    public int getCodAbogado() {
        return codAbogado;
    }

    public void setCodAbogado(int codAbogado) {
        this.codAbogado = codAbogado;
    }

    public String getApellidoNombre() {
        return apellidoNombre;
    }

    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFuero() {
        return fuero;
    }

    public void setFuero(String fuero) {
        this.fuero = fuero;
    }

    public int getTotalCausas() {
        return totalCausas;
    }

    public void setTotalCausas(int totalCausas) {
        this.totalCausas = totalCausas;
    }

    public int getCantAbiertas() {
        return cantAbiertas;
    }

    public void setCantAbiertas(int cantAbiertas) {
        this.cantAbiertas = cantAbiertas;
    }

    public ArrayList<Causa> getCausasAbogado() {
        return causasAbogado;
    }

    public void setCausasAbogado(ArrayList<Causa> causasAbogado) {
        this.causasAbogado = causasAbogado;
    }
    
    public String liquidar(ArrayList<Causa> causasLiq){
        return "el abogado es:"; 
    }

    
}
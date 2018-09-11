package estudiojuridico;
import java.util.ArrayList;
public class Abogado {
    private int codAbogado;
    private String apellidoNombre;
    private String tipoDocumento;
    private int nroDocumento;
    private String Domicilio;
    private int telefono;
    private String email;
    private String fuero;
    private ArrayList<Causa> causasAbogado = new ArrayList<Causa>();
    private int totalCausas;
    private int cantAbiertas;

    /**
     * @return the codAbogado
     */
    public int getCodAbogado() {
        return codAbogado;
    }

    /**
     * @param codAbogado the codAbogado to set
     */
    public void setCodAbogado(int codAbogado) {
        this.codAbogado = codAbogado;
    }

    /**
     * @return the apellidoNombre
     */
    public String getApellidoNombre() {
        return apellidoNombre;
    }

    /**
     * @param apellidoNombre the apellidoNombre to set
     */
    public void setApellidoNombre(String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }

    /**
     * @return the tipoDocumento
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * @param tipoDocumento the tipoDocumento to set
     */
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return the nroDocumento
     */
    public int getNroDocumento() {
        return nroDocumento;
    }

    /**
     * @param nroDocumento the nroDocumento to set
     */
    public void setNroDocumento(int nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    /**
     * @return the Domicilio
     */
    public String getDomicilio() {
        return Domicilio;
    }

    /**
     * @param Domicilio the Domicilio to set
     */
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the fuero
     */
    public String getFuero() {
        return fuero;
    }

    /**
     * @param fuero the fuero to set
     */
    public void setFuero(String fuero) {
        this.fuero = fuero;
    }

    /**
     * @return the totalCausas
     */
    public int getTotalCausas() {
        return totalCausas;
    }

    /**
     * @param totalCausas the totalCausas to set
     */
    public void setTotalCausas(int totalCausas) {
        this.totalCausas = totalCausas;
    }

    /**
     * @return the cantAbiertas
     */
    public int getCantAbiertas() {
        return cantAbiertas;
    }

    /**
     * @param cantAbiertas the cantAbiertas to set
     */
    public void setCantAbiertas(int cantAbiertas) {
        this.cantAbiertas = cantAbiertas;
    }

    /**
     * @return the causasAbogado
     */
    public ArrayList<Causa> getCausasAbogado() {
        return causasAbogado;
    }

    /**
     * @param causasAbogado the causasAbogado to set
     */
    public void setCausasAbogado(ArrayList<Causa> causasAbogado) {
        this.causasAbogado = causasAbogado;
    }
    
    
    
}

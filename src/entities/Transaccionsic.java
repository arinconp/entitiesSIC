/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "TRANSACCIONSIC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccionsic.findAll", query = "SELECT t FROM Transaccionsic t")
    , @NamedQuery(name = "Transaccionsic.findByNumTransaccion", query = "SELECT t FROM Transaccionsic t WHERE t.numTransaccion = :numTransaccion")
    , @NamedQuery(name = "Transaccionsic.findByValorTotal", query = "SELECT t FROM Transaccionsic t WHERE t.valorTotal = :valorTotal")
    , @NamedQuery(name = "Transaccionsic.findByNumDocumento", query = "SELECT t FROM Transaccionsic t WHERE t.numDocumento = :numDocumento")
    , @NamedQuery(name = "Transaccionsic.findByTipoDocumento", query = "SELECT t FROM Transaccionsic t WHERE t.tipoDocumento = :tipoDocumento")
    , @NamedQuery(name = "Transaccionsic.findByFecha", query = "SELECT t FROM Transaccionsic t WHERE t.fecha = :fecha")})
public class Transaccionsic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_TRANSACCION")
    private Integer numTransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_TOTAL")
    private int valorTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_DOCUMENTO")
    private int numDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPO_DOCUMENTO")
    private String tipoDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "FECHA")
    private String fecha;

    public Transaccionsic() {
    }

    public Transaccionsic(Integer numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public Transaccionsic(Integer numTransaccion, int valorTotal, int numDocumento, String tipoDocumento, String fecha) {
        this.numTransaccion = numTransaccion;
        this.valorTotal = valorTotal;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
        this.fecha = fecha;
    }

    public Integer getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(Integer numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(int numDocumento) {
        this.numDocumento = numDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numTransaccion != null ? numTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccionsic)) {
            return false;
        }
        Transaccionsic other = (Transaccionsic) object;
        if ((this.numTransaccion == null && other.numTransaccion != null) || (this.numTransaccion != null && !this.numTransaccion.equals(other.numTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transaccionsic[ numTransaccion=" + numTransaccion + " ]";
    }
    
}

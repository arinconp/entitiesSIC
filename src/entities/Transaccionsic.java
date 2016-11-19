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
 * @author sala-a
 */
@Entity
@Table(name = "TRANSACCIONSIC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transaccionsic.findAll", query = "SELECT t FROM Transaccionsic t"),
    @NamedQuery(name = "Transaccionsic.findByNumeroTransaccion", query = "SELECT t FROM Transaccionsic t WHERE t.numeroTransaccion = :numeroTransaccion"),
    @NamedQuery(name = "Transaccionsic.findByValorTotal", query = "SELECT t FROM Transaccionsic t WHERE t.valorTotal = :valorTotal"),
    @NamedQuery(name = "Transaccionsic.findByCedulaUsuario", query = "SELECT t FROM Transaccionsic t WHERE t.cedulaUsuario = :cedulaUsuario"),
    @NamedQuery(name = "Transaccionsic.findByFecha", query = "SELECT t FROM Transaccionsic t WHERE t.fecha = :fecha")})
public class Transaccionsic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_TRANSACCION")
    private Integer numeroTransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VALOR_TOTAL")
    private double valorTotal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CEDULA_USUARIO")
    private String cedulaUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FECHA")
    private String fecha;

    public Transaccionsic() {
    }

    public Transaccionsic(Integer numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

    public Transaccionsic(Integer numeroTransaccion, double valorTotal, String cedulaUsuario, String fecha) {
        this.numeroTransaccion = numeroTransaccion;
        this.valorTotal = valorTotal;
        this.cedulaUsuario = cedulaUsuario;
        this.fecha = fecha;
    }

    public Integer getNumeroTransaccion() {
        return numeroTransaccion;
    }

    public void setNumeroTransaccion(Integer numeroTransaccion) {
        this.numeroTransaccion = numeroTransaccion;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
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
        hash += (numeroTransaccion != null ? numeroTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Transaccionsic)) {
            return false;
        }
        Transaccionsic other = (Transaccionsic) object;
        if ((this.numeroTransaccion == null && other.numeroTransaccion != null) || (this.numeroTransaccion != null && !this.numeroTransaccion.equals(other.numeroTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Transaccionsic[ numeroTransaccion=" + numeroTransaccion + " ]";
    }
    
}

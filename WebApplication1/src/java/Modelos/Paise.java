/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author ruizm
 */
@Entity
@Table(name = "paises")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paise.findAll", query = "SELECT p FROM Paise p")
    , @NamedQuery(name = "Paise.findByCodPais", query = "SELECT p FROM Paise p WHERE p.codPais = :codPais")
    , @NamedQuery(name = "Paise.findByBandera", query = "SELECT p FROM Paise p WHERE p.bandera = :bandera")})
public class Paise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cod_pais")
    private Integer codPais;
    @Lob
    @Column(name = "nom_pais")
    private String nomPais;
    @Basic(optional = false)
    @Column(name = "bandera")
    private String bandera;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codPais")
    private List<Premio> premioList;
    @OneToMany(mappedBy = "nacionalidad")
    private List<Autor> autorList;

    public Paise() {
    }

    public Paise(Integer codPais) {
        this.codPais = codPais;
    }

    public Paise(Integer codPais, String bandera) {
        this.codPais = codPais;
        this.bandera = bandera;
    }

    public Integer getCodPais() {
        return codPais;
    }

    public void setCodPais(Integer codPais) {
        this.codPais = codPais;
    }

    public String getNomPais() {
        return nomPais;
    }

    public void setNomPais(String nomPais) {
        this.nomPais = nomPais;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    @XmlTransient
    public List<Premio> getPremioList() {
        return premioList;
    }

    public void setPremioList(List<Premio> premioList) {
        this.premioList = premioList;
    }

    @XmlTransient
    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPais != null ? codPais.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paise)) {
            return false;
        }
        Paise other = (Paise) object;
        if ((this.codPais == null && other.codPais != null) || (this.codPais != null && !this.codPais.equals(other.codPais))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Modelos.Paise[ codPais=" + codPais + " ]";
    }
    
}

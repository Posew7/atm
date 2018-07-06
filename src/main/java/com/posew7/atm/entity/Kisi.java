package com.posew7.atm.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "kisi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Kisi.girisKontrol", query = "SELECT k FROM Kisi k where k.kullanici = :kullanici and k.sifre = :sifre")
    , @NamedQuery(name = "Kisi.findAll", query = "SELECT k FROM Kisi k")
    , @NamedQuery(name = "Kisi.findByNo", query = "SELECT k FROM Kisi k WHERE k.no = :no")
    , @NamedQuery(name = "Kisi.findByKullanici", query = "SELECT k FROM Kisi k WHERE k.kullanici = :kullanici")
    , @NamedQuery(name = "Kisi.findBySifre", query = "SELECT k FROM Kisi k WHERE k.sifre = :sifre")
    , @NamedQuery(name = "Kisi.findByPara", query = "SELECT k FROM Kisi k WHERE k.para = :para")})
public class Kisi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Size(max = 30)
    @Column(name = "kullanici")
    private String kullanici;
    @Size(max = 30)
    @Column(name = "sifre")
    private String sifre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "para")
    private double para;

    public Kisi() {
    }

    public Kisi(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getKullanici() {
        return kullanici;
    }

    public void setKullanici(String kullanici) {
        this.kullanici = kullanici;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public double getPara() {
        return para;
    }

    public void setPara(double para) {
        this.para = para;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (no != null ? no.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kisi)) {
            return false;
        }
        Kisi other = (Kisi) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posew7.atm.entity.Kisi[ no=" + no + " ]";
    }

}

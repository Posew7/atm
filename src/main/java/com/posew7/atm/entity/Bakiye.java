/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.posew7.atm.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yunus
 */
@Entity
@Table(name = "bakiye")
@XmlRootElement
@NamedQueries({
    
    @NamedQuery(name = "Bakiye.paraYatir", query = "SELECT k FROM Bakiye k where k.bakiye = :bakiye")
    , @NamedQuery(name = "Bakiye.findAll", query = "SELECT b FROM Bakiye b")
    , @NamedQuery(name = "Bakiye.findByNo", query = "SELECT b FROM Bakiye b WHERE b.no = :no")
    , @NamedQuery(name = "Bakiye.findByBakiye", query = "SELECT b FROM Bakiye b WHERE b.bakiye = :bakiye")})
public class Bakiye implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "no")
    private Integer no;
    @Column(name = "bakiye")
    private Integer bakiye;

    public Bakiye() {
    }

    public Bakiye(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getBakiye() {
        return bakiye;
    }

    public void setBakiye(Integer bakiye) {
        this.bakiye = bakiye;
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
        if (!(object instanceof Bakiye)) {
            return false;
        }
        Bakiye other = (Bakiye) object;
        if ((this.no == null && other.no != null) || (this.no != null && !this.no.equals(other.no))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.posew7.atm.entity.Bakiye[ no=" + no + " ]";
    }
    
}

package com.posew7.atm.mb;

import com.posew7.atm.session.KisiFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "giris")
@RequestScoped
public class Giris {

    @EJB
    private KisiFacade kisiFacade;

    private String kullanici;
    private String sifre;
    private double para;

    public Giris() {
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
    
    public String girisKontrolMB(){
        
        boolean sonuc = kisiFacade.girisKontrol(kullanici, sifre);
        
        if (sonuc) {
            return "menu.xhtml";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("HATA", "kullanıcı veya şifre yanlış"));
            return "";
        }
        
    }
    
}

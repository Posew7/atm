package com.posew7.atm.mb;

import com.posew7.atm.session.BakiyeFacade;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

@Named(value = "menu")
@RequestScoped
public class Menu {

    @EJB
    private BakiyeFacade bakiyeFacade;

    private int bakiye;

    public Menu() {
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public String paraYatir(){
        
        boolean sonuc = bakiyeFacade.paraEkle(bakiye);
        
        if (sonuc) {
            return "paraYatir.xhtml";
        } else {
            return "";
        }
    }
    
}

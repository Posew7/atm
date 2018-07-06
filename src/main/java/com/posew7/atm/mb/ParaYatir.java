
package com.posew7.atm.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "paraYatir")
@RequestScoped
public class ParaYatir {

    private int Bakiye;
    
    public ParaYatir() {
    }

    public int getBakiye() {
        return Bakiye;
    }

    public void setBakiye(int Bakiye) {
        this.Bakiye = Bakiye;
    }
    
    
    
}

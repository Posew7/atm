package com.posew7.atm.session;

import com.posew7.atm.entity.Kisi;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class KisiFacade extends AbstractFacade<Kisi> {

    @PersistenceContext(unitName = "com.posew7_atm_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KisiFacade() {
        super(Kisi.class);
    }

    public boolean girisKontrol(String p_kullanici, String p_sifre) {

        try {

            Kisi k = em.createNamedQuery("Kisi.girisKontrol", Kisi.class).setParameter("kullanici", p_kullanici).setParameter("sifre", p_sifre).getSingleResult();

            if (k != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }

    }

}

package com.posew7.atm.session;

import com.posew7.atm.entity.Bakiye;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BakiyeFacade extends AbstractFacade<Bakiye> {

    @PersistenceContext(unitName = "com.posew7_atm_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BakiyeFacade() {
        super(Bakiye.class);
    }

    public boolean paraEkle(int p_bakiye) {

        try {
            int k = em.createNamedQuery("Bakiye.paraYatir", Bakiye.class).setParameter("bakiye", p_bakiye).executeUpdate();

            if (k != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            return false;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Modelos.Subsectorespropios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruizm
 */
@Stateless
public class SubsectorespropiosFacade extends AbstractFacade<Subsectorespropios> {

    @PersistenceContext(unitName = "VictorRuizPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SubsectorespropiosFacade() {
        super(Subsectorespropios.class);
    }
    
}

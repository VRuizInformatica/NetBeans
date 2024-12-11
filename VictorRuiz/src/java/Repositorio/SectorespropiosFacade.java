/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Modelos.Sectorespropios;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruizm
 */
@Stateless
public class SectorespropiosFacade extends AbstractFacade<Sectorespropios> {

    @PersistenceContext(unitName = "VictorRuizPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SectorespropiosFacade() {
        super(Sectorespropios.class);
    }
    
}

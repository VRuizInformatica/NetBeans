/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repositorio;

import Modelos.Regiones;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ruizm
 */
@Stateless
public class RegionesFacade extends AbstractFacade<Regiones> {

    @PersistenceContext(unitName = "VictorRuizPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegionesFacade() {
        super(Regiones.class);
    }
    
}
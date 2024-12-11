package Controladores;

import Modelos.Proyecto;
import Modelos.Cad;
import Modelos.Crs;
import Modelos.Odsprincipal;
import Repositorio.ProyectoFacade;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("ejercicio3")
@ViewScoped
public class Ejercicio3 implements Serializable {

    private List<Proyecto> proyectos;

    @EJB
    private ProyectoFacade proyectoFacade;

    @PostConstruct
    public void init() {
        proyectos = proyectoFacade.findAll();
    }

    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public String getCrsInfo(Proyecto proyecto) {
        List<Crs> crsList = proyecto.getCrsList();
        if (crsList != null && !crsList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Crs crs : crsList) {
                sb.append(crs.getCodCrs()).append(" - ").append(crs.getNomCrs()).append("; ");
            }
            return sb.toString();
        } else {
            return "Sin CRS";
        }
    }

    public String getOdsInfo(Proyecto proyecto) {
        List<Odsprincipal> odsList = proyecto.getOdsprincipalList();
        if (odsList != null && !odsList.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Odsprincipal ods : odsList) {
                sb.append(ods.getCodOds()).append(" - ").append(ods.getNomOds()).append("; ");
            }
            return sb.toString();
        } else {
            return "Sin ODS";
        }
    }
}

package Controladores;

import Modelos.Proyecto;
import Repositorio.ProyectoFacade;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("ejercicio1")
@ViewScoped
public class Ejercicio1 implements Serializable {

    private Integer yearFilter;
    private String countryFilter;

    private List<Proyecto> proyectosFiltrados;
    private List<Proyecto> todosProyectos;

    private Set<String> listaPaises;

    @EJB
    private ProyectoFacade proyectoFacade;

    @PostConstruct
    public void init() {
        todosProyectos = proyectoFacade.findAll();
        proyectosFiltrados = new ArrayList<>(todosProyectos);

        listaPaises = new HashSet<>();
        for (Proyecto proyecto : todosProyectos) {
            if (proyecto.getPais() != null && !proyecto.getPais().isEmpty()) {
                listaPaises.add(proyecto.getPais());
            }
        }
    }


    public Integer getYearFilter() {
        return yearFilter;
    }

    public void setYearFilter(Integer yearFilter) {
        this.yearFilter = yearFilter;
    }

    public String getCountryFilter() {
        return countryFilter;
    }

    public void setCountryFilter(String countryFilter) {
        this.countryFilter = countryFilter;
    }

    public List<Proyecto> getProyectosFiltrados() {
        return proyectosFiltrados;
    }

    public Set<String> getListaPaises() {
        return listaPaises;
    }

    public void filtrarProyectos() {
        proyectosFiltrados = new ArrayList<>();

        for (Proyecto proyecto : todosProyectos) {
            boolean coincideAnyo = (yearFilter == null) || (proyecto.getAnyo() != null && proyecto.getAnyo().equals(yearFilter));
            boolean coincidePais = (countryFilter == null || countryFilter.isEmpty()) || (proyecto.getPais() != null && proyecto.getPais().equals(countryFilter));

            if (coincideAnyo && coincidePais) {
                proyectosFiltrados.add(proyecto);
            }
        }
    }

    public void resetearFiltros() {
        yearFilter = null;
        countryFilter = null;
        proyectosFiltrados = new ArrayList<>(todosProyectos);
    }
}

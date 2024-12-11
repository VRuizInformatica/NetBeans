package Controladores;

import Modelos.Proyecto;
import Repositorio.ProyectoFacade;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import org.primefaces.model.chart.PieChartModel;

@Named("Grafica")
@ViewScoped
public class Ejercicio2 implements Serializable {

    private static final long serialVersionUID = 1L;

    private PieChartModel pieModel;

    @EJB
    private ProyectoFacade proyectoFacade;

    @PostConstruct
    public void init() {
        createPieModel();
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    private void createPieModel() {
        pieModel = new PieChartModel();

        int añoInicio = 2018;
        int añoFin = 2022;

        List<Proyecto> proyectosList = proyectoFacade.findAll();

        Map<Integer, Double> dineroPorAño = new HashMap<>();

        for (Proyecto proyecto : proyectosList) {
            Integer añoProyecto = proyecto.getAnyo();

            if (añoProyecto != null && añoProyecto >= añoInicio && añoProyecto <= añoFin) {
                Double dineroConcedido = proyecto.getDineroConcedido();
                if (dineroConcedido != null) {
                    dineroPorAño.put(añoProyecto, dineroPorAño.getOrDefault(añoProyecto, 0.0) + dineroConcedido);
                }
            }
        }

        for (Map.Entry<Integer, Double> entry : dineroPorAño.entrySet()) {
            pieModel.set(entry.getKey().toString(), entry.getValue());
        }

        pieModel.setTitle("Dinero Concedido por Año (2018-2022)");
        pieModel.setLegendPosition("w");
        pieModel.setShadow(false);
        pieModel.setShowDataLabels(true);
        pieModel.setDataFormat("value");
    }
}

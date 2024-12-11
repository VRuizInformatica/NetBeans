package Controladores;

import Modelos.Misiones;
import Repositorio.MisionesFacade;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.model.chart.PieChartModel;

@Named("chartJsView")
@ViewScoped
public class ChartJsView implements Serializable {

    private PieChartModel pieModel;

    @EJB
    private MisionesFacade misionesFacade;

    @PostConstruct
    public void init() {
        createPieModel();
    }

    private void createPieModel() {
        pieModel = new PieChartModel();

        // Obtener la lista de misiones
        List<Misiones> misionesList = misionesFacade.findAll();

        // Contar misiones por país
        Map<String, Integer> misionesPorPais = new HashMap<>();

        for (Misiones mision : misionesList) {
            String pais = mision.getPais();
            if (pais == null || pais.isEmpty()) {
                pais = "Desconocido";
            }
            misionesPorPais.put(pais, misionesPorPais.getOrDefault(pais, 0) + 1);
        }

        // Agregar los datos al modelo del gráfico
        for (Map.Entry<String, Integer> entry : misionesPorPais.entrySet()) {
            pieModel.set(entry.getKey(), entry.getValue());
        }

        // Configuración adicional del gráfico
        pieModel.setTitle("Misiones por País");
        pieModel.setLegendPosition("w");
        pieModel.setShadow(false);
    }

    public PieChartModel getPieModel() {
        return pieModel;
    }

    public void setPieModel(PieChartModel pieModel) {
        this.pieModel = pieModel;
    }
}

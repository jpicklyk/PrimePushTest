package presentation;

import business.PushController;
import org.primefaces.model.chart.LineChartModel;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.Date;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DateAxis;

/**
 * Created by jpicklyk on 5/5/14.
 */
@Named
@RequestScoped
public class IndexBean implements Serializable{

    @Inject
    PushController controller;

    private LineChartModel model;
    private int windowSize = 10;

    public IndexBean() {
        Date date = new Date();
        model = new LineChartModel();
        DateAxis x = new DateAxis("Time");
        x.setTickFormat("%H:%M:%S");
        x.setMin(date.getTime());
        x.setMax(date.getTime()+(10000));
        x.setTickCount(windowSize);
        model.getAxes().put(AxisType.X, x);
        model.getAxis(AxisType.Y).setMax(6);
        loadSeries(date);
    }

    private void loadSeries(Date date) {
        ChartSeries series1 = new ChartSeries();
        series1.setLabel("Test series");
        
        System.out.println(date);
        series1.set(date.getTime(),0);
        model.addSeries(series1);

    }

    public LineChartModel getModel() {
        return model;
    }

    public void setModel(LineChartModel model) {
        this.model = model;
    }

    public void pushData() {
        System.out.println("Pushing data");
        controller.pushData();
    }
    
    public int getWindowSize() {
        return windowSize;
    }
}

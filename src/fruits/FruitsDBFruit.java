/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.PieChart;

/**
 *
 * @author kim
 */
public class FruitsDBFruit extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Imported Fruits avec ArrayList");
        stage.setWidth(500);
        stage.setHeight(500);

        ObservableList<PieChart.Data> pieChartData = this.getData();
        final PieChart pieChart = new PieChart(pieChartData);
        pieChart.setTitle("Imported Fruits");
        ((Group) scene.getRoot()).getChildren().add(pieChart);
        stage.setScene(scene);
        stage.show();
    }

    public ObservableList<PieChart.Data> getData() {
       
        ObservableList<PieChart.Data> data
                = FXCollections.observableArrayList();
        for (Fruit fruit : DBFruit.getAll()) {
            // ajouter dans data,des PieChart.Data("nom",Quantite
            data.add(new PieChart.Data(fruit.getNom(),
                    fruit.getQuantite())); //ajoute de la donnee dan data
        }
        return data; 
    }

    public static void main(String[] args) {
        launch(args);
    }
}

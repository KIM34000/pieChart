/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.chart.PieChart;

public class FruitsArrayList extends Application {

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(new Group());
        stage.setTitle("Imported Fruits");
        stage.setWidth(500);
        stage.setHeight(500);
        //création d'une ArrayList
        List<Fruit> list = new ArrayList<>();
        list.add(new Fruit(1, "Grapefruit", 13));
        list.add(new Fruit(2, "Oranges", 25));
        list.add(new Fruit(3, "Plums", 10));
        list.add(new Fruit(4, "Pears", 22));
        list.add(new Fruit(5, "Apples", 30));

        //appel de la méthode getData()
        ObservableList<PieChart.Data> pieChartData = this.getData(list);
        final PieChart pieChart = new PieChart(pieChartData);
        //final PieChart pieChart = new pieChart(this.getData(list));
        pieChart.setTitle("Imported Fruits test");
        ((Group) scene.getRoot()).getChildren().add(pieChart);
        stage.setScene(scene);
        stage.show();
    }

    //methode permettant de creer une observablelist<PieChart.Data> a partir de
    //l'ArrayList en utilisant le nom et la quantite
    public ObservableList<PieChart.Data> getData(List<Fruit> list) {
        //data est une Observablelist qui contiendra des pieChar.Data
        //Voir premier exemple dans le premier fichier
        ObservableList<PieChart.Data> data
                = FXCollections.observableArrayList();
        for (Fruit fruit : list) {
            //on doit ajouter dans data,des PieChart.Data("nom",Quantite
            data.add(new PieChart.Data(fruit.getNom(),
                    fruit.getQuantite())); //ajoute de la donnee dan data
        }
        return data; //la methode retourne la observablelist<PieChart.Data.data
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author kim
 */
public class Fruit {

    private SimpleIntegerProperty id;
    private SimpleStringProperty nom;
    private SimpleIntegerProperty quantite;

   

    public Fruit() {// constructeur par defaut
        this.id = new SimpleIntegerProperty();
        this.nom = new SimpleStringProperty();
        this.quantite = new SimpleIntegerProperty();
    }
    public Fruit(int id, String nom, int quantite) {//constructeur ordianire
        this.id = new SimpleIntegerProperty();
        this.nom = new SimpleStringProperty();
        this.quantite = new SimpleIntegerProperty();
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNom() {
        return nom.get();
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public int getQuantite() {
        return quantite.get();
    }

    public void setQuantite(int quantite) {
        this.quantite.set(quantite);
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", nom=" + nom + ", quantite=" + quantite + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;


import java.sql.ResultSet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kim
 */
public class DBFruit {

    public static List<Fruit> getAll() {
        List<Fruit> fruits = new ArrayList<>();
        try {

            String query = "SELECT id,nom,quantite FROM   fruits ";

            ResultSet resultSet = DBConnect.connect().createStatement().
                    executeQuery(query);

            while (resultSet.next()) {

                Fruit f = new Fruit();
                System.out.println(resultSet.getInt(1));
                f.setId(resultSet.getInt(1));
                f.setNom(resultSet.getString(2));
                f.setQuantite(resultSet.getInt(3));

                System.out.println(f);
                fruits.add(f);

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {

            return fruits;
        }

    }
}

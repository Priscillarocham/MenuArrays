package dao.impl;

import dao.intf.CoursDao;
import java.util.ArrayList;
import java.util.List;
import model.Cours;

/**
 *
 * @author Priscilla
 */
public class CoursDaoImpl implements CoursDao {

    List<Cours> coursList;

    public CoursDaoImpl() {
        coursList = new ArrayList<>();
        coursList.add(new Cours(1, "Mathematic"));
        coursList.add(new Cours(2, "French"));
        coursList.add(new Cours(3, "English"));
        coursList.add(new Cours(4, "Java"));
        coursList.add(new Cours(5, "Python"));

    }

    @Override
    public void addCours(Cours cours) {
        coursList.add(cours);
    }

    @Override
    public List<Cours> findAll() {
        return coursList;
    }

}

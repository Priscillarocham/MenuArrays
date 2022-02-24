package dao.intf;

import java.util.List;
import model.Cours;

/**
 *
 * @author Priscilla
 */
public interface CoursDao {

    void addCours(Cours cours);

    List<Cours> findAll();
}

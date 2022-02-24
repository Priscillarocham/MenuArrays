package dao.intf;

import java.util.List;
import model.Etudiant;

/**
 *
 * @author Priscilla
 */
public interface StudentDao {

    void add(Etudiant etudiant);

    List<Etudiant> findAll();
}

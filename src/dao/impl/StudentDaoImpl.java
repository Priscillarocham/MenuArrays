package dao.impl;

import dao.intf.StudentDao;
import java.util.ArrayList;
import java.util.List;
import model.Etudiant;

/**
 *
 * @author Priscilla
 */
public class StudentDaoImpl implements StudentDao {

    private List<Etudiant> etudiantList;

    public StudentDaoImpl() {
        etudiantList = new ArrayList<>();
        etudiantList.add(new Etudiant("Priscilla", "Rocha", "F"));
        etudiantList.add(new Etudiant("Gustavo", "Martins", "M"));
        etudiantList.add(new Etudiant("Viviane", "Motta", "F"));
        etudiantList.add(new Etudiant("Carlos", "Machado", "M"));
        etudiantList.add(new Etudiant("Tais", "Archanjo", "F"));
    }

    @Override
    public void add(Etudiant etudiant) {
        etudiantList.add(etudiant);
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantList;
    }

}

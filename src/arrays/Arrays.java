package arrays;

import dao.impl.CoursDaoImpl;
import dao.impl.StudentDaoImpl;
import dao.intf.CoursDao;
import dao.intf.StudentDao;
import model.Cours;
import model.Etudiant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Priscilla
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List<Etudiant> etudiantList = initialStudents();
        //List<Cours> coursList = initialCourses();

        StudentDao studentDao = new StudentDaoImpl();
        CoursDao coursDao = new CoursDaoImpl();

        String continueMenu = "y";

        do {
            Integer choix = showMenu();

            switch (choix) {
                case 1:
                    Etudiant newStudent = createNewStudent();
                    studentDao.add(newStudent);
                    //etudiantList.add(newStudent);
                    System.out.println("New student saved succefully");

                    continueMenu = isContinue();

                    break;
                case 2:
                    List<Etudiant> etudiantList = studentDao.findAll();

                    for (Etudiant etudiant : etudiantList) {
                        System.out.println(etudiant.showInfo());
                    }

                    continueMenu = isContinue();

                    break;
                case 3:
                    Cours newCours = createNewCours();
                    //coursList.add(newCours);
                    coursDao.addCours(newCours);
                    System.out.println("New cours saved succefully");

                    continueMenu = isContinue();

                    break;
                case 4:
                    List<Cours> coursList = coursDao.findAll();

                    for (Cours cours : coursList) {
                        System.out.println(cours.showInfo());
                    }

                    continueMenu = isContinue();

                    break;
                case 5:
                    System.out.println("FIN");
                    continueMenu = "n";
                    break;
                default:
                    System.out.println("----------------------------------------");
                    System.out.println("This option is not valid. Please choose another option");
            }

        } while (continueMenu.equals("y"));

    }

    public static Integer showMenu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("*************** MENU ************* \n ");
        System.out.println("1 - Create new student");
        System.out.println("2 - Display all students");
        System.out.println("3 - Create new course");
        System.out.println("4 - Display all course");
        System.out.println("5 - Exit");
        System.out.println("**********************************");

        return scanner.nextInt();
    }

    public static String isContinue() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Do you want to continue? (y/n)");

        return scanner.nextLine();
    }

    public static Etudiant createNewStudent() {
        Scanner scanner = new Scanner(System.in);
        Etudiant newStudent = new Etudiant();

        System.out.println("### CREATING NEW STUDENT ###");

        System.out.println("First name : ");
        newStudent.setFirstName(scanner.nextLine());

        System.out.println("Last name : ");
        newStudent.setLastName(scanner.nextLine());

        System.out.println("Gender : ");
        newStudent.setGender(scanner.nextLine());

        return newStudent;
    }

    public static Cours createNewCours() {
        Scanner scanner = new Scanner(System.in);
        Cours newCours = new Cours();

        System.out.println("### CREATING NEW COURSE ###");

        System.out.println("Course Id : ");
        newCours.setCourseId(scanner.nextInt());

        System.out.println("Course Name : ");
        newCours.setCourseName(scanner.next());

        return newCours;
    }
}

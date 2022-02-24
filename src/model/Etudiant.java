package model;

/**
 *
 * @author Priscilla
 */
public class Etudiant {

    private String firstName;
    private String lastName;
    private String gender;

    public Etudiant() {
    }

    public Etudiant(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String showInfo() {
        String info = "First Name: " + firstName + ", Last Name: " + lastName + ", Gender: " + gender;
        return info;
    }
}

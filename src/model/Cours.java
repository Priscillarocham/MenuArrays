package model;

/**
 *
 * @author Priscilla
 */
public class Cours {

    private Integer courseId;
    private String courseName;

    public Cours() {
    }

    public Cours(Integer courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String showInfo() {
        String info = "Course Id: " + courseId + ", Course Name: " + courseName;
        return info;
    }
}

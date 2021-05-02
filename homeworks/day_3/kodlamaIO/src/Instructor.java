public class Instructor extends User {

    private String course;
    private String about;
    private int courseCount;

    public Instructor(int id, String firstName, String lastName, String eMail, int age, String course) {
        super(id, firstName, lastName, eMail, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

}

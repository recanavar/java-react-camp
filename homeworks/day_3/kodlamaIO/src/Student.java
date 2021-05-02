public class Student extends User {

    private String myCourse;
    private String country;
    private String city;
    private String nextLesson;
    private String previousLesson;
    private int zipCode;

    public Student(int id, String firstName, String lastName, String eMail, int age) {
        super(id, firstName, lastName, eMail, age);
    }

    public String getMyCourse() {
        return myCourse;
    }

    public void setMyCourse(String myCourse) {
        this.myCourse = myCourse;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNextLesson() {
        return nextLesson;
    }

    public void setNextLesson(String nextLesson) {
        this.nextLesson = nextLesson;
    }

    public String getPreviousLesson() {
        return previousLesson;
    }

    public void setPreviousLesson(String previousLesson) {
        this.previousLesson = previousLesson;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

}

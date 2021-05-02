
public class Course {

    public Course(int id, String name, String lecturerName, int completionPercentage) {
        this.id = id;
        this.name = name;
        this.lecturerName = lecturerName;
        this.completionPercentage = completionPercentage;
    }

    int id;
    byte[] lecturerImage;
    byte[] image;
    byte[] progressBar;
    String name;
    String lecturerName;
    String lecturerDetail;
    int completionPercentage;
}

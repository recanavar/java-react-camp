import java.util.Scanner;

public class StudentManager extends UserManager {

    public void joinCourse(Student student) {
        System.out.println("[LOG] " + student.getFirstName() + " " + student.getLastName() + " joined a course");
    }

    public void exitCourse(Student student) {
        System.out.println("[LOG] " + student.getFirstName() + " " + student.getLastName() + " exited from course");
    }

    public void nextLesson(Student student) {
        System.out.println("[LOG] " + student.getFirstName() + " " + student.getLastName() + " continued next lesson.");
    }

    public void previousLesson(Student student) {
        System.out.println(
                "[LOG] " + student.getFirstName() + " " + student.getLastName() + " got back to the previous lesson.");
    }

    public void read(Student student) {
        System.out.println("================================");
        System.out.println("STUDENT INFO");
        System.out.println("================================");
        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.println("Age : " + student.getAge());
        System.out.println("E-Mail : " + student.getEmail());
        System.out.println("Course : " + student.getMyCourse());
        System.out.println("================================");
    }

    public void editProfile(Student student) {
        System.out.println("================================");
        System.out.println("PREVIOUS INFO");
        System.out.println("================================");
        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.println("Age : " + student.getAge());
        System.out.println("" + student.getCountry());
        System.out.println("" + student.getCity());
        System.out.println("================================");
        System.out.println("EDIT INFO");
        System.out.println("================================");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter New Firstname : ");
        String userName = scanner.nextLine();

        System.out.println("Enter New Lastname : ");
        String lastName = scanner.nextLine();

        System.out.println("Enter New Country : ");
        String country = scanner.nextLine();

        System.out.println("Enter New City : ");
        String city = scanner.nextLine();

        student.setFirstName(userName);
        student.setLastName(lastName);
        student.setCountry(country);
        student.setCity(city);

        System.out.println("================================");
        System.out.println("NEW INFO");
        System.out.println("================================");
        System.out.println(student.getFirstName() + " " + student.getLastName());
        System.out.println("Age : " + student.getAge());
        System.out.println("" + student.getCountry());
        System.out.println("" + student.getCity());
        System.out.println("================================");
    }
}

public class InstructorManager extends UserManager {

    public void addCourse() {
        System.out.println("[LOG] New course added.");
    }

    public void updateCourse() {
        System.out.println("[LOG] Course updated.");
    }

    public void deleteCourse() {
        System.out.println("[LOG] Course deleted.");
    }

    public void read(Instructor instructor) {
        System.out.println("================================");
        System.out.println("INSTRUCTOR INFO");
        System.out.println("================================");
        System.out.println(instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Age : " + instructor.getAge());
        System.out.println("About : " + instructor.getAbout());
        System.out.println("E-Mail : " + instructor.getEmail());
        System.out.println("Course : " + instructor.getCourse());
        System.out.println("Instructor Course Count :" + instructor.getCourseCount());
        System.out.println("Instructor Course Name : " + instructor.getCourse());
        System.out.println("================================");
    }

    public void addStudentToCourse(Instructor instructor, Student student) {
        System.out.println("[LOG] " + student.getFirstName() + " " + student.getLastName() + " was added to the "
                + instructor.getCourse());
    }

    public void deleteStudentFromCourse(Instructor instructor, Student student) {
        System.out.println("[LOG] " + student.getFirstName() + " " + student.getLastName() + " was deleted from the "
                + instructor.getCourse());
    }

    public void listStudent(Student[] students) {
        System.out.println("================================");
        System.out.println("ALL STUDENTS");
        System.out.println("================================");
        for (Student student : students) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
        System.out.println("================================");
    }
}

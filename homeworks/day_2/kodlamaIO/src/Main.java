public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", "Engin Demiroğ", 0);
        Course course2 = new Course(2, "Yazılım Geliştirici Yetiştirme Kampı (Java + React)", "Engin Demiroğ", 0);
        Course course3 = new Course(3, "Programlamaya Giriş İçin Temel Kurs", "Engin Demiroğ", 0);

        Lecture lecture1 = new Lecture(1, "24 Nisan 2021 - 2. gün", "Ders Programı");
        Lecture lecture2 = new Lecture(2, "24 Nisan 2021 - 2. gün", "Ödev 1");
        Lecture lecture3 = new Lecture(3, "24 Nisan 2021 - 2. gün", "Ödev 2");
        Lecture lecture4 = new Lecture(4, "24 Nisan 2021 - 2. gün", "Değerlendirme");

        CourseManager courseManager = new CourseManager();

        Course[] courses = { course1, course2, course3 };
        Lecture[] lectures = { lecture1, lecture2, lecture3, lecture4 };

        for (int i = 0; i < courses.length; i++) {
            courses[i].completionPercentage += courseManager.increasePercentage();
            System.out.println(courses[i].lecturerName + " - " + courses[i].name + " -> Comleted:"
                    + courses[i].completionPercentage);
            for (int j = 0; j < lectures.length; j++) {
                System.out.println(" > " + lectures[j].title);
            }
            System.out.println("=================================================================================");
        }
    }
}

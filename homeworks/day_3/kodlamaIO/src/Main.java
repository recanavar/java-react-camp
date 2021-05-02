public class Main {
    public static void main(String[] args) throws Exception {

        Student student1 = new Student(1, "Ahmet", "Çizer", "aciz@gmail.com", 19);
        Student student2 = new Student(2, "Cemal", "Ezer", "cez@gmail.com", 26);
        Student student3 = new Student(3, "Hilmi", "Ağlar", "hag@gmail.com", 30);
        Student student4 = new Student(4, "Ayberk", "Coşar", "acos@gmail.com", 33);
        Student student5 = new Student(5, "Selami", "Sürer", "ssürer@gmail.com", 48);

        student1.setCountry("Türkiye");
        student1.setCity("İstanbul");
        student1.setMyCourse("NodeJS Developer Camp");

        StudentManager stmanager = new StudentManager();
        stmanager.add(new User(6, "Hakan", "Kaçar", "kacar@gmail.com", 38));
        stmanager.read(student1);
        stmanager.joinCourse(student2);
        stmanager.exitCourse(student3);
        stmanager.nextLesson(student4);
        stmanager.previousLesson(student5);

        Instructor ins1 = new Instructor(1, "Engin", "Demirog", "demirog@gmail.com", 30,
                "Software Developer Training Camp (C# + ANGULAR)");
        Instructor ins2 = new Instructor(2, "Metin", "Yılar", "myılar@gmail.com", 34, "NodeJS Developer Camp");
        ins1.setAbout("He has Microsoft Certified Trainer (MCT) ,PMP and ITIL certificates");
        ins1.setCourseCount(1);
        ins2.setAbout("He is the best NodeJS developer in the world!");

        InstructorManager instmanager = new InstructorManager();
        instmanager.add(new Student(2, "Engin", "Süperog", "superog@gmail.com", 35));
        instmanager.addCourse();
        instmanager.updateCourse();
        instmanager.read(ins1);

        UserManager userManager = new UserManager();
        userManager.add(new Student(7, "Haluk", "Bilir", "bilir@gmail.com", 42));
        userManager.read(student3);
        userManager.update(student4);
        userManager.delete(student5);
        userManager.comment(student1, "Test comment!");
    }
}

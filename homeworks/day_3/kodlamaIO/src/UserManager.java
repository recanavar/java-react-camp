public class UserManager {

    public void add(User user) {
        System.out.println("[LOG] New user added : " + user.getFirstName() + " " + user.getLastName());
    }

    public void update(User user) {
        System.out.println("[LOG] User updated : " + user.getFirstName() + " " + user.getLastName());
    }

    public void delete(User user) {
        System.out.println("[LOG] User deleted : " + user.getFirstName() + " " + user.getLastName());
    }

    public void read(User user) {
        System.out.println("================================");
        System.out.println("USER DEFAULT INFO");
        System.out.println("================================");
        System.out.println(user.getFirstName() + " " + user.getLastName());
        System.out.println("Age : " + user.getAge());
        System.out.println("E-Mail : " + user.getEmail());
        System.out.println("================================");
    }

    public void comment(User user, String comment) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " : " + comment);
    }

}
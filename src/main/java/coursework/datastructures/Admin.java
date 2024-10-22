package coursework.datastructures;

public class Admin extends User {

    private String email;

    public Admin(int id, String login, String password, String name, String surname, String email) {
        super(id, login, password, name, surname);
        this.email = email;
    }

    public Admin(String login, String password, String name, String surname, String email) {
        super(login, password, name, surname);
        this.email = email;
    }
}

package coursework.datastructures;

public class Client extends User{

    private String email;

    public Client(int id, String login, String password, String name, String surname, String email) {
        super(id, login, password, name, surname);
        this.email = email;
    }

    public Client(String login, String password, String name, String surname, String email) {
        super(login, password, name, surname);
        this.email = email;
    }
}

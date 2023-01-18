package ConactManager;

public class Contact {
    private String name;
    private String email;
    private String number;

    public Contact (String name, String email, String number){
        this.name = name;
        this.email = email;
        this.number = number;
    }

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public String getNumber() { return this.number; }

    public String toString() {
        return this.name + "\t| " + this.email + "\t| " + this.number;
    }
}

package ConactManager;

public class Contact {

    private String Name, Phone;

    public Contact(String Name, String Phone) {
        this.Name = Name;
        this.Phone = Phone;
    }

    public Contact() {
    }


    public String toString() {
        return Name + " | " + Phone;
    }

    public void setName(String s) {
        Name = s;
    }

    public void setPhone(String e) {
        Phone = e;
    }


}
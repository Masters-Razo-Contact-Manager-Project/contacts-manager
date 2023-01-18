package ConactManager;

import java.util.ArrayList;

public class Database {
    private String name;
    private ArrayList<Contact> contacts = new ArrayList<>();



    public void addContact(Contact c) {
        this.contacts.add(c);
    }


    public Contact findByName(String name) {
        for (Contact c : this.contacts) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }

    public Contact findByEmail(String email) {
        for (Contact c : this.contacts) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }
    public Contact findByNumber(String number) {
        for (Contact c : this.contacts) {
            if (c.getNumber().equals(number)) {
                return c;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(this.name);
        for (Contact c : this.contacts){
            s.append("\n ").append(c);
        }
        return s.toString();
    }

    public void remove(String deleteName) {
    }
}

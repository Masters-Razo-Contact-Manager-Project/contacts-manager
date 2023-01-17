// Contacts database
// Contact: name, number, email
// Database: multiple contacts

import java.util.ArrayList;

class ContactsDatabase {
    public static void main(String[] args) {
        Database friends = new Database("Friends");
        friends.addContact(new Contact("Bill", "bill@gmail.com", "546023234"));
        friends.addContact(new Contact("Anna", "anna@gmnail.com", "3842348586"));
        friends.addContact(new Contact("Giovanni", "giovanni@yahoo.com", "1458658686"));
        System.out.println(friends);
    }
}

class Contact {
    private String name;
    private String email;
    private String number;

    public Contact (String name, String email, String number){
        this.name = name;
        this.email =email;
        this.number = number;
    }

    public String getName() { return this.name; }
    public String getEmail() { return this.email; }
    public String getNumber() { return this.number; }

    public String toString() {
        return this.name + "\t| " + this.email + "\t| " + this.number;
    }
}

class Database {
    private String name;
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public Database(String name) {
        this.name = name;
    }

    public void addContact(Contact c) {
        this.contacts.add(c);
    }

    public String toString(){
        String s = "";
        s += this.name;
        for (Contact c : this.contacts){
            s += "\n " + c;
        }
        return s;
    }
}
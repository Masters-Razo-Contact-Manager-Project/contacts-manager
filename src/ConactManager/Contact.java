package ConactManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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


    static void write() {
        try {
            Contact contact;
            contact = new Contact();
            Contact c = contact;

            File file = new File("contacts.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (PrintWriter output = new PrintWriter(new FileWriter(
                    "contacts.txt", true))) {
                output.printf("%s\r\n", c);
            } catch (Exception ignored) {
            }

            System.out.println("Your contact has been saved.");
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package ConactManager;

import java.io.*;
import java.util.*;

public class ContactsData {
    public static void main(String args[]) {
        Contact contact;
        contact = new Contact();
        int action = 0;

        ArrayList<Contact> contacts = new ArrayList<Contact>();
        while (action != 5) {

            System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
            Scanner reader = new Scanner(System.in);
            reader.useDelimiter("\n");
            action = reader.nextInt();

            if (action <= 0 || action > 5) {
                System.out.println("Invalid selection. ");

            }

            switch (action) {

                case 1: {

                    int counter = 0;
                    String line = null;

                    File file = new File("contacts.txt");

                    try {
                        Scanner scanner = new Scanner(file);
                        Set<String> lines = new TreeSet<>();
                        while (scanner.hasNextLine()) {
                            line = scanner.nextLine();
                            lines.add(line);
                            counter++;

                        }

                        for (String fileLine : lines) {
                            String outlook = fileLine.substring(0, 1).toUpperCase()
                                    + fileLine.substring(1);
                            System.out.println(outlook);

                        }


                        scanner.close();

                    } catch (FileNotFoundException e) {

                    }
                }

                break;

                case 2: {

                    System.out.println("\nEnter Contact Name:");
                    String Name = reader.next();
                    if (Name == null) {
                        System.out.println("\nInvalid input. ");
                        break;
                    }

                    else {
                        contact.setName(Name.toLowerCase());
                    }
                    System.out.println("Enter Contact Phone Number: ");
                    String phone = reader.next();
                    contact.setPhone(phone.toLowerCase());

                    contacts.add(contact);

                    try {

                        Contact c = contact;

                        File file = new File("contacts.txt");

                        if (!file.exists()) {
                            file.createNewFile();
                        }

                        try (PrintWriter output = new PrintWriter(new FileWriter(
                                "contacts.txt", true))) {
                            output.printf("%s\r\n", c);
                        } catch (Exception e) {
                        }

                        System.out.println("Your contact has been saved.");
                    }

                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                break;

                case 3:

                    try {
                        System.out.println("Enter the name to search for: ");
                        String searchName = reader.next();

                        BufferedReader bf = new BufferedReader(new FileReader(
                                "contacts.txt"));

                        int linecount = 0;
                        String line;

                        System.out.println("Searching for " + searchName
                                + " in file...");

                        boolean noMatches = true;
                        while ((line = bf.readLine()) != null) {

                            linecount++;
                            int indexfound = line.indexOf(searchName.toLowerCase());

                            if (indexfound > -1) {
                                System.out.println("\nContact was found\n"
                                        + "\nContact " + linecount + ": " + line);
                                noMatches = false;
                            }

                        }

                        bf.close();
                        if (noMatches) {
                            System.out.println("\nNo contact matches your input.\n");
                        }
                    }

                    catch (IOException e) {
                        System.out.println("IO Error Occurred: " + e.toString());
                    }

                    break;

                case 4:
                    //delete contact goes here

                    break;

                case 5:
                    System.out.println("Exiting out, thank you.");



        }
    }

    }
}

package ConactManager;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ContactsData {

    public static void main(String[] args) throws IOException {
        ArrayList<Contact> ContactList = new ArrayList<>();
//        ContactList.add(new Contact("Bill", "bill@gmail.com", "546023234"));
//        ContactList.add(new Contact("Anna", "anna@gmail.com", "3842348586"));
//        ContactList.add(new Contact("Giovanni", "giovanni@yahoo.com", "1458658686"));

        String directory = "data";
        String contactsList = "contacts.txt";


        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, contactsList);

        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (!Files.exists(dataFile)) {
            Files.createFile(dataFile);
        }
        List<String> lines= Files.readAllLines(dataFile);
        for()

                ArrayList<String> contactString=new ArrayList<>();
        for(Contact contact:ContactList){
            contactString.add(contact.getName()+ " | " + contact.getNumber() + " | " + contact.getEmail());
        }
        Files.write(dataFile, contactString);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1. View contacts.\n" +
//                "2. Add a new contact.\n" +
//                "3. Search a contact by name.\n" +
//                "4. Delete an existing contact.\n" +
//                "5. Exit.\n" +
//                "Enter an option (1, 2, 3, 4 or 5):");
//        String Selection = sc.nextLine();
//
//
//        String ListTitle = "Name | Email | Number \n" +
//                "___________________\n";
//
//        if (Selection.equals("1")) {
//            System.out.print(ListTitle + ContactList); ;
//        }
//
//        if (Selection.equals("2")) {
//            System.out.println("You selected add a new contact.");
//            System.out.println("Please input name");
//            String InputName = sc.nextLine();
//
//            System.out.println("Please input email");
//            String InputEmail = sc.nextLine();
//
//            System.out.println("Please input phone number");
//            String InputNum = sc.nextLine();
//            ContactList.addContact(new Contact(InputName, InputEmail, InputNum));
//
//            System.out.println(ListTitle + ContactList);
//        }
//
//        if (Selection.equals("3")) {
//            System.out.println("You selected to search a contact by name.");
//            System.out.println("Please input the name you'd like to search");
//            String SearchName = sc.nextLine();
//            System.out.println(ListTitle + ContactList.findByName(SearchName));
//        }
//
//        // doesn't work atm
//        if (Selection.equals("4")) {
//            System.out.println("You selected to delete an existing contact.");
//            System.out.println("Here is the current contact list");
//            System.out.println(ListTitle + ContactList);
//            System.out.println("Which contact name would you like to remove?");
//            String DeleteName = sc.nextLine();
//            System.out.println("Contact being deleted:");
//            System.out.println(ListTitle + ContactList.findByName(DeleteName));
////            ContactList.remove(DeleteName);
//
//            System.out.println("Updated Contacts");
//            System.out.println(ListTitle + ContactList);
//        }
////
////        if (Selection.equals("5")) {
////
////        }

    }
}

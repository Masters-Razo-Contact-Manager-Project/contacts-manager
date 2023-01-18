package ConactManager;

import java.util.Scanner;

public class ContactsData {

    public static void main(String[] args) {
        Database ContactList = new Database();
        ContactList.addContact(new Contact("Bill", "bill@gmail.com", "546023234"));
        ContactList.addContact(new Contact("Anna", "anna@gmail.com", "3842348586"));
        ContactList.addContact(new Contact("Giovanni", "giovanni@yahoo.com", "1458658686"));
//
//        System.out.println(friends);
//        System.out.println();
//
//        System.out.println(friends.findByName("Anna"));
//        System.out.println(friends.findByEmail("bill@gmail.com"));
//        System.out.println(friends.findByNumber("1458658686"));

        Scanner sc = new Scanner(System.in);
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):");
        String Selection = sc.nextLine();


        String ListTitle = "Name | Email | Number \n" +
                "___________________\n";

        if (Selection.equals("1")) {
            System.out.print(ListTitle + ContactList); ;
        }

        if (Selection.equals("2")) {
            System.out.println("You selected add a new contact.");
            System.out.println("Please input name");
            String InputName = sc.nextLine();

            System.out.println("Please input email");
            String InputEmail = sc.nextLine();

            System.out.println("Please input phone number");
            String InputNum = sc.nextLine();
            ContactList.addContact(new Contact(InputName, InputEmail, InputNum));

            System.out.println(ListTitle + ContactList);
        }

        if (Selection.equals("3")) {
            System.out.println("You selected to search a contact by name.");
            System.out.println("Please input the name you'd like to search");
            String SearchName = sc.nextLine();
            System.out.println(ListTitle + ContactList.findByName(SearchName));
        }

        // doesn't work atm
        if (Selection.equals("4")) {
            System.out.println("You selected to delete an existing contact.");
            System.out.println("Here is the current contact list");
            System.out.println(ListTitle + ContactList);
            System.out.println("Which contact name would you like to remove?");
            String DeleteName = sc.nextLine();
            System.out.println("Contact being deleted:");
            System.out.println(ListTitle + ContactList.findByName(DeleteName));
            ContactList.remove(DeleteName);

            System.out.println("Updated Contacts");
            System.out.println(ListTitle + ContactList);
        }
//
//        if (Selection.equals("5")) {
//
//        }

    }
}

/**
 * @author Benayas Hailu
 * @version December 7, 2024
 * COSC 260
 */

import edu.augie.finalProgram.BHailu.Contact;
import edu.augie.finalProgram.BHailu.PersonalContact;
import edu.augie.finalProgram.BHailu.BusinessContact;
import edu.augie.finalProgram.BHailu.ContactManager;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. List Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Search Contacts");
            System.out.println("6. Import Contacts from CSV");
            System.out.println("7. Export Contacts to CSV");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Choose Contact Type: 1. Personal  2. Business");
                    int type = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Phone Number in '(123) 456-7890' format: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    if (type == 1) {
                        System.out.print("Enter Birthday(MM/DD/YYYY): ");
                        String birthday = scanner.nextLine();
                        System.out.print("Enter Relationship: ");
                        String relation = scanner.nextLine();
                        System.out.print("Enter Nickname: ");
                        String nickName = scanner.nextLine();
                        manager.addContact(new PersonalContact(firstName, lastName, phoneNumber, email, birthday, relation, nickName));
                    } else if (type == 2) {
                        System.out.print("Enter Company Name: ");
                        String company = scanner.nextLine();
                        System.out.print("Enter Job Title: ");
                        String jobTitle = scanner.nextLine();
                        manager.addContact(new BusinessContact(firstName, lastName, phoneNumber, email, company, jobTitle));
                    } else {
                        System.out.println("Invalid type.");
                    }
                }
                case 2 -> manager.listContacts();
                case 3 -> {
                    manager.listContacts();
                    System.out.print("Enter the index of the contact to update: ");
                    int index = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Phone Number in '(123) 456-7890' format: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    System.out.println("Choose Contact Type: 1. Personal  2. Business");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (type == 1) {
                        System.out.print("Enter Birthday(MM/DD/YYYY): ");
                        String birthday = scanner.nextLine();
                        System.out.print("Enter Relationship: ");
                        String relation = scanner.nextLine();
                        System.out.print("Enter Nickname: ");
                        String nickName = scanner.nextLine();
                        manager.updateContact(index, new PersonalContact(firstName, lastName, phoneNumber, email, birthday, relation, nickName));
                    } else if (type == 2) {
                        System.out.print("Enter Company Name: ");
                        String company = scanner.nextLine();
                        System.out.print("Enter Job Title: ");
                        String jobTitle = scanner.nextLine();
                        manager.updateContact(index, new BusinessContact(firstName, lastName, phoneNumber, email, company, jobTitle));
                    } else {
                        System.out.println("Invalid type.");
                    }
                }
                case 4 -> {
                    manager.listContacts();
                    System.out.print("Enter the index of the contact to delete: ");
                    int index = scanner.nextInt() - 1;
                    manager.deleteContact(index);
                }
                case 5 -> {
                    System.out.print("Enter name to search (First or Last Name): ");
                    String name = scanner.nextLine();
                    manager.searchContacts(name);
                }
                case 6 -> {
                    System.out.print("Enter CSV file name to import: ");
                    String fileName = scanner.nextLine();
                    manager.importContactsFromCSV(fileName);
                }
                case 7 -> {
                    System.out.print("Enter CSV file name to export: ");
                    String fileName = scanner.nextLine();
                    manager.exportContactsToCSV(fileName);
                }
                case 8 -> running = false;
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

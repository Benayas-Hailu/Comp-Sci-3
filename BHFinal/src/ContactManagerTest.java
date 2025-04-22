/**
 * @author Benayas Hailu
 * @version 1.0
 * COSC 260
 */

import edu.augie.finalProgram.BHailu.ContactManager;
import edu.augie.finalProgram.BHailu.BusinessContact;
import edu.augie.finalProgram.BHailu.PersonalContact;

public class ContactManagerTest {
    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        System.out.println("Testing ContactManager Class...");
        
        // Test 1: Add Contacts
        PersonalContact p1 = new PersonalContact("John", "Doe", "(987) 654-3210", "john.doe@example.com", "12/25/1990", "Friend", "J");
        BusinessContact b1 = new BusinessContact("Alice", "Smith", "(123) 456-7890", "alice@company.com", "TechCorp", "Manager");
        manager.addContact(p1);
        manager.addContact(b1);
        
        // Test 2: List Contacts
        System.out.println("\nList Contacts:");
        manager.listContacts();
        
        // Test 3: Search Contact
        System.out.println("\nSearch Contacts for 'John':");
        manager.searchContacts("John");
        
        // Test 4: Update Contact
        PersonalContact updatedP1 = new PersonalContact("Johnny", "Doe", "(987) 654-3210", "johnny.doe@example.com", "01/01/2000", "Best Friend", "JJ");
        manager.updateContact(0, updatedP1);
        System.out.println("\nAfter Updating Contact:");
        manager.listContacts();
        
        // Test 5: Delete Contact
        manager.deleteContact(1);
        System.out.println("\nAfter Deleting Contact:");
        manager.listContacts();
    }
}

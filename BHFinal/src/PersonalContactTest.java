/**
 * @author Benayas Hailu
 * @version December 7, 2024
 * COSC 260
 */

import edu.augie.finalProgram.BHailu.PersonalContact;

public class PersonalContactTest {
    public static void main(String[] args) {
        System.out.println("Testing PersonalContact Class...");
        
        // Test 1: Valid PersonalContact
        PersonalContact contact1 = new PersonalContact("John", "Doe", "(987) 654-3210", "john.doe@example.com", "12/25/1990", "Friend", "J");
        System.out.println("Expected: Personal Contact: John Doe, Phone: (987) 654-3210, Email: john.doe@example.com, Birthday: 12/25/1990, Relationship: Friend, Nick Name: J");
        System.out.println("Result: " + contact1);
        
        // Test 2: Invalid Birthday Format
        try {
            new PersonalContact("Jane", "Doe", "(555) 555-5555", "jane.doe@example.com", "1990-12-25", "Sister", "JJ");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        // Test 3: Update Birthday and Relationship
        contact1.setBirthday("01/01/2000");
        contact1.setRelation("Best Friend");
        System.out.println("Updated Birthday: 01/01/2000, Updated Relationship: Best Friend");
        System.out.println("Result: " + contact1);
    }
}

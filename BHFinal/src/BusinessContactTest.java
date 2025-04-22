/**
 * @author Benayas Hailu
 * @version 1.0
 * COSC 260
 */

import edu.augie.finalProgram.BHailu.BusinessContact;

public class BusinessContactTest {
    public static void main(String[] args) {
        System.out.println("Testing BusinessContact Class...");
        
        // Test 1: Valid BusinessContact
        BusinessContact contact1 = new BusinessContact("Alice", "Smith", "(123) 456-7890", "alice@company.com", "TechCorp", "Manager");
        System.out.println("Expected: Business Contact: Alice Smith, Phone: (123) 456-7890, Email: alice@company.com, Company: TechCorp, Job Title: Manager");
        System.out.println("Result:   " + contact1);
        
        // Test 2: Update fields
        contact1.setCompanyName("NewTechCorp");
        contact1.setJobTitle("Senior Manager");
        System.out.println("Updated Company: NewTechCorp, Updated Job Title: Senior Manager");
        System.out.println("Result:   " + contact1);
    }
}

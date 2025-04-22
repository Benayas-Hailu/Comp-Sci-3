/**
 * @author Benayas Hailu
 * @version December 7, 2024
 * COSC 260
 */

package edu.augie.finalProgram.BHailu;

public abstract class Contact {
    
    // attributes
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    // Regular expression to validate email format
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    // Regular expression to validate phone number format
    private static final String PHONE_REGEX = "\\(\\d{3}\\) \\d{3}-\\d{4}";

    // Constructor
    public Contact(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        if (phoneNumber.matches(PHONE_REGEX)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number format. Expected format: (123) 456-7890");
        }

        if (email.matches(EMAIL_REGEX)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format!");
        }
    }

    // Default Constructor
    public Contact() {
        this("N/A", "N/A", "(000) 000-0000", "N/A@gmail.com"); 
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // setter to validate phone number
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches(PHONE_REGEX)) {
            this.phoneNumber = phoneNumber;
        } else {
            throw new IllegalArgumentException("Invalid phone number format. Expected format: (123) 456-7890");
        }  
    }

    public String getEmail() {
        return email;
    }

    // setter to validate email
    public void setEmail(String email) {
        if (email.matches(EMAIL_REGEX)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format!");
        }
    }

    // Abstract toString Method
    public abstract String toString();
}

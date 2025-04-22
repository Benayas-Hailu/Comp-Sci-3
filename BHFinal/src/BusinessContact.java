/**
 * @author Benayas Hailu
 * @version December 7, 2024
 * COSC 260
 */

package edu.augie.finalProgram.BHailu;

public class BusinessContact extends Contact {
    
    // attribute
    private String companyName;
    private String jobTitle;

    // Constructor
    public BusinessContact(String firstName, String lastName, String phoneNumber, String email, String companyName, String jobTitle) {
        super(firstName, lastName, phoneNumber, email);
        this.companyName = companyName;
        this.jobTitle = jobTitle;
    }

    // Getters and Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Business Contact: " + getFirstName() + " " + getLastName() +
               ", Phone: " + getPhoneNumber() + 
               ", Email: " + getEmail() +
               ", Company: " + companyName +
               ", Job Title: " + jobTitle;
    }
}

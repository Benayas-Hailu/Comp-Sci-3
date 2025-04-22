/**
 * @author Benayas Hailu
 * @version December 7, 2024
 * COSC 260
 */

package edu.augie.finalProgram.BHailu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class PersonalContact extends Contact {
    
    private String birthday;
    private String relation;
    private String nickName;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    // Constructor
    public PersonalContact(String firstName, String lastName, String phoneNumber, String email, String birthday, String relation, String nickName) {
        super(firstName, lastName, phoneNumber, email);
        this.relation = relation;
        this.nickName = nickName;
        try {
            // Parse the birthday string to validate it
            LocalDate.parse(birthday, formatter);
            this.birthday = birthday;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid birthday format. Expected format: MM/dd/yyyy");
        }
    }

    // Getters and Setters
    public String getBirthday() {
        return birthday;
    }

    // setter to validate birthday format
    public void setBirthday(String birthday) {
        try {
            // Parse the birthday string to validate it
            LocalDate.parse(birthday, formatter);
            this.birthday = birthday;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid birthday format. Expected format: MM/dd/yyyy");
        }
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Personal Contact: " + getFirstName() + " " + getLastName() +
               ", Phone: " + getPhoneNumber() + 
               ", Email: " + getEmail() +
               ", Birthday: " + birthday +
               ", Relationship: " + relation +
               ", Nickname: " + nickName;
    }
}

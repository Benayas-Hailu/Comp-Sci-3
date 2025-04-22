/**
 * @author Benayas Hailu
 * @version December 7, 2024
 * COSC 260
 */

package edu.augie.finalProgram.BHailu;

import java.io.*;
import java.util.*;

public class ContactManager {
    private ContactLinkedList<Contact> contacts;

    public ContactManager() {
        contacts = new ContactLinkedList<>();
    }

    // Create: Add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully.");
    }

    // Read: List all contacts
    public void listContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i).toString());
        }
    }

    // Update: Edit a contact
    public void updateContact(int index, Contact updatedContact) {
        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index. No contact updated.");
            return;
        }
        contacts.set(index, updatedContact);
        System.out.println("Contact updated successfully.");
    }

    // Delete: Remove a contact
    public void deleteContact(int index) {
        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index. No contact deleted.");
            return;
        }
        contacts.remove(index);
        System.out.println("Contact deleted successfully.");
    }

    // Search: Find contacts by name (first or last name)
    public void searchContacts(String name) {
        boolean found = false;
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().toLowerCase().contains(name.toLowerCase()) || 
                contact.getLastName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(contact.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found with the name:" + name);
        }
    }

    // Import contacts from a CSV file
    public void importContactsFromCSV(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    addContact(new PersonalContact(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]));
                } else if (parts.length == 6) {
                    addContact(new BusinessContact(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]));
                } else {
                    System.out.println("Invalid line format in CSV file:" + line);
                }
            }
            System.out.println("Contacts imported successfully.");
        } catch (IOException e) {
            System.err.println("Error reading CSV file:" + e.getMessage());
        }
    }

    // Export contacts to a CSV file
    public void exportContactsToCSV(String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                if (contact instanceof PersonalContact) {
                    PersonalContact pc = (PersonalContact) contact;
                    bw.write(String.join(",", pc.getFirstName(), pc.getLastName(), pc.getPhoneNumber(),
                            pc.getEmail(), pc.getBirthday(), pc.getRelation(), pc.getNickName()));
                } else if (contact instanceof BusinessContact) {
                    BusinessContact bc = (BusinessContact) contact;
                    bw.write(String.join(",", bc.getFirstName(), bc.getLastName(), bc.getPhoneNumber(),
                            bc.getEmail(), bc.getCompanyName(), bc.getJobTitle()));
                }
                bw.newLine();
            }
            System.out.println("Contacts exported successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to CSV file:" + e.getMessage());
        }
    }
}

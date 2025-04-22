# Comp-Sci-3
 Customer Management System for Residential and Commercial Clients

**Overview**
The Contact Management System is designed to manage and store personal and business contacts. The program provides functionalities to add, update, remove, search, import, and export contacts, leveraging a linked list data structure. It uses Java classes to define the contact objects and allows interactions through a simple driver program.


Contact Class:
○	This is the abstract base class representing a contact with essential attributes such as firstName, lastName, phoneNumber, and email.
○	It defines getters and setters for these attributes and a toString() method, which must be implemented by subclasses.
BusinessContact Class:
○	A subclass of Contact, representing business-related contacts.
○	Adds additional attributes: companyName and jobTitle.
○	Implements the toString() method to provide a detailed string representation of the business contact.
PersonalContact Class:
○	A subclass of Contact, representing personal contacts.
○	Adds additional attributes: birthday, relation, and nickName.
○	Implements the toString() method to provide a detailed string representation of the personal contact.
ContactLinkedList<T> Class:
○	A generic linked list implementation that stores contacts.
○	Supports typical list operations such as add(), get(), set(), remove(), and more.
ContactManager Class:
○	Manages the contacts list and provides methods for CRUD (Create, Read, Update, Delete) operations.
○	Includes search functionality and the ability to import/export contacts to and from CSV files.

How to compile
- In the BHFinal directory run: javac -d src src/*.java

How to run
- In the BHFinal directory run: javac -cp src Main

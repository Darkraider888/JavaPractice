/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Book extends Library {                                                                    // Variables
    String title;
    String author;
                                                                    // Constructor
    public Book(String libraryName, String location, String title, String author) {
        super(libraryName, location);                              // calls Library constructor
        this.title = title;
        this.author = author;
    }
                                                                   // Method
    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    } }


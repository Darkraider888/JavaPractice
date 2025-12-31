/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class EBook extends Book {   
    double fileSize;
    String format;
                                                 // Constructor
    public EBook(String libraryName, String location,
                 String title, String author,
                 double fileSize, String format) {
                 super(libraryName, location, title, author);  // calls Book constructor
                 this.fileSize = fileSize;
                 this.format = format;
    }
                                                      // Method 
    public void displayEBookInfo() {
        System.out.println("File Size: " + fileSize + " mb");
        System.out.println("Format: " + format);
    }
}

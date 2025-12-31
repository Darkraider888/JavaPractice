/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Library {
    String libraryName;
    String location;
                                                                     // Constructor
public Library(String libraryName, String location) {
    this.libraryName = libraryName;
    this.location = location;                       }
                                                             // Method 
public void displayLibraryInfo() {
    System.out.println("Library Name: " + libraryName);
    System.out.println("Location: " + location);
    } }

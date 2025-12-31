/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Main {
    public static void main(String[] args) {
        EBook ebook = new EBook(
            "City Library",
            "Downtown",
            "Java Programming",
            "James Gosling",
            2.5,
            "PDF"
        );

        System.out.println("=== E-Book Details ===");
        ebook.displayLibraryInfo();
        ebook.displayBookInfo();
        ebook.displayEBookInfo();
        System.out.println("======================");
        System.out.println("Mehedi Hasan, ID:2023000000033");
    }
}


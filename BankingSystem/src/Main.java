/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        // Create SavingsAccount object with given values
        SavingsAccount myAccount = new SavingsAccount(
            "ABC Bank",       // bankName
            12345,           // accountNumber
            50000.0,         // balance
            5.5              // interestRate
        );
        
        System.out.println("=== Banking System Information ===");
    
        
        // Call all display methods
        myAccount.displayBankInfo();      // From Bank class
        
        myAccount.displayAccountInfo();   // From Account class
       
        myAccount.displaySavingsInfo();   // From SavingsAccount class
        
        System.out.println("===================================");
    }
}
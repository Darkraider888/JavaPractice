/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Bank {                   //for bank
     String bankName;
    
                                       // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }
    
                                       // Method 
    public void displayBankInfo() {
        System.out.println("Bank Name: " + bankName);
    }
}

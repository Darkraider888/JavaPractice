/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Account extends Bank {           //account
    int accountNumber;
    double balance;
    
                                              // constructor
    public Account(String bankName, int accountNumber, double balance) {
        super(bankName);                      // call bank class constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
                                               // method to display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
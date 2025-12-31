/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class SavingsAccount extends Account {    //saving account
    double interestRate;
    
                                                 // constructor
    public SavingsAccount(String bankName, int accountNumber, double balance, double interestRate) {
        super(bankName, accountNumber, balance); // call parent account
        this.interestRate = interestRate;
    }
    
                                                 // method to display savings account info
    public void displaySavingsInfo() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Nillasanti Puspita N
 */
public class BankAccount {
       double balance, interestRate, serviceCharges;
    int numberOfDeposit = 0, numberOfWithdrawal = 0;

//  Constructor
    public BankAccount(double balance, double interestRate){
        this.balance = balance;
        this.interestRate = interestRate;
    }

//    Methods
    public void deposit(double amount){
        this.balance += amount;
        this.numberOfDeposit++;
    }
    public void withdraw(double amount){
        this.balance -= amount;
        this.numberOfWithdrawal++;
    }
    public void calcInterest(){
        double monthlyInterest = this.balance * (this.interestRate / 12);
        this.balance += monthlyInterest;
        System.out.println("----------------------------------------------------");
        System.out.println("Monthly Interest : $" + monthlyInterest);
    }
    public void monthlyProcess(){
        this.balance -= this.serviceCharges;
        this.calcInterest();
        this.numberOfDeposit = 0;
        this.numberOfWithdrawal = 0;
        this.serviceCharges = 0;
    }
}

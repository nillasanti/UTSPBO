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
public class SavingAccount extends BankAccount {
       public boolean status;

    public SavingAccount(double balance, double interestRate){
        super(balance, interestRate);
        this.setStatus();
    }
//    Methods
    public void setStatus(){
        if (this.balance >= 25){
            this.status = true;
        }else{
            this.status = false;
        }
    }
    public void withdraw(double amount){
        if (this.status){
            super.withdraw(amount);
        }else{
            System.out.println("Withdrawal is not allowed.");
        }
        this.setStatus();
    }
    public void deposit(double amount){
        super.deposit(amount);
        this.setStatus();
    }
    public void monthlyProcess(){
        if (super.numberOfWithdrawal > 4){
            super.serviceCharges = super.numberOfWithdrawal - 4;
        }else{
            super.serviceCharges = 0;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Monthly Service Charges : $" + super.serviceCharges);
        super.monthlyProcess();
        this.setStatus();
    }
}

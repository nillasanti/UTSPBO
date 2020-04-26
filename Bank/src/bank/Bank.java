/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.util.Scanner;
/**
 *
 * @author Nillasanti Puspita N
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
	    SavingAccount acc = new SavingAccount(0,0.12);

        boolean again = true;

        menu : while(true) {
            System.out.println("Menu : \n1. Deposit\n2. Withdraw\n3. Monthly Process\n4. Close");
            System.out.print("Enter your choice: ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("Deposit amount : ");
                    double depAmount = sc.nextDouble();
                    acc.deposit(depAmount);
                    print(acc);
                    break;
                case 2:
                    System.out.print("Withdraw amount : ");
                    double witAmount = sc.nextDouble();
                    acc.withdraw(witAmount);
                    print(acc);
                    break;
                case 3:
                    acc.monthlyProcess();
                    print(acc);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break menu;
            }
        }
    }

    public static void print(SavingAccount acc){
        System.out.println("====================================================");
        System.out.println("Balance : $" + acc.balance);
        System.out.println("Number of Deposit : " + acc.numberOfDeposit);
        System.out.println("Number of Withdrawal : " + acc.numberOfWithdrawal);
        System.out.println("====================================================");
    }
    }
 


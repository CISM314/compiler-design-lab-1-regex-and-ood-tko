
package bankaccount;

import java.util.Scanner;


public class BankAccount {
    public String accountName;
   public  Double balance;
   public double amount;
   public Scanner input = new Scanner (System.in);
   
   public BankAccount(){
    accountName  = "Hope Mogale";
    balance = 0.0;
   
    }
    
    public void deposit(double amount){
        System.out.println("How much are you depositing?");
        amount = input.nextDouble();
        balance = amount + balance;
   System.out.println("Your new balance is" +" " + "R"+balance);
   
    }
    
    public void withdraw(){
     System.out.println("How much are you withdrawing?");
     amount = input.nextDouble();
     balance = balance - amount;
    System.out.println("Your new balance is" +" " + "R"+balance);
    }


    
    public static void main(String[] args) {
       // savingsAccount ob1 = new savingsAccount();
        //ob1.deposit();
        //investmentAccount ob2 = new investmentAccount ();
        //ob2.withdraw();
        CheckingAccount ob3 = new CheckingAccount ();
        ob3.deposit();
        
        
        
        
    }
    
}

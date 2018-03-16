
package bankaccount;


public class CheckingAccount  extends BankAccount{
    
    public void deposit(){
        
        balance = 8000.00;
        System.out.println("How much are you depositing?");
        amount = input.nextDouble();
        balance = amount + balance;
   System.out.println("Your new balance is" +" " + "R"+balance);
    }
    
    public void withdraw(){
        balance = 8000.00;
     System.out.println("How much are you withdrawing?");
     amount = input.nextDouble();
     balance = balance - amount;
    System.out.println("Your new balance is" +" " + "R"+balance);
    }
    
}

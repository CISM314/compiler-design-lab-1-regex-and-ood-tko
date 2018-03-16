package bankaccount;

public class investmentAccount  extends BankAccount{
    
    public void deposit(){
        
        balance = 20000.00;
        System.out.println("How much are you depositing?");
        amount = input.nextDouble();
         balance = balance + amount;
   System.out.println("Your new balance is" +" " + "R"+balance);
    }
    
    public void withdraw(){
        
         balance = 20000.00;
     System.out.println("How much are you withdrawing?");
     amount = input.nextDouble();
     balance = balance - amount;
    System.out.println("Your new balance is" +" " + "R"+balance);
    }
    
}
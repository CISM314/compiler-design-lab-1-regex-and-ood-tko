

package validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Validator {

    
    public static void main(String[] args) {
        
        
        System.out.println("Please enter a website with a (.co.za) domain");
        Scanner input = new Scanner (System.in);
        String email  = input.nextLine();
        System.out.println(valEmail(email));
        System.out.println("Please enter a South African mobile number");
        String number = input.nextLine(); 
        System.out.println(valNumber(number));
        

    }
    
    public static boolean valEmail(String input)
    {
        String emailRegex= "^[a-zA-Z0-9_.+-]+\\.[a-z]+\\.[a-z]+$";
        Pattern emailPat=Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher=emailPat.matcher(input);
        return matcher.find();
    }

     
    
    public static boolean valNumber(String input){
        String numberRegex ="^[\\+](27|0)[0-9]{9}$";
                
        Pattern numberPat=Pattern.compile(numberRegex, Pattern.CASE_INSENSITIVE);
        Matcher matcher=numberPat.matcher(input);
       return matcher.find();
        
    }
}

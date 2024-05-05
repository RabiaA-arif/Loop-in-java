import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheker {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        while (true) {
            
            
            System.out.println("enter the password");
            String paswd=input.next();
            String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

            // System.out.println(paswd);
            // int legth=paswd.length();
            // System.out.println("the lenght of password is..");
            // System.out.println(legth);
            Pattern p = Pattern.compile(pattern);
            // Match the passwords against the pattern and print the results
            String passwrdtype=(p.matcher(paswd).matches() ? "Strong" : "Weak");
            System.out.println(passwrdtype);

            if(passwrdtype=="Strong"){
                break;
            }
            System.out.println(" please enter the strong password");
        }
        System.out.println("Great now your pasword is strong");




    }
    
}

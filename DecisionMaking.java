import java.util.Scanner;

public class DecisionMaking {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("give the colur input");
        String color=input.nextLine();
        if (color.equals("red")){
            System.out.println("Ruk ja");
        }
        else if (color.equals("yellow")){
            System.out.println("tayri kar la");
        }
        else if(color.equals("green")){
            System.out.println("chal cut la");

        }
        // movie recomdation system
        
        System.out.println("give the age of user");
        int age=input.nextInt();
        if(age<=15){
            System.out.println("you can see comedy movie");
        }
        else if (age>15 && age<25){
            System.out.println("you can watch acton movie");
        }
        else if(age>25){
            System.out.println("you can watch any type of movie comedy action fiction ");
        }


    }
        
}


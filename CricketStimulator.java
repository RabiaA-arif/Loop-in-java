import java.util.Scanner;
public class CricketStimulator {
    public static void main(String[]args){
        Scanner rn=new Scanner(System.in);
        System.out.println("is batsman strat the inning batsman ");
        String chek=rn.next();
        int runs=0;
        int balls=0;
        while(chek.equals("yes")){
            System.out.println("give the runs of batsman");
            int batsmanruns=rn.nextInt();
            runs+=batsmanruns;
            System.out.println(runs + ":::now this is current score of batsman");
            balls++;
            System.out.println("out==yes,not out ==no");
            chek=rn.next();
            
            if(chek.equals("yes")){
                System.out.println("ways getting out  of batsman duck out, or lbw");
                String outtype=rn.next();
                if (outtype.equals("duckout")){
                    System.out.println("Golden duck! Looks like biryani for lunch");
                }
                else if (outtype.equals("lbw")){
                    System.out.println("That umpire needs some Lassi to cool down");
                }
                break;
            }
        }
        System.out.println("ohhh batsman is out good luck for next time");
        System.out.println("outside the loop:");
    }

}


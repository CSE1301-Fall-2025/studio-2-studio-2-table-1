import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print ("What is your starting amount?");
        double startAmount = in.nextDouble(); 
        System.out.print ("How much money do you want to make today?");
        double winLimit = in.nextDouble();
        System.out.print ("How often do you want to win money?");
        double winChance = in.nextDouble();
        System.out.print ("How many days do you want to play for?");
        int totalSimulations = in.nextInt();
        for (int initialDay = 1;initialDay > totalSimulations;initialDay++){
            while (startAmount<winLimit && startAmount>0) {
                if (Math.random()<winChance){
                    startAmount ++;
                    
                }else{
                    startAmount--;
                    
                }
            }
            if (startAmount>0){
                System.out.print ("Success "+ startAmount);
            }else{
                System.out.print ("Ruin "+ startAmount);
            }
        }
    }
}


import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("How much do you weigh?");

       try{
            double weight = sc.nextDouble();
            double moonWeight = weight * .17;
            DecimalFormat df = new DecimalFormat("#.00");
            String Str = df.format(moonWeight);
            System.out.println("You [" + weight + " pounds] would weigh [" + Str + " pounds] on the moon!");
       } catch(InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
       }
    }
    
}

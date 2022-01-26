import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("How many gallons?");

       try{
            double gallons = sc.nextDouble();
            double liters = gallons * 3.78541;
            DecimalFormat df = new DecimalFormat("#.00");
            String litersStr = df.format(liters);
            System.out.println(gallons + " gallons is the same as " + liters + " liters." );
       } catch(InputMismatchException e) {
            System.out.println("Invalid input. Please try again.");
       }
    }
    
}

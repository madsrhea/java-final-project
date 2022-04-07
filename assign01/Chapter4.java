import java.util.Scanner;

public class Chapter4 implements TaskHandler {
    @Override

    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 4 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", "Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    exercise1(in);
                    break;
                case 2:
                    exercise2(in);
                    break;
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    exercise4(in);
                    break;
                case 5:
                    exercise5(in);
                    break;
                case 6:
                    exercise6(in);
                    break;
                case 7:
                    exercise7(in);
                    break;
                case 8:
                    exercise8(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 4 Menu.");
    }

////// FRACTION CLASS -- PART 1 ////////////////////
public class Fraction{
    public int numerator;
    public int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    public String toString()
    {
        String str = (numerator + "/" + denominator);
        return str;
    }

    ////// FRACTION CLASS -- PART 2 ////////////////////
    public void Fraction(int num, int denom)
    {
        num = this.numerator;
        denom = this.denominator;
        
    }

    ////// FRACTION CLASS -- PART 3 ////////////////////
    ////// FRACTION CLASS -- PART 4 ////////////////////
    ////// FRACTION CLASS -- PART 5 ////////////////////
    ////// FRACTION CLASS -- PART 6 ////////////////////

    ////// FRACTION CLASS -- PART 7 ////////////////////
    ////// FRACTION CLASS -- PART 8 ////////////////////

}
    // Exercise 1
    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        Fraction fraction = new Fraction();
        System.out.println(fraction);  
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        double numberPi = 3.14;
        double userRadius = InputUtility.getDouble("Give me the radius of your circle", in);
        double circum = 2 * numberPi * userRadius;
        double area = numberPi * Math.pow(userRadius, 2);
        System.out.println();
        System.out.printf("Your circumfrerence woud be %.2f", circum);
        System.out.printf(" and your area would be %.2f!", area);
        System.out.println();
    }

    public void exercise4(Scanner in) {
      
        
    }

    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        System.out.println("Hey, I can tell you which of two numbers is bigger! Watch!");
        
    }
    public void exercise6(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        System.out.println("Hey, I can tell you which of two numbers is bigger! Watch!");
        
    }
    public void exercise7(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        System.out.println("Hey, I can tell you which of two numbers is bigger! Watch!");
        
    }
    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        System.out.println("Hey, I can tell you which of two numbers is bigger! Watch!");
        
    }
}
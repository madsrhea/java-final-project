import java.util.Scanner;
public class Chapter1 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 1 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Sample Exercise"
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
                    sampleExercise(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Get Largest Number");
        System.out.println("Hey, I can tell you which of two numbers is bigger! Watch!");
        double numberOne = InputUtility.getDouble("Give me a number", in);
        double numberTwo = InputUtility.getDouble("Okay, okay, give me another", in);
        System.out.println();
        if (numberOne > numberTwo) 
        {
            System.out.printf("OBVIOUSLY %.1f is bigger! Easy!", numberOne);
            System.out.println();
        }
        else if (numberOne == numberTwo) {
            System.out.printf("Ok, so, %.1f and ...", numberOne);
            System.out.println();
            System.out.println("Wait, these are the same number!");
            System.out.println("You won't trick me that easy!");
            System.out.println();
        }
        else {
            System.out.printf("Psh. Obviously %.1f ...", numberTwo);
            System.out.println();
        }
        
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Get Average");
        double numberOne = InputUtility.getDouble("Enter a number", in);
        double numberTwo = InputUtility.getDouble("Ok. Give me another", in);
        double mathAvg = (numberOne + numberTwo) / 2;
        System.out.println();
        System.out.printf("The average is %.1f!", mathAvg);
        System.out.println();
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

    public void sampleExercise(Scanner in) {
        UIUtility.showMenuTitle("Sample Exercise");
        String name = InputUtility.getString("What is your name?", in);
        System.out.printf("%nHello %s! ", name);

        int favNum = InputUtility.getInt("What is your favorite number?", in);
        System.out.printf("%nYour favorite number is %d. ", favNum);

        int age = InputUtility.getIntInRange("How old are you (in years)?", 0, 100, in);
        System.out.printf("%nYou are %d years old. ", age);

        double temperature = InputUtility.getDouble("What is body temperature (in fahrenheit)?", in);
        System.out.printf("%nYou have a body temperature of %.1f\u00B0 fahrenheit. ", temperature);

        String likesPizza = InputUtility.validateUserString("Do you like pizza?", 
        new String[] {"Yes", "No"}, in);
        if(likesPizza.toLowerCase().equals("yes")) {
            System.out.printf("%nI like pizza too!%n");
        }
    }
}
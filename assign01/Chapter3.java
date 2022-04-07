import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Chapter3 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 3 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2", "Exercise 3"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 3 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Evens-Stevens");
        int num1 = InputUtility.getInt("Give me a number", in);
        int num2 = InputUtility.getInt("Give me a second number", in);

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);

                    if (i % num1 == 0 && i != num1) {
                        break;
                    }

                }

            }
        } else if (num1 > num2) {
            for (int i = num1; i >= num2; i--) {
                if (i % 2 == 0) {
                    System.out.println(i);

                    if (i % num2 == 0 && i != num2) {
                        break;
                    }

                }

            }

        }

    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Sum - Count - Average");
        int sumNum = 0;
        int count = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

        String input = InputUtility.getString("Please enter a number", in);
        in.nextLine();

        while (!input.equals("S".toLowerCase()))
        {
            try
            {   
                Integer.parseInt(input);
            }
            catch(NumberFormatException ex)
            {
                
            }

    }

        



        
    }

    // in-class work
    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Random Dozen");
        Random random = new Random();
        int num1 = random.nextInt(12);
        int num2 = random.nextInt(12);
        System.out.println("What is " + num1 + " x " + num2 + "?");
        boolean correct = false;

        for(int i = 3; i > 0;)
        {
            int input = in.nextInt();
            in.nextLine();
            if(input == (num1 * num2))
            {
                correct = true;
                break;
            } else
            {
                i--;
                if(i == 0)
                {
                    break;
                }
                String attempts = i == 1 ? "attempt" : "attempts";
                System.out.printf("Incorrect, you have %d %s remaining%n", i, attempts);
            }

        }
        if(correct)
        {
            System.out.println("Correct!");
        }
        else
        {
            System.out.printf("Incorrect. The answer was %d", (num1 * num2));
        }
    }

}

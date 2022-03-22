import java.util.Scanner;
import java.util.Random;

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
        String userNum = InputUtility.getString("Please input a number [Enter \"S\" to stop]", in);
        int sumNum = 0;
        int number = Integer.parseInt(userNum);
        int count = 0;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;

    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Random Dozen");
        Random random = new Random();
        int num1 = random.nextInt(12);
        int num2 = random.nextInt(12);
        int attemptLeft = 3;
        int mathQuest = InputUtility.getInt("What is " + num1 + " x " + num2 + "?", in);

        if (mathQuest == (num1 * num2)) {
            System.out.println("Correct!");
        } 
        if (mathQuest != (num1 * num2)) {
            attemptLeft -= 1;
            System.out.println("Incorrect. You have " + attemptLeft + " attempt(s) remaining.\n");
            mathQuest = InputUtility.getInt("What is " + num1 + " x " + num2 + "?", in);
        }

    }

}

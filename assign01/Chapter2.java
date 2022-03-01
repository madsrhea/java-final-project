import java.util.Scanner;

public class Chapter2 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 2 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", "Extra Credit"
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
                    extraCredit(in);
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 1 Menu.");
    }

    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Even or Odd?");
        System.out.println("I can determine if the number you give me is even or odd.");
        int isItEven = InputUtility.getInt("Give me a number", in);
        System.out.println();
        
        if (isItEven % 2 == 0)
        {
            System.out.printf("The number " + isItEven + " is even.");
        }
        else
        {
            System.out.printf("The number " + isItEven + " is odd.");
        }
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Numbers.Numbers");
        double decNumber = InputUtility.getDouble("Please input a decimal number", in);
        int intNumber = (int)decNumber;
        double afterDecNumber = (decNumber - (int)decNumber) * 100;
        System.out.println("The numbers before the decimal are: " + intNumber);
        System.out.println("The two numbers after the decimal are: " + (int)afterDecNumber);
    }

    // you're here, mads

    public void exercise3(Scanner in) {
        System.out.println("This segment has been left intentionally blank.");
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Seconds To Days");
        int seconds = InputUtility.getInt("Enter the number of seconds you wish to process", in);
        System.out.println("This segment has been left intentionally blank.");
        }

        
    public void extraCredit(Scanner in) {
        System.out.println("This segment has been left intentionally blank.");
}

}

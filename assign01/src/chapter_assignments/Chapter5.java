package src.chapter_assignments;
import java.util.Scanner;

import utilities.TaskHandler;
import utilities.UIUtility;
import utilities.InputUtility;

public class Chapter5 implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                    "Exercise 1", "Exercise 2"
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
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 5 Menu.");
    }


    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Even & Odd");
        String num = InputUtility.getString("Let me sort your numbers.\nPlease enter a number [Enter 'S' to exit]", in);
        int[] evenNum = new int[100];
            evenNum[0] = -100;
        int[] oddNum = new int[100];
            oddNum[0] = -100;
        int evenCount = 0;
        int oddCount = 0;
        String regex = "[0-9]+";

    while(num.matches(regex))
    {
        int intNum = Integer.parseInt(num);
        if(num == "S" || num == "s")
        {
            break;
        }
        else if (intNum % 2 == 0) 
        {
            evenNum[evenCount] = intNum;
            evenCount++;
            num = InputUtility.getString("Please enter another number [Enter 'S' to exit]", in);
        } 
        else if (intNum % 2 != 0) 
        {
            oddNum[oddCount] = intNum;
            oddCount++;
            num = InputUtility.getString("Please enter another number [Enter 'S' to exit]", in);
        }
        else
        {
            System.out.println("Invalid input. Please try again.");
            num = InputUtility.getString("Please enter a number [Enter 'S' to exit]", in);
        }

    }
        System.out.print("Even: \n[");
        if(evenNum[0] != -100)
        {
            for(int i = 0; i <= evenNum.length - 1; i++)
            {
                if(evenNum[i] != 0)
                {
                    System.out.print(evenNum[i] + ", ");
                }
            }
        }
        else
        {
            System.out.print("None");
        }

        System.out.print("]\n\nOdd: \n[");
        if(oddNum[0] != -100)
        {
            for(int i = 0; i < oddNum.length - 1; i++)
            {   
                if(oddNum[i] != 0)
                {   
                    System.out.print(oddNum[i] + ",");
                }
        
            }
        }
        else
        {
            System.out.print("None");
        }

        System.out.print("]\n");
    }

////////////////////////////////////////////////////////
////////////////// EXERCISE 2 METHODS //////////////////
////////////////////////////////////////////////////////

static String reverse(String str) 
{
    char c;
    String reverse = str;

    for (int i = 0; i < str.length() - 1; i++) {

        c = str.charAt(str.length() - 1 - i); 
        reverse += c;

    }

    return reverse.trim();

} 

static String isPalindrome(String str) {

    String result; 

    if (str == reverse(str)) {
         result = "This is a Palindrome";
    } else {
         result = "This isn't a Palindrome.";
    }

    return result;

}

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");

        String str1 = InputUtility.getString("Enter a word.", in);

        System.out.println("**Statistics**");
        // string length
        System.out.println("Length: " + str1.length());

        // first 3 characters
        System.out.println("First 3 characters: " + str1.substring(0,3));

        // last character
        System.out.println("Last character: " + str1.charAt(str1.length() - 1));

        // contains the letter i
        char c;
        boolean containsI = false;
        for(int i = 0; i < str1.length() - 1; i++)
        {
            c = str1.charAt(i);
            if(c == 'I' || c == 'i')
            {
                containsI = true;
            }

        }

        System.out.println("Contains the letter 'I'? " + containsI);

        // lowercase
        System.out.println("Lowercase: " + str1.toLowerCase());

        // is it a palindrome
        System.out.println("Is a palindrome? " + isPalindrome(str1));

        /////////////// STRING 2 ///////////////
        
        String str2 = InputUtility.getString("Enter another word.", in);
        
        System.out.println("**Statistics**");
        // string length
        System.out.println("Length: " + str2.length());

        // first 3 characters
        System.out.println("First 3 characters: " + str2.substring(0,3));

        // last character
        System.out.println("Last character: " + str2.charAt(str2.length() - 1));

        // contains the letter i
        containsI = false;
        for(int i = 0; i < str2.length() - 1; i++)
        {
            c = str2.charAt(i);
            if(c == 'I' || c == 'i')
            {
                containsI = true;
            }

        }

        System.out.println("Contains the letter 'I'? " + containsI);

        // lowercase
        System.out.println("Lowercase: " + str2.toLowerCase());

        // is it a palindrome
        System.out.println("Is a palindrome? " + isPalindrome(str2));

        if (str1.charAt(0) > str2.charAt(0))
        {
            System.out.println("\"" + str2 + "\" comes alphabetically before \"" + str1 + "\"");
        }
        else
        {
            System.out.println("\"" + str1 + "\" comes alphabetically before \"" + str2 + "\"");
        }

    }

}
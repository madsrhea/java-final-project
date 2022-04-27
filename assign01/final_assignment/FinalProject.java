package final_assignment;

import java.util.Scanner;

import utilities.UIUtility;

public class FinalProject 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) 
        {
            String menuTitle = "WELCOME.";
            String prompt = "PLEASE MAKE A SELECTION BELOW.";
            String[] menuOptions = 
            {
                    "NEW GAME"
                ,   "ACHIEVEMENTS"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
        }
            
        UIUtility.pressEnterToContinue(scanner);
    }

    Scanner.close();
}   



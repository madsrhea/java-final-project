package final_assignment;

import java.util.Scanner;

import utilities.UIUtility;

public class FinalApp {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            String menuTitle = "WELCOME.";
            String prompt = "\n\nplease choose an option";
            String[] menuOptions = {
                    "STORY MODE", "MODIFY ZONE"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    Computer.convo2(scanner);
                    break;
                case 2:
                   
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
        System.out.println("\nGoodbye for now!\n");
        scanner.close();
    }

}
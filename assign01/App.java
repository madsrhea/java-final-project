import java.util.Scanner;
import utilities.UIUtility;
import src.chapter_assignments.Chapter1;
import src.chapter_assignments.Chapter2;
import src.chapter_assignments.Chapter3;
import src.chapter_assignments.Chapter4;
import src.chapter_assignments.Chapter5;
import src.chapter_assignments.Chapter5Challenge;
import src.chapter_assignments.PairProgramming;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;        
        while (true) {
            String menuTitle = "Main Menu";
            String prompt = "Select an chapter";
            String[] menuOptions = {
                "Chapter 1"
            ,   "Chapter 2"
            ,   "Chapter 3"
            ,   "Chapter 4"
            ,   "Chapter 5"
            ,   "Pair Programming"
            ,   "Chapter 5 Challenge"
            ,   "Final Project"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    new Chapter1().handleTask(scanner);
                    break;
                case 2:
                    new Chapter2().handleTask(scanner);
                    break;
                case 3:
                    new Chapter3().handleTask(scanner);
                    break;
                case 4:
                    new Chapter4().handleTask(scanner);
                    break;
                case 5:
                    new Chapter5().handleTask(scanner);
                    break;
                case 6:
                    new PairProgramming().handleTask(scanner);
                    break;
                case 7:
                    new Chapter5Challenge().handleTask(scanner);
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
       System.out.println("\nProgram complete. Goodbye.\n");
       scanner.close();
    }   
}


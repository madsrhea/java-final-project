package src.chapter_assignments;
import java.util.Arrays;
import java.util.Scanner;

import utilities.TaskHandler;
import utilities.UIUtility;
import utilities.InputUtility;
public class Chapter5Challenge implements TaskHandler {
    @Override
    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 5 Challenge Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Task 1", "Task 2", "Task 3", "Task 4", "Task 5"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, in);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    task1(in);
                    break;
                case 2:
                    task2(in);
                    break;
                case 3:
                    task3(in);
                    break;
                case 4:
                    task4(in);
                    break;
                case 5:
                    task5(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting 'Chapter 5 Challenge' Menu.");
    }
// Done 
    public void task1(Scanner in) {
        UIUtility.showMenuTitle("Task 1");
        int[] list = {0, 1, 2, 3, 4};

        int whatNum = InputUtility.getInt("Give me a number?", in);
        int whereNum = InputUtility.getIntInRange("Where do you want that number to go in the array?", 0, list.length - 1, in);

        for (int i = list.length - 2; i >= whereNum; i--)
        {
            list[i+1] = list[i];
        }
        
        list[whereNum] = whatNum;
        
        System.out.println(Arrays.toString(list));
    }
// Done
    public void task2(Scanner in) {
        UIUtility.showMenuTitle("Task 2");
        Integer[] list = {0, 1, 2, 3, 4};

        int whereNum = InputUtility.getIntInRange("What number do you want to delete?", 0, 4, in);
        list[whereNum] = null;
        
        System.out.println(Arrays.toString(list));

    }

// Done
    public void task3(Scanner in) {
        UIUtility.showMenuTitle("Task 3");
        int[] list = {0, 1, 2, 3, 4};

        System.out.println("I can determine if the number you give me is even or odd.");
        int whatNum = InputUtility.getIntInRange("Give me a spot in the array", 0, 4, in);
        int whereNum = InputUtility.getIntInRange("Where do you want that number to go?", 0, 4, in);
        int temp = list[whatNum];
        list[whatNum] = list[whereNum];
        list[whereNum] = temp;
        
        System.out.println(Arrays.toString(list));

    }

// Done
    public void task4(Scanner in) {
        UIUtility.showMenuTitle("Task 4");
        int[] list = {0, 1, 2, 3, 4};
        int temp = list[4];
        for (int i = 4; i > 0; i--)
        {
            list[i] = list[i - 1];
        }
        list[0] = temp;

        System.out.println(Arrays.toString(list));
      
    }
// Done
    public void task5(Scanner in) {
        UIUtility.showMenuTitle("Task 5");
        int[] list = {0, 1, 2, 3, 4};

        int temp1 = list[4];
        int temp2 = list[3];
        for(int i = 0; i < list.length - 2; i++)
        {
            list[list.length - 1 - i] = list[i];
        }
        list[1] = temp2;
        list[0] = temp1;

        System.out.println(Arrays.toString(list));
}

}

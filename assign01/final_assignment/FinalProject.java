package final_assignment;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

import org.w3c.dom.Text;

import final_assignment.Person;

import final_assignment.TestMode;
import utilities.UIUtility;
import utilities.InputUtility;
import final_assignment.TxtFxs;

public class FinalProject {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            String menuTitle = "WELCOME.";
            String prompt = "\n\nplease choose an option";
            String[] menuOptions = {
                    "STORY MODE 1", "STORY MODE 2"
            };
            choice = UIUtility.showMenuOptions(menuTitle, prompt, menuOptions, scanner);
            if (choice == 0)
                continue;
            if (choice == menuOptions.length + 1)
                break;
            switch (choice) {
                case 1:
                    convo1(scanner);
                    break;
                case 2:
                    convo2(scanner);
                    break;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
        System.out.println("\nTah-tah for now!\n");
        scanner.close();
    }

    private static void convo1(Scanner scn)
    {
        
        int textSpeed = 10;
        
        System.out.println(TxtFxs.cleanUp);
        TxtFxs.TextSpeed("\n\nALRIGHT& LETS SET THE SCENERY.", textSpeed);
        scn.nextLine();
        System.out.println(TxtFxs.cleanUp);
        System.out.println(TxtFxs.ComputerExpressions(11));
        TxtFxs.TextSpeed("YOU'RE SITTING IN FRONT OF A COMPUTER.", 11);
        scn.nextLine();
        TxtFxs.CompileNPC(10, "\nAND I&+ AM THAT COMPUTER", 12, scn);
        TxtFxs.CompileNPC(2, "YOU ALSO HAVE A FLASH DRIVE AND THERES SOME FILES YOU WANT FROM ME", textSpeed, scn);
        TxtFxs.CompileNPC(2, "BUT&+ YOUR FLASH DRIVE SUCKS&+\nAND ONLY HAS ENOUGH SPACE FOR 5 THINGS.", textSpeed,scn);
        TxtFxs.CompileNPC(3, "&++", textSpeed,scn);
        TxtFxs.CompileNPC(1, "I'LL ADMIT&+ NOT THE MOST ENGAGING STORY", textSpeed,scn);
        TxtFxs.CompileNPC(1, "WELL&+ BEFORE WE GO ANY FURTHER,+\nMAY YOU PLEASE TELL ME A LITTLE BIT ABOUT YOURSELF?", 9, scn);
        TxtFxs.CompileNPC(10, "", 12, scn);

        convo2(scn);
    }

    private static Person action1(Scanner scn)
    {
        
        String firstName = InputUtility.getString("First name: ", scn);
        String lastName = InputUtility.getString("Last name: ", scn);
        int age = InputUtility.getIntInRange("Age: ", 0, 100, scn);
        Person person = new Person(firstName, lastName, age);
    
        // person.setFirstName(firstName);
        // person.setLastName(lastName);
        // person.setAge(age);

        

        return person;
    }

    // TODO - CREATE NEW PERSON HERE
    // TODO - INTIATE COMPUTER MONITOR AS PERSON
    // 

    private static void convo2(Scanner scn)
    {
        int textSpeed = 10;
        Person[] personArray = Person.getArray();
        Person computer = new Person();
        computer.setFirstName("COMPUTER");
        computer.setLastName("MONITOR");
        computer.setAge(19);

        String userName = action1(scn).getFirstName().toUpperCase().trim();

        personArray = Person.addToArray(action1(scn));

        String printArray = Person.printArray(personArray).toString();

        TxtFxs.CompileNPC(10, "ALRIGHT, " + userName + ", TURNS OUT THAT,+\nY'KNOW HOW I SAID YOU ONLY HAVE ENOUGH ROOM FOR FIVE FILES?", textSpeed, scn);
        TxtFxs.CompileNPC(5, "WELL,++ GUESS WHO ONLY HAS FIVE FILES TO GIVE YOU?", textSpeed, scn);
        TxtFxs.CompileNPC(10, "THAT'S RIGHT, " + userName + "& IT'S ME.", textSpeed, scn);
        TxtFxs.CompileNPC(9, "HANG ON, I'M GONNA PRINT THE ARRAY ABOVE MYSELF&", textSpeed, scn);
        TxtFxs.CompileNPC(printArray,8, "AH&& VERY NICE&&", textSpeed, scn);
        TxtFxs.CompileNPC(printArray,10, "SO, THAT'S YOU IN THE LIST RIGHT NOW.", textSpeed, scn);
        TxtFxs.CompileNPC(printArray, 7, "LET ME SEE IF I CAN'T ADD MYSELF&", textSpeed, scn);
        personArray = Person.addToArray(computer);
        printArray = Person.printArray(personArray);
        TxtFxs.CompileNPC(printArray, 7, "PERFECT!+\nNOW, WE'RE UP THERE TOGETHER.", textSpeed, scn);
        TxtFxs.CompileNPC(printArray, 10, "YES& THAT'S RIGHT&", textSpeed, scn);
        TxtFxs.CompileNPC(printArray, 8, "I WAS BORN IN 2003." , textSpeed, scn);
        TxtFxs.CompileNPC(printArray, 7, "", textSpeed, scn);
        TxtFxs.CompileNPC(printArray, 6, "SINCE I LITERALLY AM ONE.+\nAND PEOPLE LOVE SEEING THEIR OWN NAMES&", textSpeed, scn);
        TxtFxs.CompileNPC(printArray, 10, "BUT, LET'S ADD A FEW MORE THINGS.", textSpeed, scn);

    }


    public static void testCenter(Scanner scn)
    {

    }

}



// public void viewAll()
// {
   
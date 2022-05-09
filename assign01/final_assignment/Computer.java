package final_assignment;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import utilities.InputUtility;
import utilities.UIUtility;


public class Computer {

    private static int fileCount = 0;

    public Computer()
    {
        
    }

    public boolean isFull()
    {
        return fileCount <= 4 ? false : true;
    }

    public void add(Scanner scn)
    {
        UIUtility.showMenuTitle("ADD A FILE");
        if(fileCount < 5)
        {
            String fileType = InputUtility.validateUserString("WHAT TYPE OF FILE WOULD YOU LIKE TO ADD?", new String[]{"Generic File","Word Document","Image File","Music File"}, scn);
            CompFile file = new CompFile("");

            while(true)
            {
                String fileName = InputUtility.getString("WHAT IS THE NAME OF THE FILE? [enter 'x' to cancel]", scn);
                try 
                {
                    if(fileName.equalsIgnoreCase("q"))
                    {
                        return;
                    }
                    file.setFileName(fileName);
                    break;
                } 
                catch (IllegalArgumentException e) 
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        else
        {
            System.out.println("YOUR FLASH DRIVE IS FULL. PLEASE DELETE SOMETHING FIRST BEFORE ADDING SOMETHING ELSE.");
        }
    }











/////////////////////////////////////////////////
/////////////// USER INTERFACE //////////////////
/////////////////////////////////////////////////

    public static void convo1(Scanner scn)
    {
        
        int textSpeed = 10;

        System.out.println(TxtFxs.cleanUp);
        TxtFxs.TextSpeed("\n\nALRIGHT& LETS SET THE SCENE&+", textSpeed);
        scn.nextLine();
        System.out.println(TxtFxs.cleanUp);
        System.out.println(TxtFxs.ComputerExpressions(11));
        TxtFxs.TextSpeed("YOU'RE SITTING IN FRONT OF A COMPUTER.", 11);
        scn.nextLine();
        TxtFxs.CompileNPC(10, "\n&+AND I ALSO HAPPEN TO BE+ THAT COMPUTER", 12, scn);
        TxtFxs.CompileNPC(2, "YOU ALSO HAVE A FLASH DRIVE AND THERE'S SOME FILES YOU WANT FROM ME", textSpeed, scn);
        TxtFxs.CompileNPC(5, "YOU'VE ALREADY GIVEN ME YOUR FLASH DRIVE TO PUT FILES IN.", textSpeed,scn);
        TxtFxs.CompileNPC(2, "THE FLASH DRIVE ALSO, UNFORTUNATELY, WORKS IN BLOCKS OF MEMORY.\nAND YOU ONLY HAVE 5 BLOCKS TO WORK WITH.", textSpeed, scn);
        TxtFxs.CompileNPC(1, "NOW+, BEFORE WE GET TOO FAR INTO THIS+,\nMAY YOU PLEASE TELL ME A LITTLE ABOUT YOURSELF?", textSpeed, scn);
        TxtFxs.NPCNoScanner(9, "I WANT TO VERIFY THAT I GIVE YOU THE RIGHT FILES.", textSpeed - 1);
        convo2(scn);
    }

    private static Person action1(Scanner scn)
    {
        System.out.println("\n\n");
        
        Person person = new Person();
        String firstName = InputUtility.getString("First name: ", scn);
        String lastName = InputUtility.getString("Last name: ", scn);
        int age = InputUtility.getIntInRange("Age: ", 0, 100, scn);

        person.setFirstName(firstName);
        person.setLastName(lastName);
        person.setAge(age);

        return person;
    }

    public static void convo2(Scanner scn)
    {
        int textSpeed = 10;
        Person person = action1(scn);
        CompFile[] fileArray = new CompFile[5];
        String userName = person.getFirstName().toUpperCase().trim();

        String printFileArray = CompFile.printFileArray(fileArray);

        // TxtFxs.NPCArrayName(person, printFileArray, 7, "YUP+, " + userName + "+, THIS IS YOUR STUFF ALRIGHT.", textSpeed, scn);
        // TxtFxs.NPCArrayName(person, printFileArray, 7, "EMPTY SLOTS READY TO GO.\n++LET'S GET TO ADDING SOME STUFF!", textSpeed, scn);
        // TxtFxs.NPCArray(printFileArray,0, "I'VE ALREADY CREATED A COLLECTION OF WHAT I BELIEVE\nARE THE MOST IMPORTANT FILES ON YOUR COMPUTER.", textSpeed, scn);
        // TxtFxs.CompileNPC(0, "LET ME JUST ADD THOSE REAL QUICK.", textSpeed, scn);
        // TxtFxs.CompileNPC(10, "ONE MOMENT&", textSpeed, scn);

        fileArray = new CompFile[5];
        fileArray[0] = new CompFile("BLANK.txt"); 
        fileCount++;
        fileArray[1] = new CompTextFile("MyNovel.txt", 253);
        fileCount++;
        fileArray[2] = new CompTextFile("MyNovel_Draft.txt", 342);
        fileCount++;

        TxtFxs.NPCNoScanner(4, "&++&++", textSpeed);

        fileArray[3] = new CompImgFile((person.getFirstName() + "sDayAtTheBeach.png"), 2003);
        fileCount++;

        printFileArray = CompFile.printFileArray(fileArray);

        TxtFxs.NPCArray(printFileArray, 9, "AH, THERE WE ARE!", textSpeed, scn);
        TxtFxs.NPCArray(printFileArray, 12, "AS YOU CAN SEE+, ONE OF THE SPOTS IS EMPTY.", textSpeed, scn);
        TxtFxs.CompileNPC(10, "ALL YOU HAVE TO DO IS TELL ME WHAT'S THE KIND\nOF FILE YOU WANT TO SAVE+ AND WE'LL GET IT'S INFO+\nAND MOVE IT ONTO THE FLASH DRIVE.", textSpeed, scn);
    

    }

    



}
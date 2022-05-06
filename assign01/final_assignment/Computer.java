package final_assignment;

import java.io.File;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

import utilities.InputUtility;
import utilities.UIUtility;


public class Computer {
    private File[] files;
    private int fileCount = 0;

    public Computer()
    {
        files = new File[5];
        files[0] = new File("BLANK.txt"); 
        fileCount++;
        files[1] = new TextFile();

        // sometimes this program does this hang on
            // textfile extends file 
            // so theres no reason a file type object should be unable to handle a textfile one

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
            File file = new File();

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

        // System.out.println(TxtFxs.cleanUp);
        // TxtFxs.TextSpeed("\n\nALRIGHT& LETS SET THE SCENE&+", textSpeed);
        // scn.nextLine();
        // System.out.println(TxtFxs.cleanUp);
        // System.out.println(TxtFxs.ComputerExpressions(11));
        // TxtFxs.TextSpeed("YOU'RE SITTING IN FRONT OF A COMPUTER.", 11);
        // scn.nextLine();
        // TxtFxs.CompileNPC(10, "\n&+AND I ALSO HAPPEN TO BE+ THAT COMPUTER", 12, scn);
        // TxtFxs.CompileNPC(2, "YOU ALSO HAVE A FLASH DRIVE AND THERE'S SOME FILES YOU WANT FROM ME", textSpeed, scn);
        // TxtFxs.CompileNPC(5, "YOU'VE ALREADY GIVEN ME YOUR FLASH DRIVE TO PUT FILES IN.", textSpeed,scn);
        // TxtFxs.CompileNPC(2, "THE FLASH DRIVE ALSO, UNFORTUNATELY, WORKS IN BLOCKS OF MEMORY.\nAND YOU ONLY HAVE 5 BLOCKS TO WORK WITH.", textSpeed, scn);
        // TxtFxs.CompileNPC(1, "NOW+, BEFORE WE GET TOO FAR INTO THIS+,\nMAY YOU PLEASE TELL ME A LITTLE ABOUT YOURSELF?", textSpeed, scn);
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

    private static void convo2(Scanner scn)
    {
        int textSpeed = 10;
        Person person = action1(scn);
        File[] fileArray = new File[5];
        String userName = person.getFirstName().toUpperCase().trim();

        String printFileArray = File.getFileArray(fileArray).toString();

        TxtFxs.NPCArrayName(person, printFileArray, 7, "YUP+, " + userName + "+, THIS IS YOUR STUFF ALRIGHT.", textSpeed, scn);
        TxtFxs.NPCArrayName(person, printFileArray, 7, "EMPTY SLOTS READY TO GO.\n++LET'S GET TO ADDING SOME STUFF!", textSpeed, scn);
        TxtFxs.NPCArray(printFileArray,0, "I'VE ALREADY CREATED A COLLECTION OF WHAT I BELIEVE\nARE THE MOST IMPORTANT FILES ON YOUR COMPUTER.", textSpeed, scn);
        TxtFxs.CompileNPC(0, "LET ME JUST ADD THOSE REAL QUICK.", textSpeed, scn);

    }

    

    public static void testCenter(Scanner scn)
    {

    }

}

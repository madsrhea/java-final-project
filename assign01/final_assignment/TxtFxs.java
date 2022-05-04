package final_assignment;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TxtFxs {

    public static String cleanUp = "\033[H\033[2J";
    private static String computerFace;
    private static String chatBox = "   ______________\n__/   COMPUTER   \\____________________________________________";
    private static String nextArrow = "\n\n\n\n\t\t\t\t\t\tEnter ==>";

    public static String ComputerExpressions(int i) {

        switch (i) {
            case 1:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |                  |  (\\)  |\n"
                        + "\t\t| |    ||      ||    |       |\n"
                        + "\t\t| |                  |  (-)  |\n"
                        + "\t\t| |       ▄▄▄▄       |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 2:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |                  |  (\\)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| |                  |  (-)  |\n"
                        + "\t\t| |   ==      ==     |       |\n"
                        + "\t\t| \\     ▄▄▄▄         / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 3:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |                  |  (\\)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| |                  |  (-)  |\n"
                        + "\t\t| |     ||     ||    |       |\n"
                        + "\t\t| \\       ...        / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 4:

                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |                  |  (\\)  |\n"
                        + "\t\t| |  ||     ||       |       |\n"
                        + "\t\t| |    ...           |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 5:

                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |                  |  (\\)  |\n"
                        + "\t\t| |  ||     ||       |       |\n"
                        + "\t\t| |    ▄▄▄           |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 6:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /     ||     ||    \\       |\n"
                        + "\t\t| |       ....       |  (\\)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| |                  |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 7:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /     ||     ||    \\       |\n"
                        + "\t\t| |        ▄▄▄       |  (\\)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| |                  |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 8:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                 \\       |\n"
                        + "\t\t| |   _      _       |  (\\)  |\n"
                        + "\t\t| |   =      =       |       |\n"
                        + "\t\t| |   ...            |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 9:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |     _      _     |  (\\)  |\n"
                        + "\t\t| |     =      =     |       |\n"
                        + "\t\t| |        ▄         |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;
            case 10:
            computerFace = ("\t\t+--------------v-------------+\n"
            + "\t\t|  __________________      @ |\n"
            + "\t\t| /                  \\       |\n"
            + "\t\t| |                  |  (\\)  |\n"
            + "\t\t| |    ||      ||    |       |\n"
            + "\t\t| |                  |  (-)  |\n"
            + "\t\t| |        ...       |       |\n"
            + "\t\t| \\                  / :|||: |\n"
            + "\t\t|  -ooo--------------  :|||: |\n"
            + "\t\t+----------------------------+\n");
            break;
            case 11:
                computerFace = ("\t\t+--------------v-------------+\n"
                        + "\t\t|  __________________      @ |\n"
                        + "\t\t| /                  \\       |\n"
                        + "\t\t| |                  |  (\\)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| |                  |  (-)  |\n"
                        + "\t\t| |                  |       |\n"
                        + "\t\t| \\                  / :|||: |\n"
                        + "\t\t|  -ooo--------------  :|||: |\n"
                        + "\t\t+----------------------------+\n");
                break;

        }
        return computerFace;
    }

    public static void TextSpeed(String str, int time) 
    {
        char slowDown = '+';
        char elipsies = '&';
        for (int i = 0; i < str.length(); i++) {
            

            if(str.charAt(i) == slowDown)
            {
                try {
                    TimeUnit.MILLISECONDS.sleep(250);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            else if (str.charAt(i) == elipsies)
            {
                for(int k = 0; k <= 3; k++)
                {
                    System.out.print(". ");
                    try
                    {
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
                    catch (InterruptedException f) {
                        // TODO Auto-generated catch block
                        f.printStackTrace();
                    }
                }
            }
            else
            {
                System.out.printf("%c", str.charAt(i));
            }
            try {
                Thread.sleep(time);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
        
    }

    public static void CompileNPC(int expression, String words, int time, Scanner scn)
    {
        System.out.println(cleanUp);
        System.out.print(ComputerExpressions(expression));
            if(time != 22 && time != 21)
            {System.out.println(chatBox+"\n");}
        TextSpeed(words, time);
            if(time != 22 && time != 19)
            {System.out.println(nextArrow);}
        scn.nextLine();
    }

    public static void CompileNPC(int expression, String words, int time)
    {
        System.out.println(cleanUp);
        System.out.print(ComputerExpressions(expression));
            if(time != 22 && time != 21)
            {System.out.println(chatBox+"\n");}
        TextSpeed(words, time);
            if(time != 22 && time != 19)
            {System.out.println(nextArrow);}
    }

    public static void CompileNPC(String array, int expression, String words, int time, Scanner scn)
    {
        System.out.println(cleanUp);
        System.out.println("\n\n"+array+"\n\n");
        System.out.print(ComputerExpressions(expression));
            if(time != 12 && time != 11)
            {System.out.println(chatBox+"\n");}
        TextSpeed(words, time);
            if(time != 12 && time != 9)
            {System.out.println(nextArrow);}
        scn.nextLine();
    }
}

// run text until end of sentence
// show symbol to prompt user to hit enter to continue
// run next block of text
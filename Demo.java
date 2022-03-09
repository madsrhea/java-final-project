/* File to follow along / test code in classs */

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthday [yyyy-mm-dd]: ");
        String birthday = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate realBirthday = LocalDate.parse(birthday);
        int birthMonth = realBirthday.getMonthValue();
        int birthDay = realBirthday.getDayOfMonth();
        if ((birthDay >= 21 && birthMonth == 3) || (birthMonth == 4 && birthDay <= 20))
        {
            System.out.println("You are an Aries.");
        }
        else if ((birthDay >= 21 && birthMonth == 4) || (birthMonth == 5 && birthDay <= 20))
        {
            System.out.println("You are a Taurus.");
        }
        else if ((birthDay >= 21 && birthMonth == 5) || (birthMonth == 6 && birthDay <= 20))
        {
            System.out.println("You are a Gemini");
        } 
        else if ((birthDay >= 21 && birthMonth == 6) || (birthMonth == 7 && birthDay <= 22))
        {
            System.out.println("You are a Cancer.");
        } 
        else if ((birthDay >= 23 && birthMonth == 7) || (birthMonth == 8 && birthDay <= 22))
        {
            System.out.println("You are a Leo.");
        }
        else if ((birthDay >= 23 && birthMonth == 8) || (birthMonth == 9 && birthDay <= 22))
        {
            System.out.println("You are a Virgo.");
        }
        else if ((birthDay >= 23 && birthMonth == 9) || (birthMonth == 10 && birthDay <= 22))
        {
            System.out.println("You are a Libra.");
        }
        else if ((birthDay >= 23 && birthMonth == 10) || (birthMonth == 11 && birthDay <= 22))
        {
            System.out.println("You are a Scorpio.");
        }
        else if ((birthDay >= 23 && birthMonth == 11) || (birthMonth == 12 && birthDay <= 21))
        {
            System.out.println("You are a Sagittarius.");
        }
        else if ((birthDay >= 22 && birthMonth == 12) || (birthMonth == 1 && birthDay <= 19))
        {
            System.out.println("You are a Capricorn.");
        }
        else if ((birthDay >= 20 && birthMonth == 1) || (birthMonth == 2 && birthDay <= 19))
        {
            System.out.println("You are an Aquarius.");
        }
        else
        {
            System.out.println("You are a Pisces.");
        }
        
    }
    // static method is x.method()
    // non-static is declare the variable before THEN declare the 
}
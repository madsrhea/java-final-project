package src.chapter_assignments;
import java.util.Scanner;

import utilities.TaskHandler;
import utilities.UIUtility;
import utilities.TaskHandler;

public class Chapter4 implements TaskHandler {
    @Override

    public void handleTask(Scanner in) {
        int choice = 0;
        while (true) {
            String menuTitle = "Chapter 4 Menu";
            String prompt = "Select an exercise";
            String[] menuOptions = {
                "Exercise 1", "Exercise 2", "Exercise 3", "Exercise 4", "Exercise 5", "Exercise 6", "Exercise 7", "Exercise 8"
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
                case 3:
                    exercise3(in);
                    break;
                case 4:
                    exercise4(in);
                    break;
                case 5:
                    exercise5(in);
                    break;
                case 6:
                    exercise6(in);
                    break;
                case 7:
                    exercise7(in);
                    break;
                case 8:
                    exercise8(in);
                    break;
            }
            UIUtility.pressEnterToContinue(in);
        }
        System.out.println("\nExiting Chapter 4 Menu.");
    }

////// FRACTION CLASS -- PART 1 ////////////////////
public static class Fraction{
    public int numerator;
    public int denominator;

    public Fraction()
    {
        numerator = 1;
        denominator = 1;
    }

    public String toString()
    {
        String str = (numerator + "/" + denominator);
        return str;
    }

    ////// FRACTION CLASS -- PART 2 ////////////////////
    public Fraction(int numerator, int denominator)
    {
        validateDenominator(denominator);
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator()
    {
        return numerator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public int getDemoninator()
    {
        return denominator;
    }

    public void setDenominator(int denominator)
    {
        validateDenominator(denominator);
        this.denominator = denominator;
    }

    ////// FRACTION CLASS -- PART 3 ////////////////////
    private void validateDenominator(int num) throws IllegalArgumentException
    {
        if(num == 0)
        {
           throw new IllegalArgumentException();
        }
    }

    ////// FRACTION CLASS -- PART 4 ////////////////////
    public static int greatestCommonDivisor(int num1, int num2)
    {   if (num2 == 0)
        {
            return num1;
        }
		return (num1 == 0) ? num1 : greatestCommonDivisor(num2, num1 % num2);
    }


    ////// FRACTION CLASS -- PART 5 ////////////////////
    public Fraction simplify()
    {
        int gcd = greatestCommonDivisor(getNumerator(), getDemoninator());
        while (gcd != 0)
        {
        int num2 = getDemoninator() / gcd;
        int num1 = getNumerator() / gcd;

        if ((num1 >= 0 && num2 < 0) || (num1 < 0 && num2 < 0))
        {
            num1 = num1 * -1;
            num2 = num2 * -1;
        }

        Fraction simpFrac = new Fraction(num1, num2);

        return simpFrac;
    }
        return null;
    }



    ////// FRACTION CLASS -- PART 6 ////////////////////
  
    private String mixedNumber() 
    {
        Fraction simplified = simplify();

        if(simplified.denominator == 1)
            {
                return Integer.toString(simplified.numerator);
            }
            else if (simplified.numerator == 0)
            {
                return "0";
            }
            else if(simplified.numerator > simplified.denominator)
            {
                int mixedNumber = numerator / denominator;
                int mixedFraction = numerator % denominator;
                return (mixedNumber + " " + mixedFraction + "/" + simplified.denominator);
            }
            else if (simplified.numerator < 0)
            {
                int mixedNumber = numerator / denominator;
                int mixedFraction = numerator % denominator;
                int makePositive = mixedFraction * -1;
                return (mixedNumber + " " + makePositive + "/" + simplified.denominator);
            }
            else
            {
            return simplified.toString();
            }
    }

    ////// FRACTION CLASS -- PART 7 ////////////////////
    public String add(Fraction other)
    {   
       Fraction fraction = new Fraction();
     
       int a = fraction.numerator;
       int b = fraction.denominator;
       int c = other.numerator;
       int d = other.denominator;

       fraction.numerator = ((a * b) + (c * d));
       fraction.denominator = (b * d);

       return (fraction.mixedNumber() + " + " + other.mixedNumber() + " = " + (fraction.mixedNumber() + other.mixedNumber()));
    }




    ////// FRACTION CLASS -- PART 8 ////////////////////

}

/////////////////////////////////////////////////////////////
////////////////// END OF FUNCTION CLASS ////////////////////
/////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////
/////////////////// START OF EXERCISES //////////////////////
/////////////////////////////////////////////////////////////



    // Exercise 1
    public void exercise1(Scanner in) {
        UIUtility.showMenuTitle("Exercise 1");
        Fraction fraction = new Fraction();
        System.out.println(fraction);  
    }

    public void exercise2(Scanner in) {
        UIUtility.showMenuTitle("Exercise 2");
        Fraction fraction = new Fraction(27, 6);
        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDemoninator());
        fraction.setNumerator(30);
        fraction.setDenominator(45);
        System.out.println(fraction);
    }

    public void exercise3(Scanner in) {
        UIUtility.showMenuTitle("Exercise 3");
        IllegalArgumentException iae = new IllegalArgumentException("Denominator cannot be zero.");
        try 
        {
            Fraction fraction = new Fraction(3,0);

        } 
        catch (Exception up) 
        {
            System.out.println(iae.getMessage());
        }
       Fraction fracshawn = new Fraction();
       
       try 
       {
           fracshawn.setDenominator(0);
       }
       catch (Exception up) 
       {
            System.out.println(iae.getMessage());
       }
    }

    public void exercise4(Scanner in) {
        UIUtility.showMenuTitle("Exercise 4");
        System.out.println(Fraction.greatestCommonDivisor(75,45));
        System.out.println(Fraction.greatestCommonDivisor(2, 4));
        System.out.println(Fraction.greatestCommonDivisor(5, 7));
    }

    public void exercise5(Scanner in) {
        UIUtility.showMenuTitle("Exercise 5");
        Fraction newNum1 = new Fraction(75, 45);
        System.out.println(newNum1.simplify()); // 5/3
        Fraction newNum2 = new Fraction(2,4);
        System.out.println(newNum2.simplify()); // 1/2
        Fraction newNum3 = new Fraction(5,7);
        System.out.println(newNum3.simplify()); // 5/7
        Fraction newNum4 = new Fraction(-2, 4);
        System.out.println(newNum4.simplify()); // -1/2
        Fraction newNum5 = new Fraction(2, -4);
        System.out.println(newNum5.simplify()); // -1/2
        Fraction newNum6 = new Fraction(-2, -4);
        System.out.println(newNum6.simplify()); // 1/2

       
    }
    public void exercise6(Scanner in) {
        UIUtility.showMenuTitle("Exercise 6");
        Fraction newNum1 = new Fraction(4,1);
        Fraction newNum2 = new Fraction(0,4); 
        Fraction newNum3 = new Fraction(4,4);
        Fraction newNum4 = new Fraction(8,4); 
        Fraction newNum5 = new Fraction(4,8); 
        Fraction newNum6 = new Fraction(13,5);
        Fraction newNum7 = new Fraction(-13, 5);  
        Fraction newNum8 = new Fraction(13,-5); 
        Fraction newNum9 = new Fraction(-13,-5); 
        Fraction fraction10 = new Fraction(-2, 3);
        
        System.out.println(newNum1.mixedNumber()); // 4
        System.out.println(newNum2.mixedNumber()); // 0
        System.out.println(newNum3.mixedNumber()); // 1
        System.out.println(newNum4.mixedNumber());// 2
        System.out.println(newNum5.mixedNumber()); // 1/2
        System.out.println(newNum6.mixedNumber()); // 2 3/5
        System.out.println(newNum7.mixedNumber()); // -2 3/5
        System.out.println(newNum8.mixedNumber()); // -2 3/5
        System.out.println(newNum9.mixedNumber()); // 2 3/5
        System.out.println(fraction10.mixedNumber());
    }

    public void exercise7(Scanner in) {
        UIUtility.showMenuTitle("Exercise 7");
        Fraction newNum1 = new Fraction(12 , 5);
        Fraction newNum2 = new Fraction(4 , 8);
        System.out.println(newNum1.add(newNum2)); // 2 3/5 + 1/2 = 3 1/10
        Fraction newNum3 = new Fraction(-13, -5);
        Fraction newNum4 = new Fraction(13 , -5);
        System.out.println(newNum3.add(newNum4)); // 2 3/5 + -2 3/5 = 0
    }
    public void exercise8(Scanner in) {
        UIUtility.showMenuTitle("Exercise 8");
        
    }
}
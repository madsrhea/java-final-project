// Code made by Mads Rhea && Alex Korte!

import java.util.Scanner;

public class PairProgramming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int north = -90;
        int south = 90;
        int east = -180;
        int west = 180;

        String usersChoice = InputUtility.validateUserString(
                "Would you like to see the furthest points you have ever traveled, (must do at least 2 places)?",
                new String[] { "yes", "no" }, scanner);

        while (usersChoice.toLowerCase().matches("yes")) {
            try {
                int latitude = InputUtility.getIntInRange("Enter in a valid latitude", -90, 90, scanner);
                if (latitude > north) {
                    north = latitude;
                } else if (latitude < south) 
                {
                    south = latitude;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Invalid number, please choose one between -90 and 90");
            }
            try {
                int longitude = InputUtility.getIntInRange("Enter a valid longitude.", -180, 180, scanner);
                if (longitude > east) {
                    east = longitude;
                } else if (longitude < west) {
                    west = longitude;
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Invalid number, please choose one between -180 and 180");
            }
            usersChoice = InputUtility.validateUserString("Would you like to enter another location?",
                    new String[] { "yes", "no" }, scanner);
            if (usersChoice.toLowerCase().matches("no")) {
                if(south > north || east < west)
                {
                    south = north;
                    west = east;
                }
                    // need to display furthest North, South, East, West
                System.out.println("Farthest North: " + north); // max latitude
                System.out.println("Farthest South: " + south); // min latitude
                System.out.println("Farthest East: " + east); // max longitude
                System.out.println("Farthest West: " + west); // min longitude
                }
        }

        
    }
}
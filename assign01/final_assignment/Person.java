package final_assignment;
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private static Person[] personArray = new Person[5];

    private String cleanUp = "\033[H\033[2J";

    public Person()
    {
        firstName = "Undefined";
        lastName = "Undefined";
        age = -1;
    }

    public Person(String firstName, String lastName, int age)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String input)
    {
        validateFirstName(input);
        this.firstName = input;
    }

    public void validateFirstName(String input)
    {
        if(input == null || input.equals(""))
        {
            throw new IllegalArgumentException(cleanUp + "please don't leave the first name field empty.");
        }
    
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String input)
    {
        validateLastName(input);
        this.lastName = input;
    }

    public void validateLastName(String input)
    {
        if(input == null || input.equals(""))
        {
            throw new IllegalArgumentException(cleanUp + "please don't leave the last name field empty.\n(you can also lie i dont care)");
        }
    
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int input)
    {
        validateAge(input);
        this.age = input;
    }

    public void validateAge(int input)
    {
        if(input >= 100 || input <= 0)
        {
            throw new IllegalArgumentException("there's no way ..... enter your actual age.\n(well, anything between 0 - 100)");
        }

    }

    public static Person[] getArray()
    {
        return personArray;
    }

    public static Person[] addToArray(Person input)
    {
        for(int i = 0; i < personArray.length; i++)
        {
            if(personArray[i] == null)
            {
                personArray[i] = input;
                break;
            }
        }

        return personArray;

    }


    public String toString() {
        return firstName.toUpperCase() + " " + lastName.toUpperCase() + " (" + age + ")";
    }

    public static String printArray(Person[] input)
    {
        String str = "[ ";
        String[] array = new String[input.length];
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] != null)
            {
                array[i] = "" + input[i];
                str += input[i];
                if (input[i+1] != null && i + 1 < input.length)
                {  
                    str += ", ";
                }
            }
        }
        str += " ]";

        return str;

    }


}

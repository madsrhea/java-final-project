package final_assignment;

public class File {
    
    private String fileName;
    public static File[] fileArray = new File[5];

    private String cleanUp = "\033[H\033[2J";

    public File()
    {
        fileName = "N/A";
    }

    public File(String fileName)
    {
       setFileName(fileName);
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String input)
    {
        validateFileName(input);
        this.fileName = input;
    }

    public void validateFileName(String input)
    {
        if(input == null || input.equals(""))
        {
            throw new IllegalArgumentException(cleanUp + "PLEASE DON'T LEAVE THE FILE NAME EMPTY.");
        }
    
    }

    public static File[] getFileArray()
    {
        return fileArray;
    }

    public static String printFileArray(File[] input)
    {
        String str = "[ ";
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] == null)
            {
               str += "*EMPTY*";
            }
            else
            {
                 str += input[i];
            }
            
            if (i + 1 < input.length)
            {  
                str += ", ";
            }
        }
        
        str += " ]";

        return str;
    }
}

package final_assignment;

public class CompFile implements Comparable<CompFile> {
    
    public String fileName;
    public static CompFile[] fileArray = new CompFile[5];

    private String cleanUp = "\033[H\033[2J";

    public CompFile()
    {
        fileName = "N/A";
    }

    public CompFile(String fileName)
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

    public static CompFile[] getFileArray()
    {
        return fileArray;
    }

    public static String printFileArray(CompFile[] input)
    {
        String str = "[ ";
        for(int i = 0; i < input.length; i++)
        {
            if(input[i] == null)
            {
               str += "\t*EMPTY*";
            }
            else
            {
                 str += input[i].toString();
            }
            
            if (i + 1 < input.length)
            {  
                str += ", ";
            }
        }
        
        str += " ]";

        return str;
    }

    @Override
    public String toString()
    {
        return String.format("\n\tGENERIC FILE:\n\t\tFile Name='%s'\n", fileName);
    }

    @Override
    public int compareTo(CompFile o) {
        // TODO Auto-generated method stub
        return 0;
    }
}

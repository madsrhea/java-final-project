package final_assignment;

public class CompImgFile extends CompFile 
{
    public int dateYear;
    

    public CompImgFile()
    {
        super();
        dateYear = -1;
        
    }

    public CompImgFile(String fileName, int dateYear)
    {
        super(fileName);
        setdateYear(dateYear);        
    }

    public int getdateYear()
    {
        return dateYear;
    }

    public void setdateYear(int dateYear)
    {
        validateYeardateYear(dateYear);
        this.dateYear = dateYear;
    }

    public void validateYeardateYear(int dateYear)
    {
        if(dateYear <= 1950 || dateYear >= 2023)
        {
            throw new IllegalArgumentException("VALID YEAR (1950 - 2022) IS REQUIRED FOR IMAGE.\n('YYYY' FORMAT PLEASE");
        }

    }


}

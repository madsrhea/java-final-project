package final_assignment;

import java.util.Date;

public class ImgFile extends File 
{
    public Date date;

    public ImgFile()
    {
        super();
        date = null;
    }

    public ImgFile(String fileName, Date date)
    {
        super(fileName);
        setDate(date);        
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        validateDate(date);
        this.date = date;
    }

    public void validateDate(Date date)
    {
        if(date == null)
        {
            throw new IllegalArgumentException("PAGE NUMBER IS REQUIRED FOR TEXT FILES.");
        }

    }


}

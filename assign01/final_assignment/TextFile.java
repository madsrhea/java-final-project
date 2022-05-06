package final_assignment;

public class TextFile extends File {
    private int pageNum;

    public TextFile()
    {
        super();
        pageNum = -1;
    }

    public TextFile(String fileName, int pageNum)
    {
        super(fileName);
        setPages(pageNum);
    }

    public int getPages()
    {
        return pageNum;
    }

    public void setPages(int pageNum)
    {
        validatePages(pageNum);
        setPages(pageNum);
    }

    public void validatePages(int pageNum)
    {
        if(pageNum >= 0)
        {
            throw new IllegalArgumentException("PAGE NUMBER IS REQUIRED FOR TEXT FILES.");
        }

    }


}

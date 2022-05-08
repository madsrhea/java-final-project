package final_assignment;

public class CompTextFile extends CompFile {
    private int pageNum;

    public CompTextFile()
    {
        super();
        pageNum = -1;
    }

    public CompTextFile(String fileName, int pageNum)
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
        this.pageNum = pageNum;
    }

    public void validatePages(int pageNum)
    {
        if(pageNum <= 0)
        {
            throw new IllegalArgumentException("PAGE NUMBER IS REQUIRED FOR TEXT FILES.");
        }

    }


}

package final_assignment;

public class CompMusicFile extends CompFile {
    private int songLength;
    private Person artist;

    public CompMusicFile()
    {
        super();
        songLength = -1;
        artist = new Person();
    }

    public CompMusicFile(String fileName, int songLength, Person artist)
    {
        super(fileName);
        setSongLength(songLength);
        setArtist(artist);
        
    }

    public int getSongLength()
    {
        return songLength;
    }

    public void setSongLength(int songLength)
    {
        validateSongLength(songLength);
        setSongLength(songLength);
    }

    public void validateSongLength(int songLength)
    {
        if(songLength >= 0)
        {
            throw new IllegalArgumentException("A SONG CANNOT BE NEGATIVE SECONDS. THAT'S IMPOSSIBLE.");
        }

    }

    public Person getArtist()
    {
        return artist;
    }

    public void setArtist(Person artist)
    {
        validateArtist(artist);
        this.artist = artist;

    }

    public void validateArtist(Person artist)
    {
        if(artist == null)
        {
            throw new IllegalArgumentException("ARTIST IS REQUIRED.");
        }
    }


}

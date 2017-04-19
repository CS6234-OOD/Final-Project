package instructor;
public class SelfPaceCourse extends Course
{
    private String uploadDate;
    private String expiration;

    public SelfPaceCourse(String courseType, String n, Double f, String u, String s,
    String uploadDate, String expiration)
    {
        super(courseType, n, f, u, s);
        this.uploadDate = uploadDate;
        this.expiration = expiration;
    }

    public String getUploadDate()
    {
        return uploadDate;
    }

    public void setUploadDate(String name)
    {
        this.uploadDate = uploadDate;
    }

    public String getExpiration()
    {
        return uploadDate;
    }

    public void setExpiration(String expiration)
    {
        this.expiration = expiration;
    }
}
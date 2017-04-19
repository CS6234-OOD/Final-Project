package instructor;
public class SemesterCourse extends Course
{
    private String semester;
    private Double duration;
    private Double credits;
    private String certification;
    private String instructor;

    public SemesterCourse(String courseType, String n, Double f, String u, String s,
    String semester, Double duration, Double credits,
    String certification, String instructor)
    {
        super(courseType, n, f, u, s);
        this.semester = semester;
        this.duration = duration;
        this.credits = credits;
        this.certification = certification;
        this.instructor = instructor;
    }

    public String getSemester()
    {
        return semester;
    }

    public void setSemster(String semester)
    {
        this.semester = semester;
    }

    public Double getDuration()
    {
        return duration;
    }

    public void setDuration(Double duration)
    {
        this.duration = duration;
    }

    public Double getCredits()
    {
        return credits;
    }

    public void setCredits(Double credits)
    {
        this.credits = credits;
    }

    public String getCertification()
    {
        return certification;
    }

    public void setCertification(String certification)
    {
        this.certification = certification;
    }

    public String getInstructor()
    {
        return instructor;
    }

    public void setInstructor(String instructor)
    {
        this.instructor = instructor;
    }



}
package instructor;
public abstract class Course
{
    private String courseType;
    private String name;
    private Double fee;
    private String university;
    private String subject;


    // constructor
    public Course(String courseType, String n, Double f, String u, String s)
    {
        this.courseType = courseType;
        this.name = n;
        this.fee = f;
        this.university = u;
        this.subject = s;
    }

    public String getType()
    {
        return courseType;
    }

    public void setType(String type)
    {
        this.courseType = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public Double getFee()
    {
        return fee;
    }


    public void setFee(Double fee)
    {
        this.fee = fee;
    }


    public String getUniversity()
    {
        return university;
    }


    public void setUniversity(String university)
    {
        this.university = university;
    }

    public String getSubject()
    {
        return subject;
    }


    public void setSubject(String subject)
    {
        this.subject = subject;
    }


    //abstract void makeCourse();

    public String toString()
    {
        return "A new course has been created: " + name;
    }
}



/* Course

    - name
    - fee
    - university
    - subject
    - toString

*/


/*
CourseSemster extends Course
    - semester
    - duration
    - credit
    - certification
    - instructor

    --------------------
    getInstructor
    setInstructor



CourseSelfPace extends Course
    - uploadDate
    - expirationDate
*/
package instructor;
public class CourseFactory
{
    protected Course createCourse(String courseType, String n, Double f, String u, String s,
    String uploadDate, String expiration)
    {

        SelfPaceCourse spc = new SelfPaceCourse(courseType, n, f, u, s, uploadDate, expiration);
        return spc;
    }

    protected Course createCourse(String courseType, String n, Double f, String u, String s, String semester,
    Double duration, Double credits, String certification, String instructor)
    {

        SemesterCourse sc = new SemesterCourse(courseType, n, f, u, s, semester, duration, credits, certification, instructor);
        return sc;
    }
}
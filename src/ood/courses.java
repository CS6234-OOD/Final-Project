package ood;
public class courses {
    
     int courseNumber;
    String courseName;
    
    public courses(int courseNumber, String courseName)
    {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    courses(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getCourseNumber()
    {
        return courseNumber;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    
}
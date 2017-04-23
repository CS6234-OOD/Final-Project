package ood;
public class courses {
    
    String courseNumber;
    String courseName;
    String courseType;
    
    public courses(String courseNumber, String courseName, String courseType)
    {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.courseType = courseType;
    }

    courses(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getCourseNumber()
    {
        return courseNumber;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    
}
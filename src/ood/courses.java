/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ood;

/**
 *
 * @author richardhsu
 */
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

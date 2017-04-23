package ood;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
/**
 *
 * @author richardhsu
 */
public class coursesList {
    
    ArrayList <courses> coursesList = new ArrayList<courses>();
    
    public DefaultListModel CoursesList()
    {
        DefaultListModel courses = new DefaultListModel();
        
        
        
        courses courseA = new courses(6234, "Object-Oriented-Design");
        coursesList.add(courseA);
        
        courses courseB = new courses(6112, "Design of Algorithms");
        coursesList.add(courseB);
        
        courses courseC = new courses(6444, "Big Data");
        coursesList.add(courseC);
        
        
        
        for (int i = 0; i < coursesList.size(); i++)
        {
            //System.out.println(coursesList.get(i));
            courses.add(i, coursesList.get(i).courseNumber + ": " + coursesList.get(i).courseName);
        }
        //courses [] coursesList = {new courses(6234, "Object-Oriented-Design"), new courses(6112, "Algorithms"), new courses(6351, "AI"), new courses(1011, "Big Data"), new courses(1113, "Discrete Math"), new courses(6331, "Cryptography"), new courses(6221, "Software Paradigms")};
        /*
        for (int i = 0; i < coursesList.length; i++)
        {
            courses.add(i, coursesList[i].courseNumber + ": " + coursesList[i].courseName);
        }
        */
        return courses;
    }
    
    public void addCourse(int courseNumber, String courseName)
    {
        courses courseD = new courses(courseNumber, courseName);
        coursesList.add(courseD);
    }
}
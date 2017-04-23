package ood;
import javax.swing.DefaultListModel;

/**
 *
 * @author richardhsu
 */
public class coursesList {

    public DefaultListModel CoursesList()
    {
        DefaultListModel courses = new DefaultListModel();
        
        courses [] coursesList = {new courses(6234, "Object-Oriented-Design"), new courses(6112, "Algorithms"), new courses(6351, "AI"), new courses(1011, "Big Data"), new courses(1113, "Discrete Math"), new courses(6331, "Cryptography"), new courses(6221, "Software Paradigms")};
        
        for (int i = 0; i < coursesList.length; i++)
        {
            courses.add(i, coursesList[i].courseNumber + ": " + coursesList[i].courseName);
        }
        return courses;
    }
}
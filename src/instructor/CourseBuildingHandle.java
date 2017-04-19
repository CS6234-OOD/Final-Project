package instructor;
/* This is a class that handles the order of building a course and
   sends the request to the right factory
*/
public abstract class CourseBuildingHandle
{
    protected abstract Course makeCourse(String courseType);

    /* Act as an order mechanism for courses that have special things */
    /*
    public Course orderTheCourse(String courseType)
    {
        Course newCourse = makeCourse(courseType);

        //newCourse.getName();

        return newCourse;
    }
    */
}
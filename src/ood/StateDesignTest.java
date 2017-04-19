package ood;

public class StateDesignTest {

	public static void main(String[] args) {

        Course dataAnalytics = new Course("Data Analytics");
        Course oop = new Course("Object Oriented Programming");
        
        Student student1 = new Student("Student1", "student1@gwu.edu");
        Student student2 = new Student("Student2", "student2@gwu.edu");
        Student student3 = new Student("Student3", "student3@gwu.edu");
        Student student4 = new Student("Student4", "student4@gwu.edu");
        
        CourseRegistration dataAnalyticsRegistration = new CourseRegistration(dataAnalytics, 3, false);
        CourseRegistration oopRegistration = new CourseRegistration(oop, 2, true);
        
        dataAnalyticsRegistration.register(student1);
        dataAnalyticsRegistration.register(student1);
        dataAnalyticsRegistration.register(student2);
        dataAnalyticsRegistration.register(student3);
        dataAnalyticsRegistration.register(student4);
        dataAnalyticsRegistration.unregister(student4);
        dataAnalyticsRegistration.unregister(student1);
        
        oopRegistration.register(student1);
        oopRegistration.register(student2);
        oopRegistration.register(student3);
        oopRegistration.register(student4);
        oopRegistration.unregister(student4);
        oopRegistration.unregister(student1);
       

	}

}

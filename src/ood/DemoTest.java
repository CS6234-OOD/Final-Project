package ood;
import java.text.ParseException;

public class DemoTest {
	public static void main(String args[]) throws ParseException{
		//RegistrationState Open;
		Course oop = new Course("Object Oriented Programming");
		CourseRegistration oopRegistration = new CourseRegistration(oop, 2, true);
		Student std1 = new Student("Aziz","1234567");
		Student std2 = new Student("Richard","2224567");
		Student std3 = new Student("Roman","2224555");
		Student std4 = new Student("Chris","2223355");
		Student std5 = new Student("Yulia","1223355");
		//std1.observ(oopRegistration);
		//std2.observ(oopRegistration);
		oopRegistration.register(std1);
		oopRegistration.register(std2);
		oopRegistration.register(std3); 
		oopRegistration.register(std4);
	//	oopRegistration.register(std5);
		oopRegistration.unregister(std1);
		//oopRegistration.setRegistrationState(oopRegistration.getOpenState());
	//	system.getClosedState();
	}

}
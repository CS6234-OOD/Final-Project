package ood;
public class Student extends Observer {
	public String name;
	public String email;
	CourseRegistration system;
	
	public Student(String newName, String newEmail){
		name = newName;
		email = newEmail;
	}
	public void observ(CourseRegistration system){
		this.system = system;
		this.system.attach(this);
		
	}
	@Override
	public String update() {
		// TODO Auto-generated method stub
		//System.out.println("Dear " + name + ": the Course Registerartion System is now " + system.getCurrentState());
                System.out.println("Dear Student: " + ": the course " + system.getCurrentState() + " is now open.");
		return "Dear Student: " + ": the course is now open. ";
	}
}
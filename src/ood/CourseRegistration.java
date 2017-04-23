package ood;
import java.util.ArrayList;
import java.util.List;

public class CourseRegistration {
	 private RegistrationState open;
	 private RegistrationState waitlist;
	 private RegistrationState closed;
	 private RegistrationState currentRegistratonState;

	 private Course course;
	 private ArrayList<Student> registeredStudents; 
	 private ArrayList<Student> waitlistedStudents;
	 private List<Observer> observers = new ArrayList<Observer>();


	 private int studentLimit;
	 private boolean allowWaitlist; 

	    public CourseRegistration(Course newCourse, int newStudentLimit, boolean allowWaitlist)
	    {
	        course = newCourse;
	        studentLimit = newStudentLimit;
	        this.allowWaitlist = allowWaitlist;
	        registeredStudents = new ArrayList<Student>();
	   	 	waitlistedStudents = new ArrayList<Student>();
	    	open = new Open(this);
	        closed = new Closed(this);
	        waitlist = new Waitlist(this);
	        
	        currentRegistratonState = open;
	        notifyAllObservers();

	    }

	    public void setRegistrationState(RegistrationState newState)
	    {
	        currentRegistratonState = newState;
	        notifyAllObservers();
	    }

	    public RegistrationMessage register(Student newStudent)
	    {
	        return currentRegistratonState.register(newStudent);
	    }

	    public RegistrationMessage unregister(Student existingStudent)
	    {
	        return currentRegistratonState.unregister(existingStudent);
	    }

	    
	    // getters for the state
	    public RegistrationState getCurrentState(){
	    	return currentRegistratonState;
	    }
	    public RegistrationState getOpenState()
	    {
	        return open;
	        
	    }
	    
	    public RegistrationState getClosedState()
	    {
	        return closed;
	    }
	    
	    public RegistrationState getWaitlistState()
	    {
	        return waitlist;
	    }
	   
	   public int getRegisterdStudents(){
	        return registeredStudents.size();
	   }

	   public int getStudentLimit(){
	        return studentLimit;
	   }

	   public boolean allowsWaitlist(){
	        return allowWaitlist;
	   }
	   
	   public void addRegisteredStudent(Student newStudent){
		   registeredStudents.add(newStudent);
	   }
	   
	   public void removeRegisteredStudent(Student existingStudent){
		   registeredStudents.remove(existingStudent);
	   }
	   
	   public void addWaitlistStudent(Student newStudent){
		   waitlistedStudents.add(newStudent);
	   }
	   
	   public void removeWaitlistStudent(Student existingStudent){
		   waitlistedStudents.remove(existingStudent);
	   }
	   
	   public boolean isWaitlisted(Student existingStudent){
		   return waitlistedStudents.contains(existingStudent);
	   }
	   
	   public boolean isRegistered(Student existingStudent){
		   return registeredStudents.contains(existingStudent);
	   }
	   
	   public void attach(Observer observer){
		   observers.add(observer);
	    }
	    
	    public void notifyAllObservers(){
	    	for(Observer observer: observers){
	    		observer.update();
	    	}
	    }
	   
	   


}
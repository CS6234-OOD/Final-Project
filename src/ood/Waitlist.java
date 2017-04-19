package ood;

public class Waitlist implements RegistrationState {
	
	private CourseRegistration courseRegistration;
	
	public Waitlist(CourseRegistration newCourseRegistration){
		courseRegistration = newCourseRegistration;
	}

	@Override
	public RegistrationMessage register(Student newStudent) {
		if(!courseRegistration.isWaitlisted(newStudent)){
			courseRegistration.addWaitlistStudent(newStudent);
			System.out.println("Student: " + newStudent.name + " has been added to the waiting list.");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " has been added to the waiting list.", "Registration State is waitList");
                        return registrationMessage;
		}else{
			System.out.println("Student: " + newStudent.name + " is already on the waiting list.");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " is already on the waiting list.", "Registration State is waitList");
                        return registrationMessage;
		}

	}

	@Override
	public RegistrationMessage unregister(Student existingStudent) {
		if(courseRegistration.isRegistered(existingStudent)){
			courseRegistration.removeRegisteredStudent(existingStudent);
			System.out.println("Student: " + existingStudent.name + " has been unregistered");
			//add logic to remove waitlisted student to registered list
			courseRegistration.setRegistrationState(courseRegistration.getOpenState());
			System.out.println("Registration State changed from Waitlist to Open");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + existingStudent.name + " has been unregistered", "Registration State changed from Waitlist to Open");
                        return registrationMessage;
		}else if(courseRegistration.isWaitlisted(existingStudent)){
			courseRegistration.removeWaitlistStudent(existingStudent);
			System.out.println("Student: " + existingStudent.name + " has been removed from the waiting list.");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + existingStudent.name + " has been removed from the waiting list.", "Registration State is Waitlist");
                        return registrationMessage;
                        
		}
                else 
                {
                        RegistrationMessage registrationMessage = new RegistrationMessage("Please Try Again Later!", "Are you sure you enrolled?");
                        return registrationMessage;
                }
	}

}

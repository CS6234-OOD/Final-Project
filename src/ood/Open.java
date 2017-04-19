package ood;

public class Open implements RegistrationState {
	
	private CourseRegistration courseRegistration;
	
	public Open(CourseRegistration newCourseRegistration){
		courseRegistration = newCourseRegistration;
	}

	@Override
	public RegistrationMessage register(Student newStudent) {
                
		if(!courseRegistration.isRegistered(newStudent)){
			courseRegistration.addRegisteredStudent(newStudent);
		
			System.out.println("Student: " + newStudent.name + " has been registered");
		
			//Set State to close or waitlist if limit has been reached.
			if(courseRegistration.getRegisterdStudents() == courseRegistration.getStudentLimit()){
				if(courseRegistration.allowsWaitlist()){
					courseRegistration.setRegistrationState(courseRegistration.getWaitlistState());
					System.out.println("Registration State changed from Open to Waitlist");
                                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " has been registered", "Registration State changed from Open to Waitlist");
                                        return registrationMessage;
				}
				else{
					courseRegistration.setRegistrationState(courseRegistration.getClosedState());
					System.out.println("Registration State changed from Open to Closed");
                                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " has been registered", "Registration State changed from Open to Closed");
                                        return registrationMessage;
				}
			}
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " has been registered", "Registration State is Open");
                        return registrationMessage;
		}
		else{
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " has already been registered", "Registration State is Open");
			System.out.println("Student: " + newStudent.name + " has already been registered");
                        return registrationMessage;
		}
	}

	@Override
	public RegistrationMessage unregister(Student existingStudent) {
		if(courseRegistration.isRegistered(existingStudent)){
			courseRegistration.removeRegisteredStudent(existingStudent);
			System.out.println("Student: " + existingStudent.name + " has been unregistered");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + existingStudent.name + " has been unregistered", "Registration State is Open");
                        //return "Student: " + existingStudent.name + " has been unregistered";
                        return registrationMessage;
                        
		}else{
			System.out.println("Student: " + existingStudent.name + " has not registered for the course.");
                        //return "Student: " + existingStudent.name + " has not registered for the course.";
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + existingStudent.name + " has not registered for the course.", "Registration State is Open");
                        return registrationMessage;
		}
		
	}

}

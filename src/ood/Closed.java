package ood;

public class Closed implements RegistrationState {
	private CourseRegistration courseRegistration;
	
	public Closed(CourseRegistration newCourseRegistration){
		courseRegistration = newCourseRegistration;
	}

	@Override
	public RegistrationMessage register(Student newStudent) {	
		System.out.println("Course is closed. Student: " + newStudent.name + " could not register.");
                

                RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + newStudent.name + " could not register.", "Course is closed");
                return registrationMessage;
	}

	@Override
	public RegistrationMessage unregister(Student existingStudent) {
		if(courseRegistration.isRegistered(existingStudent)){
			courseRegistration.removeRegisteredStudent(existingStudent);
			System.out.println("Student: " + existingStudent.name + " has been unregistered");
			courseRegistration.setRegistrationState(courseRegistration.getOpenState());
			System.out.println("Registration State changed from Closed to Open");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + existingStudent.name + " has been unregistered", "Registration State changed from Closed to Open");
                        return registrationMessage;
		}else{
			System.out.println("Student: " + existingStudent.name + " has not registered for the course.");
                        RegistrationMessage registrationMessage = new RegistrationMessage("Student: " + existingStudent.name + " has not registered for the course.", "Registration State is Closed");
                        return registrationMessage;
		}	
	}
}

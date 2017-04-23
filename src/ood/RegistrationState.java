package ood;
public interface RegistrationState {
    RegistrationMessage register(Student newStudent);
    RegistrationMessage unregister(Student existingStudent);
}
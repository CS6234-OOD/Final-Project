package ood;
public class RegistrationMessage {
    String courseStatus;
    String confirmation;
    
    
    public RegistrationMessage(String confirm, String status)
    {
        courseStatus = status;
        confirmation = confirm;
    }
}
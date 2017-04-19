/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ood;

/**
 *
 * @author richardhsu
 */
public class RegistrationMessage {
    String courseStatus;
    String confirmation;
    
    
    public RegistrationMessage(String confirm, String status)
    {
        courseStatus = status;
        confirmation = confirm;
    }
}

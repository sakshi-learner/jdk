package org.example.notification;

public class PopUpService implements NotificationService{
    @Override
    public void sendNotification(){
        System.out.println("Pop-Up open");
    }
}

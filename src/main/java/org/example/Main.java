package org.example;

import org.example.CollectionApi.GenericRegister;
import org.example.CollectionApi.Student;
import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpService;
import org.example.notification.SmsService;

import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        NotificationService notification = new PopUpService();
//        OrderService order = new OrderService(notification);
//        order.placeOrder();

        GenericRegister<Student, Integer> repo = new GenericRegister<>();

        repo.save(1, new Student(1, "Rahul", 78));
        repo.save(2, new Student(2, "Amit", 92));
        repo.save(3, new Student(3, "Priya", 85));

        System.out.println(repo.findById(2));
        System.out.println(repo.getAllIds());
        System.out.println(repo.findAllSorted(Comparator.comparing(s -> s.name)));


    }
}
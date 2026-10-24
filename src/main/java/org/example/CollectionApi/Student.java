package org.example.CollectionApi;

public class Student {
    int id;
    public String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return id + " - " + name + " (" + marks + ")";
    }
}
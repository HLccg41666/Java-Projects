package com.ArrayExercises;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

class Student {
    private String id;
    private String name;
    private int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    // Getters and setters omitted for brevity

    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + "}";
    }
}

public class demo5 {
    public static void main(String[] args) {
        // Step 1: Create an array list of students and add a new student object
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("heim001", "Alice", 20));
        students.add(new Student("heim002", "Bob", 22));
        students.add(new Student("heim003", "Charlie", 23));

        // Print initial list
        System.out.println("Initial students list:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Step 2: Check if each student ID is unique
        boolean uniqueIds = true;
        for (int i = 0; i < students.size(); i++) {
            for (int j = i + 1; j < students.size(); j++) {
                if (students.get(i).getId().equals(students.get(j).getId())) {
                    uniqueIds = false;
                    break;
                }
            }
            if (!uniqueIds) break;
        }
        System.out.println("Are all student IDs unique? " + uniqueIds);

        // Step 3: Remove the student with ID "heim002"
        students.removeIf(student -> student.getId().equals("heim002"));

        // Print list after removal
        System.out.println("Students list after removal:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Step 4: Check if there are any students left in the array
        boolean hasStudents = !students.isEmpty();
        System.out.println("Are there any students left? " + hasStudents);

        // Step 5: Query the student with ID "heim002"
        Optional<Student> queriedStudent = students.stream()
                .filter(student -> student.getId().equals("heim002"))
                .findFirst();

        System.out.println("Queried student with ID 'heim002'" );
    }

    // Assuming you have getters for id, name, and age in the Student class
    // e.g., public String getId() { return id; }
}
package com.me.functionalinterface.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    public static List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        studentList.add(
                new Student("Sayan", 3.9, 9.8, Arrays.asList("Play", "Read", "Write", "Exam", "Music")));
        studentList.add(
                new Student("Ayan", 3.5, 7.8, Arrays.asList("Read", "Write", "Exam", "Music")));
        studentList.add(
                new Student("Shubham", 4.1, 8.8, Arrays.asList("Play", "Read", "Exam", "Music")));
        studentList.add(
                new Student("Narayan", 4.5, 7.5, Arrays.asList("Play", "Read", "Write", "Exam")));
        studentList.add(
                new Student("Binata", 4.9, 9.9, Arrays.asList("Read", "Write", "Exam")));
        studentList.add(
                new Student("Ruchira", 3.3, 6.8, Arrays.asList("Play", "Music")));
        return studentList;
    }
}

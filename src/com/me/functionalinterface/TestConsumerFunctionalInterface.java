package com.me.functionalinterface;

import com.me.functionalinterface.data.Student;
import com.me.functionalinterface.data.StudentDatabase;

import java.util.function.Consumer;

public class TestConsumerFunctionalInterface {

    final private static Consumer<Student> c1 = student -> System.out.print(student.getName());
    final private static Consumer<Student> c2 = student -> System.out.println(student.getActivities());
    /**
     * accept function body - first, filter it by GPA of a student
     * then prints name
     * and then prints activities
     */
    final private static Consumer<Student> c3 = student -> {
        if(student.getGPA() >= 3.9){
            c1.andThen(c2).accept(student);
        }
    };

    public static void main(String[] args) {
        /**
         * Normal accept method - this lambda is the accept function of a Consumer
         */
//        StudentDatabase.getAllStudents().forEach((student -> System.out.println(student)));
        /**
         * forEach() takes a Consumer (we can use Consumer chaining also) and call the accept function
         */
//        StudentDatabase.getAllStudents().forEach(c1.andThen(c2));

        /**
         * check the c3 Consumer implementation
         */
        StudentDatabase.getAllStudents().forEach(c3);
    }
}

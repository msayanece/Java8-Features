package com.me.functionalinterface.data;

import java.util.List;

public class Student {
    private String name;
    private Double grade;
    private Double GPA;
    private List<String> activities;

    public Student(String name, Double grade, Double GPA, List<String> activities) {
        this.name = name;
        this.grade = grade;
        this.GPA = GPA;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", GPA=" + GPA +
                ", activities=" + activities +
                '}';
    }
}

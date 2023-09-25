package org.example.models;

import java.util.Date;

public abstract class Employee {
    protected String name;
    protected String mobile;
    protected Date birthDate;
    protected double salary;

    public Employee(String name, String mobile, Date birthDate, double salary) {
        this.name = name;
        this.mobile = mobile;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public abstract boolean isReady();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                '}';
    }
}
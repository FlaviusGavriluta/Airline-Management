package org.example.model;

import java.util.Date;

public abstract class Employee {
    private String name;
    private String mobile;
    private Date birthDate;
    private double salary;

    public Employee(String name, String mobile, Date birthDate, double salary) {
        this.name = name;
        this.mobile = mobile;
        this.birthDate = birthDate;
        this.salary = salary;
    }
    public abstract boolean isReady();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

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
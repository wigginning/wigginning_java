package Scripts;

public class Employee {
    String name;
    int age;
    String designation;
    double salary;

    // Employee 类构造器
    public Employee(String name) {
        this.name = name;
    }
    // 设置年龄
    public void empAge(int empAge) {
        age = empAge;
    }
    // 设置职位
    public void empDesignation(String empDes) {
        designation = empDes;
    }
    // 设置薪水
    public void empSalary(double empSalary) {
        salary = empSalary;
    }
    // 打印信息
    public void printEmployee() {
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}

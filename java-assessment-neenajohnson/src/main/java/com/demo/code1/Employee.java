package com.demo.code1;

public class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display(){
        System.out.println(
                "id:"+id+" "+
                        "name:"+name+" "+
                        "salary:"+salary
        );
    }

}

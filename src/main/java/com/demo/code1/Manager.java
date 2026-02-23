package com.demo.code1;

public class Manager extends Employee{
    private double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    void display() {

        System.out.println(  "id:"+id+" "+
                "name:"+name+" "+
                "salary:"+salary+" "+
                "bonus:"+bonus+" "+
                "total:"+(bonus+salary));
    }
}

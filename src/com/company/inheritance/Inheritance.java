package com.company.inheritance;
class  Employee{
    float salary=40000;
}

public class Inheritance extends Employee {
    int bonus = 10000;
    public static void main(String args[]){
        Inheritance h= new Inheritance();
        h.display(h.salary);
        h.display(h.bonus);

    }

    void display(float salary){
        System.out.println("employee salary is :" + salary);
        System.out.println("employee bonus is :" + salary);
    }
    }

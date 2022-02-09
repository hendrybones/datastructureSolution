package com.company.inheritance;
class Animal{
    void eat(){
        System.out.println("eating");
    }

}
class Dog extends Animal {

    void bark(){
        System.out.println("Barking");
    }
}
class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping");
    }

}
public class MultilevelInheritance {
    public static void main(String args[]){
        BabyDog d= new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }

    }

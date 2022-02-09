package com.company.polymorphism;

class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class  SBI extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }

}
class Axis extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}

public class A {
    public static void main(String args[]){
        Bank b;
        b= new SBI();
        System.out.println("SBI interest" + b.getRateOfInterest());

        b=new Axis();
        System.out.println("AXIS  rate of interest " + b.getRateOfInterest());

    }


    }

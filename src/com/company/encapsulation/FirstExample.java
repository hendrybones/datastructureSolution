package com.company.encapsulation;

public class FirstExample {
    public static void main(String[] args){
        StudentExample e= new StudentExample();
        e.setName(" hendry");
        System.out.println(e.getName());
        Account a= new Account();
        a.setAcc_no(12345);
        a.setName("hendry");
        a.setAmount(200000);

        System.out.println("account number "+ a.getAcc_no()+" " + "account Name "+ a.getName() + "amount " + a.getAmount());

    }
    }

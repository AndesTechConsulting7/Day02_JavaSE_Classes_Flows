package org.andestech.learning.sber2020;

import java.util.Random;

public class Customer {
    long id;
    String name, sname;
    //.....
    //.....

// var1.
//    public Customer(){
//        System.out.println("+++ ctor1: " + this);
//        int a,b,c;
//
//    }

    //var 2.
    public Customer(){
        this(11,"Default","Default");
        //System.out.println("+++ ctor1: " + this);
        //int a,b,c;

    }

    public Customer(String name, String sname){
        this(0,name,sname);
        // DB query
        // generator & verify
        id = (new Random()).nextInt();

    }


   // public Customer(int id1, String name1, String sname1){
     public Customer(int id, String name, String sname){
        //id = id1;
        //name=name1
        //sname=sname1
         this.id = id;
         this.name = name;
        this.sname = sname;

        System.out.println("+++ ctor2: " + this);

    }

    String getCustomerInfo(){
        return String.format("id:%d, %s %s.",id, name, sname);
    }

    void printCusomer(){
        System.out.println(getCustomerInfo());
    }

}

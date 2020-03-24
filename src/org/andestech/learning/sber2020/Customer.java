package org.andestech.learning.sber2020;

public class Customer {
    long id;
    String name, sname;
    //.....
    //.....

    String getCustomerInfo(){
        return String.format("id:%d, %s %s.",id, name, sname);
    }

    void printCusomer(){
        System.out.println(getCustomerInfo());
    }

}

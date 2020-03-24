package org.andestech.learning.sber2020;

// class_test
public class ClassTest {


    public static void main(String[] args)
    {
        int a;
        Rocket rocket1;
        rocket1 = new Rocket();
        rocket1.mass = 1000_222_000;
        rocket1.power = 2_555_667_200L;

        Rocket rocket2 = rocket1;
        rocket2.power=1_000_000_200L;

        rocket1.printInfo();
        //System.out.println("m= " + rocket1.mass + ", p=" + rocket1.power);
        // rocket1 == ref to object

       new Customer();

       Customer customer = new Customer();
       customer.id = 12217890722L;
       customer.name = "Василий";
       customer.sname = "Петров";

       customer.printCusomer();
        System.out.println("customer: " + customer);

       //-------------------
        Customer customer2 = new Customer(12222,"Peter","The First");
        customer2.printCusomer();

        Customer customer3 = new Customer("Kate","Spy");
        customer3.printCusomer();


    }



}

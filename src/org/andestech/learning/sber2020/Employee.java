package org.andestech.learning.sber2020;
import java.util.Random;

/**
 * ABS test
 * Employee class
 * <ul>
 *    <li> Name </li>
 *    <li> SName </li>
 *    <li> ID </li>
 * </ul>
 *
 * @author Andrei
 * @version 1.0.1
 */
public class Employee {
    long id;
    String name, sname;
    Employee manager;

    public Employee(){
        this(11,"Default","Default");
     }

    public Employee(String name, String sname){
        this(0,name,sname);
        id = new Random().nextInt(2_000_000_000);
    }

     public Employee(int id, String name, String sname){
         this.id = id;
         this.name = name;
        this.sname = sname;
        System.out.println("+++ ctor2: " + this);
    }

    String getEmployeeInfo(){
        return String.format("id:%d, %s %s.",id, name, sname);
    }
    void printEmployee(){ System.out.println(getEmployeeInfo());}

}

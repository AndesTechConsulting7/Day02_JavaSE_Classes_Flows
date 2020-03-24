package org.andestech.learning.sber2020;

public class Rocket {
    double power, mass;
    Engine engine;
    //.....
    //.....

    String getInfo() { return "m= " + mass + ", p=" + power;}
    void printInfo() { System.out.println(getInfo());  }


}

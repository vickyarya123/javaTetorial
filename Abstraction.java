abstract class Employee {
    public void display() {
        System.out.println("class A:");
    }

    public void salary() {

    }

    abstract public void greet();
}

class Programmer extends Employee {
    @Override
    public void display() {
        System.out.println("dispaly method in programmer class");
    }

    @Override
    public void salary() {
        System.out.println("this is programmer");
    }

    @Override
    public void greet() {
        System.out.println("hello this is greet method ");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.display();
        // Employee e1=new Employee();
        p.greet();

    }
}

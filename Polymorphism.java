class Student{
    String name;
    int age;
 public void printInfo(String name){
System.out.println(name);
 }
 public void printInfo(int age){
    System.out.println(age);
 }
 public void printInfo(String name, int age){
    System.out.println(name+"  "+age);
 }
}

class Polymorphism{
 public static void main(String[] args){
    System.out.println("hello duniya");
    Student s1=new Student();
    s1.printInfo(10);
    s1.printInfo("vicky");
    s1.printInfo("aman", 20);
 }
}